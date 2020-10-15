
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
	        int a[]=new int[10];
	        //Array has only 10 elements
	        a[1] = 9;
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println ("ArrayIndexOutOfBounds");
	      }
		try{
			 int num=Integer.parseInt ("2") ;
			 System.out.println(num);
		      
			}
		catch(NumberFormatException e){
			  System.out.println("Number format exception occurred");
		     }
	}

}
