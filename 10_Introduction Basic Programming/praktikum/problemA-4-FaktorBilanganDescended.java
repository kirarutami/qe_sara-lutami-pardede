import java.util.*;

class faktorBilangan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bilangan;

        //code
        System.out.print("Program Faktor Bilangan\n");
        System.out.print("Masukkan Nilai: ");
        bilangan=input.nextInt();
    
        System.out.print("Faktor Bilangan dari " +bilangan + " adalah: ");
        for(int i=1; i  <= bilangan; i++){
            if(bilangan%i == 0){
                System.out.println(i  + " ");
        }
        }

    }
}