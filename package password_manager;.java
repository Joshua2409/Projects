package password_manager;

<<<<<<< Updated upstream
import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static Scanner scanner = new Scanner(System.in);
	public static GlobalData globalData = new GlobalData();
	public static final String databaseFileName = "database";

	public static void save_data(GlobalData globalData, String file_name) {
		// TODO: need encryption
		try {
			// initialize file and stream output
			FileOutputStream fileStream = new FileOutputStream(file_name);
			ObjectOutputStream objOutputStream = new ObjectOutputStream(fileStream);

			// write the class
			objOutputStream.writeObject(globalData);

			// close up the open stream
			objOutputStream.close();
			fileStream.close();

		}

		catch (IOException ex) {
			System.out.println("exception while saving data: " + ex.getMessage());
		}

	}

	public static GlobalData load_data(String file_name) {
		GlobalData loadedData = new GlobalData();
		try {

			FileInputStream fileInputStream = new FileInputStream(file_name);
			ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream);

			// Method for deserialization of object
			loadedData = (GlobalData) objInputStream.readObject();

			objInputStream.close();
			fileInputStream.close();
		} catch (IOException ex) {
			ex.printStackTrace();

		} catch (ClassNotFoundException e) {
			// handle when class is not found
			// when doing readObject
			e.printStackTrace();
		}
		// everything looks okay,
		return loadedData;

	}

	public static boolean is_numeric(String str_input) {
		try {
			Double.parseDouble(str_input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static void clear_screen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void on_register() {
		clear_screen();
		System.out.println("Register Menu");
		// email input
		String email = "";
		do {
			System.out.println("Email: ");
			email = scanner.nextLine();
			if (UtilCheck.is_email_valid(email)) {
				break;
			}
			System.out.println("Email is not valid");

		} while (true);

		// password input
		// TODO: add input mask?
		String password = "";
		do {
			System.out.println("password : ");
			password = scanner.nextLine();
			if (UtilCheck.is_password_valid(password)) {
				break;
			}
			System.out.println("password is not valid");

			

		}while (true);
		System.out.println("confirm password : ");
		String confirmpassword = scanner.nextLine();
		 if (!confirmpassword.equals(password)) {
             System.out.println("Password doesn't matched");
             return;
         } 
		// init
		UserData data = new UserData(email, password);
		// add to our data
		globalData.add_user(data);

=======
<<<<<<< HEAD
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;


public class notepad{
	File f = new File("C:\\test");
	int ln;
	
	String username,password, email;
	
	void CreateFolder() {
	if(!f.exists()) 
	{
		f.mkdirs();
	}
 }

	
	void readFile(){
		try
		{
			FileReader fr = new FileReader(f+"\\login.txt");
		}
		catch (FileNotFoundException ex) {
			try 
			{
				FileWriter fw = new FileWriter(f+"\\login.txt");
				System.out.println("File created");
			}
			catch (IOException ex1) 
			{
				System.out.println();
			}
		}
	}

		void addData(String user, String pass, String mail) {
			try {
				RandomAccessFile raf = new RandomAccessFile(f+"\\login.txt", "rw");
				for(int i=0; i<ln; i++)
				{
					raf.readLine();
				}
				if(ln>0) 
				{
					raf.writeBytes("\r\n");
					raf.writeBytes("\r\n");
				}
				raf.writeBytes("Username:"+user+ "\r\n");
	            raf.writeBytes("Password:"+pass+ "\r\n");
	            raf.writeBytes("Email:"+mail);
			}catch (FileNotFoundException ex) {
				System.out.println("File not found");
			}
			catch (IOException ex) {
				System.out.println("Error");
			}
		}
	
		void Checkdata(String user, String pass) {
			try {
			     RandomAccessFile raf = new RandomAccessFile(f+"\\login.txt", "rw");
			     String line = raf.readLine();
		         username = line.substring(9);
		         password = raf.readLine().substring(9);
		         email = raf.readLine().substring(6);
			}catch (FileNotFoundException ex) {
				System.out.println("File not found");
			}
			catch (IOException ex) {
				System.out.println("Error");
			}
		}

	void CheckData(String user, String pass) {
		try {
            RandomAccessFile raf = new RandomAccessFile(f+"\\login.txt", "rw");
            
            String line = raf.readLine();
            username=line.substring(9);
            password=raf.readLine().substring(9);
            email = raf.readLine().substring(6);
            
            if(user.equals(username) & pass.equals(password)) {
            	System.out.println("Login Succesfully");
            }
            else 
            {
            	System.out.println("Wrong user/password");
            }
		}	catch (FileNotFoundException ex) {
				System.out.println("File not found");
			}
			catch (IOException ex) {
				System.out.println("Error");
			}
	}


	
	void logic(String user, String pass) {
		try {
			 RandomAccessFile raf = new RandomAccessFile(f+"\\login.txt", "rw");
		for (int i=0; i<ln; i+=4){
			System.out.println("count"+1);

            String forUser = raf.readLine().substring(9);
            String forPass = raf.readLine().substring(9);
            if(user.equals(forUser) & pass.equals(forPass)) {
            	System.out.println("Password matched");
            	break;
            }
            else if(i==(ln-3)){
            	System.out.println("Incorrect User/Password");
            	break;
            }
            
            for (int k=1; k<=2; k++) {
            	raf.readLine();
            	}
			}
		}
		catch (FileNotFoundException ex) {
			System.out.println("File not found");
		}
		catch (IOException ex) {
			System.out.println("Error");
		}
	}
	
	void countLines() {
		try {
			ln=0;
			RandomAccessFile raf = new RandomAccessFile(f+"\\logins.txt", "rw");
			for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
            System.out.println("number of lines:"+ln);
		}
		catch (FileNotFoundException ex) {
			System.out.println("File not found");
		}
		catch (IOException ex) {
			System.out.println("Error");
		}
	}
	
public class Main {
	public static void main(String[] arg) {
		System.out.println("Hello world!");
		System.out.println("Test123");	
	
=======
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static boolean is_numeric(String str_input) {
		try {
			Double.parseDouble(str_input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	} 
	public static void on_register() {
		System.out.println("Register Menu");
>>>>>>> Stashed changes
	}

	public static void on_login() {
		System.out.println("Login Menu");
<<<<<<< Updated upstream
		// email input
		String email = "";
		System.out.println("Email: ");
		email = scanner.nextLine();

		if (!globalData.has_email(email)) {
			System.out.println("Email hasn't been registered yet");
			return;
		}

		// input password
		String password = "";
		System.out.println("password: ");
		password = scanner.nextLine();

		if (!globalData.check_user_pass(email, password)) {
			System.out.println("password is invalid");
			return;

		}

		System.out.println("u are logged in");

=======
>>>>>>> Stashed changes
	}

	public static void intro() {
		System.out.println("Welcome user, to our password manager");

	}

<<<<<<< Updated upstream
	public static void unit_test() {
		/*
		 * eclipse doesn't enable assert by default
		 * 
		 * to enable assert go to Window->Preferences -> Java and installed JRES click
		 * edit... in default VM arguments add "-ea" options
		 * 
		 */

		System.out.println("testing app....");
		// valid email
		assert true == UtilCheck.is_email_valid("test@gmail.com");
		;
		assert true == UtilCheck.is_email_valid("nicho@gmail.com");
		;
		assert true == UtilCheck.is_email_valid("IHateJavaSoMuch@gmail.com");
		;
		assert true == UtilCheck.is_email_valid("KILLMEPLS12345421@gmail.com");
		;
		// invalid email
		assert false == UtilCheck.is_email_valid("andrewtanen@@gmail.com");
		;
		assert false == UtilCheck.is_email_valid("andrewtanen@@gmailcom");
		;
		assert false == UtilCheck.is_email_valid("@gmailcom");
		;
		assert false == UtilCheck.is_email_valid("@gmailcom");
		;
		assert false == UtilCheck.is_email_valid("andrewtanen@gmail.com@");
		;

		System.out.println("testing done");

	}

	public static void main(String[] arg) {

		/**/
		intro();
		unit_test();
		/*
		 * call back when program exits to save the data
		 **/
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			public void run() {
				System.out.println("saving data ...");
				save_data(globalData, databaseFileName);
				System.out.println("saving data done");

			}
		}));
		//
		/*
		 * try to load a data
		 */
		File databaseFile = new File(databaseFileName);
		// only load if file exist
		if (databaseFile.exists() && !databaseFile.isDirectory()) {
			globalData = load_data(databaseFileName);

		}
		// ==============================================================

		/* run program as normal */

		while (true) {

			clear_screen();
=======
	public static void main(String[] arg) {
		intro();
		while (true) {

			clearScreen();
>>>>>>> Stashed changes
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.println("your choice: ");
			int n = 0;
			String str_input = scanner.nextLine();
			// if string is not numeric -> invalid
			if (!is_numeric(str_input)) {
				System.out.println("Invalid input, input must be numeric");
				continue;
			} else {
				// convert string to number
				n = Integer.parseInt(str_input);
				if (n < 1 || n > 3) {
					System.out.println("Invalid input, must be between 1 to 3");

				}
<<<<<<< Updated upstream
=======
				
>>>>>>> Stashed changes

			}
			if (n == 1)
				on_register();
			if (n == 2)
				on_login();
			if (n == 3)
				return;
		}

	}
<<<<<<< Updated upstream
=======
>>>>>>> 0f8cd35f726c9b8c34430ea4c08a4e064f3e2134
>>>>>>> Stashed changes
}