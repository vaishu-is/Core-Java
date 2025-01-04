package StringHandling.Methods;

public class tocharArray {
    public static void main(String[] args) {
        String str="Abc";
        System.out.println(str.codePointAt(0));
        //CodepointAt

        System.out.println("Charter");
        char[]charArray =str.toCharArray();
        for (int index=0;index< charArray.length;index++){
            System.out.println(charArray[index]+" ");
        }
       //resverse the string
        System.out.println("reversing the string");
        String string="good day cool";
        String reverseString=" ";

        for (int index=string.length()-1;index>=0;index--){
            reverseString=reverseString+string.charAt(index);
        }
            System.out.println(reverseString);
        }
    }
