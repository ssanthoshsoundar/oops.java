
import java.util.Scanner;

public class Bill1 {
    public static void main (String[] args)
    {
        int a,d;
        String name;
        float e,c,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter consumer number:");
        a=s.nextInt();
        System.out.println("Enter consumer name:");
        s.nextLine();
        name=s.nextLine();
        System.out.println("Enter previous month reading:");
        b=s.nextFloat();
        System.out.println("Enter current month reading:");
        c=s.nextFloat();
        System.out.println("Enter the type of EB connection(Domestic=1,Commercial=2):");
        d=s.nextInt();
        e=c-b;

        if(d==1)
        {
            if (e<=100)
            {
                System.out.println("bill =:"+(e*1));
            }
            else if(e>100&&e<=200)
            {
                System.out.println("bill=:"+(e*2.50));
            }
            else if(e>200&&e<=500)
            {
                System.out.println("bill=:"+(e*4));
            }
            else if (e>500)
            {
                System.out.println("bill=:"+(e*6));
            }
        }
        else if (d==2)
        {
            if (e<=100)
            {
                System.out.println("bill=:"+(e*2));
            }
            else if(e>100&&e<=200)
            {
                System.out.println("bill=:"+(e*4.50));
            }
            else if (e>200&&e<=500)
            {
                System.out.println("bill=:"+(e*6));
            }
            else if (e>501)
            {
                System.out.println("bill=:" + (e * 7));
            }

        }
        else
        {
            System.out.println("please enter a valid number");
        }

    }



}

