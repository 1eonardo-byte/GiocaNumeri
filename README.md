# GiocaNumeri

### Esecuzione dell'applicazione
![Risultato del gioco GiocaNumeri](immagini/output.png)

## 1.
GiocaNumeri implementa un modello di concorrenza basato su thread multipli in java. il thread principale ovvere il main avvia il peimo thread g1, effettua una pausa temporizzata tra mite sleep, avvia il secondo thread g2 e infine utilizza il metodo join per attendere la conclusione di entrambi i thread prima di stampare il messaggio di chiusura del gioco. All'interno dei thread, l'uso di yield favorisce l'alternanza nell'esecuzione.

## 2. Metodi usati 
- **'start()'**: Inizia l'esecuzione del thread, Java richiama automaticamente il metodo run().

- **'run()'**: Rappresenta il punto d'ingresso del thread, contenente le istruzioni eseguite in concorrenza.
-**'sleep()'**: sospende temporaneamente l'esecuzione del thread corrente per il numero di millisecondi specificato.
-**'join()'**: permette al thread chiamante (il main), di mettersi in attesa finchè i thread su cui è invocato non completano la loro esecuzione.
-**'yield()'**: segnala allo scheduler che il thread corrente è dispostoa cedere la propria quota di utilizzo dalla CPU per consentire l'esecuzione di altri thread con la stessa priorità

## 3. gestione delle eccezioni
- **'InterruptedException'**: è un'eccezione di tipo *checked* sollevata quando un thread in stato di pausa (sleep()) o di attesa (yield()) viene interrotto. Nel codice viene gestita traite blocchi 'try-catch', stampando i messaggi d'errore con system.err

