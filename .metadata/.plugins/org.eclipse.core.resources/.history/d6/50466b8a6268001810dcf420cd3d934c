
public class rensyu {

	public static void main(String[] args) {

		int selected =new java.util.Random().nextInt(4);
		switch(selected){
			case 1:
				System.out.println("検索");
				break;
			case 2:
				System.out.println("登録");
				break;
			case 3:
				System.out.println("削除");
				break;
			case 4:
				System.out.println("変更");
		}

	}

}
"select iit.item_name,ubit.total_price,ubit.total_count,ubit.pay from user_buy_item_transaction ubit left join item_info_transaction iit on ubit.item_transaction_id = iit.id where ubit.item_transaction_id=? and ubit.user_master_id = ? order by ubit.insert_date DESC"






