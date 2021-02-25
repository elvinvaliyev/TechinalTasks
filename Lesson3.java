package lesson3;

import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
       //3 9   ad.4
   
  
/*<1/> Write a Java program that reads an positive integer 
       and count the number of digits the number (less than ten billion) has.*/

//        Scanner scan = new Scanner(System.in);
//        int x = scan.nextInt();
//        int count = 0;
//        while (x > 0) {
//            x = x / 10;
//            count++;
//        }
//        System.out.println("Number of digits in the number: " + count);



/*<2/> Write a program in Java to make such a pattern like right angle triangle with 
       a number which will repeat a number in a row
       The pattern is as follows : */

//        Scanner scan= new Scanner (System.in);
//        int n = scan.nextInt();
//        for(int i=1;i<=n;i++){
//	for(int j=1;j<=i;j++){
//	System.out.print(i);}
//	System.out.println("");
//              }



/*<3/> Write a Java program to display Pascal's triangle. */

    
        
        
/*<4/> Write a program to print out all Armstrong numbers between 1 and 500. 
If sum of cubes of each digit of the number is equal to the number itself, 
then the number is called an Armstrong number.For example,
153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )*/

//Scanner scan  =new Scanner(System.in);
//int num = scan.nextInt();
//int numChecker=num;
//int sum=0;
//while(num>0){
//    sum=sum+(num%10)*(num%10)*(num%10);
//    num=num/10;
//}
// if(sum==numChecker){
//     System.out.println("armstrong");}
// else {System.out.println("not");}



/*<5/> Write a program to print Fibonacci series of n terms where
       n is input by user : 0 1 1 2 3 5 8 13 24*/

//        Scanner scan= new Scanner (System.in);
//        int n = scan.nextInt();
//        int newNum;
//        int k1=0;
//        int k2=1;
//        int count=2;
//        System.out.print("0"+" "+"1"+" ");    
//        while(n!=count){
//            newNum =k1+k2;
//            k1=k2;
//            k2=newNum;
//            System.out.print(newNum+" ");
//            count++;
//        }



/*<6/> Write a java program that verifies if the input number is palindrome or not. 
We call a number palindrome if the reverse order of reading digits gives the same number. 
Exp: 1441 is a palindrome, since the reverse order of reading its digits equal to number itself*/

//  Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        int numValue = num;
//        int count = 0;
//        int onluq;
//        int halfCount;
//        //find the count of digit in number
//        while (num > 0) {
//            count++;
//            num = num / 10;
//        }
//        
//        if (count % 2 == 0) {
//            halfCount = count / 2;
//        } else {
//            halfCount = count / 2 + 1;
//        }
//        int firstPart = numValue / (int) ((Math.pow(10, halfCount)));
//        int secondPart = numValue % (int) ((Math.pow(10, count / 2)));
//        int reversed = 0;
//        //reverse secondPart
//        while (secondPart != 0) {
//            int digit = secondPart % 10;
//            reversed = reversed * 10 + digit;
//            secondPart /= 10;
//        }
//        System.out.println(firstPart + " " + reversed);
//        if (firstPart == reversed) {
//            System.out.println("palindrom");
//        } else {
//            System.out.println("not");
//        }



/*<7/> Write a program reading grades of the students until user inputs 0.
The expected output is the average of all input numbers*/

//Scanner scan =new Scanner(System.in);
//double num =scan.nextDouble();
//double sum=0,average;
//int count=0;
//while(num!=0){
//    sum=sum+num;
//    count++;
//    num=scan.nextDouble();
//}
//average=sum/count;
//System.out.println(average);



/*<8/> Write a program which defines if the given pair of input numbers are co-prime or not.
We name the pair of numbers co-prime if they don’t have common divisor except 1. 
Example 9 and 16 are co-prime*/

