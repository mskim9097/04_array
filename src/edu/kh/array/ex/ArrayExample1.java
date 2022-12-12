package edu.kh.array.ex;

import java.util.Scanner;

public class ArrayExample1 {
	
	Scanner sc = new Scanner(System.in);
	
	/* 배열(Array)
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.(자료구조)
	 * - 묶여진 변수들은 하나의 배열명으로 불려지고 구분은 index를 이용함
	 *  (index는 0부터 시작하는 정수)
	 */
	
	public void ex1() {
		// 변수 vs 배열
		
		// 1-1. 변수 선언
		int num;
		// Stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 생성(할당)하고
		//그 공간에 num 이라는 이름을 부여.
		
		// 1-2. 변수 대입
		
		num = 10;
		//생성된 num이라는 변수 공간에 10을 대입
		
		// 1-3. 변수 사용
		System.out.println("num에 저장된 값 : " + num);
		//num이 작성된 자리에 num에 저장된 값을 읽어와서 출력
		
		//-----------------------------------------------------
		
		// 2-1. 배열 선언
		int[] arr;
		// Stack 영역에 int[] (int배열) 자료형 공간을 4byte 할당하고
		// 그 공간에 arr 이라는 이름을 부여
		// ** 해당 변수는 참조형으로 주소 값(4byte)만을 저장할 수 있음.
		
		// 2-2. 배열 할당
		arr = new int[3];
		// new : "new 연산자" 라고 하며, Heap 메모리 영역에 새로운 공간(배열, 객체)를 할당
		// int[3] : int자료형 변수 3개를 하나의 묶음으로 나타냄
		// new int[3] : Heap 영역에 int 3칸짜리 int[]을 생성(할당)
					// ** 생성된 int[]에는 시작주소가 지정된다!!! **
		
		// 2-3. 배열 요소 값 대입
		// arr은 int[] 참조형 변수이지만
		// arr[0] int 자료형 변수이기 때문에 정수 값을 대입할 수 있다.
		
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 1000;
		
		// 2-4. 배열 요소 값 읽어오기
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
	
	public void ex2() {
		//배열 선언 및 할당
		
		int[] arr = new int[4];
		// 1) stack 영역에 int[] 자료형 참조형 변수 arr 선언
		// 2) heap 영역에 int 자료형 4개 묶음으로 다루는 int[]할당
		// 3) 생성된 int[]의 주소를 arr 에 대입하여 참조하는 형태를 만듬
		
		// 배열 길이(몇 칸 인가): 배열명.length
		System.out.println("배열 길이 : " + arr.length);
		
		arr[0] = 100;
		arr[1] = 300;
		arr[2] = 500;
		arr[3] = 1000;
		
		for(int i = 0; i < arr.length; i++) {
			// 0 1 2 3
			System.out.printf("arr[%d]에 저장된 값: %d\n", i, arr[i]);
		}
		
	}
	
	public void ex3() {
		

		
		double[] height = new double[5];
		
		for(int i = 0; i < height.length; i++) {
			System.out.print((i + 1) + "번 키 입력 : ");
			height[i] = sc.nextDouble();
			// 각 인덱스에 입력받은 값을 대입(초기화
		}
				
		System.out.println(); // 줄바꿈
		
		double sum = 0; // 합계용 변수
		
		for(int i = 0; i < height.length; i++) {
			System.out.print(height[i] + " ");
			sum += height[i]; // 배열에 저장된 값을 sum에 누적
			// sum = sum + height[i]
		}
		
		System.out.printf("\n평균 : %.2f\n", sum / height.length);
	}
	
	public void ex4() {
		
		System.out.print("입력 받을 인원 수 : ");
		int input = sc.nextInt();		
		int[] score = new int[input];
		
		System.out.println();
		
		for(int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번 점수 입력 : ");
			score[i] = sc.nextInt();
		}
		System.out.println();
	}


}
