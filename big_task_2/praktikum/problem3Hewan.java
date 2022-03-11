package praktikum;
import java.util.*;

public class problem3Hewan {
    public static void main(String[] args) {
        var ui= new Mobil(new Scanner(System.in));
        ui.StartUI();
    }
}
     class Hewan{
        float berat; 
    }

     class Mobil extends Hewan{
        Set<String> muatan = new HashSet<String>();
        
        int kapasitas = 0; 
        String inputMuatan; 

        Scanner input;
        Mobil(Scanner input){
            this.input = input;
        }
        void StartUI(){
            
            this.tambahMuatan(); 
        }
            public void tambahMuatan(){
                muatan.add("Cheetah");
                System.out.println("Masukkan Kapasitas Mobil: ");
                kapasitas = input.nextInt();
                System.out.println("Masukkan Nama Hewan: ");
                inputMuatan = input.next();
                System.out.println("Masukkan Berat Hewan: ");
                berat = input.nextFloat();
                System.out.println("Yang ada di dalam mobil: ");
                if(berat<=kapasitas){   
                    muatan.add(inputMuatan);
                    System.out.println(muatan);
                }
                else {
                    System.out.println(muatan);
                }

            }      
    }
    
