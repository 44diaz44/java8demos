package com.withlambdas;

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
		
		/*Messaging m=new Messaging()
		{
			
			
			public void sendMessage()
			{
				System.out.println("Welcome to Programming");
				
			}
			
		};
		
		
		m.sendMessage();
		*/
		
		// Now lets Apply Lambda expression to simplify above code
		
	
		Messaging m=(s)->
		System.out.println("Welcome all to lambda"+s);
		m.sendMessage("Expression");
		
		
		
		// Another way to simplyfy 
		// you can remove even the pararentis if you only one parameter
		Messaging m1=s->
		System.out.println("Welcome all to lambda"+s);
		m.sendMessage("Expression");
		
		
		Calculator s=(x,y)->
							
				{
			
			return x+y;
				};
		
		System.out.println(s.sum(10,20));
	
	}

}


