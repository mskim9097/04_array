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
		

		
		while(input < 3 || input % 2 == 0) {
			System.out.println("다시 입력하세요.");
			System.out.print("정수 : ");
			input = sc.nextInt();
		}
		if (input >= 3 && input % 2 != 0 ) {
			int arr[] = new int[input];
			for(int i = 0; i < input; i++) {
				if(i <= input / 2) {
					arr[i] = i + 1;
				} else {
					arr[i] = input - i; 
				}
				if(i < input - 1) {
				System.out.print(arr[i] + ", ");	
				} else{
					System.out.print(1);
				}
			}
			
		}
			
	}
	
	public void practice9() {
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			System.out.print("발생한 난수 : " + arr[i] + " ");
		}
		
		
	}
	
	public void practice10() {
		
		
		int[] arr = new int[10];		
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			
			System.out.print(arr[i] + " ");
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			} else if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println();		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);		
	}
	public void practice11() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {			
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			
			for(int x = 0; x < i; x++) {
				if(random == arr[x]) {					
					i--;
			
					break;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}	
	}
	
	public void practice12() {
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {			
			int random = (int)(Math.random() * 45 + 1);
			arr[i] = random;
			
			for(int x = 0; x < i; x++) {
				if(random == arr[x]) {					
					i--;
			
					break;
				}
			}
		}
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}		
	}
	
	public void practice13() {
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		System.out.print("문자열에 있는 문자 : ");
		char[] arr = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
			
			for(int x = 0; x < i ; x++) {
				if(arr[i] == arr[x]) {
					i--;
					break;
				}
			}			
			
		}
		
	}
	
	public void practice14() {
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int input = sc.nextInt();
		System.out.println();
		
		for(int i = 1; i <= input; i++) {
			System.out.print(i + "번째 문자열: ");
			String answer = sc.next();
			
			}
		System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
		String answer1 = sc.nextLine();
		
		
		if(answer1 = ) {
			System.out.print("더 입력하고 싶은 개수 : ");
			int input1 = sc.nextInt();
			
			for(int x = 1; x <= input1; x++) {
				System.out.print((x + input) + "번째 문자열 : ");
				String answer = sc.next();
			}
					
			
		}
	}
}
