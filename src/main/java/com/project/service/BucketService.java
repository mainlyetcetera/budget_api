package com.project.service;

import com.project.entity.BucketEntity;

import java.util.List;
import java.util.Optional;

public interface BucketService {
    List<BucketEntity> findAllBuckets();
    Optional<BucketEntity> findById(Long id);
    BucketEntity saveBucket(BucketEntity creditEntity);
    BucketEntity updateBucket(BucketEntity creditEntity);
    void deleteBucket(Long id);
}
