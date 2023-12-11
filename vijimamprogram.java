//.
//What will be the output of the program?
 class CommandArgsThree 
{
    public static void main(String [] args) 
    {
        String [][] argCopy = new String[2][2];
        int x;
        argCopy[0] = args;
      //  System.out.println(argCopy[0]);
        x = argCopy[0].length;
        System.out.println(x);
        for (int y = 0; y < x; y++) 
        {
            System.out.print(" " + argCopy[0][y]);
        }
    }
}
//and the command-line invocation is
//
//> java CommandArgsThree 1 2 3
//
//0 0
//1 2
//0 0 0
//1 2 3
