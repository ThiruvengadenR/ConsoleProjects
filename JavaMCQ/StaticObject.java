package JavaMCQ;


public class StaticObject extends StaticObject1
{
	// if parent class have a static block is executed first in child block.
	public static void main(String[] args) {
		StaticObject1 venkadesh = new StaticObject1();
		Thiru.add(); //parent class static object works only it have parent child relationship

	}

}



