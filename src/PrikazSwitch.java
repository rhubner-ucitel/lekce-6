public class PrikazSwitch {

    private static final int PONDELI = 0;
    private static final int UTERY = 1;


    public static void main(String[] args) {

        int den = PONDELI;

        switch (den) {
            case PONDELI:
                System.out.println("Nesnasim pondelky.");
                break;
            case UTERY:
                System.out.println("Je utery, mozna bych mohl neco udelat.");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Nech bejt, pracoval jsem v utery.");
                break;
            case 5:
            case 6:
                System.out.println("Je vikend nic nedelam.");
                break;
            default:
                System.out.println("Spatna hodnota dne v tydnu : " + den);
        }
    }
}
