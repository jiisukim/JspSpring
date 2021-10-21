package chapter15.vo;

public class Message {
	private int messageId;
	private String guestName;
	private String password;
	private String message;
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	//���� �޽����� ��й�ȣ�� �����Ǿ� �ִ��� Ȯ��
	public boolean hasPassword() {
		return password!=null&&!password.isEmpty();
	}
		
	//��й�ȣ�� ��й�ȣ Ȯ�� ���� ������ Ȯ��
	public boolean matchPassword(String pwd) {
		return password!=null&&password.equals(pwd);
	}
	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", guestName=" + guestName + ", password=" + password + ", message="
				+ message + "]";
	}
	
	
	
	
}
