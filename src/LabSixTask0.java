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