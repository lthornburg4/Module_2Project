package model;

/**
 * @author lthor - lthornburg1
 * CIS175 - Spring 2023
 * Jan 23, 2023
 */
public class BabysittingEmployees {
	private String babysitterName;
	private int babysitterAge;
	private double rate;
	
	public BabysittingEmployees() {
		
	}
	
	public BabysittingEmployees(double rate) {
		setRate(12.00);
	}
	
	public BabysittingEmployees(String bname, int bage, double rate) {
		setBabysitterName(bname);
		setBabysitterAge(bage);
		setRate(rate);
	}
	
	public String getBabysitterName() {
		return babysitterName;
	}
	public void setBabysitterName(String babysitterName) {
		this.babysitterName = babysitterName;
	}
	public int getBabysitterAge() {
		return babysitterAge;
	}
	public void setBabysitterAge(int babysitterAge) {
		this.babysitterAge = babysitterAge;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
}
