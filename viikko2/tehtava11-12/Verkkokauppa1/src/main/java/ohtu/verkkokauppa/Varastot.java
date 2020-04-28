package ohtu.verkkokauppa;

import org.springframework.stereotype.Component;

@Component
public interface Varastot {
    Tuote haeTuote(int id);

    int saldo(int id);

    void otaVarastosta(Tuote t);

    void palautaVarastoon(Tuote t);


}
