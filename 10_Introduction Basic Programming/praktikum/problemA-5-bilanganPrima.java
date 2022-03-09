import java.util.Scanner;

class bilanganPrima {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bilangan;
        int check=0;

        //code
        System.out.print("Program Memeriksa Bilangan Prima\n");
        System.out.print("Masukkan Nilai: ");
        bilangan=input.nextInt();
    
        for(int i=2;i<=bilangan;i++){
            if (bilangan%i ==0){
                check++;
            }
        }

        if(check==1){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }
}