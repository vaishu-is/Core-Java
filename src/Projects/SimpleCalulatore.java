package Projects;

import javax.xml.transform.Source;
import java.util.Scanner;

public class SimpleCalulatore {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter First Number");
        double num1 =scanner.nextDouble();

        System.out.println("Enter Second Number");
        double num2 =scanner.nextDouble();

        System.out.println("Choose an Operation (+,-,/,*):");
        char operation =scanner.next().charAt(0);

        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case'-':
                result=num1-num2;
                System.out.println("Result:"+result);
                break;
            case'*':
                result=num1*num2;
                System.out.println("Result:"+result);
                break;
            case '/':
                if (num2!=0) {
                    result = num1 / num2;
                    System.out.println("Result:" + result);
                }
                else {
                    System.out.println("Error: Division by Zero is not allowed");
                }
                break;

            default:
                System.out.println("Invaild");
                break;


                }

        }


    }

