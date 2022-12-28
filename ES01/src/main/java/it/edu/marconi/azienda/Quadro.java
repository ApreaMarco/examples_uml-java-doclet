package it.edu.marconi.azienda;

/**
 * Classe che rappresenta un Quadro (estensione di Impiegato) dell'Azienda.
 *
 * @author <a href="mailto:marco.aprea@marconiverona.edu.it">Marco Aprea</a>
 * @version 1.0 20221207
 * @see
 * <a href="https://it.wikipedia.org/wiki/Quadro_(diritto_del_lavoro_italiano)">
 * WIKI Quadro</a>
 */
/*
KEYWORD FINAL: 
- una classe dichiarata final non può essere estesa
 */
final public class Quadro extends Impiegato {

    /**
     * Costruttore della classe Quadro.
     *
     * @param id
     * @param cognome
     * @param nome
     * @param stipendioBase
     * @param bonus
     */
    public Quadro(int id, String cognome, String nome, int stipendioBase,
            int bonus) {
        super(id, cognome, nome, stipendioBase);
        this.setBonus(bonus);
    }

    /**
     * toString che rappresenta la classe Quadro.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Quadro{" + super.toString() + '}';
    }
}