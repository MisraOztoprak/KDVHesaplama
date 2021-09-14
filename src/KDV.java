import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        float tutar;

        System.out.println("lütfen para tutarınızı giriniz");
        tutar = input.nextFloat();

        if (tutar < 1000) {
            float azTutar = tutar * 18 / 1000 + tutar;
            System.out.println("Tutarınız 1000 TL'den az:" +azTutar);
        }
        else if(tutar>=1000){
            float cokTutar = tutar * 8 / 1000 + tutar;
            System.out.println("Tutarınız 1000 TL'den fazla:" +cokTutar);

        }


    }
}

