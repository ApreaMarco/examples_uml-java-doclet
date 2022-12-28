package it.edu.marconi.azienda;

/**
 * Classe che rappresenta un Dipendente dell'Azienda.
 *
 * @author <a href="mailto:marco.aprea@marconiverona.edu.it">Marco Aprea</a>
 * @version 1.0 20221207
 * @see <a href="https://it.wikipedia.org/wiki/Lavoratore">
 * WIKI Lavoratore</a>
 */
public class Dipendente {

    private int id;
    private String cognome;
    private String nome;
    private int stipendioBase;
    /*
    KEYWORD FINAL:
    - una variabile dichiarata final diviene una costante se è un tipo
      primitivo (non puoi usare il metodo set)
     */
    private static final int DEFAULT_BONUS = 100;

    /**
     * Costruttore della classe Dipendente.
     *
     * @param id
     * @param cognome
     * @param nome
     * @param stipendioBase
     */
    public Dipendente(int id, String cognome, String nome, int stipendioBase) {
        this.id = id;
        this.cognome = cognome;
        this.nome = nome;
        this.stipendioBase = stipendioBase;
    }

    /**
     * Getter per la proprietà id.
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Setter per la proprietà id.
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter per la proprietà nome.
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setter per la proprietà nome.
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Getter per la proprietà cognome.
     *
     * @return
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Setter per la proprietà cognome.
     *
     * @param cognome
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Getter per la proprietà stipendioBase.
     *
     * @return
     */
    public int getStipendioBase() {
        return stipendioBase;
    }

    /**
     * Setter per la proprietà stipendioBase.
     *
     * @param stipendioBase
     */
    public void setStipendioBase(int stipendioBase) {
        this.stipendioBase = stipendioBase;
    }

    /**
     * Metodo che calcola lo stipendio del dipendente.
     *
     * @return
     */
    public int calcoloStipendio() {
        return stipendioBase + DEFAULT_BONUS;
    }

    /**
     * toString che rappresenta la classe Dipendente.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Dipendente{" + "id=" + id + ", cognome=" + cognome
                + ", nome=" + nome + ", stipendioBase=" + stipendioBase + '}';
    }
}