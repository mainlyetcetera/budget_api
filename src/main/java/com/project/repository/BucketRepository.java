package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.BucketEntity;

@Repository
public interface BucketRepository extends JpaRepository<BucketEntity, Long> {}
