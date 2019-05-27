package com.mex.SpringBootProject.controllers;

import com.mex.SpringBootProject.entities.EntityForm;
import com.mex.SpringBootProject.entities.RiscoEnum;
import com.mex.SpringBootProject.repositories.IFormRepository;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("form")
public class FormController {

    @Autowired
    private IFormRepository formRepo;

    @RequestMapping("create")
    @ResponseBody
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public ResponseEntity<EntityForm> createInfo(@RequestBody EntityForm ef) {
        //Here could be handled exception errors
        return ResponseEntity.ok().body(formRepo.save(processInfo(ef)));
    }

    private EntityForm processInfo(EntityForm ef) {
        RiscoEnum risco = ef.getRisco();
        if (risco == RiscoEnum.B || risco == RiscoEnum.C) {
            ef.setTaxaJuros((int) Math.round(ef.getTaxaJuros() * risco.getCantidad() / 100.0));
        }
        return ef;
    }
}
