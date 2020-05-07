package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		double result01 = num*num*num-(num*9)+2;
		double result02 = num*7+2;
		
		if (num<=0) {
			System.out.print("계산결과는 "+ result01 + " 입니다.");
		} else if (num>0) {
			System.out.print("계산결과는 "+ result02 + " 입니다.");
		}
		sc.close();
	}

}
