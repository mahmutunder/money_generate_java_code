package money;

import java.util.Calendar;
import java.util.Random;

public class Dollar {
    private int denomination;
    private String face;
    private String serial;
    private int year;

    public Dollar() {
        this.denomination =0;
        this.face = null;
        this.serial = null;
        this.year = 0;
    }

    public Dollar(int denomination,  int year) {
        this.denomination = denomination;
        this.face = dollar(denomination);
        this.serial = generateSerial();
        this.year = year;
    }



    public Dollar(int denomination, String face, String serial, int year) {
        this.denomination = denomination;
        this.face = face;
        this.serial = serial;
        this.year = year;
    }

    public Dollar(int denomination, String serial, int year) {
        this.denomination = denomination;
        this.face = dollar(denomination);
        this.serial = serial;
        this.year = year;
    }

    public int getDenomination() {
        return denomination;
    }

    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showBill(){
        System.out.println(toString());
    }

    public int getAge(){

        int currentYear= Calendar.getInstance().get(Calendar.YEAR);
        return currentYear-year;
    }
    private String dollar(int denomination) {
        String name="";
        switch (denomination){
            case 1: name="George Washington"; break;
            case 2: name="Thomas Jefferson"; break;
            case 5: name="Abraham Lincoln"; break;
            case 10: name="Alexander Hamilton"; break;
            case 20: name="Andrew Jackson"; break;
            case 50: name="Ulysses S. Grant"; break;
            case 100: name="Benjamin Franklin"; break;



        }
        return name;
    }



    public String toString() {
        return "Dollar{" +
                "denomination=" + denomination +
                ", face='" + face + '\'' +
                ", serial='" + serial + '\'' +
                ", year=" + year +
                '}';
    }

    private String generateSerial(){
        String gs="";
        String letter="ABCDEFGHIJKLMNOPQRSTUVWXY";


        Random random= new Random();
        String[] generate=new String[10];
        generate[0]=""+letter.charAt(random.nextInt(letter.length()));
        generate[9]=""+letter.charAt(random.nextInt(letter.length()));

        for (int i = 1; i <generate.length-1; i++) {
            generate[i]=""+random.nextInt(11);
        }

        for (int i = 0; i <generate.length ; i++) {
            gs+=generate[i];
        }

        return gs;
    }




}
