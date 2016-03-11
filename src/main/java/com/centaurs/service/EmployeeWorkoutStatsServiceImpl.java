package com.centaurs.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.centaurs.model.EmployeeWorkoutStats;
import com.centaurs.repository.EmployeeWorkoutsStatsRepository;
import com.centaurs.valueobjects.FitnessDataRequestVO;

public class EmployeeWorkoutStatsServiceImpl implements EmployeeWorkoutStatsService {
    @Autowired
    private EmployeeWorkoutsStatsRepository employeeWorkoutsStatsRepository;

	@Override
	public void saveEmployeeWorkoutStats(FitnessDataRequestVO fitnessDataRequestVO) {
		EmployeeWorkoutStats employeeWorkoutStats = new EmployeeWorkoutStats();
		employeeWorkoutStats.setEmpId(fitnessDataRequestVO.getEmpId());

		employeeWorkoutStats.setCalories(fitnessDataRequestVO.getCalories());
		employeeWorkoutStats.setCyclingInMin(fitnessDataRequestVO.getCyclingInMin());
		employeeWorkoutStats.setDistanceInMtr(fitnessDataRequestVO.getDistanceInMtr());
		employeeWorkoutStats.setRunningInMin(fitnessDataRequestVO.getRunningInMin());
		employeeWorkoutStats.setStepsCount(fitnessDataRequestVO.getStepsCount());
		
		employeeWorkoutStats.setClaoriesAdherence(fitnessDataRequestVO.getClaoriesAdherence());
		employeeWorkoutStats.setCyclingAdherence(fitnessDataRequestVO.getCyclingAdherence());
		employeeWorkoutStats.setDistanceAdherence(fitnessDataRequestVO.getDistanceAdherence());
		employeeWorkoutStats.setRunningAdherence(fitnessDataRequestVO.getRunningAdherence());
		employeeWorkoutStats.setStepsAdherence(fitnessDataRequestVO.getStepsAdherence());
		
		
		employeeWorkoutStats.setOverallAdherence(fitnessDataRequestVO.getOverAllAdherence());
		employeeWorkoutStats.setCreatedDate(fitnessDataRequestVO.getCreatedDate());
		employeeWorkoutStats.setStartDate(fitnessDataRequestVO.getStartDate());
		employeeWorkoutStats.setEndDate(fitnessDataRequestVO.getEndDate());
		employeeWorkoutsStatsRepository.save(employeeWorkoutStats);		
	}
}
