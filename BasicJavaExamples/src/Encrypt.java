import java.util.*;
public class Encrypt
{
        public static void main(String[] args)
        {
            //encrypting the grade.
            char grade='B';
            grade= (char) (grade+8);
            System.out.println( grade);
            //Dycripting the grade
            grade=(char) (grade-8);
            System.out.println(grade);

        }
    }

