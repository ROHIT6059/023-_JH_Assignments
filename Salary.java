
import java.util.Scanner;
public class Salary
{
 public static void main(String args[]) 
 {
  float basic_salary,da,hra,GrossPayment;
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter Basic Salary Of Employee: ");
     basic_salary=scan.nextFloat();
  if (basic_salary < 10000) 
   { 
      hra = (10*basic_salary) /100;
      da = (90*basic_salary) /100;
   }
  
    else
      {
         hra = 2000;
         da = (98*basic_salary) /100;
   }
        GrossPayment = basic_salary + da + hra;
        System.out.println("Gross Salary Of Employee: "+GrossPayment);
  }
}