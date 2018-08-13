package j11;
import java.util.Scanner;
public class ConvertVocal2Angka {
    private static void tampilJudul(String identitas){
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");
    }
    private static void main(String[] args){
    String identitas = "Ahmad Amirudin / X-RPL3 / 02";
    
    tampilJudul(identitas);
    
    String kalimat = tampilInput();
    }
    private static String tampilInput(){
    Scanner scanner = new Scanner(System.in);
    
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli" + kalimat);
        
        return kalimat;
    }
    
    
}
