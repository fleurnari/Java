package com.yedam.homework;

public class PortableNotebook implements Notebook {

	// 필드
	int mode;
	String oa;
	String browser;
	String video;
	String app;
	
	// 생성자
	public PortableNotebook(String oa, String browser, String video, String app) {
		this.mode = NOTEBOOK_MODE;
		if (mode == NOTEBOOK_MODE) {
			System.out.println("NOTEBOOK_MODE");
		} else if (mode == TABLET_MODE) {
			System.out.println("TABLET_MODE");
		}
		
		this.oa = oa;
		this.browser = browser;
		this.video = video;
		this.app = app;
	}
	
	
	// 메소드
	@Override
	public void writeDocumentation() {
		System.out.println(oa + "를 통해 문서를 작성");
	}

	@Override
	public void searchInternet() {
		System.out.println(browser + "를 통해 인터넷을 검색");
	}

	@Override
	public void watchVideo() {
		System.out.println(video + "를 시청");
	}

	@Override
	public void useApp() {
		if (mode == NOTEBOOK_MODE) {
			mode = TABLET_MODE;
		}
		System.out.println(app + "을 실행");
	}
	
	public void changeMode() {
		if (mode == NOTEBOOK_MODE) {
			mode = TABLET_MODE;
			System.out.println("TABLET_MODE");
		} else if (mode == TABLET_MODE) {
			mode = NOTEBOOK_MODE;
			System.out.println("NOTEBOOK_MODE");
		}
		
	}



}
