package com.mex.SpringBootProject.initializers;

import com.mex.SpringBootProject.repositories.IFormRepository;
import com.mex.SpringBootProject.entities.EntityForm;
import com.mex.SpringBootProject.entities.RiscoEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class DummyCLR implements CommandLineRunner {

    @Autowired
    private IFormRepository repoForm;

    @Override
    public void run(String... args) throws Exception {

        EntityForm ef = new EntityForm();
        ef.setNomeCliente("TestName");
        ef.setLimiteCredito(1200);
        ef.setRisco(RiscoEnum.A);
        ef.setTaxaJuros(300);
        repoForm.save(ef);

        //Risco Types could be persisted right here and fetched from the frontend ($http.get()) instead of an enum type (RiscoEnum).
    }
}
