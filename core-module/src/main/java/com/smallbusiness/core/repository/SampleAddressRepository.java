package com.smallbusiness.core.repository;

import java.util.UUID;

import com.smallbusiness.core.entity.SampleAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleAddressRepository extends JpaRepository<SampleAddress, UUID> {

}