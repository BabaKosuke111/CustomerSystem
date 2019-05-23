package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import base.ConnectionManager;
import beans.Item;

public class ItemDAO {

	public List<Item> showAllItem() throws SQLException {
		List<Item> itemList=new ArrayList<>();

		String sql="SELECT * FROM customer_info_db.m_item";

		try(Connection con=ConnectionManager.getConnection();
				Statement stmt = con.createStatement()){

			ResultSet rs=stmt.executeQuery(sql);

			while(rs.next()) {
				int itemId=rs.getInt("item_id");
				String itemName=rs.getString("item_name");

				Item item=new Item();
				item.setItemId(itemId);
				item.setItemName(itemName);

				itemList.add(item);

			}
			return itemList;
		}
	}

}
