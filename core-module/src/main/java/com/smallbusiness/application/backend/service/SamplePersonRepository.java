package com.smallbusiness.application.backend.service;

import java.util.UUID;

import com.smallbusiness.application.backend.entity.SamplePerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, UUID> {

}