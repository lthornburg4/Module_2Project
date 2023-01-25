package Tests;
import model.BabysittingCustomers;
import model.BabysittingEmployees;
import model.BabysittingSchedule;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author lthor - lthornburg1
 * CIS175 - Spring 2023
 * Jan 23, 2023
 */
public class TestBabysittingLogic {
	BabysittingEmployees babyEmp = new BabysittingEmployees();
	BabysittingCustomers babyCust = new BabysittingCustomers();
	BabysittingSchedule babySch = new BabysittingSchedule();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateRate() {
		babyEmp.setRate(12.00);
		babyCust.setHoursNeeded(4);
		double dailyRate = babySch.calculateRate(babyEmp, babyCust); 
		assertEquals(48, dailyRate, 0.0);
	}
	
	@Test
	public void testCalculateRateChange() {
		babyEmp.setRate(15.00);
		babyCust.setNumberOfKids(3);
		double kidsRate = babySch.calculateRateChange(babyEmp, babyCust);
		assertEquals(45, kidsRate, 0.0);
	}

}
