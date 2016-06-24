package com.hsy.unitTesting;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JFormattedTextField;

import com.wsy.dao.Dao;
import com.wsy.model.Reader;

//For each test case,if actual output satisfies expected output,then return true;if not ,then return false.

public class AddReader_UnitTest {
	public static String CASE_NUM;
	
	public static boolean UT_TC_001_001_002_001() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_001";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(0);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(0);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())==1){
			test.setActual("true");
			CASE_SUC=true;
		}else{
			test.setActual("false");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	
	public static boolean UT_TC_001_001_002_002() throws ParseException{//some parameter is empty
		CASE_NUM="UT_TC_001_001_002_002";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(1);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(1);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_003() throws ParseException{//some parameter is empty
		CASE_NUM="UT_TC_001_001_002_003";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(2);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(2);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_004() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_004";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(3);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(3);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_005() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_005";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(4);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(4);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_006() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_006";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(5);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(5);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_007() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_007";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(6);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(6);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_008() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_008";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(7);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(7);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_009() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_009";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(8);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(8);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_010() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_010";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(9);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(9);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_011() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_011";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(10);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(10);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_012() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_012";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(11);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(11);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_013() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_013";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(12);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(12);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_014() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_014";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(13);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(13);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_015() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_015";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(14);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(14);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_016() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_016";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(15);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(15);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_017() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_017";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(16);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(16);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_018() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_018";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(17);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(17);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_019() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_019";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(18);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(18);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	public static boolean UT_TC_001_001_002_020() throws ParseException{
		CASE_NUM="UT_TC_001_001_002_020";
		boolean CASE_SUC=false;

		ArrayList ReaderList=Util_AddReader.ReaderList;
		Reader reader=(Reader) ReaderList.get(19);
		ArrayList RusultList=Util_AddReader.ResultList;
		TestResult test=(TestResult)RusultList.get(19);
		
		if(Dao.InsertReader(reader.getName(),reader.getSex(),reader.getAge(),reader.getIdentityCard(),reader.getDate()
				,reader.getMaxNum(),reader.getTel(),reader.getKeepMoney(),reader.getZj()+"",reader.getZy(),reader.getBztime(),reader.getISBN())!=1){
			test.setActual("false");
			CASE_SUC=true;
		}else{
			test.setActual("true");
		}
		test.setTeststatus(CASE_SUC+"");//本次测试用例的最终是否通过结果
		return CASE_SUC;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
