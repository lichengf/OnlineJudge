package com.lichengfeng.chapterone.sectionone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplusBforInputWithTwoZero {
	
	public static void main(String[] args) {
		BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		try {
			while((str = buffered.readLine())!=null ) {
				int num1 = Integer.valueOf(str.split(" ")[0]);
				int num2 = Integer.valueOf(str.split(" ")[1]);
				if(num1==0 && num2==0){
					break;
				}else {
					System.out.println(num1+num2);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
