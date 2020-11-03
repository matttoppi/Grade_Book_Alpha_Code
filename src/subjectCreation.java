import java.io.*;
import java.util.Scanner;

public class subjectCreation {

    public subjectCreation() throws IOException, InterruptedException {
        for (int i = 1; i <= 1; ) {
            System.out.print("What is the name of the new subject you would like to create?: ");
            Scanner nameOfNewSubject = new Scanner(System.in);
            String subject = nameOfNewSubject.nextLine();

            System.out.print("Please re-type subject name: ");
            Scanner nameOfNewSubject2 = new Scanner(System.in);
            String subject2 = nameOfNewSubject2.nextLine();

            if (subject2.equals(subject)) {
                String nameOfClass = subject;

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

                //HOW DO I PRINT THIS ARRAY TO A TXT FILE AND HOW DO I LATER ACCESS IT IF IT IS THE FIRST ARRAY PUT ON THE FILE
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
                System.out.println("             |YOUR SUBJECT NAMES DID NOT MATCH|");
                System.out.println("                   |PLEASE TRY AGAIN|");
            }
        }
        new pauseForXAmountOfTime();
        new mainMenuUI();
    }
}
