package it.edu.marconi.azienda;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe che conterrà i dipendenti dell'Azienda.
 *
 * @author <a href="mailto:marco.aprea@marconiverona.edu.it">Marco Aprea</a>
 * @version 1.0 20221207
 * @see <a href="https://it.wikipedia.org/wiki/Impresa">
 * WIKI Impresa</a>
 * @see Dipendente
 * @see Impiegato
 * @see Quadro
 */
public class AziendaMap {

    private String nomeAzienda;
    private Map<Integer, Dipendente> mapDipendenti;

    /**
     * Costruttore della classe AziendaMap.
     *
     * @param nomeAzienda
     */
    public AziendaMap(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
        this.mapDipendenti = new HashMap<>();
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
     * @param chiave
     * @param valore
     */
    public void addDipendente(Integer chiave, Dipendente valore) {
        this.mapDipendenti.put(chiave, valore);
    }

    /**
     * Calcola l'ammontare degli stipendi di tutti i dipendenti dell'azienda.
     *
     * @return
     */
    public int getCostoPersonale() {
        int totStipendiDipendenti = 0;
        for (Dipendente dipendente : mapDipendenti.values()) {
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
                + ", hashMapDipendenti=[\n";
        for (Dipendente dipendente : mapDipendenti.values()) {
            stringa += dipendente.toString() + "\n";
        }
        stringa += "]}";
        return stringa;
    }
}