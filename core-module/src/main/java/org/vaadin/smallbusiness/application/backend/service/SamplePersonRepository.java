package org.vaadin.smallbusiness.application.backend.service;

import java.util.UUID;

import org.vaadin.smallbusiness.application.backend.entity.SamplePerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, UUID> {

}