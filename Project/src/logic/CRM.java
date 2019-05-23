package logic;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import beans.Customer;
import beans.Inquiry;
import beans.User;
import dao.CustomerDAO;
import dao.InquiryDAO;
import dao.UserDAO;

public class CRM {

	public static void main(String[] args) throws SQLException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int sample = 0;
		UserDAO udao = new UserDAO();
		System.out.println("顧客管理システムです");
		System.out.println("********************");
		//ログイン処理
		while(true) {
			System.out.println("ログインしてください");
			System.out.print("ユーザーID:");
			String user = scan.nextLine();
			System.out.print("パスワード:");
			String password = scan.nextLine();

			if(udao.getLogin(user,password)==true) {
				System.out.println("ログインしました");
				break;
			}else {
				System.out.println("ユーザーIDまたはパスワードが違います");
			}
		}



		while(true) {
			System.out.println("********************");
			System.out.println("顧客情報と問い合わせ情報のどちらを操作しますか");
			System.out.println("顧客情報:k");
			System.out.println("問い合わせ情報:t");
			System.out.println("ユーザー登録:u");
			System.out.println("ログアウト:q");
			System.out.print("コマンドを入力してください:");
			String select = scan.next();

			if(select.equals("q"))break;
			switch (select) {
			case "k":
				if(Customer()==true) {
					break;
				}
			case "t":
				if(Inquiry()==true) {
					break;
				}
			case "u":
				if(User()==true) {
					break;
				}
			default:
				//System.out.println("操作は次の中から選択してください。[k:顧客情報 t:問い合わせ情報 q:終了]");
				break;
			}
		}
		//ログアウトの胸を表示（馬場）
		System.out.println("ログアウトしました。");
	}

	/*顧客情報処理
	 * s:一覧表示
	 * i:登録
	 * d:削除
	 * h:編集
	 * b:メニューに戻る
	 */
	public static boolean Customer() throws SQLException {
		Scanner scan = new Scanner(System.in);
		final CustomerDAO cdao = new CustomerDAO();
		while(true) {
			List<Customer> customerList = cdao.showAllCustomer();
			Customer customer = new Customer();
			System.out.println("********************");
			System.out.println("操作を選択してください");
			System.out.println("顧客リスト表示:s");
			System.out.println("顧客リスト登録:i");
			System.out.println("顧客リスト削除:d");
			System.out.println("顧客リスト編集:h");
			System.out.println("選択画面に戻る:b");
			System.out.print("コマンドを入力してください:");
			String customerselect = scan.next();

			switch (customerselect) {

			case "s":
				System.out.println("********************");
				System.out.println("顧客リスト一覧を表示します");


				for(Customer tempCus : customerList) {
					int id = tempCus.getCustomerId();
					String name = tempCus.getCustomerName();
					String nameKana = tempCus.getCustomerNameKana();
					String postalCode = tempCus.getPostalCode();
					String  address= tempCus.getAddress();

					//コンソールに出力
					System.out.print(id + "\t|");
					System.out.print(name + "\t|");
					System.out.print(nameKana + "\t|");
					System.out.print(postalCode + "\t|");
					System.out.print(address + "\t|");
				}
				break;
			case "i":
				try {
					//顧客情報の入力

					System.out.println("********************");
					System.out.println("登録する従業員情報を指定してください。");
					System.out.print("・顧客名：");
					String name = scan.next();
					System.out.print("・顧客名ふりがな：");
					String nameKana = scan.next();
					System.out.print("・郵便番号：");
					String postalCode = scan.next();
					System.out.print("・所在地：");
					String  address= scan.next();
					System.out.print("・ユーザーID：");
					String userId = scan.next();

					System.out.println(name);
					System.out.println(userId);

					// 顧客情報の追加
					customer.setCustomerName(name);
					customer.setCustomerNameKana(nameKana);
					customer.setPostalCode(postalCode);
					customer.setAddress(address);

					int count = cdao.insertCustomer(customer);

					if (count >= 1) {
						System.out.println(count + "件の従業員情報を登録しました。");
						break;
					} else {
						throw new SQLException();
					}

				} catch (SQLException e) {
					System.out.println(e);
				}
				break;

			case "d":
				System.out.println("********************");
				System.out.println("従業員IDを入力してください");
				int customerId = scan.nextInt();
				System.out.println("本当に削除しますか？");
				System.out.println("はい:y");
				System.out.println("いいえ:n");
				String select = scan.next();
				if(select.equals("y")) {
					cdao.deleteCustomer(customerId);
				}else if(select.equals("n")) {
					break;
				}
				break;
			case "h":
				try {
					System.out.println("顧客情報を編集します");

					for(Customer tempCus : customerList) {
						int id = tempCus.getCustomerId();
						String name = tempCus.getCustomerName();
						String nameKana = tempCus.getCustomerNameKana();
						String postalCode = tempCus.getPostalCode();
						String  address= tempCus.getAddress();

						System.out.print(id + "\t|");
						System.out.print(name + "\t|");
						System.out.print(nameKana + "\t|");
						System.out.print(postalCode + "\t|");
						System.out.print(address + "\t|");
					}

					System.out.print("編集する顧客を番号で選択してください：");
					int customerNum = scan.nextInt();
					customer=cdao.showCustomer(customerNum);
					System.out.println(1+customer.getCustomerName());
					System.out.println(2+customer.getCustomerNameKana());
					System.out.println(3+customer.getPostalCode());
					System.out.println(4+customer.getAddress());

					System.out.println("編集するデータを番号でしてください");
					int selectNum=scan.nextInt();

					switch(selectNum) {
					case 1:
						System.out.print("顧客名：");
						String nameUpdate = scan.next();
						customer.setCustomerName(nameUpdate);
						break;
					case 2:
						System.out.print("・顧客名ふりがな：");
						String nameKanaUpdate = scan.next();
						customer.setCustomerNameKana(nameKanaUpdate);
						break;
					case 3:
						System.out.print("・郵便番号：");
						String postalCodeUpdate = scan.next();
						customer.setPostalCode(postalCodeUpdate);
						break;
					case 4:
						System.out.print("・所在地：");
						String  addressUpdate= scan.next();
						customer.setAddress(addressUpdate);
						break;
					}

					customer.setCustomerId(customerNum);

					int count=cdao.updateCustomer(selectNum,customer);

					if (count >= 1) {
						System.out.println(count + "件のデータを編集しました。");
					} else {
						throw new SQLException();
					}
				}catch (SQLException e) {
					System.out.println(e);
				}

				break;

			case "b":
				return true;
			default :
				System.out.println("操作は次の中から選択してください。[s:リスト表示 i:登録 d:削除 h:編集 b:メニュー画面に戻る]");
			}
		}
	}


	/*問い合わせ情報処理
	 * s:一覧表示
	 * i:登録
	 * d:削除
	 * h:編集
	 * b:メニューに戻る
	 */
	public static boolean Inquiry() throws SQLException {
		Scanner scan = new Scanner(System.in);
		final InquiryDAO inq = new InquiryDAO();
		while(true) {
			//リスト、インスタンス位置変更（馬場）
			List<Inquiry> inquiryList = inq.showAllInquiry();
			Inquiry inquiry= new Inquiry();
			System.out.println("********************");
			//丁寧な口調に変更（馬場）
			System.out.println("操作を選択してください");
			System.out.println("お問い合わせリスト表示:s");
			System.out.println("お問い合わせ登録:i");
			System.out.println("お問い合わせ削除:d");
			System.out.println("お問い合わせ回答:h");
			System.out.println("選択画面に戻る:b");
			System.out.print("コマンドを入力してください:");
			String customerselect = scan.next();

			switch (customerselect) {
			case "s":
				System.out.println("********************");
				System.out.println("問い合わせリスト一覧を表示します");
				//List<Inquiry> inquiryList = inq.showAllInquiry();

				for(Inquiry tempinq : inquiryList) {
					int inquiryId = tempinq.getInquiryId();
					String itemName =  tempinq.getItemName();
					String customerName =  tempinq.getCustomerName();
					String  inquiryContents=  tempinq.getInquiryContents();
					String statusName =  tempinq.getStatusName();

					System.out.print(inquiryId + "\t|");
					System.out.print(itemName + "\t|");
					System.out.print(customerName + "\t|");
					System.out.print(inquiryContents + "\t|");
					System.out.println(statusName + "\t|");
				}
				break;
			case "i":
				try {
					//Inquiry inquiry= new Inquiry();
					System.out.println("********************");
					System.out.println("登録する問い合わせ情報を指定してください。");
					System.out.print("・顧客ID：");
					int customerId = scan.nextInt();
					System.out.print("・部品ID：");
					int itemId = scan.nextInt();
					System.out.print("・問い合わせ内容：");
					String inquiryContents = scan.next();


					// 授業員情報の追加
					inquiry.setCustomerId(customerId);
					inquiry.setItemId(itemId);
					inquiry.setInquiryContents(inquiryContents);

					int count = inq.insertInquiry(inquiry);

					if (count >= 1) {
						System.out.println(count + "件の問い合わせ情報を登録しました。");
						break;
					} else {
						throw new SQLException();
					}

				} catch (SQLException e) {
					System.out.println(e);
				}
				break;


			case "d":
				System.out.println("********************");
				System.out.println("問い合わせIDを入力してください");
				//変数名後ろで使うため変更（馬場）
				int inquiryDeleteId = scan.nextInt();

				//確認画面
				System.out.println("本当に削除しますか？");
				System.out.println("はい:y");
				System.out.println("いいえ:n");
				String select = scan.next();
				if(select.equals("y")) {
					inq.deleteInquiry(inquiryDeleteId);
				}else if(select.equals("n")){
					break;
				}
				break;
			case "h":
				//お問い合わせ回答追加（馬場）
				try {
					System.out.println("********************");
					System.out.println("お問い合わせに対して回答します");
					for(Inquiry tempinq : inquiryList) {
						int inquiryId = tempinq.getInquiryId();
						String itemName =  tempinq.getItemName();
						String customerName =  tempinq.getCustomerName();
						String  inquiryContents=  tempinq.getInquiryContents();
						String statusName =  tempinq.getStatusName();

						System.out.print(inquiryId + "\t|");
						System.out.print(itemName + "\t|");
						System.out.print(customerName + "\t|");
						System.out.print(inquiryContents + "\t|");
						System.out.println(statusName + "\t|");
					}
					int count=0;
					while(true) {
						int inquiryCount=0;
						System.out.print("回答するお問い合わせの番号を指定してください：");
						int selectInquiryNum=scan.nextInt();

						for(Inquiry tempinq : inquiryList) {

							if(selectInquiryNum==tempinq.getInquiryId()) {
								break;
							}
							inquiryCount++;
						}
						if(inquiryCount>=inquiryList.size()) {
							System.out.println("リストにあるお問い合わせ番号がありません。");
							continue;
						}

						System.out.print("回答：");
						String inputReply=scan.next();


						inquiry.setInquiryId(selectInquiryNum);
						inquiry.setReplyContents(inputReply);
						count=inq.updateInquiry(inquiry);
						break;
					}
					if (count >= 1) {
						System.out.println(count + "件のお問い合わせに回答しました。");
					} else {
						throw new SQLException();
					}
				} catch (SQLException e) {
					System.out.println(e);
				}
				break;


			case "b":
				return true;
			default :
				System.out.println("操作は次の中から選択してください。[s:リスト表示 i:登録 d:削除 h:編集 b:メニュー画面に戻る]");
			}
		}
	}

	/*ユーザー登録処理
	 *
	 * */
	public static boolean User() {
		User user= new User();
		Scanner scan = new Scanner(System.in);
		System.out.println("ユーザー情報を入力してください");
		System.out.print("ユーザーID:");
		String userId = scan.next();
		System.out.print("名前:");
		String userName = scan.next();
		System.out.print("パスワード:");
		String userPassword1 = scan.next();
		System.out.print("パスワード(確認用):");
		String userPassword2 = scan.next();

		if(userPassword1.equals(userPassword2)) {
			user.setUserId(userId);
			user.setUserName(userName);
			user.setPassword(userPassword1);

			System.out.println("ユーザー登録が完了しました");
			return true;
		}else {
			System.out.println("確認用パスワードに誤りがあります");
			return false;
		}
	}
}


