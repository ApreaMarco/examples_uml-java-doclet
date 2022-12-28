package it.edu.marconi.azienda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Classe che conterrà i dipendenti dell'Azienda.
 *
 * @author <a href="mailto:marco.aprea@marconiverona.edu.it">Marco Aprea</a>
 * @version 1.0 20221207
 *
 * @see <a href="https://it.wikipedia.org/wiki/Impresa">
 * WIKI Impresa</a>
 * @see Dipendente
 * @see Impiegato
 * @see Quadro
 */
public class AziendaList {

    private String nomeAzienda;
    private List<Dipendente> listaDipendenti;

    /**
     * Costruttore della classe AziendaList.
     *
     * @param nomeAzienda
     */
    public AziendaList(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
        this.listaDipendenti = new ArrayList<>();
    }

    /**
     * Getter per la proprietà nomeAzienda.
     *
     * @return
     */
    public String getNomeAzienda() {
        return nomeAzienda;
    }

    /**
     * Setter per la proprietà nomeAzienda.
     *
     * @param nomeAzienda
     */
    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }

    /**
     * Aggiunge un Dipendente alla lista dei dipendenti.
     *
     * @param dipendente
     */
    public void addDipendente(Dipendente dipendente) {
        this.listaDipendenti.add(dipendente);
    }

    /**
     * Calcola l'ammontare degli stipendi di tutti i dipendenti dell'azienda.
     *
     * @return
     */
    public int getCostoPersonale() {
        int totStipendiDipendenti = 0;
        for (Dipendente dipendente : listaDipendenti) {
            totStipendiDipendenti += dipendente.calcoloStipendio();
        }
        return totStipendiDipendenti;
    }

    /**
     * toString che rappresenta la classe AziendaList.
     *
     * @return
     */
    @Override
    public String toString() {
        String stringa = "AziendaList{" + "nomeAzienda=" + nomeAzienda
                + ", listaDipendenti=[\n";
        for (Dipendente dipendente : listaDipendenti) {
            stringa += dipendente.toString() + "\n";
        }
        stringa += "]}";
        return stringa;
    }
}