package com.youcode.repository;

import com.youcode.entities.Objectif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectifRepository extends JpaRepository<Objectif, Integer >{
}
