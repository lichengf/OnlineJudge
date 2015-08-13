package com.lichengf.acm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Elevator {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		try {
			while((str = bf.readLine())!=null) {
				String []num = str.split(" ");
				int N = Integer.valueOf(num[0]);
				if (N == 0){
					break;
				} 
				int totalTime = 0;
				int currentFloor = 0;
				int floors = 0;
				for(int i = 1 ; i < N+1 ; i++) {
					int nextFloor = Integer.valueOf(num[i]);
					if (currentFloor > nextFloor) {
						floors = currentFloor-nextFloor;
						totalTime += floors*4;
					}
					if (currentFloor < nextFloor){
						floors = nextFloor - currentFloor;
						totalTime += floors*6;
					}
					totalTime+=5;
					currentFloor = nextFloor;
				}
				System.out.println(totalTime);
			}
		} catch (Exception e) {
		}
	}
}