//Scanner scan = new Scanner(System.in);
//int x = scan.nextInt();
//int y = scan.nextInt();
//int [] xArr= new int[x-1];
//int [] yArr= new int[y-1];
//
//for(int j=2;j<=x;j++){
//    if(x%j==0){
//    xArr[j-2]=j;
//    }
//}
//for(int j=2;j<=y;j++){
//    if(y%j==0){
//    yArr[j-2]=j;
//    }
//}
//for(int i=0;i<xArr.length;i++){
//    for(int j=0;j<yArr.length;j++){
//if(xArr[i]==yArr[j]){
//    if(xArr[i]!=0){
//    System.out.println("value : "+xArr[i]);}}}}
//
//System.out.println(Arrays.toString(xArr));
//System.out.println(Arrays.toString(yArr));
 


/*<9/> Write a program to compute the cosine of x. 
The user should supply x and a positive integer n.
We compute the cosine of x using the series and the computation
should use all terms in the series up through the term involving xncos
x = 1 -x^2/2! + x^4/4! -x^6/6! ...*/

//Scanner scan = new Scanner(System.in);
//int k=scan.nextInt()*2;
//int x=scan.nextInt();
//int fact =1;
// for(int i=1;i<=2*k;i++){    
//      fact=fact*i;    
//  }
// double allSum=0;
// double cousine=1;
// for(int i=0;i<k*2;i++){
//     cousine= (Math.pow(-1, i))*(Math.pow(x, 2*i))/fact;
//     allSum=allSum+cousine;
//     
// }
//System.out.println(cousine);



/*<10/> Write a Java program to calculate the average value of array elements*/

//Scanner scan= new Scanner (System.in);
//System.out.println("print size");
//int size =scan.nextInt();
//int[] arr= new int[size];
//System.out.println("print values");
//for(int i=0;i<size;i++){
//    arr[i]=scan.nextInt();
//}
//System.out.println(Arrays.toString(arr));
//
//int sum=0;
//double average;
//for(int i=0;i<arr.length;i++){
//sum=sum+arr[i];}
//average =sum/(double)arr.length;
//System.out.println(average);



/*<11/> Write a Java program to find the index of an array element.*/

//Scanner scan= new Scanner (System.in);
//System.out.println("print size");
//int size =scan.nextInt();
//int[] arr= new int[size];
//System.out.println("print values");
//for(int i=0;i<size;i++){
//    arr[i]=scan.nextInt();
//}
//System.out.println(Arrays.toString(arr));
//System.out.println("hansi indexli element istiyirsiz?");
//int index=scan.nextInt();
//try{
//System.out.println("BUDUR : " + arr[index]);}
//catch(Exception e){
// System.out.println("Bele index yoxdur");}



/*<12/> Write a Java program to find the maximum and minimum value of an array.*/

//Scanner scan= new Scanner (System.in);
//System.out.println("print size");
//int size =scan.nextInt();
//int arr[]= new int[size];
//System.out.println("print values");
//for(int i=0;i<size;i++){
//    arr[i]=scan.nextInt();
//}
//System.out.println(Arrays.toString(arr));
//
//int max,min;
//max=arr[0];
//min=arr[0];
//for(int i=0;i<size;i++){
//    if(arr[i]>max){
//        max=arr[i];
//    }
//    if(arr[i]<min){
//    min=arr[i];}
//}
//System.out.println("max : "+ max);
//System.out.println("min : "+ min);



/*<13/> Write a Java program to reverse an array of integer values.*/

//Scanner scan= new Scanner (System.in);
//System.out.println("print size");
//int size =scan.nextInt();
//int[] arr= new int[size];
//System.out.println("print values");
//for(int i=0;i<size;i++){
//    arr[i]=scan.nextInt();
//}
//System.out.println(Arrays.toString(arr));
//int[] arr1 =new int[size];
//for(int i=arr.length-1;i>=0;i--){
//arr1[i]=arr[arr.length-1-i];}
//System.out.println(Arrays.toString(arr1));



/*<14/> Write a Java program to find the duplicate values of an array of integer values.*/

