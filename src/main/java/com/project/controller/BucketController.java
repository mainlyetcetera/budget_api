package com.project.controller;

import java.util.List;
import java.util.Optional;

import com.project.entity.BucketEntity;
import com.project.service.BucketService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/buckets")
public class BucketController {

    private final BucketService bs;

    public BucketController(BucketService bs) {
        this.bs = bs;
    }

    @GetMapping
    public List<BucketEntity> findAllBuckets() {
        return bs.findAllBuckets();
    }

    @GetMapping("/{id}")
    public Optional<BucketEntity> findBucketById(@PathVariable("id") Long id) {
        return bs.findById(id);
    }

    @PostMapping
    public BucketEntity saveBucket(@RequestBody BucketEntity b) {
        return bs.saveBucket(b);
    }

    @PutMapping
    public BucketEntity updateBucket(@RequestBody BucketEntity b) {
        return bs.updateBucket(b);
    }

    @DeleteMapping("/{id}")
    public void deleteBucket(@PathVariable("id") Long id) {
        bs.deleteBucket(id);
    }

}
