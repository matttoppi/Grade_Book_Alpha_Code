import java.util.Scanner;

public class getPassword {

    public getPassword() { // Checks to see if password is needed. If yes then has user set a password
        boolean needPassword = true; // REMOVE THIS LINE AFTER YOU SET UP TXT DOCUMENT
        for (int i = 1; i <= 1;) {
            System.out.println("---------------------------------------------------------------");
            System.out.print("Please create a password to use in the future (case sensitive): ");
            Scanner userPassword = new Scanner(System.in);
            String firstPassword = userPassword.nextLine();

            System.out.print("Please re-enter the password (case sensitive): ");
            Scanner userPassword2 = new Scanner(System.in);
            String secondPassword = userPassword2.nextLine();

            if (firstPassword.equals(secondPassword)) {
                System.out.println("|Password settings updated|");
                System.out.println(firstPassword);
                i++;
            } else {
                System.out.println("             |YOUR PASSWORDS DID NOT MATCH|");
                System.out.println("                   |PLEASE TRY AGAIN|");
            }
        }
    }




}
