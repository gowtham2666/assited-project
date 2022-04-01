package projects;

public class innerClassAssisted1 {
	 class Inner{  
		  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
		 }  


		public static void main(String[] args) {

			innerClassAssisted1 obj=new innerClassAssisted1();
			innerClassAssisted1.Inner in=obj.new Inner();  
			in.hello();  
		}
	}



