package com.smallbusiness.core.backend.service;

import java.util.UUID;

import com.smallbusiness.core.backend.entity.SamplePerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, UUID> {

}