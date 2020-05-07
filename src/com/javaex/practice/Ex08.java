package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

			int num1;
			int num2;
			int num3;
			
			Scanner sc = new Scanner (System.in);
			System.out.println("숫자 3개를 입력해주세요");
			System.out.print("숫자1: ");
			num1 = sc.nextInt();
			System.out.print("숫자2: ");
			num2 = sc.nextInt();
			System.out.print("숫자3: ");
			num3 = sc.nextInt();
			
			if (num1<num2 && num1<num3) {
				System.out.print("가장 작은수는 " + num1 +"입니다.");
			} else if (num2<num1 && num2<num3) {
				System.out.print("가장 작은수는 " + num2 +"입니다.");
			} else if (num3<num1 && num3<num2) {
				System.out.print("가장 작은수는 " + num3 +"입니다.");
			}
			sc.close();
	}

}
