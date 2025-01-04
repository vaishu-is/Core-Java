package StringHandling.Methods;

public class Split {
    public static void main(String[] args) {

        //it will split the given String with , or tokenized

        String course="Java,Python,Js";
        String[]splitstring =course.split(",");
        for( String cour:splitstring){

            System.out.println(cour);
        }

    }
}
