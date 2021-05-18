
package module;

import java.util.Scanner;

class Login {
    private static final String USERNAME="naman123";
    private static final String PASSWORD="12345";

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }
    private static void loggingIn(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("PLEASE! Enter Your Username:-");
        String username=scanner.nextLine();
        System.out.print("Enter Your Password:");
        String password = scanner.nextLine();
        System.out.println();
        if (username.equals(Login.getUSERNAME())){
            System.out.println("WELCOME : Login Approved");
        }
        else System.out.println("OOPS! LOGIN FAILED.");
    }
}
