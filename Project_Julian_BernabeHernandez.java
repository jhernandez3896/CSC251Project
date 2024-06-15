import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Project_Julian_BernabeHernandez
{
   public static void main (String[] args) throws IOException
   {
      // declare variables
      String policyNumber, providerName, firstName, lastName;
      String smokeStatus = " ";
      int age;
      double height, weight;
      int totalsmokers = 0; // the total number of smokers
      int totalnsmokers = 0; // the total number of non-smokers
      
      // Get information from the text document 'Policy Information'
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      // Create an ArrayList to store object
      ArrayList<Policy> policies = new ArrayList<Policy>();
      
      while(inputFile.hasNext())       
         {
            policyNumber = inputFile.nextLine();
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();  
            lastName = inputFile.nextLine();
            age = inputFile.nextInt();
            inputFile.nextLine();
            smokeStatus = inputFile.nextLine();
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();
            
            if(inputFile.hasNext())
            {
               inputFile.nextLine();
               inputFile.nextLine();
            }
            
            // Create Policy objects using the Policy class type
            Policy p = new Policy(policyNumber, providerName, firstName, lastName, age, smokeStatus, height, weight);
            
            // Add Policy Objects to the ArrayList
            policies.add(p); 
         
         }
      
      inputFile.close(); // Close the file
      
      // Use a for loop to display the output
      for(int index=0; index < policies.size(); index++)
         { 
            System.out.println("Policy Number: " + policies.get(index).getPolicyNumber()); // returns the policy number
            System.out.println("Provider Name: " + policies.get(index).getProviderName()); // returns the provider name
            System.out.println("Policyholder's First Name: " + policies.get(index).getFirstName()); // returns the policyholder's first name
            System.out.println("Policyholder's Last Name: " + policies.get(index).getLastName()); // returns the policyholder's last name
            System.out.println("Policyholder's Age: " + policies.get(index).getAge()); // returns the policyholder's age
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policies.get(index).getsmokeStatus()); // returns the policyholder's smoking status
            System.out.println("Policyholder's Height: " + policies.get(index).getHeight() + " inches"); // returns the policyholder's height
            System.out.println("Policyholder's Weight: " + policies.get(index).getWeight() + " pounds"); // returns the policyholder's weight
            System.out.printf("Policyholder's BMI: %.2f \n", policies.get(index).getBMI()); // returns the policyholder's BMI
            System.out.printf("Policyholder's Price: $%.2f \n", policies.get(index).getPrice()); // returns the policy price
            System.out.println();
            
            if (policies.get(index).getsmokeStatus().equalsIgnoreCase("non-smoker"))
               totalnsmokers += 1;
            else
               totalsmokers += 1;
         } 
         
         System.out.println("The number of policies with a smoker is: " + totalsmokers);
         System.out.println("The number of policies with a non-smoker is: " + totalnsmokers); 
   }
}