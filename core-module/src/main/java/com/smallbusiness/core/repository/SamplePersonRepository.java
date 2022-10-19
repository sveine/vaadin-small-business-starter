package com.smallbusiness.core.repository;

import java.util.UUID;

import com.smallbusiness.core.entity.SamplePerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, UUID> {

}