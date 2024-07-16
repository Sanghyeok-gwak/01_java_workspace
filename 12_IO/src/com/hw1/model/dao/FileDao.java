package com.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDao {

	public void fileSave(String content,String fileName) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName+".txt",true))){
			bw.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	public String fileOpen(String fileName) {
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName+".txt")) ){
			String value=null;
			StringBuilder sb = new StringBuilder();
			while((value = br.readLine())!= null) {
			sb.append(value);
			String result = sb.toString();
			
			return result;
			
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("존재하는 파일이 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fileName;
		
		
		
	}
	
	
	
}
