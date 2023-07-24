package ObjectClassTry;

public class PraticeProgramJuly18 {
	
public String toString()
{
	int num = this.hashCode();
	String name = "PraticeProgramJuly18";
	String convert = Integer.toBinaryString(num);
	
	return (name +"^^^"+convert) ;
	
}


// getClass is native method cannot see the implementation of the method.
	public static void main(String[] args) {
		PraticeProgramJuly18  obj = new PraticeProgramJuly18();
		//System.out.println("Printing the object " +obj);
		System.out.println("Calling toString method "+obj.toString());
		System.out.println("Calling hash code method "+obj.hashCode());
		System.out.println("calling equals method using object "+obj.equals(obj));
	}

}
