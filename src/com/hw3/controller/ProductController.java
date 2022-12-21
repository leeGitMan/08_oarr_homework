package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	
	Product po = new Product();
	
	
	private Product[] pro = null;
	{
		pro = new Product[10];
	}
	
	
	// 현재 추가된 객체 수
	public static int count = 0;
	
	
	Scanner sc = new Scanner(System.in);
	
	
	
	
	
	
	public void mainMenu() {
		
		//메뉴 출력 --> do-while 문으로 반복 실행 처리함
		
		
		
		
		int input = 0;
		
		do {
			System.out.println("1. 제품 정보 추가 : ");
			System.out.println("2. 제품 전체 조회 : ");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("원하는 번호를 입력하세요.");
			
			input = sc.nextInt();
			
			
			
			
			
			switch(input) {
			case 1 : productInput(); break;
			case 2 : productPrint(); break;
			case 3 : break;
			case 4 : break;
			case 0 : System.out.println("종료하겠습니다."); break;
			default : System.out.println("\n잘못 입력하셨습니다.\n"); break;
			
			}
	
		}while(input != 0);
		
		
		
		// ===제품 관리 메뉴===
		// 제품 정보 추가는 productInput 메소드 실행
		// 제품 전체 조회는 productPrint 메소드 실행
		
		//  프로그램 종료
		
		

		
	}
	
		
	
	public void productInput() {
		// 키보드로 도서 정보를 입력 받아 객체 생성
		
		
		
		System.out.print(" ====== 도서 정보를 입력======\n");
		
		
		
		
			System.out.print("도서 제품 번호 : ");
			int pId = sc.nextInt();
			
			
			System.out.print("도서 제품 명 : ");
			String pName = sc.next();
			
			
			
			System.out.print("도서 제품 가격 : " );
			int price = sc.nextInt();
			
			
			System.out.print("도서 제품 세금 : ");
			double tax = sc.nextDouble();
			
			if(pro[9] != null) {
				System.out.println("저장 공간 부족");
				return;
			}
			
			for(int i = 0; i < pro.length; i++) {
				if(pro[i] == null) {
					pro[i] = new Product(pId, pName, price, tax);
					break;
				}
			}
			System.out.println("정보 저장 완료!");
		// -> Product 생성자 내부에서 ProductController의 count 클래스 변수 값 1씩 증가
			
			
		// 현재 카운트 인덱스에 생성한 주소 저장
	}
	
	public void productPrint() {
		// 현재까지 기록된 도서 정보 모두 출력
		
		System.out.print(" ====== 도서 정보 조회======\n");
		
		boolean flag = false;
		
		
		for(int i = 0; i < pro.length; i++) {
			
			if(!flag) {
				System.out.print("정보가 없습니다.");
				
			}
			
		/*
		 * 
			if(pro[i] == null) {
				System.out.println("제품 정보가 없습니다.");
				break;
			}
			else {
				System.out.println(pro[i].information());
				
				System.out.println("======================================");
				
			}*/
		}
		
		
	}
	// 추가적으로 제품 삭제, 수정, 검색 등등 메소드 응용해서 추가헤보기
	
	
	
	

}
