
package lesson2;

import java.util.Arrays;
import java.util.Scanner;
//enum for exercise n4
enum DAY {
        Monday,
   	Tuesday,
   	Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
}
//1 3 13
public class Lesson2 {
    public static void main(String[] args) {
        
/*<1/> Write a console java application (outside of IDE) 
       which collects command line arguments and displays some informative result. */

//        System.out.println( "Name: "+ args[0]);
//        System.out.println( "Gender: "+ args[1]);
//        System.out.println( "Age: "+ args[2]);
//        System.out.println( "Height: "+ args[3]);
//        System.out.println( "Weight: "+ args[4]);
             
       
       
/*<2/> Write a Java program to convert minutes into a number of years and days. */

//       Scanner scan  = new Scanner(System.in);
//       int minute = scan.nextInt();
//       int hours=minute/60;
//       int day=hours/24;
//       int year=day/365;
//       int remainDay = day%365;
//       System.out.println(year);
//       System.out.println(remainDay);



//3 was easy quadrical              
       


/*<4/> Write a Java program that keeps a number from the user and generates 
       an integer between 1 and 7 and displays the name of the weekday.*/

//Scanner scan =new Scanner(System.in);
//int day =scan.nextInt();
//DAY d1=DAY.Monday;
//DAY d2=DAY.Tuesday;
//DAY d3=DAY.Wednesday;
//DAY d4=DAY.Thursday;
//DAY d5=DAY.Friday;
//DAY d6=DAY.Saturday;
//DAY d7=DAY.Sunday;
//
//  switch (day) 
//        { 
//        case 1: 
//            System.out.println(d1); 
//            break; 
//        case 2: 
//            System.out.println(d2); 
//            break;  
//        case 3: 
//            System.out.println(d3); 
//            break; 
//        case 4: 
//            System.out.println(d4); 
//            break; 
//        case 5: 
//            System.out.println(d5); 
//            break; 
//        case 6: 
//            System.out.println(d6); 
//            break;
//        case 7: 
//            System.out.println(d7); 
//            break;
//        default: 
//            System.out.println("HEC BIRI"); 
//            break; }
     


/*<5/> Write a program in Java to input 5 numbers from
keyboard and find their sum and average.*/

//Scanner scan =new Scanner(System.in);
//double a =scan.nextDouble();
//double b =scan.nextDouble();
//double c =scan.nextDouble();
//double d =scan.nextDouble();
//double e =scan.nextDouble();
//double sum =a+b+c+d+e;
//System.out.println("The sum of 5 no is :" + sum);
//System.out.println("The Average is: " + sum/5);



/*<6/>Write a Java program that determines a student’s grade.
The program will read three types of scores(quiz, mid-term, and final scores) 
and determine the grade based on the following rules:
-if the average score >=90% =>grade=A
-if the average score >= 70% and <90% => grade=B
-if the average score>=50% and <70% =>grade=C
-if the average score<50% =>grade=F*/

//        Scanner scan =new Scanner(System.in);
//        System.out.println("Quiz score:");
//        int quiz =scan.nextInt();
//        
//        System.out.println("Mid-term score:");
//        int mid =scan.nextInt();
//        
//        System.out.println("Final score: ");
//        int finalScore =scan.nextInt();
//        
//        int mark=(quiz+mid+finalScore)/3;
//        String result =((mark <= 50 ) ? "F":
//            (50 <= mark && mark < 70) ? "C":
//            (70 <= mark && mark < 90) ? "B":
//            (90 <= mark  && mark<=100) ? "A":"Impossible");
//        System.out.println("Your grade is "+result);
        


   /*<7/> Write a program to print absolute valueof a 
number entered by user: (use ternary operator)*/ 

//Scanner scan =new Scanner(System.in);
//double x=scan.nextDouble();
//x=(x<0)?x*(-1):x;
//System.out.println(x);



 /*<8/> Write a program to check whether a entered
character is lowercase ( a to z ) or uppercase*/                  

//        Scanner scan =new Scanner(System.in);
//        char letter =scan.next().charAt(0);
//            int ascii =letter;
//        
//         System.out.println(ascii);
//         if(ascii>=97 && ascii<=122){
//             System.out.println("lowercase");}
//         else
//          if(ascii>=65 && ascii<=90){
//             System.out.println("uppercase");}
//          else {System.out.println("hec biri");}   



/*<9/>    Print digits in words from 0 to 9. 
(Write in two styles using switch -case and if else statements)*/

//Scanner scan =new Scanner(System.in);
//int num =scan.nextInt();
//switch(num){
//    case 0:System.out.println("zero");break;
//    case 1:System.out.println("one");break;
//    case 2:System.out.println("two");break;
//    case 3:System.out.println("three");break;
//    case 4:System.out.println("four");break;
//    case 5:System.out.println("five");break;
//    case 6:System.out.println("six");break;
//    case 7:System.out.println("seven");break;
//    case 8:System.out.println("eight");break;
//    case 9:System.out.println("nine");break;
//    default:System.out.println("not in range");      
//}
//
//if(num==0){System.out.println("zero");}else
//if(num==1){System.out.println("one");}else
//if(num==2){System.out.println("two");}else
//if(num==3){System.out.println("three");}else
//if(num==4){System.out.println("four");}else
//if(num==5){System.out.println("five");}else
//if(num==6){System.out.println("six");}else
//if(num==7){System.out.println("seven");}else
//if(num==8){System.out.println("eight");}else
//if(num==9){System.out.println("nine");}else
//{System.out.println("not in range");}
                                


/*<10/> Write a calculator program which calculates 5 basic operations for 2 input numbers.*/

//        Scanner scan = new Scanner(System.in);
//        System.out.println("a Daxil edin");
//        double a = scan.nextDouble(); 
//        
//        System.out.println("b Daxil edin");
//        double b = scan.nextDouble(); 
//        
//        System.out.println("sum = " + (a + b));
//        System.out.println("difference = " + (a - b));
//        System.out.println("product  = " + (a * b));
//        System.out.println("division = " + (a / b));
//        System.out.println("remainder = " + (a % b));



/*<11/> A school has following rules for grading system:*/

//        Scanner scan=new Scanner(System.in);
//        int mark =scan.nextInt();
//        String result =((0 <= mark && mark <= 25 ) ? "F":
//                    (25 <= mark && mark < 45) ? "E": 
//                    (45 <= mark && mark < 50) ? "D":
//                    (50 <= mark && mark < 60) ? "C":
//                    (60 <= mark && mark < 80) ? "B":
//                    (80 <= mark  && mark<=100) ? "A":"Impossible");
//      
//        System.out.println("Result is "+result);
        


/*<12/> A company decided to give bonus of 5% to employee 
if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount*/

//        Scanner scan =new Scanner(System.in);
//        System.out.println("Inputyour salary:");
//        double salary =scan.nextDouble();
//        
//        System.out.println("Input year of service: ");
//        int year =scan.nextInt();
//        
//        if(year>5){
//        salary=salary*0.05+salary;
//        System.out.println(salary);}
//        else{
//            System.out.println(salary);
//        }
        


/*<13/> A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user / Number of classes held / Number of classes attended.
And print : percentage of class attendedIs student is allowed to sit in exam or not.*/

//     Scanner scan = new Scanner (System.in);
//        System.out.println("Input total number of classes :");
//        double total = scan.nextDouble();
//        
//        System.out.println("Input number of attended classes :");
//        double attended =scan.nextDouble();
//        double percentage =(attended*100)/total;
//        
//        System.out.println("Percentage of class attended"+percentage);
//        if(percentage>=0 && percentage<75){System.out.println("not allowed");}
//        else if(percentage>=75 && percentage<=100){System.out.println("allowed");}
//        else System.out.println("something go wrong");




    }}