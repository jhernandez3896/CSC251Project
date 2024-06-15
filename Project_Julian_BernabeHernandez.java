import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Project_Julian_BernabeHernandez
{
   public static void main (String[] args) throws IOException
   {
      String policyNumber, providerName, firstName, lastName, smokeStatus;
      int age;
      double height, weight;
      
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
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
         
            Policy p = new Policy(policyNumber, providerName, firstName, lastName, age, smokeStatus, height, weight);
            policies.add(p); 
         
         }
      
      inputFile.close();
      
      for(int index=0; index < policies.size(); index++)
         { 
            System.out.println("Policy Number: " + policies.get(index).getPolicyNumber());
            System.out.println("Provider Name: " + policies.get(index).getProviderName());
            System.out.println("Policyholder's First Name: " + policies.get(index).getFirstName());
            System.out.println("Policyholder's Last Name: " + policies.get(index).getLastName());
            System.out.println("Policyholder's Age: " + policies.get(index).getAge());
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policies.get(index).getsmokeStatus());
            System.out.println("Policyholder's Height: " + policies.get(index).getHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policies.get(index).getWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f \n", policies.get(index).getBMI());
            System.out.printf("Policyholder's Price: $%.2f \n", policies.get(index).getPrice());
            System.out.println();
         }  
   }
}