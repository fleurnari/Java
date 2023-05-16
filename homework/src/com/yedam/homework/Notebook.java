package com.yedam.homework;

public interface Notebook extends Tablet {
	// 필드
	public static final int NOTEBOOK_MODE = 1;
	
	// 메소드
	public abstract void writeDocumentation();
	public abstract void searchInternet();
	
}
