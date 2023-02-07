package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.KeyboardShortcutEntity;

@Repository
public interface KeyboardShortcutRepository extends JpaRepository<KeyboardShortcutEntity, Long> {}
