package JavaMCQ;

public class StaticClasses 
{
	// A java program to demonstrate use
	// of static keyword with Classes
private static String str = "StaticClass String";
// Static class
	    static class MyNestedClass {
	        // non-static method
	        static void disp(){
	          System.out.println(str);
	        }
	    }
	    public static void main(String args[])
	    {
	    	StaticClasses.MyNestedClass obj = new StaticClasses.MyNestedClass();
	    	MyNestedClass.disp();
	    }
	}

