package chapter08.member;

import java.util.Date;
/**
 * 
 * 
 * @author PC-18
 * �ڹٺ� : �Ӽ�(������), ���� �̺�Ʈ, ��ü ����ȭ�� ���� ǥ��
 * JSP������ �Ӽ��� ǥ���ϱ� ���� �뵵�� ���
 * �ڹٺ� �Ծ��� ������ Ŭ������ �ڹٺ��̶�� �θ�.
 */
public class MemberInfo {
	//1) �����͸� �����ϴ� �ʵ�
	private String id;
	private String password;
	private String name;
	private String address;
	private Date registerdate;
	private String email;
	
	//�����͸� �о�� �� ���Ǵ� getter �޼���
	public String getId() {
		return id;
	}
	//���� ������ �� ����ϴ� setter �޼���
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getRegisterdate() {
		return registerdate;
	}
	public void setRegisterdate(Date registerdate) {
		this.registerdate = registerdate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
