package JavabasicProgram;

public class prime {
    public static void main(String[] args) {

        int n =17;
        boolean isprime=true;

        for (int i=2;i<=n/2;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
            System.out.println(isprime?"itsprime":"its not prime");
        }
    }

