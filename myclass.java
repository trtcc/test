
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trtcc
 */
public class myclass {


 	 public static void main(String args[]){
             Scanner scan = new Scanner(System.in);
      String test = scan.next();
      char[] chars = test.toCharArray();
      StringBuilder ans = new StringBuilder();
      for(char output : chars){
         if(Character.isDigit(output)){
            ans.append(output);
         }
      }
      System.out.println(ans);
   }

 	
 }

    
