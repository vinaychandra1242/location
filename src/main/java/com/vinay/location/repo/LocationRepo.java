package com.vinay.location.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinay.location.entity.LocationEntity;

public interface LocationRepo extends JpaRepository<LocationEntity, Integer> {

}
