package com.hsy.unitTesting;
import com.hsy.unitTesting.Login_UnitTest;

public class Login_Drive {
	private static boolean UT_TC_001_001_001_001=false;
	private static boolean UT_TC_001_001_001_002=false;
	private static boolean UT_TC_001_001_001_003=false;
	private static boolean UT_TC_001_001_001_004=false;
	
	public static void main(String[] args){
		if(Login_UnitTest.UT_TC_001_001_001_001()){
			UT_TC_001_001_001_001=true;
			System.out.println(UT_TC_001_001_001_001+""+"1");
		}
		if(Login_UnitTest.UT_TC_001_001_001_002()){
			UT_TC_001_001_001_002=true;
			System.out.println(UT_TC_001_001_001_002+""+"2");
		}
		if(Login_UnitTest.UT_TC_001_001_001_003()){
			UT_TC_001_001_001_003=true;
			System.out.println(UT_TC_001_001_001_002+""+"3");
		}
		if(Login_UnitTest.UT_TC_001_001_001_004()){
			UT_TC_001_001_001_004=true;
			System.out.println(UT_TC_001_001_001_002+""+"4");
		}
		
	}
}
