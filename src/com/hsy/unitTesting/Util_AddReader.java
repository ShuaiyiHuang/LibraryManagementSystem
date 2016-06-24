package com.hsy.unitTesting;
import com.wsy.model.Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.SortingFocusTraversalPolicy;

//import com.sun.accessibility.internal.resources.accessibility;
//import com.sun.corba.se.spi.ior.Writeable;
//import com.sun.istack.internal.Nullable;
//import com.sun.webkit.graphics.WCPageBackBuffer;
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import jxl.*;
import jxl.format.CellFormat;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;



public class Util_AddReader {
	
	
	static int numColumns=0;
	static int numRows=0;
    static File wfile;
	static File rfile;
    static Workbook rWorkbook=null;
    WritableWorkbook wwb=null;

	public static ArrayList ReaderList=new ArrayList<Reader>();//账单ArrayList
	
	public static ArrayList ResultList=new ArrayList<TestResult>();//测试结果Arraylist
	
	static public void  inputData(String str) throws BiffException, IOException, ParseException{//读取数据
		rfile=createFile(str);
	    rWorkbook=Workbook.getWorkbook(rfile);
		Sheet rSheet=rWorkbook.getSheet(0);
		numColumns=rSheet.getColumns();
		numRows=rSheet.getRows();
		System.out.println(numRows+":"+numColumns);
		String[] column1Str =new String[numRows];
		String[] column2Str =new String[numRows];
		String[] column3Str =new String[numRows];
		String[] column4Str =new String[numRows];
		String[] column5Str =new String[numRows];
		String[] column6Str =new String[numRows];
		String[] column7Str =new String[numRows];
		String[] column8Str =new String[numRows];
		String[] column9Str =new String[numRows];
		String[] column10Str =new String[numRows];
		String[] column11Str =new String[numRows];
		String[] column12Str =new String[numRows];
		String[] column13Str =new String[numRows];
		String[] column14Str =new String[numRows];
		String[] column15Str =new String[numRows];
		for(int i=1;i<numRows;i++){
			column1Str[i]=rSheet.getCell(0,i).getContents();
			column2Str[i]=rSheet.getCell(1,i).getContents();
			column3Str[i]=rSheet.getCell(2,i).getContents();
			column4Str[i]=rSheet.getCell(3,i).getContents();
			column5Str[i]=rSheet.getCell(4,i).getContents();//time
			column6Str[i]=rSheet.getCell(5,i).getContents();
			column7Str[i]=rSheet.getCell(6,i).getContents();//预期输出
			column8Str[i]=rSheet.getCell(7,i).getContents();
			column9Str[i]=rSheet.getCell(8,i).getContents();
			column10Str[i]=rSheet.getCell(9,i).getContents();
			column11Str[i]=rSheet.getCell(10,i).getContents();//当前时间
			column12Str[i]=rSheet.getCell(11,i).getContents();//bztime
			column15Str[i]=rSheet.getCell(14,i).getContents();//expected output
			java.sql.Date date;
			
			SimpleDateFormat myfmt = new SimpleDateFormat("yyyy-MM-dd");
			
			String name=column1Str[i];
			String sex=column2Str[i];
			String age=column3Str[i];
			String identityCard=column4Str[i];
			//date=java.sql.Date.valueOf(myfmt.format(myfmt.parse(column5Str[i])));//证件有效日期 valid date
			date=splitString(column5Str[i]);
			String maxNum=column6Str[i];
			String tel=column7Str[i];

			Double keepMoney;
			if(column8Str[i]==""){
				keepMoney=(double)-1000;
			}else{
				keepMoney=Double.parseDouble(column8Str[i]);
			}
			
			int zj=0;
			if(column9Str[i]==""){
				zj=-100;
			}else{
				zj=Integer.parseInt(column9Str[i]);
			}
			String zy=column10Str[i];
			String ISBN=column11Str[i];
			//java.sql.Date bztime=java.sql.Date.valueOf(myfmt.format(myfmt.parse(column12Str[i])));
			
			java.sql.Date bztime=splitString(column12Str[i]);
			String expected=column15Str[i];

			Reader reader=new Reader(name,sex,age,identityCard,date,maxNum,tel,keepMoney,zj,zy,ISBN,bztime);
			TestResult test=new TestResult(expected,"","not passed");
			ReaderList.add(reader);
			ResultList.add(test);
		}
		
		

	}
	
