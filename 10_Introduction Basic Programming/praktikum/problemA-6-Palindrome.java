import java.util.*;

class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String kata, reverseKata="";

        //code
        System.out.print("Program Kata Palindrom\n");
        System.out.print("Masukkan Kata: ");
        kata = input.nextLine();
    
        int kataLength = kata.length();
        
        for(int i=(kataLength - 1); i>=0; --i){
            reverseKata = reverseKata + kata.charAt(i);
        }
        if(kata.toLowerCase().equals(reverseKata.toLowerCase())){
            System.out.println(kata + " adalah String Palindrome");
        } else {
            System.out.println(kata + " bukan String Palindrome");
        }

        

    }
}