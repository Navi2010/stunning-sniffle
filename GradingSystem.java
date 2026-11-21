import java.util.Scanner;

public class GradingSystem {
    static void main() {
        Scanner math = new Scanner(System.in);
        System.out.print("Enter math grade: ");
        int mathGrade = math.nextInt();

        Scanner english = new Scanner(System.in);
        System.out.print("Enter english grade: ");
        int englishGrade = english.nextInt();

        Scanner science = new Scanner(System.in);
        System.out.print("Enter science grade: ");
        int scienceGrade = science.nextInt();

        Scanner history = new Scanner(System.in);
        System.out.print("Enter history grade: ");
        int historyGrade = history.nextInt();

        Scanner compSci = new Scanner(System.in);
        System.out.print("Enter comp sci grade: ");
        int computerGrade = compSci.nextInt();

        int sum = mathGrade + englishGrade + scienceGrade + historyGrade + computerGrade;
        int average = sum/5;

        if (average >= 90){
            System.out.println("Excellent");
        }

        else if(average >= 70){
            System.out.println("Good");
        }

        else if(average >= 50){
            System.out.println("Okay");
        }

        else{
            System.out.println("Failed");
        }
    }


}
