package scan;

	class One //parent class
	{
	   void add()
	  {
		  System.out.println("add");
	  }
	   void sub()
	  {
		  System.out.println("sub");
	  }
	}

public class Singleinheritancenon extends  One {//sub class
          void mul()
		{
			System.out.println("mul");
		}
	      void div()
	     {
	    	System.out.println("div") ;
	     }
	     public static void main(String[]args)
	 	{
	    	 Singleinheritancenon s1=new Singleinheritancenon() ;
	    s1.	 mul();
		s1.	div();
		s1.	add();
		s1.	sub();
}

			

	
	

		

	}


