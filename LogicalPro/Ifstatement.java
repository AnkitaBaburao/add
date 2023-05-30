package statement;

public class Ifstatement {

	public static void main(String args[]) {
	int a=6;
	int b=5;
	int c=8;
	if (a>b&&a>c) {
	System.out.println(a+"is the greatest");
	

	}else
		if (b>c){
			System.out.println(b+"is the greatest");
			
		}
		else 
		{
			System.out.println(c+"is the greatest");
			
		}			
	}
}

