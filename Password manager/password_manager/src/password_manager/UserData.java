package password_manager;
import java.io.Serializable;

public class UserData implements Serializable{
	
	private String email;
	private String password;

	public UserData(String email, String password) {

		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPassword() {
		return this.password;
	}

}
