

/**
 * @see UdA n. 1 - Esercitazione GiocaNumeri
 * 
 */
public class Giocatore extends Thread {
    String nome;
    private String parola;
    private int punteggio;

    /**
     * Costruttore del Giocatore.
     * @param nome nome del giocatore
     */
    public Giocatore(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce la parola associata al giocatore.
     * @return la parola del giocatore
     */
    public String getParola() {
        return parola;
    }        

    /**
     * Imposta la parola associata al giocatore.
     * @param parola parola da impostare
     */
    public void setParola(String parola) {
        this.parola = parola;
    }

    /**
     * Restituisce il punteggio del giocatore.
     * @return punteggio
     */
    public int getPunteggio() {
        return punteggio;
    }

    /**
     * Imposta il punteggio del giocatore.
     * @param punteggio punteggio da assegnare
     */
    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    /**
     * il metodo gioca esegue il conteggio, applica una pausa con sleep() e calcola il punteggio finale.
     */
    public void gioca() {
        int numero = 19;
        String parolaStr = "Il tuo ";
        setParola(parolaStr);

        for (int i = 0; i < numero; i++) {
            System.out.println("Giocatore : " + nome + " i: " + i);
            Thread.yield();
        }
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Errore durante la sospensione del thread " + nome + ": " + e.getMessage());
        }
        
        setPunteggio(100);
        System.out.println("Giocatore : " + nome + " parola: " + getParola().toUpperCase() + " punteggio: " + getPunteggio());
    }

    public void comunica() {
    }

    @Override 
    public void run() {
        gioca();
    }
}