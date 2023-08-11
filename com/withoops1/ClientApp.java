package com.withoops1;

public class ClientApp {

	public static void main(String[] args) 
	
	{
		//Stage 1
		//MessagaApp m=new MessagaApp();
		//m.show(new MessageImpl());
		
		
		// stage 2
		//Messaging m=new MessageImpl();
		//m.sendMessage();
		
		
		// stage 3 
		
		// anonymous classes
		
		Messaging m=new Messaging()
		{
			
			
			public void sendMessage()
			{
				System.out.println("Welcome to Programming");
				
			}
			
		};
		
		
		m.sendMessage();
		
		
		
	}

}


