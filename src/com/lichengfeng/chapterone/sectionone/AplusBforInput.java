package com.lichengfeng.chapterone.sectionone;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AplusBforInput {
	
	public static void main(String[] args) {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			String str = "";
			while((str = strin.readLine())!=null) {
				String[] num = str.split(" ");
				System.out.println(Integer.valueOf(num[0])+Integer.valueOf(num[1]));
			}
		} catch (Exception e) {
		}
	}
}
