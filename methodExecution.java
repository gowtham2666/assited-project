package projects;

public class methodExecution {
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		methodExecution ab=new methodExecution();
		int  solution= ab.multipynumbers(10,2);
		System.out.println("Multipilcation is :"+solution);
		}


}
