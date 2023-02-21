package javaProject;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;


public class onlineExamination {
	Scanner sc = new Scanner(System.in);
	HashMap<String,Integer> info = new HashMap<String,Integer>();
	public void login()
	{    
		info.put("prasad",1111);
		info.put("raj",2222);
		info.put("soham",3333);
		info.put("nil",4444);
		info.put("varad",5555);
		String id;
		int pwd;
		System.out.println("LOGIN");
		System.out.println("Enter Username : ");
		id = sc.next();
		System.out.println("Enter Password : ");
		pwd = sc.nextInt();
		if(info.containsKey(id) && info.get(id)==pwd)
		{   
			System.out.println("\nLogin successful!");
			menu();
		}
		else
		{
			System.out.println("\nIncorrect user ID or password!\nTry again!\n");
			login();
		}
	}
	public void menu()
	{
		int ch;
		System.out.println("\nEnter Choice : ");
		System.out.println("1.Update profile \n2.Start Exam \n3.Logout");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				info = update();
				menu();
				break;
			case 2:
				startExam();
				menu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Choose correct choice : ");
		}
	}
	public HashMap<String,Integer> update()
	{
		String update_id;
		int update_pwd;
		System.out.println("Enter Username : ");
		update_id = sc.next();
		System.out.println("Enter Old Password : ");
		update_pwd = sc.nextInt();
		if(info.containsKey(update_id) && info.get(update_id)==update_pwd)
		{
			System.out.println("Enter New Password : ");
			update_pwd = sc.nextInt();
			info.replace(update_id,update_pwd);
			System.out.println("PASSWORD CHANGED SUCCESSFULLY");
		}
		else
		{
			System.out.println("User not found\n");
		}
		return info;
	}
	public void startExam()
	{
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 30;
		int score = 0,ans;

		while(System.currentTimeMillis()<endTime)
		{
			System.out.println("\n");
			System.out.println("Q1.Why is a firewall used in a computer?");
			System.out.println("1.monitoring \t2.authentication \t3.Security \t4.Data transmission");
			System.out.print("Answer : ");
			ans = sc.nextInt();
			if(ans == 3)
				score+=5;
			else
				score--;

			System.out.println("\n");
			System.out.println("Q2.ALU stands for ? ");
			System.out.println("1. Arithmetic Lexical Unit\t2. Arithmetic Logical Unit\t3. Arrival Location Time \t4. None");
			System.out.print("Answer : ");
			ans = sc.nextInt();
			if(ans == 2)
				score+=5;
			else
				score--;

			System.out.println("\n");
			System.out.println("Q3.Total bits used by the IPv6 address is _______");
			System.out.println("1. 64bit\t2. 256bit\t3. 128bit\t4.32bit");
			System.out.print("Answer : ");
			ans = sc.nextInt();
			if(ans == 3)
				score+=5;
			else
				score--;

			System.out.println("\n");
			System.out.println("Q4.dentify the language which is mainly used for Artificial Intelligence");
			System.out.println("1.java\t2.c \t3. cpp\t4. prolog");
			System.out.print("Answer : ");
			ans = sc.nextInt();
			if(ans == 4)
				score+=5;
			else
				score--;

			System.out.println("\n");
			System.out.println("Q5.Full form of CPU?");
			System.out.println("1. Computer Principle Unit\t2.) Computer Processing Unit\t3. Central Processing Unit\t4.Control Processing Unit");
			System.out.print("Answer : ");
			ans = sc.nextInt();
			if(ans == 3)
				score+=5;
			else
				score--;
			System.out.println("\n");
			
			
			System.out.println("\n");
			System.out.println("Q4.How many levels are there in the architecture of the database?");
			System.out.println("1.2\t2.3 \t3. 4\t4. 5");
			System.out.print("Answer : ");
			ans = sc.nextInt();
			if(ans == 2)
				score+=5;
			else
				score--;
			break;
		}
		System.out.println("Exam Finished");
		System.out.println();
		System.out.println("Grade = "+score);
		if(score>10)
			System.out.println("Congratutaions!\nYou are Pass.");
		else
			System.out.println("You are Fail\nBetter Luck Next Time.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		onlineExamination obj  = new onlineExamination();
		obj.login();
	}

}
