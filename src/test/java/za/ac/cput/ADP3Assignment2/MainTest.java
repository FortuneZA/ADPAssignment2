package za.ac.cput.ADP3Assignment2;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


/*
Author:Mathew Fortuin (219069514)
Date: 16/5/2021
Maven TDD: Test class used to test my methods
 */
class MainTest
{

    //List Interface
@Test
    public void testMyArrayListAdd()
{

    ArrayList<String> standards = new ArrayList<String>();
    standards.add("C grade");

    int firstSize = standards.size();

    standards.add("D grade");

    int secondSize=standards.size();

    assertEquals(firstSize,secondSize);



}
@Test
public void testMyArrayListRemove()
{
    ArrayList<String> standards = new ArrayList<String>();
    standards.add("C grade");

    int firstSize = standards.size();

    standards.remove(0);

    int secondSize=standards.size();

    assertEquals(firstSize,secondSize);

}

@Test
    public void testMyArrayListFind()
{

    ArrayList<String> standards = new ArrayList<String>();
    standards.add("C grade");

    boolean doesContain1 = standards.contains("C grade");
    boolean doesContain2 = standards.contains("c grade");

    assertEquals(doesContain1,doesContain2);




}
//Set Interface
@Test
public void testMyHashSetAdd()
{

    Set<Double> accuracy = new HashSet<>();

    accuracy.add(36.7);

    int firstSize = accuracy.size();

    accuracy.add(27.1);

    int secondSize = accuracy.size();

    assertEquals(firstSize,secondSize);

}

@Test
public void testMyHashSetRemove()
{

    Set<Double> accuracy = new HashSet<>();

    accuracy.add(35.0);

    int firstSize = accuracy.size();

    accuracy.remove(35.0);

    int secondSize = accuracy.size();

    assertEquals(firstSize,secondSize);


}
@Test
public void testMyHashSetFind()
{

    Set<Double>accuracy = new HashSet<>();

    accuracy.add(50.0);


    boolean doesContain1 = accuracy.contains(50.0);
    boolean doesContain2 = accuracy.contains(50.00);

    assertEquals(doesContain1,doesContain2);

}

//Map Interface
 @Test
 public void testMyHashMapAdd()
 {
     Map<String,String> contestants = new HashMap<String,String>();

     contestants.put("Contestant1","Jones");

     int firstSize = contestants.size();

     contestants.put("Contestant4","Adams");

     int secondSize = contestants.size();

     assertEquals(firstSize,secondSize);

 }

 @Test
 public void testMyHashMapRemove()
 {
     Map<String,String> contestants = new HashMap<String,String>();
     contestants.put("Contestant 21","Van Der Walt");
     contestants.put("Contestant 36","Jacobs");

     int firstSize = contestants.size();

     contestants.remove("Contestant 36");

     int secondSize=contestants.size();

     assertEquals(firstSize,secondSize);
 }

 @Test
 public void testMyHashMapFind()
 {
     Map<String,String> contestants = new HashMap<String,String>();

     contestants.put("Contestant 34","Isaacs");
     contestants.put("Contestant 51","Isaacs");

     boolean doesContain1 = contestants.containsValue("Isaacs");
     boolean doesContain2 = contestants.containsKey("Contestant 34");

     assertEquals(doesContain1,doesContain2);
 }

 //Collections Interface

@Test
    public void testMyCollectionAdd()
{
    Collection<Object> contestantProfile = new ArrayList<Object>();

    contestantProfile.add("Fortuin");

    int firstSize = contestantProfile.size();

    contestantProfile.add(34.9);

    int secondSize = contestantProfile.size();

    assertEquals(firstSize,secondSize);
}

@Test
    public void testMyCollectionRemove()
{
    Collection<Object> contestantProfile = new ArrayList<Object>();

    contestantProfile.add("South Africa");

    int firstSize = contestantProfile.size();

    contestantProfile.remove("South Africa");

    int secondSize=contestantProfile.size();

    assertEquals(firstSize,secondSize);
}

@Test
    public void testMyCollectionFind()
{
    Collection<Object> contestantProfile = new ArrayList<Object>();
    contestantProfile.add("South Africa");
    contestantProfile.add(35.8);

    boolean doesContain1 = contestantProfile.contains("South Africa");
    boolean doesContain2 = contestantProfile.contains(35.8);

    assertEquals(doesContain1,doesContain2);

}




}