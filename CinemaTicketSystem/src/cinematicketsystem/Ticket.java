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
public class Ticket  {
   


 public void OrderTicket(int place){ 
   Scanner sc = new Scanner(System.in);
         boolean response = true;
         int Count=0;
         int Sum=0;
         String[] user_respo;
        String[] Rows = { "Row 1 ", "Row 2 ", "Row 3 ", "Row 4 ", "Row 5 ", "Row 6 ", "Row 7 ", "Row 8 ", "Row 9 ", "Row 10 "};
        String [][] table = {
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},   
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"}

        };
         

         
        do{ 
           System.out.println("Cinema Seat Reservation");
          String[] columns = { "Col 1",  "Col 2",  "Col 3",  "Col 4" };
        for(int i = 0; i < columns.length; i++){
            System.out.print("\t" + columns[i]);

        }

       
        System.out.println();   
        
        for(int row = 0; row < table.length; row++){
            System.out.print(Rows[row]);
            for(int col = 0; col < table[row].length; col++){
                
                System.out.print("\t" + table[row][col]);

            }

            System.out.println();
        }
        //TABLE REPEAT

        System.out.print("Enter row and column number to reserve separated by space (Enter a negative number to exit): ");
        //GET THE USER INPUT SEPARTING THE INTEGER WITH WHITE SPACE
        user_respo = sc.nextLine().split(" ");
        
        int row1 = Integer.parseInt(user_respo[0]);
        int col2 = Integer.parseInt(user_respo[1]);
        //CHECK IF IT IS A NEGATIVE NUMBER OR NOT
        if(Integer.parseInt(user_respo[0]) > 0 && Integer.parseInt(user_respo[1]) > 0){
             //MINUS 1 SINCE INDEX STARTS WITH 0
            if (table[row1-1][col2-1] !="X"){
             table[row1-1][col2-1] = "X";
             Count++;
              System.out.println("Number of tickets are ordered:");
        System.out.println(Count);
        
        if(row1<=5){
            if(CinemaBook.choice==1){
            Sum+=8;
        System.out.println("Price:8 AZN");}
        if(CinemaBook.choice==2){
            Sum+=9;
        System.out.println("Price:9 AZN");}
        if(CinemaBook.choice==3){
            Sum+=10;
        System.out.println("Price:10 AZN");}
        if(CinemaBook.choice==4){
            Sum+=6;
        System.out.println("Price:6 AZN");}
        if(CinemaBook.choice==5){
            Sum+=7;
        System.out.println("Price:7 AZN");}}
        
        else 
        { if(CinemaBook.choice==1){
            Sum+=7;
        System.out.println("Price:7 AZN");}
        if(CinemaBook.choice==2){
            Sum+=8;
        System.out.println("Price:8 AZN");}
        if(CinemaBook.choice==3){
            Sum+=9;
        System.out.println("Price:9 AZN");}
        if(CinemaBook.choice==4){
            Sum+=5;
        System.out.println("Price:5 AZN");}
        if(CinemaBook.choice==5){
            Sum+=6;
        System.out.println("Price:6 AZN");}}
        

        }
            else{
                 System.out.println("This seat is already booked");
            }
        }
        else {
        response = false;

        }
        
        }// END OF DO WHILE
        while(response == true);
 System.out.println("Final Price:"+Sum);}
 
}
    



