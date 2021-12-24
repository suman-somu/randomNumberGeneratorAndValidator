package generator;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class passGenerator {
    public static void main(String[] args) {


        System.out.println("please enter "+"\n 1 to start "+"\n 2 to exit");
        Scanner sc= new Scanner(System.in);
        int enter= sc.nextInt();
        if(enter ==1){
            System.out.println("how long you want your password ?");
            int len= sc.nextInt();
            startFunction(len);
        }
        else if(enter ==2){
            System.out.println("thank you for using this");
        }
        else {
            System.out.println("kya bey chutiye ...sahi se number dal bsdk");
        }


    }

    private static void startFunction(int len) {


        String password ="";

        while(password.length() < len){

//            int random= (int)Math.random()*100;
//            double r= Math.random()*10;
//            int re=(int)r;
            int randomNum = ThreadLocalRandom.current().nextInt(0, 5);
//            System.out.println(randomNum);

//            System.out.println(re);
            switch(randomNum){
                case 0://func for giving a random character between "a-z"
                    String s=randomSmallCharacter();
                    password+=s;
                    break;
                case 1://func to give a random character between "A-Z"
                    String t=randomCapitalCharacter();
                    password+=t;
                    break;
                case 3://func to give random from 0-9
                    String y=randomNumber();
                    password+=y;
                    break;
                case 4://func to give random from all special characters
                    String u=randomSpecialCharacterGenerator();
                    password+=u;
                    break;


            }


        }

        System.out.println(password);
    }


    private static String randomNumber() {
//        System.out.println("this is random number");
        int r = ThreadLocalRandom.current().nextInt(0, 10);
        String s= String.valueOf(r);
        return s;

    }

    private static String randomSpecialCharacterGenerator() {
//        System.out.println("this is random special character");

        String s="";

        int randomForSwitch = ThreadLocalRandom.current().nextInt(1, 5);
        switch (randomForSwitch){
            case 1:
                int r = ThreadLocalRandom.current().nextInt(33, 48);
                char c= (char) r;
                 s= String.valueOf(c);
                 break;
            case 2:
                int rq = ThreadLocalRandom.current().nextInt(58, 65);
                char cq= (char) rq;
                s= String.valueOf(cq);
                break;
            case 3:
                int rw = ThreadLocalRandom.current().nextInt(91, 97);
                char cw= (char) rw;
                s= String.valueOf(cw);
                break;
            case 4:int rr = ThreadLocalRandom.current().nextInt(123, 127);
                char cr= (char) rr;
                s= String.valueOf(cr);
                break;

        }

        return s;
    }

    private static String randomCapitalCharacter() {
//        System.out.println("this is random capital character");
        int r = ThreadLocalRandom.current().nextInt(65, 91);
        char c= (char) r;
        String s= String.valueOf(c);
        return s;
    }

    private static String randomSmallCharacter() {
//        System.out.println("this is random small character");
        int r = ThreadLocalRandom.current().nextInt(97, 122);
        char c= (char) r;
        String s= String.valueOf(c);
        return s;

    }
}
