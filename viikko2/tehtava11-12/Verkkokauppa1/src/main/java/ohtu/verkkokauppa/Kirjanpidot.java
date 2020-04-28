package ohtu.verkkokauppa;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public interface Kirjanpidot {
    void lisaaTapahtuma(String tapahtuma);

    ArrayList<String> getTapahtumat();
}
