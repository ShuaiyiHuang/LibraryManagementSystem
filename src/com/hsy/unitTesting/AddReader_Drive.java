package com.hsy.unitTesting;

import java.io.IOException;
import java.text.ParseException;

import com.wsy.dao.Dao;
import com.wsy.model.*;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class AddReader_Drive {
	private static boolean UT_TC_001_001_002_001=false;
	private static boolean UT_TC_001_001_002_002=false;
	public static void main(String[] args) throws ParseException, BiffException, IOException, RowsExceededException, WriteException {
		// TODO Auto-generated method stub
		
		Util_AddReader.inputData("D:\\workspace\\libraryManager\\src\\TestReader.xls");//read test case from excel
		
	if(AddReader_UnitTest.UT_TC_001_001_002_001()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		//System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
		
		
		
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_002()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_003()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_004()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_005()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_006()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_007()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_008()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_009()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_010()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_011()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_012()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_013()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_014()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_015()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_016()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_017()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_018()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_019()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	if(AddReader_UnitTest.UT_TC_001_001_002_020()){
		System.out.println(AddReader_UnitTest.CASE_NUM+"passed");
	}else{
		System.out.println(AddReader_UnitTest.CASE_NUM+"not passed");
	}
	
	//Util_AddReader.inputData("D:\\workspace\\libraryManager\\src\\TestReader.xls");
	Util_AddReader.writeData("D:\\workspace\\libraryManager\\src\\TestReaderOut.xls",Util_AddReader.ResultList);

	}

}
