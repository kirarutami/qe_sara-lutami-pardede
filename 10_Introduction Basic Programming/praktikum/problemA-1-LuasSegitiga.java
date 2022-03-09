import java.util.Scanner;

class luasSegitiga {
    public static void main(String[] args) {
        //input
        float alas;
        float tinggi;

        //code

        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Alas: ");
        alas=input.nextFloat();
        System.out.print("Masukkan Tinggi: ");
        tinggi=input.nextFloat();
        double luassegitiga =0.5*alas*tinggi;
        System.out.println("Luas Segitiga : " +luassegitiga);
    }
}