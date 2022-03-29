package projects;

 class  empinfo{
	 int id  ;
	  String name;
	   void  display()
	   {
		    System.out.println(id+", "+name );
	   }
 }
 
public class constructordemo {
	public static void main(String[] args) {
		 empinfo emp1 = new empinfo();
		   emp1.id=2; 
		   
		 empinfo emp2 = new empinfo();
		 emp2.id=57;
		   emp1 .display();
		   emp2.display();
		 
	}

}
