package praktikum;
import java.util.Scanner;

public class problem1JamPasir
{
  public static void main (String args[])
  {
    Scanner s = new Scanner(System.in);
    int row, col, asterisk;
    System.out.println("masukkan jumlah baris jam pasir: ");
    int angka = s.nextInt();

    // perulangan pertama untuk menampilkan
    //bagian atas jam pasir
    for(row = 1;row <= angka;row ++)
       {
          for(col = 1;col <= row;col ++)
             {
              System.out.print(" ");
             }
          for(asterisk = angka;asterisk >= row;asterisk --)
             {
              System.out.print("* ");
             }
         System.out.println();
       }
    // perulangan kedua untuk menampilkan
    //bagian bawah jam pasir
    for(row = 1;row <= angka;row ++)
       {
         for(col = angka;col >= row;col --)
             {
              System.out.print(" ");
             }
         for(asterisk = 1;asterisk <= row;asterisk ++)
            {
             System.out.print("* ");
            }
         System.out.println();
       }
   }
}