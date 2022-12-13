package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	
	public void practice1() {
		
		int sum = 0;
		int[] arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}
	
	public void practice2() {
		
		int sum = 0;
		int[] arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
			if(i % 2 != 0) {
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : " + sum);
	}
	
	public void practice3() {
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		
		int count = 0;
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("입력 " + i + " : ");
			arr[i] = sc.nextInt();			
		}
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		for(int i = 0; i < 5; i++) {
			if(input == arr[i]) {
				System.out.println("인덱스 : " + i);
				count = arr[i];
			}
			
		}
		if(input != count) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}

	}
	
	public void practice5() {
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		
		System.out.print("application에 " + ch + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < arr.length; i++) {
			if(ch == arr[i]) {
				count ++; 
				System.out.print(i + " ");
			}			
		}
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
	}
	
	public void practice6() {
		
		int sum = 0;
		System.out.print("정수 : ");
		int input =sc.nextInt();
		int[] arr= new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	
	public void practice7() {
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
			if(i > 7) {
				arr[i] = '*';
			}
			System.out.print(arr[i]);
		}
				
	}
	
	public void practice8() {
		
		int input = 3;
		System.out.print("정수 : ");
		input = sc.nextInt();
		int arr[] = new int[input];

		
		while(input < 3 || input % 2 == 0) {
			System.out.println("다시 입력하세요.");
			System.out.print("정수 : ");
			input = sc.nextInt();
		}
		if (input >= 3 && input % 2 != 0 ) {
			for(int i = 0; i < input; i++) {
				if(i <= input / 2) {
					arr[i] = i + 1;
				} else {
					arr[i] = input - i; 
				}
				if(i < input - 1) {
				System.out.print(arr[i] + ", ");	
				} else if (i == input -1) {
					System.out.print(1);
				}
			}
			
		}
	
		
		
	}
	
	

}
