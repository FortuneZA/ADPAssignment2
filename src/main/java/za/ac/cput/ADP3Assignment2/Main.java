package za.ac.cput.ADP3Assignment2;

import java.util.ArrayList;

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
        standards.add("A grade");
        standards.add("B grade");
        standards.add("C grade");
        standards.add("D grade");

          for(int i =0;i<standards.size();i++)
          {
              System.out.println(standards.get(i));
          }
    }



    public static void main( String[] args )
    {

        Main run = new Main();
        run.myArrayList();

    }
}
