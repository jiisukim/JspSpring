package kr.or.ddit.vo;

// 자바빈 클래스
public class Member {
   private String userName ="김은대";
   private String password ="1234";
   
   public String getUserName() {
      return userName;
   }
   public void setUserName(String userName) {
      this.userName = userName;
   }
   public String getPassword() {
      return password;
   }
   public void setPassword(String password) {
      this.password = password;
   }
   
   @Override
   public String toString() {
      return "Member [userName=" + userName + ", password=" + password + "]";
   }
   
   
   
}