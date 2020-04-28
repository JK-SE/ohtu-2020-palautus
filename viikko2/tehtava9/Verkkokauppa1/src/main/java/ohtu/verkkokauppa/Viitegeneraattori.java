package ohtu.verkkokauppa;

public class Viitegeneraattori implements Viitegeneraattorit {

    private static Viitegeneraattori instanssi;

    public static Viitegeneraattori getInstance() {
        if (Viitegeneraattori.instanssi == null) {
            Viitegeneraattori.instanssi = new Viitegeneraattori();
        }

        return Viitegeneraattori.instanssi;
    }
    private int seuraava;
    
    private Viitegeneraattori(){
        seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
