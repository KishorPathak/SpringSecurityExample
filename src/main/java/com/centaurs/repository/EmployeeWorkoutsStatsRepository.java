package com.centaurs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centaurs.model.EmployeeWorkoutStats;

public interface EmployeeWorkoutsStatsRepository extends JpaRepository<EmployeeWorkoutStats, Long>  {

}
