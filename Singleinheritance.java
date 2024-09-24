package demo.sessions;
class One //parent class
{
  static void add()
  {
	  System.out.println("add");
  }
  static void sub()
  {
	  System.out.println("sub");
  }
}

public class Singleinheritance extends One//child class
{
	static void mul()
	{
		System.out.println("mul");
	}
     static void div()
     {
    	System.out.println("div") ;
     }

	public static void main(String[]args)
	{
		mul();
		div();
		add();
		sub();
		

}
}
