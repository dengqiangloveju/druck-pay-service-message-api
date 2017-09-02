package com.druck.pay.facade;

import java.util.Map;

import com.druck.pay.domain.DruckTransactionMessage;
import com.druck.pay.utils.PageBean;

public interface DruckTransactionMessageFacade {
	/**
	 * 预存储消息. 
	 */
	public void saveMessageWaitingConfirm(DruckTransactionMessage druckTransactionMessage);
	
	/**
	 * 确认并发送消息.
	 */
	public void confirmAndSendMessage(String messageId);

	
	/**
	 * 存储并发送消息.
	 */
	public void saveAndSendMessage(DruckTransactionMessage druckTransactionMessage);

	
	/**
	 * 直接发送消息.
	 */
	public void directSendMessage(DruckTransactionMessage druckTransactionMessage);
	
	
	/**
	 * 重发消息.
	 */
	public void reSendMessage(DruckTransactionMessage druckTransactionMessage);
	
	
	/**
	 * 根据messageId重发某条消息.
	 */
	public void reSendMessageByMessageId(String messageId);
	
	
	/**
	 * 将消息标记为死亡消息.
	 */
	public void setMessageToAreadlyDead(String messageId);


	/**
	 * 根据消息ID获取消息
	 */
	public DruckTransactionMessage getMessageByMessageId(String messageId);

	/**
	 * 根据消息ID删除消息
	 */
	public void deleteMessageByMessageId(String messageId);
	
	
	/**
	 * 重发某个消息队列中的全部已死亡的消息.
	 */
	public void reSendAllDeadMessageByQueueName(String queueName, int batchSize);
	
	/**
	 * 获取分页数据
	 */
	PageBean listPage(Map<String, Object> paramMap, int pageNo, int pageSize);
}
