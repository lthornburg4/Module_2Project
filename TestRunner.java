package Tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author lthor - lthornburg1
 * CIS175 - Spring 2023
 * January 23, 2023
 */
public class TestRunner {
	public static void main (String[] args) {
		
		Result result = JUnitCore.runClasses(TestBabysittingLogic.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}

}
