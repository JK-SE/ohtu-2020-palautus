package ohtu.verkkokauppa;

public interface Varastot {
    //static Varasto getInstance();

    Tuote haeTuote(int id);

    int saldo(int id);

    void otaVarastosta(Tuote t);

    void palautaVarastoon(Tuote t);

    //void alustaTuotteet();
}
