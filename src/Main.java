import java.nio.channels.ScatteringByteChannel;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //sumOfArrayElements();
        //twoDimensionArray(); // there a think are 3 rows and 4 columns exactly opposite of home work :)
        //another2DArray();
        //dynamic2DimensionalArray(); // from internet taken, i did understand the code, but will never write it on my own.
        //biggestElementInArray();
        //reversedLinkedList();
        isStringIsPalindrome();
    }

    public static void sumOfArrayElements() {
        int[] arr = {4, 5, 2, 6, 3};
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        {
            System.out.println(sum);
        }
    }
    public static void twoDimensionArray() {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8,},
                {9, 10, 11,12}};

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length + 1; j++) {
                System.out.println(arr[i][j]);
       }

        }
    public static void another2DArray(){
        int [][] arr = new int [4][3];
            arr[0][0]=1;
            arr[0][1]=2;
            arr[0][2]=3;
            arr[1][0]=4;
            arr[1][1]=5;
            arr[1][2]=6;
            arr[2][0]=7;
            arr[2][1]=8;
            arr[2][2]=9;
            arr[3][0]=10;
            arr[3][1] =11;
            arr [3][2] =12;

            for(int i = 0; i <arr.length; i ++)
                for(int j = 0; j<arr.length-1;j++){
                    System.out.println(arr[i][j]);
                }
        }

    public static void dynamic2DimensionalArray (){
        System.out.print("Enter first number of rows and after that number of columns : ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();

        System.out.println("Enter array elements and they will be printed from left to right: ");

        int twoD[][]=new int[rows][columns];


        for(int i=0; i<rows;i++)
        {
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=sc.nextInt();
            }
        }
        System.out.print("\nData you entered : \n");
        for(int []x:twoD){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }

    }

    public static void biggestElementInArray(){
        int [] arr = {1,3,6,67,92,32,45};
        int max = arr[0];
        for (int i = 0; i<arr.length;i++)
            if(arr[i]>max )
            max = arr[i];{
            System.out.println(max);
        }
    }

    public static void reversedLinkedList(){
    LinkedList<Integer> cars = new LinkedList<>();
    cars.add(1);
    cars.add(2);
    cars.add(3);
    cars.add(4);
    System.out.println("Linked list of integers before revesrs" + cars);
    for(int i = cars.size() -1;i >= 0;i--) {
        System.out.println(i);
    }
   }

   public static void isStringIsPalindrome(){
       Scanner myString = new Scanner(System.in);
       System.out.println("Please enter your word");
       String obj = myString.next();
       String str = obj, reverseStr = "";

       int strLength = str.length();

       for (int i = (strLength - 1); i >=0; --i) {
           reverseStr = reverseStr + str.charAt(i);
       }
       if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
           System.out.println(str + " is a Palindrome String.");
       }
       else {
           System.out.println(str + " is not a Palindrome String.");
       }
   }


   }


