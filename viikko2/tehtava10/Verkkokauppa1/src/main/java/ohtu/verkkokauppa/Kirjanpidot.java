package ohtu.verkkokauppa;

import java.util.ArrayList;

public interface Kirjanpidot {
    void lisaaTapahtuma(String tapahtuma);

    ArrayList<String> getTapahtumat();
}
