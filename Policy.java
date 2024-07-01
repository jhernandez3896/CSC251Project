public class Policy
{
   // declaring variables
   private String policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   
   // no-arg constructor
   public Policy()
   {
      policyNumber = "";
      providerName = "";
   }
   
   /**
      constructor that accepts arguments for each field
      @param num           the policy number
      @param provider      the provider name

   **/
   public Policy (String num, String provider)
   {
      policyNumber = num;
      providerName = provider;
   }
   
   /**
      A copy constructor of the TextBook class that it is passed as a parameter.
      It's used to avoid security holes.
      @param object2 - the object to copy
   **/
   
   public Policy(Policy object2)
   {
      policyNumber = object2.policyNumber;
      providerName = object2.providerName;
   }
   
   // setters
   
   /**
      the setPolicyNumber method updates the value of the policyNumber field
      @param num           the policy number
   **/
   public void setPolicyNumber(String num)
   {
      policyNumber = num;
   }
   
   /**
      the setProviderName method updates the value of the providerName field
      @param provider      the provider name
   **/
   public void setProviderName(String provider)
   {
      providerName = provider;
   }
   
   
   // getters
   
   /**
      the getPolicyNumber method retrieves the value of the policyNumber field
      @param none
   **/
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
      the getProviderName method retrieves the value of the providerName field
      @param none
   **/
   public String getProviderName()
   {
      return providerName;
   }
   
   public String toString()
   {
      return String.format("Policy Number: " + policyNumber +
                           "\nProvider Name: " + providerName);
   }
}