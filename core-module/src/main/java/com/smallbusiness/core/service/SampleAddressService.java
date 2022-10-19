package com.smallbusiness.core.service;

import com.smallbusiness.core.entity.SampleAddress;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public interface SampleAddressService {
    Optional<SampleAddress> get(UUID id);

    SampleAddress update(SampleAddress entity);

    void delete(UUID id);

    Page<SampleAddress> list(Pageable pageable);

    int count();
}
