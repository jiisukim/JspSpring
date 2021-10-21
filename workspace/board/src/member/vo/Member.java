package member.vo;

import java.util.Date;

//�ڹٺ� Ŭ����
public class Member {
	private String memberid;
	private String name;
	private String password;
	private Date regDate;
	public Member(String memberid, String name, String password, Date regDate) {
		this.memberid = memberid;
		this.name = name;
		this.password = password;
		this.regDate = regDate;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	//��й�ȣ ���� ��� ���� �� ���. ������ true ����
	public boolean matchPassword(String pwd) {
		return password.equals(pwd);
	}
	
	@Override
	public String toString() {
		return "Member [memberid=" + memberid + ", name=" + name + ", password=" + password + ", regDate=" + regDate
				+ "]";
	}
	public void changePassword(String newPwd) {
		//���� ��й�ȣ�� �ű� ��й�ȣ�� �ٲ�
		this.password = newPwd;
		
	}
	
	
}
