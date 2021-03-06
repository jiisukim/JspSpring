package chapter15.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import chapter15.jdbc.JdbcUtil;
import chapter15.vo.Message;

public class MessageDao {
	//한 개 객체만 사용하도록 싱글톤 패턴을 적용
	private static MessageDao messageDao = new MessageDao();
	private MessageDao() {}
	public static MessageDao getInstance() {return messageDao;}
	
	public int insert(Connection conn, Message messageVo) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(
				"insert into guestbook_message" +
				"(message_id, guest_name, password, message) " +
				" values((select nvl(max(message_id),0)+1 from guestbook_message),?,?,?)"
				);
			pstmt.setString(1, messageVo.getGuestName());
			pstmt.setString(2, messageVo.getPassword());
			pstmt.setString(3, messageVo.getMessage());
			//pstmt.executeUpdate() : 반영된 행의 수를 return 
			return pstmt.executeUpdate();
		}finally {
			JdbcUtil.close(pstmt);
		}
	}
	//service 객체에서 사용할 메서드(방명록 목록 리스트를 리턴)
	public List<Message> selectList(Connection conn, int firstRow, int endRow) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(
				"SELECT * "
				+ " FROM"
				+ " ("
				+ "    SELECT ROW_NUMBER() OVER (ORDER BY MESSAGE_ID DESC) RNUM"
				+ "         , MESSAGE_ID, GUEST_NAME, PASSWORD, MESSAGE"
				+ "    FROM   GUESTBOOK_MESSAGE"
				+ " ) T"
				+ " WHERE T.RNUM BETWEEN " + firstRow + " AND " + endRow
					);
			rs = pstmt.executeQuery();
			if(rs.next()) {//select 결과가 존재할 때
				List<Message> messageList = new ArrayList<Message>();
				do {
					Message message = new Message();
					message.setMessageId(rs.getInt("message_id"));
					message.setGuestName(rs.getString("guest_name"));
					message.setPassword(rs.getString("password"));
					message.setMessage(rs.getString("message"));
					
					messageList.add(message);
				}while(rs.next());
				return messageList;				
			}else {//select 결과가 null 실행
				return Collections.emptyList();
			}			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return null;
	}
	//전체 행의 개수를 구함
	public int selectCount(Connection conn) throws SQLException {
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//쿼리를 위한 형식 객체 생성
			stmt = conn.createStatement();
			//stmt 형색 객체를 통해 쿼리를 실행
			rs = stmt.executeQuery("select count(*) from guestbook_message");
			//next() 메서드를 실행하여 1행을 바라보도록 함
			rs.next();
			return rs.getInt(1);			
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
		}
		
	}
	public Message select(Connection conn, int messageId) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(
					"SELECT * FROM GUESTBOOK_MESSAGE WHERE MESSAGE_ID = ?"
					);
			pstmt.setInt(1, messageId);
			rs = pstmt.executeQuery();
		//SELECT * FROM GUESTBOOK_MESSAGE WHERE MESSAGE_ID = messageId
			if(rs.next()) {
				//VO(Model이라고도 함)
				Message message = new Message();
				message.setMessageId(rs.getInt("message_id"));
				message.setGuestName(rs.getString("guest_name"));
				message.setPassword(rs.getString("password"));
				message.setMessage(rs.getString("message"));
				
				return message;
			}else {
				return null;
			}
			
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
	}
	public int delete(Connection conn, int messageId) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(
					"DELETE FROM GUESTBOOK_MESSAGE WHERE MESSAGE_ID = ?"
					);
			pstmt.setInt(1, messageId);
			//delete된 행의 수가 int 형으로 return됨
			return pstmt.executeUpdate();
		}finally {
			JdbcUtil.close(pstmt);
		}
		
	}
}





