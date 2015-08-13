package com.lichengfeng.chapterone.sectionone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplusBforInputWithN {
	
	public static void main(String[] args) {
		try {
			BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.valueOf(buffered.readLine());
			while(N>0){
				String []num = buffered.readLine().split(" ");
				System.out.println(Integer.valueOf(num[0])+Integer.valueOf(num[1]));
				N = N - 1;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
