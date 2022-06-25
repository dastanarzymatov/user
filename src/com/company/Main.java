package com.company;

import com.company.gender.Gender;
import com.company.model.User;
import com.company.service.impl.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                ID MENEN KORUSH UCHUN 1 BASS                    
                ID MENEN OCHURUSH UCHUN 2 BASS                   
                BAARDYK MAALYMATTY KORUSH UCHUN 3 BAS               
                USER KOSHUU UCHUN 4 BASS""");
        Scanner scanner = new Scanner(System.in);

        UserService userService = new UserService();
        userService.addUser(new User(1, "Dastan", 20, Gender.MALE));
        userService.addUser(new User(2, "Nurtilek", 27, Gender.MALE));
        userService.addUser(new User(3, "Nurdin", 20, Gender.MALE));
        userService.addUser(new User(4, "Jaulan", 22, Gender.MALE));
        while (true){
        int a=scanner.nextInt();

            switch (a) {
            case 1-> userService.IdMnTabuu();
            case 2-> userService.idMnOchuruu();
            case 3->userService.bardykUsrAluu();
            case 4->  userService.userKoshuu();
            default->System.out.println(" bisde mynday jok ");
        }
        }


    }


}