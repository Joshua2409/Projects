package password_manager;

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
	}
