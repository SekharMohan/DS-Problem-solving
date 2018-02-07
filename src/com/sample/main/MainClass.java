package com.sample.main;

import java.util.Scanner;

public class MainClass {
	private static MainClass instance;
	
	private void exitProgram() {
		System.exit(0);
	}
	
	private void callStack() {
		
	}
	
	private MainClass() {
		
	}
	public static MainClass getInstace() {
		if(instance == null ){
			instance = new MainClass();
		}
		
		return instance;
	}
	public static void main(String[] args){
		Scanner  scanner = new Scanner(System.in);
		
		System.out.println("1.Stack");
		System.out.println("2.Exit");
		System.out.println("");
		System.out.println("\n Enter your choice");
		int choice = scanner.nextInt();
	MainClass object = getInstace();
		switch(choice) {
		case 1:
			object.callStack();
			break;
			
		case 2:
			object.exitProgram();
			break;
			default:
				System.out.println("invalid");
				
		}
		
	}

}
