class Engineering
{
String university_name = " Anna university ";
public static void main (String [] args )
    {
        Engineering engObj = new Engineering();
        engObj.project();
        engObj.exam();
        engObj.intenship();
        engObj.distintion();
        engObj.attendance();
    }

void project()
    {
        System.out.println(" 8 semester for project work do it based on your department ");
    }

void exam()
    {
        System.out.println("   2 university examnination connected every year ");
    }

void intenship()
    {
        System.out.println(" every individual must finish 3 intenship before final semester ");
    }

void distintion()
    {
        System.out.println(" above 8.5 cgpa with no history of arrear students are eglible for distinction ");
    }

void attendance()
    {
        System.out.println(" above 75% attendance is must for write university exam   ");
    }
}

