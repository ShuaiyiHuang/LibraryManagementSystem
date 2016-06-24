package com.hsy.unitTesting;

import com.wsy.dao.Dao;

public class Login_UnitTest {
	public static String CASE_NUM;
	private static Dao dao;
	
	
	public static boolean UT_TC_001_001_001_001(){//some parameter is empty
		CASE_NUM="UT_TC_001_001_001_001";
		boolean CASE_SUC=false;
		if(dao.check("hsy","").getName()==null){
			CASE_SUC=true;
		}
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_001_002(){//username and password does not match
		CASE_NUM="UT_TC_001_001_001_002";
		boolean CASE_SUC=false;
		if(dao.check("hsy","123").getName()==null){
			CASE_SUC=true;
		}
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_001_003(){//username does not exist
		CASE_NUM="UT_TC_001_001_001_003";
		boolean CASE_SUC=false;
		if(dao.check("ysh","123").getName()==null){
			CASE_SUC=true;
		}
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_001_004(){//success case
		CASE_NUM="UT_TC_001_001_001_004";
		boolean CASE_SUC=false;
		if(dao.check("hsy","hsy").getName()!=null){
			CASE_SUC=true;
		}
		return CASE_SUC;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
