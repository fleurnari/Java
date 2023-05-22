package com.yedam.account;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// @NoArgsConstructor : 기본 생성자
// @Data : 전부 한번에 생성


public class Account {

	private String accountId;
	private int accountBalance;
	private Date accountCredate;
	private String memberId;


}
