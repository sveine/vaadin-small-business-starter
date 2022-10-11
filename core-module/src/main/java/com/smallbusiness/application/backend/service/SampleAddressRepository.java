package com.smallbusiness.application.backend.service;

import java.util.UUID;

import com.smallbusiness.application.backend.entity.SampleAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleAddressRepository extends JpaRepository<SampleAddress, UUID> {

}