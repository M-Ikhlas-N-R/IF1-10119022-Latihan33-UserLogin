package com.MINR;

import java.util.Scanner;
/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Membuat program User Login Latihan 33
 *
 */

public class Latihan33Login extends User{
    private String usName, passWord;

    public static void main(String[] args) {
        Latihan33Login userPertama = new Latihan33Login();
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan Username = ");
        userPertama.usName = userInput.next();

        System.out.print("Masukkan Password = ");
        userPertama.passWord = userInput.next();

        userPertama.pengecekkanLogin(userPertama.usName, userPertama.passWord);
    }
}
