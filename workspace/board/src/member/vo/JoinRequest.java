package member.vo;

import java.util.Map;

public class JoinRequest {
	private String memberid;
	private String name;
	private String password;
	private String confirmPassword;
	
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
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "JoinRequest [memberid=" + memberid + ", name=" + name + ", password=" + password + ", confirmPassword="
				+ confirmPassword + "]";
	}
	public void validate(Map<String, Boolean> errors) {
		checkEmpty(errors, "memberid", memberid);
		checkEmpty(errors, "name", name);
		checkEmpty(errors, "password", password);
		//confirmPassword�� ���� �ִٸ� errors�� confirmPassword Ű�� TRUE ���� ������?
		checkEmpty(errors, "confirmPassword", confirmPassword);
		//password�� confirmPassword�� ��� ���� ���� �� errors�� �ƹ��͵� �ȵ�(put)
		//but, password�� confirmPassword�� �ٸ� ���� �� errors�� ������ �־���� ��
		//!errors�� �ǹ̴� confirmPassword�� ���� �ִٴ� ��
		/*
		 * checkEmpty(errors, "confirmPassword", confirmPassword); �����ϸ� ���� ��������� �ƹ� ���� ������� �ʰ�
		 * ���� ��� ���� ��� TRUE�� ����ȴ�.
		 * !errors.containsKey("confirmPassword") : errors.containsKey("confirmPassword") ==>  errors�ȿ� confirmPassword��� Ű �̸��� ������ �ִ���
		 * TRUE(����������) ���� Ű �̸��� ������ �ֱ� ������ 
		 * errors.containsKey("confirmPassword")== TRUE => ���� ����ִ�
		 * �ٵ� �տ� ����[!]�� �ٱ� ������ ���� ������ ���� ��
		 */
		if(!errors.containsKey("confirmPassword")) { //confirmPassword�� ä�����ִ�
			if(!isPasswordEqualToconfirm()) {	//password�� confirmPasswor�� �ٸ���
				errors.put("notMatch", Boolean.TRUE);
			}
		}
	}
	//errors : �����Ǿ� �ִ� errors, fieldName : vo�� �������, value : vo�� ��������� ��
	private void checkEmpty(Map<String, Boolean> errors, String fieldName, String value) {
		if(value==null||value.isEmpty()) {
			errors.put(fieldName, Boolean.TRUE);
		}
	}
	
	//password�� confirmPassword�� ���� ������ ��. ������ True, �ٸ��� False ����
	public boolean isPasswordEqualToconfirm() {
		return password != null && password.equals(confirmPassword);
	}
}






