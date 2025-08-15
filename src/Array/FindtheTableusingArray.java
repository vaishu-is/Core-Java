package Array;

public class FindtheTableusingArray {
    public static void main(String[] args) {
        int []nums ={10,20,30,40,32};

        for(int n:nums ){
            System.out.println("Table of "+n+":");
            for(int i=1;i<=10;i++){
                System.out.println(n+"x"+i+"="+(n*i));

            }
        }
    }
}
