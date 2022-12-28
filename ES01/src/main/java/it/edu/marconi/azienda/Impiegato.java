package it.edu.marconi.azienda;

/**
 * Classe che rappresenta un Impiegato (estensione di Dipendente) dell'Azienda.
 *
 * @author <a href="mailto:marco.aprea@marconiverona.edu.it">Marco Aprea</a>
 * @version 1.0 20221207
 * @see <a href="https://it.wikipedia.org/wiki/Impiegato">
 * WIKI Impiegato</a>
 */
public class Impiegato extends Dipendente {

    private int bonus;

    /**
     * Costruttore della classe Impiegato.
     *
     * @param id
     * @param cognome
     * @param nome
     * @param stipendioBase
     */
    public Impiegato(int id, String cognome, String nome, int stipendioBase) {
        super(id, cognome, nome, stipendioBase);
        this.setBonus(200);
    }

    /**
     * Getter per la proprietà bonus.
     *
     * @return
     */
    public int getBonus() {
        return bonus;
    }

    /**
     * Setter per la proprietà bonus.
     *
     * @param bonus
     */
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    /**
     * Metodo che calcola lo stipendio dell'impiegato.
     *
     * @return
     */
    /*
    KEYWORD FINAL:
    - un metodo dichiarato final non può essere riscritto in
    una sottoclasse (non è possibile applicare l’override)
     */
    @Override
    final public int calcoloStipendio() {
        return super.calcoloStipendio() + this.getBonus();
    }

    /**
     * toString che rappresenta la classe Impiegato.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Impiegato{" + super.toString() + ", bonus=" + bonus + '}';
    }
}