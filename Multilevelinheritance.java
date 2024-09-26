package demo.sessions;


 class Multilevelinheritance3 
{
	static void add1()
	{
	System.out.println(10);	
	}
	
}
class Multilevelinheritance2 extends Multilevelinheritance3
{
	static void add2()
	{
		System.out.println(20);
	}
	
	
}
 class Multilevelinheritance1 extends Multilevelinheritance2
{
	static void add3()
	{
		System.out.println(30);
	}

  public static void main(String[] args) {
	  add1();
	  add2();
      add3();
  }

		
  }
	


