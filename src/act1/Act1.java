
package act1;

import java.util.Scanner;

public class Act1 {

    
    public static void main(String[] args) {
       
        
        Scanner ss = new Scanner(System.in);
        int total = 0;
        float average;
        String remarks;
        int sub; 
        
        
        System.out.print("Enter student name : ");
        String name = ss.nextLine();
        
        System.out.print("Enter number of subject : ");
        sub = ss.nextInt();
        
        for ( int i = 1 ; i <= sub ; i++ ){
           System.out.print( "Enter grade for sub " + i + " :  ");
           total += ss.nextInt();
           
           
           
            
    }
    
   average = (float)total / (float)sub;
            System.out.println("AVERAGE: " + average );
    
    if ( average >= 75 ){
          System.out.println("REMARKS: PASSED! "  );
}
    else{
          
          System.out.println(" REMARKS: FAILED! ");      
}
    
    }
}
   