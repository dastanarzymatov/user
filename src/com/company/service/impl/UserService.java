package com.company.service.impl;

import com.company.gender.Gender;
import com.company.dao.UserDao;
import com.company.model.User;

import java.util.Scanner;

public class UserService implements com.company.service.UserService {
    UserDao userDao = new UserDao();

    public void addUser(User user) {
        userDao.getUsers().add(user);
    }

    @Override
    public void userKoshuu() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("id jaz ");
        int id = scanner.nextInt();

        System.out.print("atyny jaz ");
        String name = scanner1.nextLine();

        System.out.print("jashyndy jaz ");
        int age = scanner.nextInt();

        System.out.println("male - 1\n" +
                "female - 2");
        int gender = scanner.nextInt();

        if (1 == gender) {
            userDao.getUsers().add(new User(id, name, age, Gender.MALE));
        } else if (2 == gender) {
            userDao.getUsers().add(new User(id, name, age, Gender.FEMALE));
        }
        System.out.println(userDao.getUsers());

    }

    @Override
    public void IdMnTabuu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ID MENEN KORGUN KELSE TANDA ");
        userDao.getUsers().stream().map(x -> x.getId()).forEach(System.out::println);
        int a = scanner.nextInt();
        userDao.getUsers().stream().filter(x -> x.getId() == a).forEach(System.out::println);


    }

    @Override
    public void idMnOchuruu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ID TANDAP OCHURUNUZ ");
        userDao.getUsers().stream().map(x -> x.getId()).forEach(System.out::println);
        int id = scanner.nextInt();
        userDao.getUsers().removeIf(x -> x.getId() == id);
        userDao.getUsers().forEach(System.out::println);

    }

    @Override
    public void bardykUsrAluu() {
        System.out.println(" BAARDYK MAALYMATTAR ");
        System.out.println(userDao.getUsers());

    }
}
