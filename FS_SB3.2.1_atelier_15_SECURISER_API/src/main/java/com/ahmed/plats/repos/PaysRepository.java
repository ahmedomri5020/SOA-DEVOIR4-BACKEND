package com.ahmed.plats.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ahmed.plats.entities.Pays;

@RepositoryRestResource(path = "pays")
public interface PaysRepository extends JpaRepository<Pays, Long> {

}
