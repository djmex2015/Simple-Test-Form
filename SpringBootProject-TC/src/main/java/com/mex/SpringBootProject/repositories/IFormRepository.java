package com.mex.SpringBootProject.repositories;

import com.mex.SpringBootProject.entities.EntityForm;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8081")
@RepositoryRestResource(path = "form", collectionResourceRel = "form")
public interface IFormRepository extends CrudRepository<EntityForm, Long> {
}
