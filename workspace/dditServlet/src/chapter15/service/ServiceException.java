package chapter15.service;

public class ServiceException extends RuntimeException{
	//�����ε� : �ϳ��� Ŭ�������� ���� �̸��� �޼ҵ带 ������ ���
	//������. �޽����� ���� ����
	public ServiceException(String message,Exception cause) {
		super(message,cause);
	}
	public ServiceException(String message) {
		super(message);
	}
}
