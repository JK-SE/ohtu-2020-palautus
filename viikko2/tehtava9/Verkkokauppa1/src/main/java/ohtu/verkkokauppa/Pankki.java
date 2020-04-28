package ohtu.verkkokauppa;

public class Pankki implements Pankit {

    private static Pankki instanssi;

    private Kirjanpito kirjanpito;

    public static Pankki getInstance() {
        if (Pankki.instanssi == null) {
            Pankki.instanssi = new Pankki();
        }
        return Pankki.instanssi;
    }
    public Pankki() {
        kirjanpito = Kirjanpito.getInstance();
    }

    @Override
    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        kirjanpito.lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille
                + " viite " + viitenumero + " summa " + summa + "e");

        // täällä olisi koodi joka ottaa yhteyden pankin verkkorajapintaan
        return true;
    }
}
