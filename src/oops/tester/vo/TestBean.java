package oops.tester.vo;

import java.util.Date;

public class TestBean {
	private int id;
	private String testString;
	private Date writeInTime;
	public TestBean() {}
	public TestBean(int id, String testString, Date writeInTime) {
		this.id = id;
		this.testString = testString;
		this.writeInTime = writeInTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTestString() {
		return testString;
	}
	public void setTestString(String testString) {
		this.testString = testString;
	}
	public Date getWriteInTime() {
		return writeInTime;
	}
	public void setWriteInTime(Date writeInTime) {
		this.writeInTime = writeInTime;
	}
	
	
	
	
}
