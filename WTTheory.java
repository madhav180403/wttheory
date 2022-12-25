package wttheory;
import java.util.*;
public class WTTheory {
    static Scanner inp=new Scanner(System.in);
    static void dispopt()
    {   System.out.println("Enter your choice");
        System.out.println("1. Length");
        System.out.println("2. Mass");
        System.out.println("3. Speed");
        System.out.println("4. Temperature");
        System.out.println("5. Area");
    }
    static void length()
    {   
        int x,y;
        double z;
        System.out.println("Choose unit to convert from:");
        System.out.println("1. Metre");
        System.out.println("2. Centimetre");
        System.out.println("3. Inch");
        System.out.println("4. Foot");
        x=inp.nextInt();
        System.out.println("\n");
        System.out.println("Enter the quantity of first unit:");
        z=inp.nextDouble();
        System.out.println("\n");
        System.out.println("Choose unit to convert to:");
        System.out.println("1. Metre");
        System.out.println("2. Centimetre");
        System.out.println("3. Inch");
        System.out.println("4. Foot");
        y=inp.nextInt();
        System.out.print("The result in the desired units is: ");
        if(x==1)
        {
            if(y==1)
                System.out.println(z);
            else if(y==2)
                System.out.println(z*100);
            else if(y==3)
                System.out.println(z*39.3700787);
            else if(y==4)
                System.out.println(z*3.2808399);
        }
        else if(x==2)
        {
            if(y==1)
                System.out.println(z/100);
            else if(y==2)
                System.out.println(z);
            else if(y==3)
                System.out.println(z*0.393700787);
            else if(y==4)
                System.out.println(z*0.032808399);
        }
        else if(x==3)
        {
            if(y==1)
                System.out.println(z*0.0254);
            else if(y==2)
                System.out.println(z*2.54);
            else if(y==3)
                System.out.println(z);
            else if(y==4)
                System.out.println(z*0.08333);
        }
        else if(x==4)
        {
            if(y==1)
                System.out.println(z*0.3048);
            else if(y==2)
                System.out.println(z*30.48);
            else if(y==3)
                System.out.println(z*12);
            else if(y==4)
                System.out.println(z);
        }
        System.out.println("\n");
    }
    static void mass()
    {   
        int x,y;
        double z;
        System.out.println("Choose unit to convert from:");
        System.out.println("1. Kilogram");
        System.out.println("2. Gram");
        System.out.println("3. Pound");
        System.out.println("4. Ounce");
        x=inp.nextInt();
        System.out.println("\n");
        System.out.println("Enter the quantity of first unit:");
        z=inp.nextDouble();
        System.out.println("\n");
        System.out.println("Choose unit to convert to:");
        System.out.println("1. Kilogram");
        System.out.println("2. Gram");
        System.out.println("3. Pound");
        System.out.println("4. Ounce");
        y=inp.nextInt();
        System.out.print("The result in the desired units is: ");
        if(x==1)
        {
            if(y==1)
                System.out.println(z);
            else if(y==2)
                System.out.println(z*1000);
            else if(y==3)
                System.out.println(z*2.20462262);
            else if(y==4)
                System.out.println(z*35.273619);
        }
        else if(x==2)
        {
            if(y==1)
                System.out.println(z/1000);
            else if(y==2)
                System.out.println(z);
            else if(y==3)
                System.out.println(z*0.00220462262);
            else if(y==4)
                System.out.println(z*0.035273619);
        }
        else if(x==3)
        {
            if(y==1)
                System.out.println(z*0.45359237);
            else if(y==2)
                System.out.println(z*453.59237);
            else if(y==3)
                System.out.println(z);
            else if(y==4)
                System.out.println(z*16);
        }
        else if(x==4)
        {
            if(y==1)
                System.out.println(z*0.0283495231);
            else if(y==2)
                System.out.println(z*28.3495231);
            else if(y==3)
                System.out.println(z*0.0625);
            else if(y==4)
                System.out.println(z);
        }
        System.out.println("\n");
    }
    static void speed()
    {   
        int x,y;
        double z;
        System.out.println("Choose unit to convert from:");
        System.out.println("1. Metre per second (m/s)");
        System.out.println("2. Kilometre per hour (kmph)");
        System.out.println("3. Knot (kn)");
        System.out.println("4. Miles per hour (mph)");
        x=inp.nextInt();
        System.out.println("\n");
        System.out.println("Enter the quantity of first unit:");
        z=inp.nextDouble();
        System.out.println("\n");
        System.out.println("Choose unit to convert to:");
        System.out.println("1. Metre per second (m/s)");
        System.out.println("2. Kilometre per hour (kmph)");
        System.out.println("3. Knot (kn)");
        System.out.println("4. Miles per hour (mph)");
        y=inp.nextInt();
        System.out.print("The result in the desired units is: ");
        if(x==1)
        {
            if(y==1)
                System.out.println(z);
            else if(y==2)
                System.out.println(z*3.6);
            else if(y==3)
                System.out.println(z*1.94384449);
            else if(y==4)
                System.out.println(z*2.23693629);
        }
        else if(x==2)
        {
            if(y==1)
                System.out.println(z*0.277777);
            else if(y==2)
                System.out.println(z);
            else if(y==3)
                System.out.println(z*0.539956803);
            else if(y==4)
                System.out.println(z*0.621371192);
        }
        else if(x==3)
        {
            if(y==1)
                System.out.println(z*0.5144444);
            else if(y==2)
                System.out.println(z*1.852);
            else if(y==3)
                System.out.println(z);
            else if(y==4)
                System.out.println(z*1.15077945);
        }
        else if(x==4)
        {
            if(y==1)
                System.out.println(z*0.44704);
            else if(y==2)
                System.out.println(z*1.609344);
            else if(y==3)
                System.out.println(z*0.868976242);
            else if(y==4)
                System.out.println(z);
        }
        System.out.println("\n");
    }
    static void temperature()
    {   
        int x,y;
        double z;
        System.out.println("Choose unit to convert from:");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.println("4. Rankine");
        x=inp.nextInt();
        System.out.println("\n");
        System.out.println("Enter the quantity of first unit:");
        z=inp.nextDouble();
        System.out.println("\n");
        System.out.println("Choose unit to convert to:");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.println("4. Rankine");
        y=inp.nextInt();
        System.out.print("The result in the desired units is: ");
        if(x==1)
        {
            if(y==1)
                System.out.println(z);
            else if(y==2)
                System.out.println(z*1.8+32);
            else if(y==3)
                System.out.println(z+273.15);
            else if(y==4)
                System.out.println(z*1.8+491.67);
        }
        else if(x==2)
        {
            if(y==1)
                System.out.println((z-32)*5/9);
            else if(y==2)
                System.out.println(z);
            else if(y==3)
                System.out.println((z-32)*5/9+273.15);
            else if(y==4)
                System.out.println(z+459.67);
        }
        else if(x==3)
        {
            if(y==1)
                System.out.println(z-273.15);
            else if(y==2)
                System.out.println((z-273.15)*1.8+32);
            else if(y==3)
                System.out.println(z);
            else if(y==4)
                System.out.println(z*1.8);
        }
        else if(x==4)
        {
            if(y==1)
                System.out.println((z-491.67)/1.8);
            else if(y==2)
                System.out.println(z-459.67);
            else if(y==3)
                System.out.println(z/1.8);
            else if(y==4)
                System.out.println(z);
        }
        System.out.println("\n");
    }
    static void area()
    {   
        int x,y;
        double z;
        System.out.println("Choose unit to convert from:");
        System.out.println("1. Square metre ");
        System.out.println("2. Square kilometre");
        System.out.println("3. Acre");
        System.out.println("4. Hectare");
        x=inp.nextInt();
        System.out.println("\n");
        System.out.println("Enter the quantity of first unit:");
        z=inp.nextDouble();
        System.out.println("\n");
        System.out.println("Choose unit to convert to:");
        System.out.println("1. Square metre ");
        System.out.println("2. Square kilometre");
        System.out.println("3. Acre");
        System.out.println("4. Hectare");
        y=inp.nextInt();
        System.out.print("The result in the desired units is: ");
        if(x==1)
        {
            if(y==1)
                System.out.println(z);
            else if(y==2)
                System.out.println(z/1000000);
            else if(y==3)
                System.out.println(z*0.000247105);
            else if(y==4)
                System.out.println(z*0.0001);
        }
        else if(x==2)
        {
            if(y==1)
                System.out.println(z*1000000);
            else if(y==2)
                System.out.println(z);
            else if(y==3)
                System.out.println(z*247.105407);
            else if(y==4)
                System.out.println(z*100);
        }
        else if(x==3)
        {
            if(y==1)
                System.out.println(z*4046.856);
            else if(y==2)
                System.out.println(z*0.004046856);
            else if(y==3)
                System.out.println(z);
            else if(y==4)
                System.out.println(z*0.4046856);
        }
        else if(x==4)
        {
            if(y==1)
                System.out.println(z*10000);
            else if(y==2)
                System.out.println(z*0.01);
            else if(y==3)
                System.out.println(z*2.47105407);
            else if(y==4)
                System.out.println(z);
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        System.out.println("UNIT CONVERTER\n\n");
        int cont=1;
        while(cont==1)
        {
            dispopt();
            int x=inp.nextInt();
            System.out.println("\n");
            if(x==1)
            {
                length();
            }
            else if(x==2)
            {
                mass();
            }
            else if(x==3)
            {
                speed();
            }
            else if(x==4)
            {
                temperature();
            }
            else if(x==5)
            {
                area();
            }
            System.out.println("Do you wish to continue?(1/0)");
            cont=inp.nextInt();
            System.out.println("\n");
        }
    }
    
}
