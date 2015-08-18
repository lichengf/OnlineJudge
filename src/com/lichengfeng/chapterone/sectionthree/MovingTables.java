package com.lichengfeng.chapterone.sectionthree;
/**
 * this question is so hard for me.
 */
import java.util.Scanner;

public class MovingTables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			while(N > 0) {
				int M = sc.nextInt();
				int []room = new int[202];
				int sum = 0;
				while(M > 0) {
					int begin = sc.nextInt() , end = sc.nextInt();
					begin = (begin-1)/2;
					end = (end-1)/2;
					if(begin > end) {
						int temp = begin;
						begin = end;
						end = temp;
					}
					for(int i = begin ; i <= end ; i++) {
						room[i]++;
						if(room[i] > sum) {
							sum = room[i];
						}
					}
					M--;
				}
				System.out.println(sum*10);
				N--;
			}
	}
}
