package com.smallbusiness.core.backend.service;

import java.util.UUID;

import com.smallbusiness.core.backend.entity.SampleAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleAddressRepository extends JpaRepository<SampleAddress, UUID> {

}