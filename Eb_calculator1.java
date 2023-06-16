import java.util.Scanner;
class Eb_calculator1
{
int Fixed_cost = 50;
public static void main (String [] args)
    {
    Scanner scanObj = new Scanner(System.in);
    System.out.println(" Different connection type --> price_homeUse --home , government_aided_school_hospital--G_sch_hos , private_school_restaurants--P_sch_rest , common_religious_centre--religion , common_industry --C_industry"); 
    System.out.println("Different connection type --> temporary_connection--temp , street_light--street_light ,small_scale_industry--street_light , commercial_business--COM_business , small_scale_industry--S_industry ,vicaittari_powerloom --power_loom");
    System.out.println("Enter your connection type (case sensitive) "); 
    String string_name = scanObj.nextLine();
    System.out.println("Previous month reading");
    int oldReading = scanObj.nextInt();
    System.out.println("Current month reading");
    int newReading = scanObj.nextInt();
    int unit = newReading-oldReading;
    Eb_calculator1 ebObj = new Eb_calculator1();
    ebObj.eb_calculation( string_name , unit);
    }

void eb_calculation(String string_name , int unit )
{
switch (string_name)
{
case "home":
    {
    price_homeUse(unit);
    break;
    }
case "G_sch_hos":
    
    government_aided_school_hospital(unit);
    break;
    
case "P_sch_rest":
    
    private_school_restaurants(unit);
    break;
    
case "religion":
    
    common_religious_centre(unit);
    break;
    
case "C_industry" :
    
    common_industry(unit);
    break;
    
case "temp":
    
    temporary_connection(unit);
    break;
    
case "street_light":
    
    street_light(unit);
    break;
    
case "COM_business" :
    
    commercial_business(unit);
    break;
    
case "S_industry":
    
    small_scale_industry(unit);
    break;
    
case "power_loom":
    
    vicaittari_powerloom(unit);
    break;
    
default:
    
    System.out.println("No matched connection is found ");
    break;

}
}


void vicaittari_powerloom(int unit)
{
    if (unit<=750 && unit > 0)
        {
        System.out.println("First 750 units free for power loom,  No need to pay any amount .Consumed units  " + unit);
        }
    else if (unit>750 && unit <1001)
    {
        int unit_1 = unit - 750;
        double rate = unit_1 *2.30;
        System.out.println("Total consumed units is  " + unit + "  Total amount paid for power loom user " + (Fixed_cost + rate ));
    }
else if (unit>1000 && unit <1501)
    {
        int unit_1 = unit - 750;
        int unit_2 = unit_1 -250;
        double rate_1 = 250 *2.30;
        double rate_2 = unit_2 *3.45;
        System.out.println("Total consumed units is  " + unit + "  Total amount paid for power loom user " + (Fixed_cost + rate_1 + rate_2 ));
    }
else if (unit >1500)
    {
        int unit_1 = unit - 750;
        int unit_2 = unit_1 -250;
        int unit_3 = unit_2-500;
        double rate_1 = 250*2.30;
        double rate_2 = 500 *3.45;
        double rate_3 = (unit_3 *4.60);
        System.out.println("Total consumed units is  " + unit + "  Total amount paid for power loom user " + (Fixed_cost + rate_1 + rate_2 +rate_3));
    }
    else 
    {
        System.out.println("Double check the Reading ");
    }

}
void small_scale_industry(int unit)
{
    int service = 40;
    if (unit<501 && unit>0)
    {
        double price = unit *4.00 ;
        System.out.println("Total unit consumed " + unit + " Total amount paid for small scale industry  "+ (price + service));
    }
else if (unit>500 )
    {
        int unit_1 = unit-500;
        double price1 = 500*4.00;
        double price2 = unit_1 *4.60;
        System.out.println("Total unit consumed " + unit + " Total amount paid for small scale industry "+ (price1 + price2 +service));
    }
    else 
    {
        System.out.println("Double check the Reading ");
    }

}
void commercial_business(int unit)
{
    int service = 140;
    if (unit<101 && unit > 0)
    {
        double price = unit *5.0 ;
        System.out.println("Total unit consumed " + unit + " Total amount paid for commerical business   "+ (price + service));
    }
else if (unit>100 )
    {
        int unit_1 = unit-100;
        double price1 = 100*5.0;
        double price2 = unit_1 *8.05;
        System.out.println("Total unit consumed " + unit + " Total amount paid for commerical business  "+ (price1 + price2 +service));
    }
    else 
    {
        System.out.println("Double check the Reading ");
    }


}
void street_light(int unit)
{
if (unit>0)
    {
        int service = 120;
        double price = unit * 6.35 ;
        System.out.println("Total unit consumed " + unit + " Total amount Paid for street light  "+ (price +service));
    }
    else 
    {
        System.out.println("Double check the Reading ");
    }
}
void temporary_connection(int unit)
{
if (unit>0)
    {
        int service = 690;
        double price = unit * 12.0 ;
        System.out.println("Total unit consumed " + unit + " Total amount Paid for temporary connection  "+ (price +service));
    }  
    else 
    {
        System.out.println("Double check the Reading ");
    }
}
void common_industry(int unit)
{
if (unit>0)
    {
        int service = 120;
        double price = unit * 6.35 ;
        System.out.println("Total unit consumed " + unit + " Total amount Paid for common industry "+ (price +service));
    }
    else 
    {
        System.out.println("Double check the Reading ");
    }
}
void common_religious_centre(int unit)
{
    int service = 120;
    if (unit<121 && unit>0)
    {
        double price = unit *2.85 ;
        System.out.println("Total unit consumed " + unit + " Total amount paid for regilious centre  "+ (price + service));
    }
else if (unit>120 )
    {
        int unit_1 = unit-120;
        double price1 = 120*2.85;
        double price2 = unit_1 *5.75;
        System.out.println("Total unit consumed " + unit + " Total amount paid for regilious centre  "+ (price1 + price2 +service));
    }
    else 
    {
        System.out.println("Double check the Reading ");
    }
}

void private_school_restaurants(int unit)
 {
    if (unit>0)
        {
            int service = 120;
            double price = unit * 7.50 ;
            System.out.println("Total unit consumed " + unit + " Total amount paid for private school or restaurants  "+ (price +service));
        }
    else 
    {
        System.out.println("Double check the Reading ");
    }
 }

void government_aided_school_hospital(int unit)
 {
    if (unit>0)
        {
        int service = 120;
        double price = unit * 5.75 ;
        int serive = 120;
        System.out.println("Total unit consumed " + unit + " Total amount paid for government or aided school and hospital  "+ (price +service));
         }
    else 
    {
        System.out.println("Double check the Reading ");
    }
 }
void price_homeUse(int unit)
{
    if (unit<=100 && unit > 0)
        {
        System.out.println("First 100 units free , No need to pay any amount . consumed units  " + unit );
        }
    else if (unit>100 && unit <201)
    {
        int unit_1 = unit - 100;
        double rate = unit_1 *3.5;
        System.out.println("Total consumed units is  " + unit + "  Total amount paid for home user " + (Fixed_cost + rate ));
    }
else if (unit>200 && unit <501)
    {
        int unit_1 = unit - 100;
        int unit_2 = unit_1 -100;
        double rate_1 = 100 *3.5;
        double rate_2 = unit_2 *4.6;
        System.out.println("Total consumed units is  " + unit + "  Total amount paid for home user " + (Fixed_cost + rate_1 + rate_2 ));
    }
else if (unit >500 && unit <5000)
    {
        int unit_1 = unit - 100;
        int unit_2 = unit_1 -100;
        int unit_3 = unit_2-300;
        double rate_1 = 100 *3.5;
        double rate_2 = 300 *4.6;
        double rate_3 = (unit_3 *6.6);
        System.out.println("Total consumed units is  " + unit + "  Total amount paid for home user " + (Fixed_cost + rate_1 + rate_2 +rate_3));
    }
    else 
    {
        System.out.println("Double check the Reading ");
    }
}
}

