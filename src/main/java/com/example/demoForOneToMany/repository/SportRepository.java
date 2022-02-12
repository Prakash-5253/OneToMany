package com.example.demoForOneToMany.repository;

import com.example.demoForOneToMany.entity.Sport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportRepository extends JpaRepository<Sport,String> {
}
