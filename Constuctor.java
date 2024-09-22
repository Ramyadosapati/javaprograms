package demo.sessions;

public class Constuctor {
	Constuctor()
	{

		System.out.println( "1st");
	}
	Constuctor( int a)
	{

		System.out.println( "2nd");
	}
	public static void main(String[] args) {
	  new	Constuctor();
	  new  Constuctor(550);

	}

}
