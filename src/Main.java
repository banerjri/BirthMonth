import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int BirthMonth;
        System.out.print("Enter your Birth Month (must be between 1 - 12 inclusive) = ");
        if(in.hasNextInt())
        {
            BirthMonth = in.nextInt();
            in.nextLine();
            if (BirthMonth < 13 & BirthMonth > 0)
            {
                System.out.print("Your Birth Month is " + BirthMonth);
            }
                else
            {
                System.out.print("\nYou have enered the wrong Birth month " + BirthMonth);
            }


        }



    }
}