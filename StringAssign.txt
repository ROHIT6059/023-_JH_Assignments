import java.util.*;
import java.io.*;

class StringAssign {
 public static void main(String []args) {
    Scanner read=new Scanner(System.in);

//----------=====Problem 1 String=====--------

   String Line=read.nextLine();
   int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }
            else if( ch >= '0' && ch <= '9')
            {
                ++digits;
            }
            else if (ch ==' ')
            {
                ++spaces;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
	System.out.println("Digits: " + digits);
        System.out.println("White spaces: " + spaces);


//----------=====Problem 3 String=====--------

String data =read.nextLine();
System.out.println(data.replaceAll("([a-zA-Z])\\1{2,}", "$1"));


//----------=====Problem 3 String=====--------

  String str1 = read.nextLine();
  System.out.println("The given string is: " + str1);
   for (int i = 0; i < str1.length(); i++) {
   boolean unique = true;
   for (int j = 0; j < str1.length(); j++) {
    if (i != j && str1.charAt(i) == str1.charAt(j)) {
     unique = false;
     break;
    }
   }
   if (unique) {
    System.out.println("The first non repeated character in String is: " + str1.charAt(i));
    break;
   }
  }

 }
}