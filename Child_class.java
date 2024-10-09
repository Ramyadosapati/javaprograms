package demo.sessions;
 class Parent_class
 {
	 void login()
	 {
		 System.out.println("login with email id");
	 }
 }

public class Child_class extends Parent_class {
	void login()
	{
	System.out.println(" login with mobile no");
	 super.login()  ;
	}

	public static void main(String[] args) {
		Child_class c1=new Child_class();
		c1.login();

	}

}
