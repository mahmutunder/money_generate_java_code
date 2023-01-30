package money;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.util.Random;
import java.util.Scanner;

public class MoneyTest {
    public static void main(String[] args) throws FileNotFoundException {

    //printFile(); money maker

        Dollar dl;

        String[][] wallet=new String[100][];
        Scanner read= new Scanner(new File("money.txt"));
        int indexRow=0;

        while (read.hasNext()){
            String line= read.nextLine();
            wallet[indexRow]=line.split(",");
            int amount=Integer.parseInt(wallet[indexRow][0]);
            int year=Integer.parseInt(wallet[indexRow][3]);
             dl=new Dollar(amount,year);
            dl.showBill();
            indexRow++;



        }


        }




        // if you want to generate  more money,  use here
    public static void printFile() throws FileNotFoundException {
        Random random= new Random();
        Dollar d;
        PrintWriter printMoney= new PrintWriter("money.txt");

        // change 100 how you fell ;)
        for (int i = 0; i <100 ; i++) {
            int res=0;
            int dollar=random.nextInt(100)+1;
            if(dollar==1){
                res=1;
            }else if(dollar==2){
                res=2;
            }else if(dollar>2 && dollar<10){
                res=5;
            }else if(dollar>=10 && dollar<20){
                res=10;
            }else if(dollar>=20 && dollar<49) {
                res = 20;
            }else if(dollar>=50 && dollar<99) {
                res = 50;
            }else{
                res=100;
            }

            int year=random.nextInt(20)+1992;
            d= new Dollar(res,year);

            printMoney.println(d.getDenomination()+","+d.getFace()+","
                    +d.getSerial()+","+d.getYear());
        }
        System.out.println("done");
        printMoney.close();



    }


}
