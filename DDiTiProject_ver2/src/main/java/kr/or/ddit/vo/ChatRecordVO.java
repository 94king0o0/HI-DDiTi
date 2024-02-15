package kr.or.ddit.vo;

import lombok.Data;


// 채팅 기록
@Data
public class ChatRecordVO {

	private int chatNo;
	private int memNo;
	private int chatRoomNo;
	private String chatMsg;
	private String chatSender;
	private String chatDate;
	private int fileNo;
	
	private String resString;
}

