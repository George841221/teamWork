package dataBase;

import models.Player;

import java.util.Scanner;

public class PlayerReg {

    public void playerRegister(String name, String email){
        Player player = new Player();
       /* if() {
            player.setName(name);
            player.setEmail(email);
            return true;
        }else{
            return false;
        }*/
        //Timestamp timestamp = new Timestamp();
    }

    public String inputName(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }
    public String inputEmail(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
