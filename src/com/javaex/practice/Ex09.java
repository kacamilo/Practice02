package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		int num1;
		int num2;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("첫번째 숫자: ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		num2 = sc.nextInt();
		
		if (num1<num2) {
				if (num2%num1==0) {
			System.out.print(num1 +" 는(은) " + num2 + " 의 약수입니다.");
				}
				 else {
			System.out.print(num1 +" 는(은) " + num2 + " 의 약수가 아닙니다.");
				 }
		} else if (num1>num2) {
			if (num1%num2==0) {
		System.out.print(num2 +" 는(은) " + num1 + " 의 약수입니다.");
			}
			 else {
		System.out.print(num2 +" 는(은) " + num1 + " 의 약수가 아닙니다.");
			 }
		}
		sc.close();
		}
}
