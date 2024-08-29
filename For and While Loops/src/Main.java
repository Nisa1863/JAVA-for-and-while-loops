import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i =0; i<9 ;i++)
            System.out.println("Nisa Nur");
        /* kodda ilk basta int i =0 dan baslatacak yani
        0 dan baslayacak daha sonra kaca kadar oldugunu
        belirtmisiz 9 a kadar yazdigimiz kelimeyi tekrar edecek
        i++ dan da sirayla artacak 1.kelime 2.kelime 3.kelime diye
        ve eger bislemi burada 9 a kadar ilerlemesini istiyorsak
        sayimizi 0 dan baslatmamiz lazim cunku sayilar 0 dan baslar
        01234 5 tane sai elde etmis oluruz
         */

        /* kac kez yurutmek istedigimizi bildgimiz
        durumlarda for dongusu kullanmak en mantiklisi
         */

        int i =0;
        while (i > 0){
            System.out.println("nur nisa");
            i++;
        }
        /* kac kez tekrarladigimizi bilmiyorsak ornek
        bir program yazdik ve kullanicidan admin diyene
        kadar surekli girmesini saglamak istiyoruz bu durumda
        while dongusu kullanmak en mantiklisidir
         */

        /*referans turleri arasinda karsilastirma
        operaorlerini kulanamayiz cunku bu operatorler
        kendi degerlerini degil adresi veya dize nesnelerini
        karsilastiracaktir dizi nesnelerinin yerine equals
        yontemi kullanmak gerekir

        String input = "";
        while (input != "quit")
        quit yazdiracak isek hepsi kucuk harf olmali
        nasil yaopariz
        input = scanner.next().toLowerCase();

         */
        String input ="";
        while(!input.equals("quit")){
            System.out.println("INPUT:");
            Scanner scanner =new Scanner(System.in);
            input =scanner.next().toLowerCase();
            // ne cikmis bir gorelim diye//
            System.out.println(input);
        }
    }
}