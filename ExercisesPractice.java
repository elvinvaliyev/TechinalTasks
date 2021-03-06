package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 10
public class ExercisesPractice {

    /*<1/> Write a program which calculates average of the 2D array elements.*/
    public void Exercise1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("row");
        int n = scan.nextInt();
        System.out.println("column");
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
        //read
        int sum = 0, count = 0;
        double average;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
                sum += arr[i][j];
                count++;
            }
        }
        average = sum / (double) count;
        //print
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println(average);
    }


    /*<2/> Create and fill 2 x 3 and 3 x 5 size matrices in your program.
     Then calculate and print the product matrix in tabular format.*/
    public void Exercise2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("row1");
        int n1 = scan.nextInt();
        System.out.println("column1");
        int m1 = scan.nextInt();
        System.out.println("row2");
        int n2 = scan.nextInt();
        System.out.println("column2");
        int m2 = scan.nextInt();

        int[][] arr1 = new int[n1][m1];
        int[][] arr2 = new int[n2][m2];
        int[][] productArr = new int[n1][m2];
        //read 2 arrays
        System.out.println("first array elements");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                arr1[i][j] = scan.nextInt();
            }
        }
        System.out.println("second array elements");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                arr2[i][j] = scan.nextInt();
            }
        }
        //product of 2 matrix
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k < m1; k++) {
                    productArr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        //print product of 2 matrix
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(" " + productArr[i][j]);
            }
            System.out.println();
        }
    }

    /*<3/> Write a Java program to print an array after changing the rows and columns of a given two-dimensional array.*/
    public void Exercise3() {

        Scanner scan = new Scanner(System.in);
        System.out.println("row");
        int n = scan.nextInt();
        System.out.println("column");
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
        int[][] arrZ = new int[m][n];

        System.out.println("array elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrZ[j][i] = arr[i][j];
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + arrZ[i][j]);
            }
            System.out.println();
        }
    }

    /*<4/> Write a java program to print sum of upper triangle matrix:*/
    public void Exercise4() {

        Scanner scan = new Scanner(System.in);
        System.out.println("row");
        int n = scan.nextInt();
        System.out.println("column");
        int m = scan.nextInt();
        int[][] arr = new int[n][m];

        System.out.println("array elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i <= j) {
                    sum += arr[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("sum is " + sum);
    }

    /*<5/> Write a java program which finds max element in your 3 x 4 size matrix array.*/
    public void Exercise5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("row");
        int n = scan.nextInt();
        System.out.println("column");
        int m = scan.nextInt();
        int[][] arr = new int[n][m];

        System.out.println("array elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
        System.out.println(max);
    }


    /*<6/> Write a java program which splits your square matrix (exp 3 x 3 matrix)
    array into upper and lower triangles matrices.*/
    public void Exercise6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("row");
        int n = scan.nextInt();
        System.out.println("column");
        int m = scan.nextInt();
        int[][] arr = new int[n][m];

        System.out.println("array elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int[][] firstArr = new int[n][m];
        int[][] secondArr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i >= j) {
                    firstArr[i][j] = arr[i][j];
                } else {
                    secondArr[i][j] = arr[i][j];
                }
            }
        }
        //print this arrays
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + firstArr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + secondArr[i][j]);
            }
            System.out.println();
        }
    }

    /*<7/>There are 20 students in the collage who have taken java exam.
    First seven students had {3,4,4,5,5,4,3}scoreswhile second seven students all had 5 point.
    And last six students failed (2 point) badly. But later on they retook the exam and scored {4,3,4,3,3,2} points.
    Write a java program which contains arrays before and after retake exam.
    Then find an average point of all students after retake exam.*/
    public void Exercise7() {
        Scanner scan = new Scanner(System.in);
        int[] students = new int[]{3, 4, 4, 5, 5, 4, 3, 5, 5, 5, 5, 5, 5, 5, 1, 1, 1, 1, 1, 1};
        int count = 0;
        for (int i = 0; i < 20; i++) {
            if (students[i] <= 2) {
                count++;
            }
        }
        int[] afterExam = new int[20];
        System.arraycopy(students, 0, afterExam, 0, 14);
        System.out.println("Imtahani yeniden verenlerin qiymetlerini yazin.Kesilen telebe sayi :" + count);
        for (int i = 0; i < 20; i++) {
            if (afterExam[i] <= 2) {
                afterExam[i] = scan.nextInt();
            }
        }
        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(afterExam));

    }

    enum Months {
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December
    }

    /*<8/> Create an enumeration class of year months.
    Using for-each loop, print out months by numbering them:
    1.January
    2.February
    3......
    Then, print the enumeration elements as string array.*/
    public void Exercise8() {
        for (Months month : Months.values()) {
            System.out.print(month + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(Months.values()));
    }


    /*<9/> Create an enumeration class of year months.
    And create an enum variable which accepts your birth month from user input.
    Use switch case in order to display number of days in your birth month.*/
    public void Exercise9() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your birth month:");
        String dayOfMonth = scan.nextLine();
        Months getMontsValue = Months.valueOf(dayOfMonth);
        System.out.print("Your birth month has: ");
        switch (getMontsValue) {
            case January:
                System.out.println("31 days");
                break;
            case February:
                System.out.println("28 or 29 days");
                break;
            case March:
                System.out.println("31 days");
                break;
            case April:
                System.out.println("30 days");
                break;
            case May:
                System.out.println("31 days");
                break;
            case June:
                System.out.println("30 days");
                break;
            case July:
                System.out.println("31 days");
                break;
            case August:
                System.out.println("31 days");
                break;
            case September:
                System.out.println("30 days");
                break;
            case October:
                System.out.println("31 days");
                break;
            case November:
                System.out.println("30 days");
                break;
            case December:
                System.out.println("31 days");
                break;

        }
    }

    /*<10/> Suppose that you have an array of numbers shows the total days up to each month(February accepted 28 days).
     * Write a java program accepts number between 1 and 365, and prints corresponding month or months list*/
    public void Exercise10() {
        String[] Months = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November",
                "December"};

        int[] Days = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};


        String[][] selectDay = new String[12][];

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*<1/> Write a Java method to compute the average of three numbers*/
    public double Exercise_1(int x, int y, int z) {
        double average = (x + y + z) / 3;
        return average;
    }

    /*<2/> Write a Java method to count all words in a string*/
    public int Exercise_2(String str) {
        str = str.trim();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == (' ')) {
                count++;
            }
            if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') {
                count--;
            }
        }

        return count + 1;
    }

    /*<3/> Write a Java method to find all twin prime numbers less than 100*/
    public void Exercise_3(int x) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int sum = 0;
        for (int j = 3; j < x; j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == 0) {
                numbers.add(j);
            }
            sum = 0;
        }
        for (int i = 0; i < numbers.size(); i += 2) {
            System.out.println("(" + numbers.get(i) + "," + numbers.get(i + 1) + ")");
        }
    }


    /*<4/> Write Java methods to calculate the area of a triangle.*/
    public double Exercise_4(double x, double y, double z) {
        double perimeter = (x + y + z) / 2;
        double area = Math.sqrt(perimeter * (perimeter - x) * (perimeter - y) * (perimeter - z));
        return area;
    }

    /*<5/> Write a Java method to verify if the taken pair of numbers are co-prime or not
     (co-prime means if they do not have any common factor except 1 or not).*/
    public void Exercise_5(int x, int y) {
        ArrayList<Integer> firstElement = new ArrayList<Integer>();
        ArrayList<Integer> secondElement = new ArrayList<Integer>();
        for (int j = 2; j <= x; j++) {
            if (x % j == 0) {
                firstElement.add(j);
            }
        }
        for (int j = 2; j <= y; j++) {
            if (y % j == 0) {
                secondElement.add(j);
            }
        }
        int sum = 0;
        for (int i = 0; i < firstElement.size(); i++) {
            for (int j = 0; j < secondElement.size(); j++) {
                if (firstElement.get(i) == secondElement.get(j)) {
                    System.out.print(firstElement.get(i) + " ");
                    sum += firstElement.get(i);
                }
            }
        }
        System.out.println();
        if (sum != 0) {
            System.out.println("not prime");
        } else {
            System.out.println("co-prime");
        }
        System.out.println(firstElement);
        System.out.println(secondElement);
    }

    /*<6/> Write a Java method which calculates if the taken number is palindrome or not.
     (We call number palindrome if the reverse reading of it is equal to itself. Exp 12321, 252, 18281, 171)*/
    public void Exercise_6(int x) {
        int keepNumberX = x;
        int reversedX = 0;
        while (keepNumberX > 0) {
            reversedX = reversedX * 10 + keepNumberX % 10;
            keepNumberX = keepNumberX / 10;
        }
        if (x == reversedX) {
            System.out.println("palindrome number ");
        } else {
            System.out.println("not");
        }
    }

    /*<7/> Write a Java method which prints all divisors of the taken number.
    (Exp: divisors of 24 are 1,2,3,4,6,12,24)*/
    public void Exercise_7(int x) {
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    /*<8/> Write a Java method which returns the sum of number and its reverse
    (exp: for the input 243, the output should be 243 + 342 = 585).*/
    public int Exercise_8(int x) {
        int keepNumberX = x;
        int reversedX = 0;
        while (keepNumberX > 0) {
            reversedX = reversedX * 10 + keepNumberX % 10;
            keepNumberX = keepNumberX / 10;
        }
        int sum = x + reversedX;
        return sum;
    }

    /*<9/> Write ajava method which prints consecutiveelements in tabular format (matrix format) for the given matrix size.*/
    public void Exercise_9(int row, int column) {
        int count = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int num = (int) Math.log10(count) + 1;
                if (num == 1) {
                    System.out.print(count + "    ");
                } else if (num == 2) {
                    System.out.print(count + "   ");
                } else if (num == 3) {
                    System.out.print(count + "  ");
                }
                count++;
            }
            System.out.println();
        }
    }
}
