package Sapi.Razo;

public class Hello {
	interface HelloService {
	      String hello(String firstname, String lastname);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloService helloService=(String firstname, String lastname) -> 
		{ String hello="Hello " + firstname + " " + lastname; return hello; };
		System.out.println(helloService.hello(args[0], args[1]));
		        

		    
	}

}