	public void inputAllData(String str) throws BiffException, IOException{//读取数据
		rfile=createFile(str);
	    rWorkbook=Workbook.getWorkbook(rfile);
		Sheet rSheet=rWorkbook.getSheet(0);
		numColumns=rSheet.getColumns();
		numRows=rSheet.getRows();
		System.out.println(numRows+":"+numColumns);
		String[] column1Str =new String[numRows];
		String[] column2Str =new String[numRows];
		String[] column3Str =new String[numRows];
		String[] column5Str =new String[numRows];
		for(int i=1;i<numRows;i++){
			column1Str[i]=rSheet.getCell(0,i).getContents();
			column2Str[i]=rSheet.getCell(1,i).getContents();
			column3Str[i]=rSheet.getCell(2,i).getContents();//欠费金额
			column5Str[i]=rSheet.getCell(4,i).getContents();//预期输出
//			Reader reader=new Reader(Double.parseDouble(column1Str[i]),Integer.parseInt(column2Str[i]),Double.parseDouble(column3Str[i]),column5Str[i]);
//			ReaderList.add(bill);
		}

	}
	
	public static File createFile(String str)//根据路径创建文件
	{
		File file=new File(str);
		return file;
	}
	
	static public  void writeData(String str,ArrayList resultList) throws BiffException, IOException, RowsExceededException, WriteException{
		
		wfile=createFile(str);
		 Workbook wb = Workbook.getWorkbook(wfile); 
		 WritableWorkbook book =  Workbook.createWorkbook(wfile, wb); 
		 WritableSheet sheet1 = book.getSheet(0);
		 for(int i=0;i<resultList.size();i++)
		 {
			 TestResult testresult=(TestResult)resultList.get(i);
			 sheet1.addCell(new Label(15, i+1,testresult.getActual()+""));//实际输出
			 sheet1.addCell(new Label(16, i+1,testresult.getTeststatus()+""));//实际输出
		 }

		 book.write();  
         book.close(); 
		 
	}
	
	public  void writeAllData(String str,ArrayList ReaderList) throws BiffException, IOException, RowsExceededException, WriteException{
		
		wfile=createFile(str);
		 Workbook wb = Workbook.getWorkbook(wfile); 
		 WritableWorkbook book =  Workbook.createWorkbook(wfile, wb); 
		 WritableSheet sheet1 = book.getSheet(0);
		 for(int i=0;i<ReaderList.size();i++)
		 {
			 Reader reader=(Reader) ReaderList.get(i);
			 //sheet1.addCell(new Label(3, i+1,bill.getResult()+""));从i=1开始，第D列写入结果
	//		 sheet1.addCell(new Label(5, i+1,reader.getResult()+""));//实际输出
	//		 sheet1.addCell(new Label(6, i+1,reader.getTestresult()+""));//测试结果，Y或者N
			 
		 }

		 book.write();  
         book.close(); 
		 
	}
	
	static java.sql.Date splitString(String str) throws ParseException{
		String[] res=str.split("\\.");
		String tempdate="2016-6-27";
		if(res.length>=3){
			tempdate=res[0]+"-"+res[1]+"-"+res[2];
		}
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		java.sql.Date resDate=java.sql.Date.valueOf(fmt.format(fmt.parse(tempdate)));
		return resDate;
		
	}
	
	public static void main(String[] args) throws RowsExceededException, WriteException {
		
	}

}

