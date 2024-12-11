public class BreakContinue {


    public static void main(String[] args) {

        System.out.println("Zacatek for s continue;");
        for(int i = 0; i < 10; i++) {

            if(i % 2 == 0) {
                continue;
            }
            System.out.println(i);

        }

        System.out.println("Konec for s continue;");

        System.out.println("Zacatek while(true)");

        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
            if (i > 10) {
                break;
            }
        }

    }
}