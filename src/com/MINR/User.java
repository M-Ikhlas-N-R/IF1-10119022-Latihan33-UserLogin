package com.MINR;

public class User {
    private  final String username = "RizkiAdam";
    private  final String password = "terbaikselalu";
    private boolean statusAkun = false;

    private boolean cekAkun(String parUserName, String parPassword ){
        if(parUserName.equals(this.username) && parPassword.equals(this.password)){
            return !this.statusAkun;
        }
        return this.statusAkun;
    }

    private void hasilLogin(boolean status, String parUsername){
        if (status){
            System.out.format("******Hallo %s******\n", parUsername);
            System.out.println("Selamat Datang di Aplikasi ini");
        }else{
            System.out.println("\nOoops, Username atau Password anda salah");
        }
    }

    public void pengecekkanLogin(String parUsername, String parPassword){
        this.hasilLogin(
                this.cekAkun(parUsername, parPassword),
                parUsername
        );
    }
}
