/*
Scenario 0:
Consider the following array:
int[] myArr = {4, 8, 15, 16, 23, 42};
1. Answer the following questions without writing or running any code:
a. What is the length of myArr?
b. What is the value of the first element?
c. What is the index value of the last element?
d. What is the value of the third element?
e. What is the value of myArr[3]?
f. If we try to access myArr[10], what happens?
        2. Write a program that prints labeled answers for items (a)–(e). Then deliberately try to
access myArr[10], run the program, and explain the error message in a comment in
your code.
*/


public class LabSixTask0 {
    public static void main(String[] args) {
        int[] myArr = {4, 8, 15, 16, 23, 42};

        System.out.println("a) Length of myArr: " + myArr.length);
        System.out.println("b) Value of the first element: " + myArr[0]);
        System.out.println("c) Index of the last element: " + (myArr.length - 1));
        System.out.println("d) Value of the third element: " + myArr[2]);
        System.out.println("e) Value of myArr[3]: " + myArr[3]);
    }
}

// If we try to access myArr[10], the program gives an error.
//Because the array has only 6 elements (index 0 to 5).
//The error is:   ArrayIndexOutOfBoundsException
//It means we are trying to use an index that does not exist.