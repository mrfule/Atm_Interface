package ATM;

import java.util.Scanner;
import java.io.*;

public class User extends ATM {
	
	String username , name , atype ,passwd;
	int  mobile;
	double bal;

	public void application() throws IOException
	{
		Scanner s =new  Scanner(System.in);
		System.out.println("Welcome to lelo");
		
		System.out.println("username----------Use String only");
		username=s.nextLine();
		System.out.println("passwd -----------Use Integer Values only");
		passwd=s.nextLine();
		System.out.println("Name--------------String");
		s.next();
		name=s.nextLine();
		System.out.println("Mobile Number-----Number");
		mobile=s.nextInt();
		System.out.println("Account Type------S/C");
		s.next();
		atype=s.nextLine();
		System.out.println("Balence-----------Number");
		bal=s.nextDouble();
		
		FileWriter writer=new FileWriter(username+"_.txt");
		writer.write(username);
		writer.close();
		
		FileWriter p=new FileWriter(passwd+"_.txt");
		p.write(passwd);
		p.close();
		
		FileWriter b=new FileWriter(username+"_bal.txt");
		b.write(bal+" ");
		b.close();
		
		
	}
	
}
