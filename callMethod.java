package projects;

public class callMethod {
	int val=150;

	int operations(int val) {
		val =val*10/100;
		return(val);
	}

	public static void main(String args[]) {
		callMethod ad = new callMethod();
		System.out.println("Before operation value  is "+ad.val);
		ad.operations(100);
		System.out.println("After operation value  is "+ad.val);
		}
	}





