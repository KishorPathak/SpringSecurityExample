package com.centaurs.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.centaurs.service.EmployeeWorkoutStatsService;
import com.centaurs.valueobjects.FitnessDataRequestVO;

@Controller
public class EmployeeWorkoutStatsController {
    @Autowired
    private EmployeeWorkoutStatsService employeeWorkoutStatsService;

    private static final String APPLICATION_JSON = "application/json";
    
    @ResponseBody
	@Transactional(propagation = Propagation.REQUIRED)
    @RequestMapping(value = "/employeeWorkoutStats", method = RequestMethod.POST, consumes = APPLICATION_JSON)
    public void saveEmployeeWorkoutStats(@RequestBody final FitnessDataRequestVO fitnessDataRequestVO) {
    	employeeWorkoutStatsService.saveEmployeeWorkoutStats(fitnessDataRequestVO);
    }

}
