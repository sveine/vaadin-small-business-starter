package com.smallbusiness.core.service.impl;

import com.smallbusiness.core.entity.SamplePerson;
import com.smallbusiness.core.repository.SamplePersonRepository;
import com.smallbusiness.core.service.SamplePersonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class SamplePersonServiceImpl implements SamplePersonService {

    private final SamplePersonRepository samplePersonRepository;

    //    @Autowired
    public SamplePersonServiceImpl(SamplePersonRepository samplePersonRepository) {
        this.samplePersonRepository = samplePersonRepository;
    }

    @Override
    public Optional<SamplePerson> get(UUID id) {
        return samplePersonRepository.findById(id);
    }

    @Override
    public SamplePerson update(SamplePerson entity) {
        return samplePersonRepository.save(entity);
    }

    @Override
    public void delete(UUID id) {
        samplePersonRepository.deleteById(id);
    }

    @Override
    public Page<SamplePerson> list(Pageable pageable) {
        return samplePersonRepository.findAll(pageable);
    }

    @Override
    public int count() {
        return (int) samplePersonRepository.count();
    }

}
