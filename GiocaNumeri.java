

public class GiocaNumeri {

    public static void main(String[] args) {
         System.out.println("INIZIO GIOCO");
         
         Giocatore g1 = new Giocatore("Leonardo");
         g1.start();

         try {
            Thread.sleep(5000);
         } catch (InterruptedException e){
            System.err.println("Errore nella sospensione del Thread main: " + e.getMessage());
         } 
         
         Giocatore g2 = new Giocatore("Paolo");
         g2.start();

         try{
            g1.join();
            g2.join();
         }catch (InterruptedException e){
            System.err.println("Errore durante l'attesa dei Thread con join(): " + e.getMessage());
         }
         
         System.out.println("FINE GIOCO");
    }
}