import java.io.*;
import java.util.Scanner;

public class subjectCreation {
    /**
     * creates a subject
     * creates a text file that is put into the project directory
     * asks user for weights of exams, quizzes, homeworks, projects... all in percent values
     *      weights are printed in text file header for later use
     * has system making sure user typed in the correct class name (if...else)
     *
     *
     * @throws IOException
     * @throws InterruptedException
     */

    public subjectCreation() throws IOException, InterruptedException {
        for (int i = 1; i <= 1; ) {
            System.out.print("What is the name of the new subject you would like to create?: ");
            Scanner nameOfNewSubject = new Scanner(System.in);
            String subject = nameOfNewSubject.nextLine();

            System.out.print("Please re-type subject name: ");
            Scanner nameOfNewSubject2 = new Scanner(System.in);
            String subject2 = nameOfNewSubject2.nextLine();

            if (subject2.equals(subject)) {
                String nameOfClass = subject; //sets name of class

                //asks for the weights of each grade category
                System.out.println("Enter the weight of each of the following assignment types to later be calculated into a final grade: ");
                Scanner weight = new Scanner(System.in);
                System.out.print("Exams: ");
                double exam = weight.nextDouble();
                System.out.print("Quizzes: ");
                double quiz = weight.nextDouble();
                System.out.print("Homework: ");
                double homework = weight.nextDouble();
                System.out.print("Projects: ");
                double project = weight.nextDouble();

                double weightedArray[] = {exam, quiz, homework, project};
                File f = null;
                boolean bool = false;
                try {
                    f = new File(nameOfClass+".txt");
                    bool = f.createNewFile();
                    System.out.println("File for new class created: " + bool);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                i++;
            }else{
                //forces user to input the correct class name
                System.out.println("             |YOUR SUBJECT NAMES DID NOT MATCH|");
                System.out.println("                   |PLEASE TRY AGAIN|");
            }
        }
        new pauseForXAmountOfTime(); // calls the class that will make the program wait before parsing the next line
        new mainMenuUI(); // calls the main menu interface... only way to stop the program currently is to do so in the
        // main menu

    }
}