//Scanner scan= new Scanner (System.in);
//System.out.println("print size");
//int size =scan.nextInt();
//int[] arr= new int[size];
//System.out.println("print values");
//for(int i=0;i<size;i++){
//    arr[i]=scan.nextInt();
//}
//
//Arrays.sort(arr);
//for(int i=0;i<arr.length-1;i++){
//    if(arr[i]==arr[i+1]){
//        System.out.println(arr[i]+" is dublicate");}
//}



/*15/> Write a Java program to find the common elements between two arrays.(integer values)*/

//Scanner scan =new Scanner(System.in);
//System.out.println("first arr size");
//int size1 =scan.nextInt();
//int[] arr1= new int[size1];
//System.out.println("second arr size");
//int size2 = scan.nextInt();
//int[] arr2= new int[size2];
//System.out.println("print 1st values");
//for(int i=0;i<arr1.length;i++){
//    arr1[i]=scan.nextInt();
//}
//System.out.println("print 2st values");
//for(int i=0;i<arr2.length;i++){
//    arr2[i]=scan.nextInt();
//}
//
//for(int i=0;i<arr1.length;i++){
//    for(int j=0;j<arr2.length;j++){
//if(arr1[i]==arr2[j]){
//    System.out.println("value : "+arr1[i]);}}}













//4 
//Additional exercises

//1 Faktorial hesablamaq

//Scanner scan =new Scanner(System.in);
//int n =scan.nextInt();
//int s=1;
//for(int i=n;i>1;i--){
//    s=s*i;
//}
// System.out.println(s);



//2 Array elementlerin faktorialini hesablamaq

//Scanner scan =new Scanner(System.in);
//        System.out.println("array size");
//int size =scan.nextInt();
//int arr [] =new int[size];
//        System.out.println("qiymetleri daxil et");
//for(int i=0;i<size;i++){
//arr[i]=scan.nextInt();}
//        System.out.println("array qiymetleri budur");
//for(int i=0;i<size;i++){
//    System.out.print(arr[i]+ " ");}
//
//        System.out.println("");
//for(int i=0;i<size;i++){
//    int hasil =1;
//for(int j =arr[i];j>1;j--){
//        hasil=hasil*j;}
//    System.out.print(hasil+" ");}



//3  Find and print prime numbers of an array (massivin sade elementlerini cap edin)

//Scanner scan = new Scanner(System.in);
//System.out.println("array size");
//int size =scan.nextInt();
//int arr []=new int [size];
//System.out.println("Qiymetleri daxil edin");
//for(int i=0;i<size;i++){
//arr[i]=scan.nextInt();}
//
//
//for(int i=0;i<size;i++){
//int S=0;
//for(int j=2;j<=arr[i]-1;j++){
//    if(arr[i]%j==0){
//    S=1;
//    }
//}
//if(S==1){
//    System.out.println(arr[i]+" Sade deyil");
//}
//else{
//    System.out.println(arr[i]+" sadedir");
//}}



//4. Find gcd (EBOB) of given number pair (verilmis ededler cutunun EBOB-nu hesablayin)
       
//          ArrayList<Integer> number1 = new ArrayList<Integer>();
//           ArrayList<Integer> number2 = new ArrayList<Integer>();
           
        
//5. Find product of two input numbers using loop (dovr vasitesile iki ededin hasilini hesablayin)

//        Scanner scan = new Scanner(System.in);
//        int x = scan.nextInt();
//        int y = scan.nextInt();
//        int sum = 0;
//        for (int i = 0; i < y; i++) {
//            sum = sum + x;
//        }
//        System.out.println(sum);


       
//6. Find division of two input numbers using loop (dovr vasitesile bir ededin digerine bolunmesini hesablayin)

//        Scanner scan = new Scanner(System.in);
//        int x = scan.nextInt();
//        int y = scan.nextInt();
//        int difference=0;
//        int i=0;
//        while(x>0){
//        x =x-y;
//        i++;}
//        System.out.println(i);
        

}}