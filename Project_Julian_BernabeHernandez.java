import java.util.Scanner;

public class Project_Julian_BernabeHernandez
{
   public static void main (String[] args)
   {
      int policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokeStatus;
      double height;
      double weight;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please Enter The Policy Number: ");
      policyNumber = keyboard.nextInt();
      System.out.print("Please Enter The Provider Name: ");
      keyboard.nextLine();
      providerName = keyboard.nextLine();
      System.out.print("Please Enter The Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      System.out.print("Please Enter The Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      System.out.print("Please Enter The Policyholder's Age: ");
      age = keyboard.nextInt();
      System.out.print("Please Enter The Policyholder's Smoking Status (smoker/non-smoker): ");
      keyboard.nextLine();
      smokeStatus = keyboard.nextLine();
      System.out.print("Please Enter The Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      System.out.print("Please Enter The Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      
      Policy person = new Policy(policyNumber, providerName, firstName, lastName, age, smokeStatus, height, weight);
      System.out.println();
      System.out.println("Policy Number: " + person.getPolicyNumber());
      System.out.println("Provider Name: " + person.getProviderName());
      System.out.println("Policyholder's First Name: " + person.getFirstName());
      System.out.println("Policyholder's Last Name: " + person.getLastName());
      System.out.println("Policyholder's Age: " + person.getAge());
      System.out.println("Policyholder's Smoking Status: " + person.getsmokeStatus());
      System.out.println("Policyholder's Height: " + person.getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + person.getWeight()+ " pounds");
      System.out.printf("Policyholder's BMI: %.2f", person.getBMI());
      System.out.println();
      System.out.printf("Policy Price: $%.2f", person.getPrice());
      
   }
}