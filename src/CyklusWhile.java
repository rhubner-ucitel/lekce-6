

public class CyklusWhile {


    public static void main(String[] args) {
        System.out.println("zacatek programu");

        int i = 50;

        while (i < 50) {
            if(i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }


        System.out.println("konec programu");
    }
}
