package oops.tester.domain;

import java.util.Date;

public class Test {
	private Integer id;
	private String testString;
	private Date writeInTime;
	
	
	public Test() {}
	
	public Test(Integer id, String testString, Date writeInTime) {
		this.id = id;
		this.testString = testString;
		this.writeInTime = writeInTime;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((testString == null) ? 0 : testString.hashCode());
		result = prime * result
				+ ((writeInTime == null) ? 0 : writeInTime.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (testString == null) {
			if (other.testString != null)
				return false;
		} else if (!testString.equals(other.testString))
			return false;
		if (writeInTime == null) {
			if (other.writeInTime != null)
				return false;
		} else if (!writeInTime.equals(other.writeInTime))
			return false;
		return true;
	}
	
	
}
