package bank;

import java.time.LocalDateTime;

public class Log {
	
	private String m_sender;
	private String m_receiver;
	private double amount;
	private LocalDateTime localDateTime;
	
	public Log(String senderNumber, double amount, String receiverNumber) {
		setSender(senderNumber);
		setAmount(amount);
		setReceiver(receiverNumber);
	}
	
	public Log(String senderNumber, double amount, String receiverNumber, LocalDateTime dateTime)	{
		this(senderNumber,amount,receiverNumber);
		setDateTime(dateTime);
	}
	
	public LocalDateTime getDateTime() {
		return localDateTime;
	}

	private void setDateTime(LocalDateTime dateTime) {
		this.localDateTime = dateTime;
	}

	private String getSender() {
		return m_sender;
	}

	private void setSender(String sender) {
		this.m_sender = sender;
	}

	private String getReceiver() {
		return m_receiver;
	}

	private void setReceiver(String receiver) {
		this.m_receiver = receiver;
	}

	private double getAmount() {
		return amount;
	}

	private void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isEqual(Log log) {
		if(this.getSender() != log.getSender())
			return false;
		if(this.getAmount() != log.getAmount())
			return false;
		if(this.getReceiver() != log.getReceiver())
			return false;
		return true;
	}
}
