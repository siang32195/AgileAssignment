/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilewspart;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class AgileWSpart {

    
    public static void main(String[] args) {
        String[][] list = {{"1001","Tan Jok Huat"},{"1002","Lim Jia Rong"},{"1003","Lee Yi Fung"}};
        String userID;
        Scanner scn = new Scanner(System.in);
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    
        do{
            System.out.println("Please Enter your staff ID(\"q\" for quit):");
            userID = scn.nextLine().toLowerCase();
            
            if("1001".equals(userID)){
                System.out.println("Staff ID: "+ list[0][0]);
                System.out.println("Name: "+ list[0][1]);
                System.out.println("Clock in Time: "+ sdf.format(d)+"\n");
            }
            else if(userID.equals("1002")){
                System.out.println("Staff ID: "+ list[1][0]);
                System.out.println("Name: "+ list[1][1]);
                System.out.println("Clock in Time: "+ sdf.format(d)+"\n");
            }
            else if(userID.equals("1003")){
                System.out.println("Staff ID: "+ list[2][0]);
                System.out.println("Name: "+ list[2][1]);
                System.out.println("Clock in Time: "+ sdf.format(d)+"\n");
            }
            else if(userID.equals("q")){
                System.out.println("Thank you For Using!!");
            }
            else
                System.out.println("Invalid Input!!!"+"\n");
                

             
        }while(!userID.equals("q"));
        
       
        
    }
    
}
