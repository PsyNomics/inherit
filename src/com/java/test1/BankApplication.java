package com.java.test1;

import java.util.Scanner;

public class BankApplication {
	private static Account2[] accountArray = new Account2[100];
	private static Scanner sc = new Scanner(System.in);;

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택> ");

			int selectNo = sc.nextInt();

			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");

	}

	//계좌 생성하기
	private static void createAccount() {
		System.out.println("---------");
		System.out.println("1.계좌생성");
		System.out.println("---------");
		System.out.println("계좌번호: "+int ano);
		System.out.println("계좌주: ");
		System.out.println("초기입금액: ");
		System.out.println("결과: 계좌가 생성되었습니다");
		
	}
	
	//계좌목록보기
	private static void accountList() {
		
	}
	
	//예금하기
	private static void deposit() {
		
	}
	
	//출금하기
	private static void withdraw() {
		
	}

	//Account2 배열에서 ano와 동일한 Account2 객체 찾기
	/*
	private static Account findAccount(String ano) {
		
	}
	*/
}
