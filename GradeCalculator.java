import java.util.Scanner;

public class GradeCalculator { //Title Indicator as Foldar Name 
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in); // Nagwowork sya as input variables para sa target output na lalagay ni use sa system
        
        // Ask the user to enter their score
        System.out.print("Enter your score: "); // Dito naman medyo di ko gets naka int si score tapos naka equal kay scanner di ko magets pano sila nagwowork together. ang hirap ng slow learner >_<
        int score = scanner.nextInt();
        
        // Determine the grade based on the score   NAG GPT NAKO Dito sir dko po talaga maimage ano gagawin ko sa LABOO17 na to >_< 
        
        char grade; //Initialization dito kukunin ano 
        
        if (score >= 90) { //If greaterthan equal si grade kay 90 e aaoutput nya si A
            grade = 'A';
        } else if (score >= 80) { //ganon den to haggang pa baba
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Output the result
        System.out.println("Your grade is: " + grade); 
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}