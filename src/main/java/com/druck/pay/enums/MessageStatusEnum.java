package com.druck.pay.enums;

public enum MessageStatusEnum {
	WAITING_CONFIRM("��ȷ��"),

	SENDING("������");

	private String desc;

	private MessageStatusEnum(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
