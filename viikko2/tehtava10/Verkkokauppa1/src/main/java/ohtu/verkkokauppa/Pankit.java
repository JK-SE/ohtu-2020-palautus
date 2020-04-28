package ohtu.verkkokauppa;

public interface Pankit {
    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
}
