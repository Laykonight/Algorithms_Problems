package Strings;

/*
Question
Implement a function that receives a string and prints it in reverse
private static void printReverse(String str){}
*/

public class Reverse {
    private static void printReverse1(String str){
        System.out.println(new StringBuffer(str).reverse());
    }

    private static void printReverse2(String str){
        StringBuffer res = new StringBuffer();
        for (int i = str.length() - 1; i >= 0 ; --i){
            res.append(str.charAt(i));
        }
        System.out.println(res);
    }


    public static void main(String[] args) {
        String testStr = "ABCD";
        System.out.println("Original String: ABCD");

        System.out.println(" result for printReverse1():");
        printReverse1(testStr);

        System.out.println(" result for printReverse2():");
        printReverse2(testStr);
    }
}
