package j11;

public class cobaOprerasiString {
    public static void main(String[] argas){
    String identitas = "Ahmad Amirudin / X-RPL3 / 02";
        System.out.println("Identitas : "+ identitas);
        
        String x = "Operasi";
        System.out.println("isi variabel x : " + x);
        System.out.println("\""+ x +"\"Panjang Karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variabel y : "+ y);
        System.out.println("y adalah Kosong : "+ y.isEmpty());
        
        System.out.println("isi y sama dengan y : "+ x.equals(y));
        
        String z = "Operasi";
        System.out.println("isi variabel z : "+ z);
        System.out.println("isi x sama dengan z (Case Sensitive) : "+ x.equals(z));
        
        String r = "operasi";
        System.out.println("isi variabel r : "+ r);
        System.out.println("isi x sama dengan r (Case Sensitive) : "+ x.equals(r));
        System.out.println("isi x sama dengan r (Nott CAse Sensitive) : "+ x.equalsIgnoreCase(r));
    }
}
