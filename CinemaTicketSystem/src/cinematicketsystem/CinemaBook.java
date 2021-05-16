/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicketsystem;
import java.util.Scanner;

/**
 *
 * @author hurua
 */
public class CinemaBook extends Ticket {
    static int choice;
    public static int place;
public static int i;
 
    public  CinemaBook(int Userchoice){
        choice=Userchoice;
        
      
    }
  

    
    public void ChooseFilm() {
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    String Movies[]=new String[]{"Matrix","The Discover","7.ci kogusdaki mucize","Circle","Pay it forward"};
        int Time[]=new int[]{11,15,18};

        System.out.println("Enter your choice");

    for ( i = 0; i < Movies.length; i++)
  System.out.println(i+1 + " : "+ Movies[i]);
       System.out.println("Enter your choice");
             choice = input.nextInt();
    if(choice==1){
        System.out.println("You chose "+Movies[0]);
         for ( i = 0; i < Time.length; i++)
           System.out.println( Time[i]+":00");
         System.out.println("Enter your choice(only the first 2 digit of the time): When is it suitable for you?");
         
                      int time = input.nextInt();
                      if(time==11) System.out.println("You chose "+Time[0]+":00");
                       if(time==15) System.out.println("You chose "+Time[1]+":00");
                        if(time==18) System.out.println("You chose "+Time[2]+":00");

           
    }
     if(choice==2){
        System.out.println("You chose "+Movies[1]);
        
         for ( i = 0; i < Time.length; i++)
           System.out.println( Time[i]+":00");
         System.out.println("Enter your choice(only the first 2 digit of the time): When is it suitable for you?");
         
                      int time = input.nextInt();
                      if(time==11) System.out.println("You chose "+Time[0]+":00");
                       if(time==15) System.out.println("You chose "+Time[1]+":00");
                        if(time==18) System.out.println("You chose "+Time[2]+":00");
    }
      if(choice==3){
        System.out.println("You chose "+Movies[2]);
        
         for ( i = 0; i < Time.length; i++)
           System.out.println( Time[i]+":00");
         System.out.println("Enter your choice(only the first 2 digit of the time): When is it suitable for you?");
         
                      int time = input.nextInt();
                      if(time==11) System.out.println("You chose "+Time[0]+":00");
                       if(time==15) System.out.println("You chose "+Time[1]+":00");
                        if(time==18) System.out.println("You chose "+Time[2]+":00");
    }
       if(choice==4){
        System.out.println("You chose "+Movies[3]);
        
         for ( i = 0; i < Time.length; i++)
           System.out.println( Time[i]+":00");
         System.out.println("Enter your choice(only the first 2 digit of the time): When is it suitable for you?");
         
                      int time = input.nextInt();
                      if(time==11) System.out.println("You chose "+Time[0]+":00");
                       if(time==15) System.out.println("You chose "+Time[1]+":00");
                        if(time==18) System.out.println("You chose "+Time[2]+":00");
    }
        if(choice==5){
        System.out.println("You chose "+Movies[4]);
        
         for ( i = 0; i < Time.length; i++)
           System.out.println( Time[i]+":00");
         System.out.println("Enter your choice(only the first 2 digit of the time): When is it suitable for you?");
         
                      int time = input.nextInt();
                      if(time==11) System.out.println("You chose "+Time[0]+":00");
                       if(time==15) System.out.println("You chose "+Time[1]+":00");
                        if(time==18) System.out.println("You chose "+Time[2]+":00");
    }
        
}}

