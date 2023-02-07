package com.project.service.impl;

import org.springframework.stereotype.Service;

import com.project.entity.BucketEntity;
import com.project.service.BucketService;
import com.project.repository.BucketRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BucketServiceImpl implements BucketService {

    private final BucketRepository br;

    public BucketServiceImpl(BucketRepository br) {
        this.br = br;
    }

    @Override
    public List<BucketEntity> findAllBuckets() {
        return br.findAll();
    }

    @Override
    public Optional<BucketEntity> findById(Long id) {
        return br.findById(id);
    }

    @Override
    public BucketEntity saveBucket(BucketEntity be) {
        return br.save(be);
    }

    @Override 
    public BucketEntity updateBucket(BucketEntity be) {
        return br.save(be);
    }

    @Override
    public void deleteBucket(Long id) {
        br.deleteById(id);
    }

}
