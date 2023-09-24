package password_manager;

import java.io.Serializable;
import java.util.Vector;

public class GlobalData implements Serializable {

	private Vector<UserData> user_datas = new Vector<UserData>();

	public GlobalData() {}
	/*
	 * add data
	 */
	public void add_user(UserData data) {
		this.user_datas.add(data);

	}

	public boolean has_email(String email) {
		for (int i = 0; i < user_datas.size(); i++) {
			if (user_datas.get(i).getEmail().equals(email))
				return true;
		}
		return false;
	}

	public boolean check_user_pass(String email, String password) {
		for (int i = 0; i < user_datas.size(); i++) {
			if (user_datas.get(i).getEmail().equals(email))
				return user_datas.get(i).getPassword().equals(password);
		}
		return false;
	}

}
