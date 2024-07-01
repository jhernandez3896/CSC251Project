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
      
      int numberOfObjects = 0; // the number of Class Objects
      
      int totalsmokers = 0; // the total number of smokers
      int totalnsmokers = 0; // the total number of non-smokers
      
      // Get information from the text document 'Policy Information'
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      // Create an ArrayList to store object
      ArrayList<PolicyHolder> policies = new ArrayList<PolicyHolder>();
      
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
            Policy p = new Policy(policyNumber, providerName);
            // Create PolicyHolder objects using the PolicyHolder class type
            PolicyHolder pH = new PolicyHolder(firstName, lastName, age, smokeStatus, height, weight, p);
            // Add Policy Objects to the ArrayList
            policies.add(pH);
            // Adds an Object to the Class Object count
            numberOfObjects = pH.getObjectCount();
            }
      
      inputFile.close(); // Close the file
      
      
      
      // Use a for loop to display the output
      for(int index=0; index < policies.size(); index++)
         {  
                    
            System.out.println(policies.get(index));
            System.out.println();
            
            if (policies.get(index).getsmokeStatus().equalsIgnoreCase("non-smoker"))
               totalnsmokers += 1;
            else
               totalsmokers += 1;
         }
         
         System.out.println("There were " + numberOfObjects + " Policy objects created.");
         System.out.println("The number of policies with a smoker is: " + totalsmokers);
         System.out.print("The number of policies with a non-smoker is: " + totalnsmokers); 
   }
}