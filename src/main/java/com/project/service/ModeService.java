package com.project.service;

import com.project.entity.ModeEntity;

import java.util.List;
import java.util.Optional;

public interface ModeService {
    List<ModeEntity> findAllModes();
    Optional<ModeEntity> findById(Long id);
    ModeEntity saveMode(ModeEntity modeEntity);
    ModeEntity updateMode(ModeEntity modeEntity);
    void deleteMode(Long id);
}
