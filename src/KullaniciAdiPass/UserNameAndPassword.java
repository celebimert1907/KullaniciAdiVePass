package KullaniciAdiPass;

import java.util.Scanner;

public class UserNameAndPassword {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName;
        String passWord;

        System.out.print("Username: ");
        userName = input.nextLine();

        System.out.print("Password: ");
        passWord = input.nextLine();

        if( userName.equals("patika") && passWord.equals("java123")){
            System.out.println("Giris yaptiniz.");
        } else {
            System.out.println("Kullanici adi yada Sifre hatali!");
        }
    }
}
