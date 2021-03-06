package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import base.ConnectionManager;
import beans.Customer;

public class CustomerDAO {

	public Customer showCustomer(int targetId) throws SQLException{

		Connection con =null;

		String sql="SELECT * FROM customer_info_db.m_customer WHERE customer_id=?";

		Customer customer=new Customer();

		try  {

			con = ConnectionManager.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, targetId);

			ResultSet rs=pstmt.executeQuery();

			if(!rs.next()) {

			}
			int customerId=rs.getInt("customer_id");
			String customerName=rs.getString("customer_name");
			String customerNameKana=rs.getString("customer_name_kana");
			String postalCode=rs.getString("postal_code");
			String address=rs.getString("address");

			customer.setCustomerId(customerId);
			customer.setCustomerName(customerName);
			customer.setCustomerNameKana(customerNameKana);
			customer.setPostalCode(postalCode);
			customer.setAddress(address);

			return customer;
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

	public List<Customer> showAllCustomer() throws SQLException{

		Connection con=null;

		List<Customer> customerList=new ArrayList<>();

		String sql="SELECT * FROM customer_info_db.m_customer";

		try{

			con=ConnectionManager.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);

			while(rs.next()) {
				int customerId=rs.getInt("customer_id");
				String customerName=rs.getString("customer_name");
				String customerNameKana=rs.getString("customer_name_kana");
				String postalCode=rs.getString("postal_code");
				String address=rs.getString("address");

				Customer customer=new Customer();
				customer.setCustomerId(customerId);
				customer.setCustomerName(customerName);
				customer.setCustomerNameKana(customerNameKana);
				customer.setPostalCode(postalCode);
				customer.setAddress(address);

				customerList.add(customer);
			}

			return customerList;

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
	public int insertCustomer(Customer customer) throws SQLException{

		Connection con =null;
		int count=0;

		String sql="INSERT INTO customer_info_db.m_customer"
				+ "(customer_name,customer_name_kana,postal_code,address) "
				+ "VALUES (?,?,?,?)";

		try  {
			con = ConnectionManager.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, customer.getCustomerName());
			pstmt.setString(2, customer.getCustomerNameKana());
			pstmt.setString(3, customer.getPostalCode());
			pstmt.setString(4, customer.getAddress());

			count=pstmt.executeUpdate();

			return count;

		} catch (SQLException e) {
			e.printStackTrace();
			return count;
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
					return count;
				}
			}
		}
	}

	public int deleteCustomer(int customerId) throws SQLException{
		int count = 0;
		String sql1="DELETE FROM customer_info_db.m_customer WHERE customer_id=?";
		String sql2 = "DELETE FROM customer_info_db.t_inquiry WHERE customer_id=?";

		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql2)) {

			pstmt.setInt(1, customerId);

			count=pstmt.executeUpdate();
		}
		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql1)) {

			pstmt.setInt(1, customerId);

			count=pstmt.executeUpdate();

			return count;
		}
	}


	public int updateCustomer(Customer customer) throws SQLException{

		Connection con=null;

		String sql="UPDATE customer_info_db.m_customer "
				+ "SET customer_name=?,customer_name_kana=?,postal_code=?,address=? "
				+ "WHERE customer_id=?";

		int count=0;

		try{

			con=ConnectionManager.getConnection();
			PreparedStatement pstmt=con.prepareStatement(sql);


			pstmt.setString(1, customer.getCustomerName());
			pstmt.setString(2, customer.getCustomerNameKana());
			pstmt.setString(3, customer.getPostalCode());
			pstmt.setString(4, customer.getAddress());
			pstmt.setInt(5, customer.getCustomerId());

			count=pstmt.executeUpdate();


			return count;

		} catch (SQLException e) {
			e.printStackTrace();
			return count;
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
					return count;
				}
			}
		}
	}

//	private static String switchSql(int selectNum) {
//
//		String sql="UPDATE customer_info_db.m_customer ";
//		switch(selectNum) {
//		case 1:
//			sql+="SET customer_name=? WHERE customer_id=?";
//			break;
//		case 2:
//			sql+="SET customer_name_kana=? WHERE customer_id=?";
//			break;
//		case 3:
//			sql+="SET postal_code=? WHERE customer_id=?";
//			break;
//		case 4:
//			sql+="SET address=? WHERE customer_id=?";
//			break;
//		}
//		return sql;
//	}
}
