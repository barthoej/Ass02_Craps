import java.util.Scanner;
public class SafeInput
{
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retVal = true;
        String response = "";
        boolean gotAVal = false;

        do {
            System.out.println("\n" + prompt + " [Y/N] ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                gotAVal = true;
                retVal = true;
            } else if (response.equalsIgnoreCase("N")) {
                gotAVal = true;
                retVal = false;
            } else {
                System.out.println("You must answer [Y/N]! " + response);
            }
        } while (!gotAVal);

        return retVal;
    }
}
