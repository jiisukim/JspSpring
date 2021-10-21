package chapter12.vo;

public class MemberVO {
	private String memNo;
	private String memName;
	
	//��ü ������ ȸ��Id, ȸ���� �ʼ�
	public MemberVO(String memNo, String memName) {
		super();
		this.memNo = memNo;
		this.memName = memName;
	}

	public String getMemNo() {
		return memNo;
	}

	public void setMemNo(String memNo) {
		this.memNo = memNo;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	@Override
	public String toString() {
		return "MemberVO [memNo=" + memNo + ", memName=" + memName + "]";
	}
	
	
	
}
