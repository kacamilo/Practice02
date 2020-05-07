package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		char sym = sc.next().charAt(0);
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		if (sym == '+') {
				System.out.print("결과는: " + ((double)num1+num2));	
		} else if (sym=='-') {
				System.out.print("결과는: " + ((double)num1 - num2));			
		} else if (sym=='*') {
				System.out.print("결과는: " + ((double)num1 * num2));			
		} else if (sym=='/' ) {
			if(num2 == 0) {
				System.out.print("계산할 수 없습니다.");
			}
			else {
				System.out.print("결과는: " + ((double)num1 / num2));
			}
		} else if (num2=='%') {
				System.out.print("계산할 수 없습니다.1");	
		} else {
			System.out.print("계산할 수 없습니다.2");			
		}
			sc.close();
	}

}
