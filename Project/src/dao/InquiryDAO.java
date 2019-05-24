package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import base.ConnectionManager;
import beans.Inquiry;

public class InquiryDAO {

	public List<Inquiry> showAllInquiry() throws SQLException{


		Connection con=null;

		List<Inquiry> inquiryList=new ArrayList<>();

		String sql="SELECT ti.inquiry_id, i.item_name, "
				+ "c.customer_name,ti.inquiry_contents,s.status_name "
				+ "FROM ((customer_info_db.t_inquiry ti "
				+ "LEFT OUTER JOIN customer_info_db.m_item i "
				+ "ON ti.item_id=i.item_id) "
				+ "LEFT OUTER JOIN customer_info_db.m_status s "
				+ "ON ti.status_code=s.status_code) "
				+ "LEFT OUTER JOIN customer_info_db.m_customer c "
				+ "ON ti.customer_id=c.customer_id";

		try {

			con=ConnectionManager.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);


			while(rs.next()) {
				int inquiryId=rs.getInt("inquiry_id");
				String itemName=rs.getString("item_name");
				String customerName=rs.getString("customer_name");
				String inquiryContents=rs.getString("inquiry_contents");
				String statusName=rs.getString("status_name");

				Inquiry inquiry=new Inquiry();
				inquiry.setInquiryId(inquiryId);
				inquiry.setItemName(itemName);
				inquiry.setCustomerName(customerName);
				inquiry.setInquiryContents(inquiryContents);
				inquiry.setStatusName(statusName);

				inquiryList.add(inquiry);
			}
			return inquiryList;


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

	public int insertInquiry(Inquiry inquiry) throws SQLException{


		String sql="INSERT INTO customer_info_db.t_inquiry "
				+ "(customer_id,item_id,inquiry_contents) "
				+ "VALUES (?,?,?) ";

		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {

			pstmt.setInt(1, inquiry.getCustomerId());
			pstmt.setInt(2, inquiry.getItemId());
			pstmt.setString(3, inquiry.getInquiryContents());

			int count=pstmt.executeUpdate();

			return count;
		}
	}

	public int updateInquiry(Inquiry inquiry) throws SQLException{

		String sql="UPDATE customer_info_db.t_inquiry "
				+ "SET reply_contents=?,status_code=? "
				+ "WHERE inquiry_id=? ";

		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {

			pstmt.setString(1, inquiry.getReplyContents());
			pstmt.setString(2, "99");
			pstmt.setInt(3, inquiry.getInquiryId());

			int count=pstmt.executeUpdate();

			return count;
		}
	}

	public int deleteInquiry(int inquiryId) throws SQLException{

		String sql="DELETE FROM customer_info_db.t_inquiry "
				+ "WHERE inquiry_id=? ";

		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {

			pstmt.setInt(1, inquiryId);

			int count=pstmt.executeUpdate();

			return count;
		}
	}
}
