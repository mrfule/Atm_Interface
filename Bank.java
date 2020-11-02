package ATM;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Bank extends User {
	int choice;
	String username,vuser,passwd,vpasswd;
	boolean flag=false;
	
	
	public void home() throws IOException
	{
	do {
		
	
		System.out.println("--------------Welcome to lelo Bank-------------------- ");
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Choice \n1.Create Account \n2.Login \n3.Exit");
		choice=s.nextInt();
		
		
		switch(choice)
		{
		case 1 :	System.out.println("you are redirecter to Application to Fill");
					application();
					break;
					
		case 2 :	s.nextLine();
					System.out.println("Username");
					username=s.nextLine();
					System.out.println("Passwd");
					passwd=s.nextLine();
					
					File u=new File(username+"_.txt");
					Scanner s1 =new Scanner(u);
					
					while(s1.hasNextLine())
					{
						vuser=s1.nextLine();
						
					}
					System.out.println(vuser);
					
					File p=new File(passwd+"_.txt");
					Scanner s2 =new Scanner(p);
					
					while(s2.hasNextInt())
					{
							vpasswd=s2.nextLine();
						
					}
					System.out.println(vpasswd);
					
					if(vpasswd.equalsIgnoreCase(passwd))
					{
						if(vuser.equalsIgnoreCase(username))
						{
							atm(username);
						}
					}
					else
						System.out.println("username or password is not valid");
					break;
		case 3 :	System.out.println("thanks to visit lelo bank");
					flag=true;
		
		
		}
	}while(!flag);
	}

}
