package com.druck.pay.exception;

public class MessageBizException extends BizException {
	private static final long serialVersionUID = 8019429687288732508L;

	/** �������ϢΪ�� **/
	public static final int SAVA_MESSAGE_IS_NULL = 8001;
	
	/** ��Ϣ�����Ѷ���Ϊ�� **/
	public static final int MESSAGE_CONSUMER_QUEUE_IS_NULL = 8002;
	
	public MessageBizException() {
	}
	
	public MessageBizException(int code, String msg) {
		super(code, msg);
	}
	
	public MessageBizException(int code, String msgFormat, Object... args) {
		super(code, msgFormat, args);
	}
}
