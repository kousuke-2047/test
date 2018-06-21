import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.item.dto.ItemCDTO;
import com.item.dto.ItemDTO;

public class rensyu {

	public static void main(String[] args) {


		String[] a = new String[100];

		String b = "tamago";
		a[0]="aiueo";
		a[1]="kakikukeko";

		a[2]=b;


		System.out.println(a[0]);
		System.out.println(a[50]);



		itemcdto.setCount(itemdao.Itemcount());

}
}
public ArrayList<ItemDTO> getInfo(int number){

	String sql = "select * from item limit ?,4";

	try{
		int num=number*4-4;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, num);
		ResultSet rs = ps.executeQuery();

		while(rs.next()){
			ItemDTO dto = new ItemDTO();
			dto.setId(rs.getInt("id"));
			dto.setItemName(rs.getString("itemName"));
			dto.setCategory(rs.getString("category"));
			dto.setItemPrice(rs.getInt("itemPrice"));
			itemList.add(dto);
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	return itemList;
}
public ArrayList<ItemCDTO> getCount(){

	String sql= "select count(*) from item";

	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();

		cdto.setCount(rs.getInt(1));
		if(cdto.getCount()%4==0){
			int f = rs.getInt(1)/4;
			for(int i=1;i<=f;i++){
				ItemCDTO dto = new ItemCDTO();
				dto.setPage(i);
				countList.add(dto);
			}
		}else{
			int f = rs.getInt(1)/4+1;
			for(int i=1;i<=f;i++){
				ItemCDTO dto = new ItemCDTO();
				dto.setPage(i);
				countList.add(dto);
		}

		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	return countList;
}
public ArrayList<ItemDTO> getInfoByC(int number,String category){

	String sql="select * from item where category=? limit ?,4";

	try{
		int num = number*4-4;
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, category);
		ps.setInt(2, num);
		ResultSet rs = ps.executeQuery();

		while(rs.next()){
			ItemDTO dto = new ItemDTO();
			dto.setId(rs.getInt("id"));
			dto.setCategory(rs.getString("category"));
			dto.setItemName(rs.getString("itemName"));
			dto.setItemPrice(rs.getInt("itemPrice"));
			itemList.add(dto);
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	return itemList;
}
public ArrayList<ItemCDTO> getCountByC(String category)throws SQLException{

	String sql="select count(*) from item where category=?";

	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, category);
		ResultSet rs = ps.executeQuery();

		cdto.setCount(rs.getInt(1));
		if(cdto.getCount()%4==0){
			int f = rs.getInt(1)/4;

			for(int i=1;i<=f;i++){
				ItemCDTO cdto = new ItemCDTO();
				cdto.setPage(i);
				countList.add(cdto);
			}
		}else{
			int f = rs.getInt(1)/4+1;

			for(int i=1;i<=f;i++){
				ItemCDTO cdto = new ItemCDTO();
				cdto.setPage(i);
				countList.add(cdto);
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	return countList;
}