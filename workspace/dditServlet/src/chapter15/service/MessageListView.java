package chapter15.service;

import java.util.List;

import chapter15.vo.Message;

//����¡ ó���� ���� ���� Ŭ����
public class MessageListView {
	private int messageTotalCount;	//��ü ���ڵ� ����(ī��θ�Ƽ)
	private int currentPageNumber; //���� ������ ��ȣ
	private List<Message> messageList;	//select ��� ����Ʈ
	private int pageTotalCount;	//�������� ��ü ����
	private int messageCountPerPage;	//������ �� ���� ����
	private int firstRow;	//���� ������ ����� ���� ���ȣ
	private int endRow; 	//���� ������ ����� �� ���ȣ
	
	public MessageListView(int messageTotalCount, int currentPageNumber, List<Message> messageList
			, int messageCountPerPage, int firstRow, int endRow) {
		this.messageTotalCount = messageTotalCount;
		this.currentPageNumber = currentPageNumber;
		this.messageList = messageList;
		this.messageCountPerPage = messageCountPerPage;
		this.firstRow = firstRow;
		this.endRow = endRow;
		
		//��ü ������ �� ���ϱ�
		calculatePageTotalCount();
	}
	
	private void calculatePageTotalCount() {
		//���� select ����� ������.. messageTotalCount : 0
		if(messageTotalCount==0) {
			pageTotalCount = 0;
		}else {
			//��ü �������� �� = ��ü ���� �� / 1������ �� ȭ�鿡 ������ ���� ���� => ���� = ���� / ����
			pageTotalCount = messageTotalCount / messageCountPerPage;
			//ex) 32�� / 1��������5���� �����ַ��� => 2�� ���Ƽ� �� 7�������� ó���Ǿ����
			if(messageTotalCount%messageCountPerPage>0) {
				pageTotalCount++;
			}
		}
	}
	
	public int getMessageTotalCount() {
		return messageTotalCount;
	}
	public int getCurrentPageNumber() {
		return currentPageNumber;
	}
	public List<Message> getMessageList() {
		return messageList;
	}
	public int getPageTotalCount() {
		return pageTotalCount;
	}
	public int getMessageCountPerPage() {
		return messageCountPerPage;
	}
	public int getFirstRow() {
		return firstRow;
	}
	public int getEndRow() {
		return endRow;
	}
	//select ����� ��� �ִ��� üũ
	public boolean isEmpty() {
		return messageTotalCount == 0;
	}
	
}





