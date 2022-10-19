package com.smallbusiness.core.service.impl;

import com.smallbusiness.core.entity.SampleAddress;
import com.smallbusiness.core.repository.SampleAddressRepository;
import com.smallbusiness.core.service.SampleAddressService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class SampleAddressServiceImpl implements SampleAddressService {

    private final SampleAddressRepository sampleAddressRepository;

    //    @Autowired
    public SampleAddressServiceImpl(SampleAddressRepository sampleAddressRepository) {
        this.sampleAddressRepository = sampleAddressRepository;
    }

    @Override
    public Optional<SampleAddress> get(UUID id) {
        return sampleAddressRepository.findById(id);
    }

    @Override
    public SampleAddress update(SampleAddress entity) {
        return sampleAddressRepository.save(entity);
    }

    @Override
    public void delete(UUID id) {
        sampleAddressRepository.deleteById(id);
    }

    @Override
    public Page<SampleAddress> list(Pageable pageable) {
        return sampleAddressRepository.findAll(pageable);
    }

    @Override
    public int count() {
        return (int) sampleAddressRepository.count();
    }

}
