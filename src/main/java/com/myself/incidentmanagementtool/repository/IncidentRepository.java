package com.myself.incidentmanagementtool.repository;

import com.myself.incidentmanagementtool.entity.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IncidentRepository extends JpaRepository<Incident, String> {
}
