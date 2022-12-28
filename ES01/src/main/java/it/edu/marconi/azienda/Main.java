package it.edu.marconi.azienda;

/**
 * Classe main runnable, che mette in relazione i diversi tipi di Dipendenti con
 * l'Azienda
 *
 * @author <a href="mailto:marco.aprea@marconiverona.edu.it">Marco Aprea</a>
 * @version 1.0 20221129
 * @see AziendaList
 * @see AziendaMap
 * @see Dipendente
 * @see Impiegato
 * @see Quadro
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        AziendaList azienda01 = new AziendaList("Marconi");
        AziendaMap azienda02 = new AziendaMap("Fermi");

        Dipendente dipendente01 = new Dipendente(1, "Mickey", "Mouse", 1000);
        Impiegato impiegato01 = new Impiegato(2, "Minnie", "Mouse", 1000);
        Quadro quadro01 = new Quadro(3, "Mortimer", "Mouse", 1000, 500);

        azienda01.addDipendente(dipendente01);
        azienda01.addDipendente(impiegato01);
        azienda01.addDipendente(quadro01);

        System.out.println("--- AziendaList ---");
        System.out.println(azienda01.toString());
        System.out.println(azienda01.getCostoPersonale());

        azienda02.addDipendente(dipendente01.getId(), dipendente01);
        azienda02.addDipendente(impiegato01.getId(), impiegato01);
        azienda02.addDipendente(quadro01.getId(), quadro01);

        System.out.println("--- AziendaMap ---");
        System.out.println(azienda02.toString());
        System.out.println(azienda02.getCostoPersonale());
    }
}