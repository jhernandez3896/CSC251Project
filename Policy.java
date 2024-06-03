class Policy
{
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokeStatus;
   private double height;
   private double weight;
   
   public Policy (int num, String provider, String fn, String ln, int years, String smoke, double h, double w)
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
   
   public void setPolicyNumber(int num)
   {
      policyNumber = num;
   }
   public void setProviderName(String provider)
   {
      providerName = provider;
   }
   public void setFirstName(String fn)
   {
      firstName = fn;
   }
   public void setLastName(String ln)
   {
      lastName = ln;
   }
   public void setAge(int years)
   {
      age = years;
   }
   public void setSmokeStatus(String smoke)
   {
      smokeStatus = smoke;
   }
   public void setHeight(double h)
   {
      height = h;
   }
   public void setWeight(double w)
   {
      weight = w;
   }
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   public String getProviderName()
   {
      return providerName;
   }
   public String getFirstName()
   {
      return firstName;
   }
   public String getLastName()
   {
      return lastName;
   }
   public int getAge()
   {
      return age;
   }
   public String getsmokeStatus()
   {
      return smokeStatus;
   }
   public double getHeight()
   {
      return height;
   }
   public double getWeight()
   {
      return weight;
   }
   public double getBMI()
   {
      return (getWeight()*703.0) / (getHeight() * getHeight());
   }
   public double getPrice()
   {
      double policyPrice = 600.0;
      if (age>50){
         policyPrice+=75.0;
      }
      if (smokeStatus.equalsIgnoreCase("smoker")){
         policyPrice+=100.0;
      }
      double bmi = getBMI();
      if (bmi > 35){
         policyPrice+=(bmi-35)*20;
      }
      return policyPrice;
   }
}