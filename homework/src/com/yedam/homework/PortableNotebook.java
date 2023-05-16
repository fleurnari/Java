package com.yedam.homework;

public class PortableNotebook implements Notebook {

	// 필드
	int mode = Notebook.NOTEBOOK_MODE;
	String oa;
	String browser;
	String video;
	String app;
	
	// 생성자
	public PortableNotebook(String oa, String browser, String video, String app) {
		String modeView = "";
		if (mode == NOTEBOOK_MODE) {
			modeView = "NOTEBOOK_MODE";
		} else if (mode == TABLET_MODE) {
			modeView = "TABLET_MODE";
		}
		
		this.oa = oa;
		this.browser = browser;
		this.video = video;
		this.app = app;
		System.out.println("현재 모드 : " + modeView);
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
			System.out.println(app + "을 실행");
		} else if (mode == TABLET_MODE) {
			System.out.println(app + "을 실행");
		}
	}
	
	public void changeMode() {
		String modeView = "";
		if (mode == NOTEBOOK_MODE) {
			mode = TABLET_MODE;
			modeView = "NOTEBOOK_MODE";
		} else if (mode == TABLET_MODE) {
			mode = NOTEBOOK_MODE;
			modeView = "TABLET_MODE";
		}
		
		System.out.println(modeView);
		
	}



}
