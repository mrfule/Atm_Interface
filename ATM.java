package ATM;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ATM {
	int choice;
	boolean flag=false;
	public void atm(String user) throws IOException
	{
		Scanner s =new Scanner(System.in);
		do
		{
		System.out.println("-------------------wlecome to lelo Bank-----------------");
		System.out.println("\n1.Diposite \n2.Withdraw \n3.Display Balence \n4.Exit");
		choice=s.nextInt();
		
		switch(choice)
		{
		case 1 :	
					String data="";
					System.out.println("Enter the Amount for Diposite");
					double new_bal=s.nextDouble();
					File obj=new File(user+"_bal.txt");
					Scanner i=new Scanner(obj);
					
					while(i.hasNextLine())
					{
						data=i.nextLine();
					}
					double old=Double.parseDouble(data);
					double result=new_bal+old;
					
					FileWriter d=new FileWriter(user+"_bal.txt");
					d.write(""+result);
					d.close();
					break;
		case 2 :	System.out.println("Enter Amount for Withdraw");
					double w=s.nextDouble();
					String wd="";
					File rw=new File(user+"_bal.txt");
					Scanner ws=new Scanner(rw);
					
					while(ws.hasNextLine())
					{
						wd=ws.nextLine();
					}
					double oldw=Double.parseDouble(wd);
					if(oldw>=w)
					{
						oldw=oldw-w;
						System.out.println("Withdraw Successful go and enjoy");
					}
					else
						System.out.println("Not Sufficient Balence");
					
					FileWriter wr=new FileWriter(user+"_bal.txt");
					wr.write(oldw+"");
					wr.close();
					
					
					break;
		case 3 :	System.out.println("Your Balance is");
					String str2="";
					File r =new File(user+"_bal.txt");
					Scanner ii=new Scanner(r);
					while(ii.hasNextLine())
					{
						str2=ii.nextLine();
					}
					System.out.println(str2);
					break;
		
		case 4 :	System.out.println("Exit");
					flag=true;
		
		}
		
		}while(!flag);
		
	}

}
