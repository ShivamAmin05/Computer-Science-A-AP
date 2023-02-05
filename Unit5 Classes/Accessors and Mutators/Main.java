class Main {
    public static void main(String[] args) {
      System.out.println("-------------------------------");
          System.out.println("Topic 5.4/5.5 Accessor/Mutators");
          System.out.println("-------------------------------");
          
          // put the testing code here
          Invitation inv1 = new Invitation();
      System.out.println(inv1);
      inv1.setName("John");
      inv1.setAddress("768 Street");
      System.out.println(inv1);
          Invitation inv2 = new Invitation("Mary");
      System.out.println(inv2);
      inv2.setAddress("000 Street");
      System.out.println(inv2);
          Invitation inv3 = new Invitation("Shivam", "123 Street");
      System.out.println(inv3);
    }
  }