package com.centaurs.valueobjects;

import java.util.Date;

public class FitnessDataRequestVO {
    private Long empId;
    private Long runningInMin;
	private Long cyclingInMin;
	private Long stepsCount;
	private Long distanceInMtr;
	private Float calories;
	private Float runningAdherence;
	private Float cyclingAdherence;
	private Float stepsAdherence;
	private Float distanceAdherence;
	private Float claoriesAdherence;
	private Float overAllAdherence;
	private Date createdDate;
	private Date startDate;
	private Date endDate;
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public Long getRunningInMin() {
		return runningInMin;
	}
	public void setRunningInMin(Long runningInMin) {
		this.runningInMin = runningInMin;
	}
	public Long getCyclingInMin() {
		return cyclingInMin;
	}
	public void setCyclingInMin(Long cyclingInMin) {
		this.cyclingInMin = cyclingInMin;
	}
	public Long getStepsCount() {
		return stepsCount;
	}
	public void setStepsCount(Long stepsCount) {
		this.stepsCount = stepsCount;
	}
	public Long getDistanceInMtr() {
		return distanceInMtr;
	}
	public void setDistanceInMtr(Long distanceInMtr) {
		this.distanceInMtr = distanceInMtr;
	}
	public Float getCalories() {
		return calories;
	}
	public void setCalories(Float calories) {
		this.calories = calories;
	}
	public Float getRunningAdherence() {
		return runningAdherence;
	}
	public void setRunningAdherence(Float runningAdherence) {
		this.runningAdherence = runningAdherence;
	}
	public Float getCyclingAdherence() {
		return cyclingAdherence;
	}
	public void setCyclingAdherence(Float cyclingAdherence) {
		this.cyclingAdherence = cyclingAdherence;
	}
	public Float getStepsAdherence() {
		return stepsAdherence;
	}
	public void setStepsAdherence(Float stepsAdherence) {
		this.stepsAdherence = stepsAdherence;
	}
	public Float getDistanceAdherence() {
		return distanceAdherence;
	}
	public void setDistanceAdherence(Float distanceAdherence) {
		this.distanceAdherence = distanceAdherence;
	}
	public Float getClaoriesAdherence() {
		return claoriesAdherence;
	}
	public void setClaoriesAdherence(Float claoriesAdherence) {
		this.claoriesAdherence = claoriesAdherence;
	}
	public Float getOverAllAdherence() {
		return overAllAdherence;
	}
	public void setOverAllAdherence(Float overAllAdherence) {
		this.overAllAdherence = overAllAdherence;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}   
	
}
