package validator;

import java.util.Scanner;

public class passValidator {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("please enter your password to check");
        String password = sc.nextLine();

        int l= password.length();
        int a=0,b=0,c=0,d=0;
        while(l-->0){

            for(int i=0;i<password.length();i++){
                char ch=password.charAt(i);

                if(ch >= 'a' && ch <= 'z') a++;

                else if(ch >= 'A' && ch <= 'Z') b++;

                else if(ch >= '0' && ch <= '9') c++;

                else d++;

            }

        }

        if(a>0 && b>0 && c>0 && d>0){
            System.out.println("your password meets the required requirements");
        }
        else {
            System.out.println("your password doesn't meet the required requirements. \n try another one.");
        }

    }

}
