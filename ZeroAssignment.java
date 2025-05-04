/* Assignment 0
Goal: You are to build a program to test each value in the array to determine if they are prime numbers. You will need 2 loops:
First loop will traverse through the array to extract each value for testing
Second loop will test each extracted value to determine if its prime
Rules for a prime number, 1 is never a prime number. A prime number is one only evenly divided by itself and 1 - example 3,7,etc
To test a number you can test values from 2 to half the value of the number inquestion for being able to be divided by a value. An easy way to do this test is to take the value in question and use the modulus % operator as it finds the whole number remainder of long division. If that value of the mod is equal to 0, then the number in question is NOT prime as its able to be evenly divided

For each number your program will output the value and if it is prime or a message stating the value is NOT prime. See supplied .println statements below.
To get full credit your program must identify the prime status of each number in the array supplied, any misidentification will result in loss of points.

Handin:
1: Remove ALL comments from final submission java file
2: Run and test your program and capture a screenshot of its full output
3: Submit .java file AND screenshot. A submission without one or the other is incomplete for grading.


*/

public class ZeroAssignment {
    public static void main(String args[]) {
      int arr[] = {31,2,4,67,81,6,7,9,15,65,77,15,14,36,41,25,1} ;
      int count = 0;
      {
         for (int i = 0; i < arr.length; i++){
         int num = arr[i];
         if (num == 1) {
             System.out.println("1 is never a prime");
             continue;
           }
        

         boolean flag = true;
         for (int j = 2; j <= num/2; j++){
              if (num % j == 0) {
               flag = false;
               break;
             }
      }
     if (flag == true)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");

      }
    }
  }
}
