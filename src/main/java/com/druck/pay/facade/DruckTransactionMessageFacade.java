package com.druck.pay.facade;

import java.util.Map;

import com.druck.pay.domain.DruckTransactionMessage;
import com.druck.pay.utils.PageBean;

public interface DruckTransactionMessageFacade {
	/**
	 * Ԥ�洢��Ϣ. 
	 */
	public void saveMessageWaitingConfirm(DruckTransactionMessage druckTransactionMessage);
	
	/**
	 * ȷ�ϲ�������Ϣ.
	 */
	public void confirmAndSendMessage(String messageId);

	
	/**
	 * �洢��������Ϣ.
	 */
	public void saveAndSendMessage(DruckTransactionMessage druckTransactionMessage);

	
	/**
	 * ֱ�ӷ�����Ϣ.
	 */
	public void directSendMessage(DruckTransactionMessage druckTransactionMessage);
	
	
	/**
	 * �ط���Ϣ.
	 */
	public void reSendMessage(DruckTransactionMessage druckTransactionMessage);
	
	
	/**
	 * ����messageId�ط�ĳ����Ϣ.
	 */
	public void reSendMessageByMessageId(String messageId);
	
	
	/**
	 * ����Ϣ���Ϊ������Ϣ.
	 */
	public void setMessageToAreadlyDead(String messageId);


	/**
	 * ������ϢID��ȡ��Ϣ
	 */
	public DruckTransactionMessage getMessageByMessageId(String messageId);

	/**
	 * ������ϢIDɾ����Ϣ
	 */
	public void deleteMessageByMessageId(String messageId);
	
	
	/**
	 * �ط�ĳ����Ϣ�����е�ȫ������������Ϣ.
	 */
	public void reSendAllDeadMessageByQueueName(String queueName, int batchSize);
	
	/**
	 * ��ȡ��ҳ����
	 */
	PageBean listPage(Map<String, Object> paramMap, int pageNo, int pageSize);
}
