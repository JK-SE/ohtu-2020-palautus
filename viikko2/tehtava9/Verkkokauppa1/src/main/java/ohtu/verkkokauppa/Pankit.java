package ohtu.verkkokauppa;

public interface Pankit {
    //static Pankki getInstance();
    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
}
