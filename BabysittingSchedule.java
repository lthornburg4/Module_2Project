package model;
import model.BabysittingCustomers;
import model.BabysittingEmployees;

/**
 * @author lthor - lthornburg1
 * CIS175 - Spring 2023
 * Jan 23, 2023
 */
public class BabysittingSchedule {
	
	public double calculateRate(BabysittingEmployees rate, BabysittingCustomers hours) {
		double dailyRate = 0;
		dailyRate = rate.getRate() * hours.getHoursNeeded();
		return dailyRate;
	}
	
	public double calculateRateChange(BabysittingEmployees rate, BabysittingCustomers numberOfKids) {
		double kidsRate = 0;
		kidsRate = rate.getRate() * numberOfKids.getNumberOfKids();
		return kidsRate;
	}
}
