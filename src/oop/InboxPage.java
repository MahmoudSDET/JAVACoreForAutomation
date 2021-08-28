package oop;

public class InboxPage extends LoginPage {

	public void inboxChecked()
	{
		System.out.println("Inbox checked Success");
	}
	public static void main(String[] args) {
		InboxPage i=new InboxPage();
		
		i.login();
		
		i.inboxChecked();
	}


}
