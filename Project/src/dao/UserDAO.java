package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import base.ConnectionManager;

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
	public boolean getLogin(String userId,String password)  {
		String userdata=null;
		String passdata=null;
		//ログイン判定
		boolean loginFlag=false;

		String sql="SELECT user_id, password FROM  customer_info_db.m_user WHERE user_id=? AND password = ?";

		Connection con=null;
		try{
			con = ConnectionManager.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, userId);
			pstmt.setString(2, password);

			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
			userdata=rs.getString("user_id");
			passdata=rs.getString("password");
			}
			//ユーザIDとパスワード正しい場合loginFlag=trueを代入
			if(userId.equals(userdata)==true&&password.equals(passdata)==true) {
				loginFlag=true;
			}
			return loginFlag;

        } catch (SQLException e) {
            e.printStackTrace();
            return loginFlag;
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    return loginFlag;
                }
            }
        }
	}
}


