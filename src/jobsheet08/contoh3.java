package jobsheet08;
import java.util.Scanner;
public class contoh3 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
//Menampilkan bilangan ganjil antara 1-10
    int x;
    int n;
    for(x=1;x<=10;x+=2)
    {System.out.println(x);}
    
    //menampilkan bilangan genap antara 1-10
    for(x=2;x<=10;x+=2)
    {System.out.println(x);}
    
    //menampilkan bilangan ganjil antara 1-n
    System.out.print("masukkan bilangan : ");
    n = input.nextInt();
    for(x=1;x<=n;x+=2){
    {System.out.println(x);}
    
    //cara 2
    for(x=1;x<=10;x++)
    if (x%2==1)
    {System.out.println(x+" ganjil");}
    else if (x%2==0)
            {System.out.println(x+" genap");}
    }
    }
}
