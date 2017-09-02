package com.druck.pay.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * DruckTransactionMessage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "druck_transaction_message")
public class DruckTransactionMessage implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 779491020950043386L;
	private String id;
	private Integer version;
	private String editor;
	private String creater;
	private Date editTime;
	private Date createTime;
	private String messageId;
	private String messageBody;
	private String messageDataType;
	private String consumerQueue;
	private Integer messageSendTimes;
	private String areadlyDead;
	private String status;
	private String remark;
	private String field1;
	private String field2;
	private String field3;

	// Constructors

	/** default constructor */
	public DruckTransactionMessage() {
	}
	
	public DruckTransactionMessage(String messageId, String messageBody, String consumerQueue) {
		this.messageId = messageId;
		this.messageBody = messageBody;
		this.consumerQueue = consumerQueue;
	}

	/** minimal constructor */
	public DruckTransactionMessage(Integer version, Date createTime,
			String messageId, String messageBody, String consumerQueue,
			Integer messageSendTimes, String areadlyDead, String status) {
		this.version = version;
		this.createTime = createTime;
		this.messageId = messageId;
		this.messageBody = messageBody;
		this.consumerQueue = consumerQueue;
		this.messageSendTimes = messageSendTimes;
		this.areadlyDead = areadlyDead;
		this.status = status;
	}

	/** full constructor */
	public DruckTransactionMessage(Integer version, String editor,
			String creater, Date editTime, Date createTime,
			String messageId, String messageBody, String messageDataType,
			String consumerQueue, Integer messageSendTimes, String areadlyDead,
			String status, String remark, String field1, String field2,
			String field3) {
		this.version = version;
		this.editor = editor;
		this.creater = creater;
		this.editTime = editTime;
		this.createTime = createTime;
		this.messageId = messageId;
		this.messageBody = messageBody;
		this.messageDataType = messageDataType;
		this.consumerQueue = consumerQueue;
		this.messageSendTimes = messageSendTimes;
		this.areadlyDead = areadlyDead;
		this.status = status;
		this.remark = remark;
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "uuid")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id", unique = true, nullable = false, length = 80)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "version", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "editor", length = 100)
	public String getEditor() {
		return this.editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	@Column(name = "creater", length = 100)
	public String getCreater() {
		return this.creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	@Column(name = "edit_time", length = 19)
	public Date getEditTime() {
		return this.editTime;
	}

	public void setEditTime(Date editTime) {
		this.editTime = editTime;
	}

	@Column(name = "create_time", nullable = false, length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "message_id", nullable = false, length = 50)
	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	@Column(name = "message_body", nullable = false)
	public String getMessageBody() {
		return this.messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	@Column(name = "message_data_type", length = 50)
	public String getMessageDataType() {
		return this.messageDataType;
	}

	public void setMessageDataType(String messageDataType) {
		this.messageDataType = messageDataType;
	}

	@Column(name = "consumer_queue", nullable = false, length = 100)
	public String getConsumerQueue() {
		return this.consumerQueue;
	}

	public void setConsumerQueue(String consumerQueue) {
		this.consumerQueue = consumerQueue;
	}

	@Column(name = "message_send_times", nullable = false)
	public Integer getMessageSendTimes() {
		return this.messageSendTimes;
	}

	public void setMessageSendTimes(Integer messageSendTimes) {
		this.messageSendTimes = messageSendTimes;
	}

	@Column(name = "areadly_dead", nullable = false, length = 20)
	public String getAreadlyDead() {
		return this.areadlyDead;
	}

	public void setAreadlyDead(String areadlyDead) {
		this.areadlyDead = areadlyDead;
	}

	@Column(name = "status", nullable = false, length = 20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "remark", length = 200)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "field1", length = 200)
	public String getField1() {
		return this.field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	@Column(name = "field2", length = 200)
	public String getField2() {
		return this.field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	@Column(name = "field3", length = 200)
	public String getField3() {
		return this.field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}
	
	public void addSendTimes() {
		this.messageSendTimes = this.messageSendTimes + 1;
	}

}