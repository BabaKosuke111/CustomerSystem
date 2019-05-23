package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import base.ConnectionManager;
import beans.User;

public class UserDAO {

	/**
	 * ユーザーIDを取得
	 *
	 * @param userId
	 *            ユーザID
	 * @param password
	 *            パスワード
	 * @return boolean ログインIDとパスワードが正しい場合対象のユーザーID 正しいtrue 正しくない||登録されていない場合false
	 * @throws SQLException
	 *             呼び出し元にスロー
	 */
	public User getLogin(String userId,String password)  {

		String sql="SELECT * FROM  customer_info_db.m_user WHERE user_id=? AND password = ?";

		User user=new User();
		Connection con=null;
		try{
			con = ConnectionManager.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, userId);
			pstmt.setString(2, password);

			ResultSet rs = pstmt.executeQuery();
			if(!rs.next()) {
			}

			String userIdData=rs.getString("user_id");
			String userNameData=rs.getString("user_name");
			String passwordData=rs.getString("password");
			//ユーザIDとパスワード正しい場合loginFlag=trueを代入
			if(userId.equals(userIdData)==true&&password.equals(passwordData)==true) {
				user.setUserId(userIdData);
				user.setUserName(userNameData);
				user.setPassword(passwordData);
			}
			return user;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
	}
}


