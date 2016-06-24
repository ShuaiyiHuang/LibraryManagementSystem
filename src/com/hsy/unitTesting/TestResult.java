package com.hsy.unitTesting;

public class TestResult {
	private String expected;
	private String actual;//actual test output
	private String teststatus="Not Passed";//if consistent,"Passe";else "Not Passed"
	
	public TestResult(String exp,String act,String tes){
		expected=exp;
		actual=act;
		teststatus=tes;
	}
	
	public TestResult(){
		
	}
	
	
	public String getExpected() {
		return expected;
	}
	public void setExpected(String expected) {
		this.expected = expected;
	}
	public String getActual() {
		return actual;
	}
	public void setActual(String actual) {
		this.actual = actual;
	}
	public String getTeststatus() {
		return teststatus;
	}
	public void setTeststatus(String teststatus) {
		this.teststatus = teststatus;
	}

}
