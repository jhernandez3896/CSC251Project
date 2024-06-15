class Policy
{
   // declaring variables
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokeStatus;
   private double height;
   private double weight;
   
   // no-arg constructor
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokeStatus = "";
      height = 0;
      weight = 0;
   }
   
   /**
      constructor that accepts arguments for each field
      @param num           the policy number
      @param provider      the provider name
      @param fn            the policyholder's first name
      @param ln            the policyholder's last name
      @param years         the policyholder's age
      @param smoke         the policyholder's smoking status
      @param h             the policyholder's height
      @param w             the policyholder's weight
   **/
   public Policy (String num, String provider, String fn, String ln, int years, String smoke, double h, double w)
   {
      policyNumber = num;
      providerName = provider;
      firstName = fn;
      lastName = ln;
      age = years;
      smokeStatus = smoke;
      height = h;
      weight = w;
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
   
   /**
      the setFirstName method updates the value of the firstName field
      @param fn            the policyholder's first name
   **/
   public void setFirstName(String fn)
   {
      firstName = fn;
   }
   
   /**
      the setLastName method updates the value of the lastName field
      @param ln            the policyholder's last name
   **/
   public void setLastName(String ln)
   {
      lastName = ln;
   }
   
   /**
      the setAge method updates the value of the age field
      @param years         the policyholder's age
   **/
   public void setAge(int years)
   {
      age = years;
   }
   
   /**
      the setSmokeStatus method updates the value of the smokeStatus field
      @param smoke         the policyholder's smoking status
   **/
   public void setSmokeStatus(String smoke)
   {
      smokeStatus = smoke;
   }
   
   /**
      the setHeight method updates the value of the height field
      @param h             the policyholder's height
   **/
   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
      the setWeight method updates the value of the weight field
      @param w             the policyholder's weight
   **/
   public void setWeight(double w)
   {
      weight = w;
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
   
   /**
      the getFirstName method retrieves the value of the firstName field
      @param none
   **/
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
      the getLastName method retrieves the value of the lastName field
      @param none
   **/
   public String getLastName()
   {
      return lastName;
   }
   
   /**
      the getAge method retrieves the value of the age field
      @param none
   **/
   public int getAge()
   {
      return age;
   }
   
   /**
      the getsmokeStatus method retrieves the value of the smokeStatus field
      @param none
   **/
   public String getsmokeStatus()
   {
      return smokeStatus;
   }
   
   /**
      the getHeight method retrieves the value of the height field
      @param none
   **/
   public double getHeight()
   {
      return height;
   }
   
   /**
      the getWeight method retrieves the value of the weight field
      @param none
   **/
   public double getWeight()
   {
      return weight;
   }
   
   /**
      the getBMI method calculates and returns the policyholder's BMI based on the height and weight
      @param none
   **/
   public double getBMI()
   {
      final double CONVERTFACTOR = 703;
      
      return (weight * CONVERTFACTOR) / (height * height);
   }
   /**
      the getPrice method calculates and returns the final policy price based on the policyholder's age, smoking status, and BMI
      @param none
   **/
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double policyPrice = BASE_PRICE;
      
      if(age > AGE_THRESHOLD)
         policyPrice += ADDITIONAL_FEE_AGE;
         
      if(smokeStatus.equalsIgnoreCase("smoker"))
         policyPrice += ADDITIONAL_FEE_SMOKING;
            
      if(getBMI() > BMI_THRESHOLD)
         policyPrice += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
         
      return policyPrice;
   }
}