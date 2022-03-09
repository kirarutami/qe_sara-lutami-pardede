import java.util.*;

class Asterisk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Program Asterisk\n");
        System.out.print("Masukkan Lebar Bawah: ");
        int bintang = input.nextInt();
        // for (int i = 0; i < 5; i++) {
        // System.out.println("    "+n .substring(i, 5 + 2*i));
        //  }

        for (int i=1; i<(bintang+1); i += 2)
        {
            for (int k=0; k < (4 - i / 2); k++)
            {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}