package com.smallbusiness.core.service;

import com.smallbusiness.core.entity.SamplePerson;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public interface SamplePersonService {
    Optional<SamplePerson> get(UUID id);

    SamplePerson update(SamplePerson entity);

    void delete(UUID id);

    Page<SamplePerson> list(Pageable pageable);

    int count();
}
