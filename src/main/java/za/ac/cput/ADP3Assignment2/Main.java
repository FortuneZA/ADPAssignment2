package za.ac.cput.ADP3Assignment2;

import java.util.*;

/**
 * Author: Mathew Fortuin (219069514)
 * Date: 7/5/2021
 * Main class that contains my collections interface
 *
 */
public class Main
{

    //1) List Interface

    public void myArrayList()
    {

        ArrayList<String> standards = new ArrayList<String>();

        //Add

        standards.add("A grade");
        standards.add("B grade");
        standards.add("C grade");
        standards.add("D grade");

        System.out.println("Standards:\n--------");
        for(int i =0;i<standards.size();i++)
        {
            System.out.println(standards.get(i));
        }
        System.out.println("--------------------------------------");

        //remove
        System.out.println("Removed Element\n");
        standards.remove(1);

        for(int i =0;i<standards.size();i++)
        {

            System.out.println( "\n"+standards.get(i));
        }
        System.out.println("--------------------------------------");

        //Find
        System.out.println("\nFinding a value: \n");
        boolean doesContain = standards.contains("C grade");

        System.out.println("\nDoes the Array contain a standard of C :  "+doesContain);


    }

    //2) Set interface

    public void myHashSet()
    {

        Set<Double> accuracy = new HashSet<>();

        //Add

        accuracy.add(79.6);
        accuracy.add(64.8);
        accuracy.add(80.2);
        accuracy.add(59.7);

        System.out.println("Accuracy:\n--------");

        for(double output:accuracy)
        {
            System.out.println(output);
        }
        System.out.println("--------------------------------------");

       //remove
        System.out.println("Removed Element: \n");
       accuracy.remove(59.7);

        for(double output2:accuracy)
        {
            System.out.println(output2);
        }
        System.out.println("--------------------------------------");

        //Find
        System.out.println("\nFinding a value: \n");
        boolean doesContain2 = accuracy.contains(100.0);
        System.out.println("Is there an accuracy of 100.0?: "+doesContain2);

    }

    //3) Map interface

  public void myHashMap()
  {
      Map<String,String> contestants = new HashMap<>();

      //Add
      contestants.put("Contestant1","Adams");
      contestants.put("Contestant2","Jones");
      contestants.put("Contestant3","Fortuin");
      contestants.put("Contestant4","Van Wyk");

      System.out.println("Contestants:\n----------");

      Set<String> storedKeys =contestants.keySet();

      for(String output:storedKeys)
      {
          System.out.println(output+":"+contestants.get(output));
      }

      System.out.println("--------------------------------------");

      //Remove

      contestants.remove("Contestant2");
      for(String output:storedKeys)
      {
          System.out.println(output+":"+contestants.get(output));
      }

      System.out.println("--------------------------------------");

      //Find
      System.out.println("\nFinding a value: \n");
      String findVal = "Fortuin";
      Boolean doesContain3 = contestants.containsValue(findVal);

      System.out.println("Is there a contestant named "+findVal+"?: "+doesContain3);

  }

  public void myCollection()
  {
      Collection<Object> contestantProfile= new ArrayList<Object>();

      //Add

      contestantProfile.add("Fortuin");
      contestantProfile.add("Cape Town,South Africa");
      contestantProfile.add(35);
      contestantProfile.add("South African Shooting Academy");
      contestantProfile.add(78.4f);

      System.out.println("ContestantProfile:\n-------------------");

      for(Object output:contestantProfile)
      {
          System.out.println(output);
      }

      System.out.println("--------------------------------------");

      //Remove
      System.out.println("Removed Element:\n");

      contestantProfile.remove(35);

      for(Object output:contestantProfile)
      {
          System.out.println(output);
      }

      //Find
      System.out.println("\nFinding a value: \n");
      String findVal ="South African Shooting Academy";
      Boolean doesContain4 = contestantProfile.contains(findVal);

      System.out.println("\nIs the contenstant a member of  "+findVal+"?: "+doesContain4);

  }



    public static void main( String[] args )
    {

        Main run = new Main();

        //List Interface Method
        run.myArrayList();

        //Set Interface Method
        //run.myHashSet();

        //Map Interface Method
        //run.myHashMap();

        //Collections Interface Method
        //run.myCollection();

    }
}
