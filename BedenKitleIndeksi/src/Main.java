import java.util.Scanner;
class BedenKitleIndeksi {
    public double kilo, boy;

    public static double vkiHesapla(BedenKitleIndeksi nesne) {
        return nesne.kilo / (nesne.boy * nesne.boy);
    }
    public BedenKitleIndeksi(double newkilo,double newboy){
        kilo = newkilo;
        boy = newboy;
    }
}
public class Main {

    public static void main(String[] args) {
        double kilo = 0;
        double boy = 0;
        double vki = 0;
        String durum;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Kilonuzu Giriniz (kg): ");
        kilo = klavye.nextDouble();
        System.out.println("Boyunuzu Giriniz (m): ");
        boy = klavye.nextDouble();
        BedenKitleIndeksi insan1 = new BedenKitleIndeksi(kilo, boy);
        System.out.printf("Vücut Kitle İndeksiniz: %.2f",  insan1.vkiHesapla(insan1));
        System.out.println();
        vki = insan1.vkiHesapla(insan1);
        if (vki < 18) {
            durum = "Zayıf";
        } else if (vki == 18 || vki > 18 && vki < 25) {
            durum = "Normal";
        } else if (vki == 25 || vki > 25 && vki < 30) {
            durum = "Kilolu";
        } else if (vki == 30 || vki > 30 && vki < 35) {
            durum = "Obez";
        } else{
            durum = "Ciddi Obez";
        }
        System.out.println("Durumunuz : "+durum);
    }
}