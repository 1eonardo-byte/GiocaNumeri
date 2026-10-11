<img width="542" height="595" alt="Screenshot 2026-10-12 alle 00 16 47" src="https://github.com/user-attachments/assets/4951c787-c5c8-44fc-921d-d7fa82caa711" />
# GiocaNumeri

### Esecuzione dell'applicazione
![Risultato del gioco GiocaNumeri](immagini/output.png)

## 1. come funziona
GiocaNumeri implementa un modello di concorrenza basato su thread multipli in java. il thread principale ovvere il main avvia il peimo thread g1, effettua una pausa temporizzata tra mite sleep, avvia il secondo thread g2 e infine utilizza il metodo join per attendere la conclusione di entrambi i thread prima di stampare il messaggio di chiusura del gioco. All'interno dei thread, l'uso di yield favorisce l'alternanza nell'esecuzione.

## 2. Metodi usati 
- **'start()'**: Inizia l'esecuzione del thread, Java richiama automaticamente il metodo run().

- **'run()'**: Rappresenta il punto d'ingresso del thread, contenente le istruzioni eseguite in concorrenza.
-**'sleep()'**: sospende temporaneamente l'esecuzione del thread corrente per il numero di millisecondi specificato.
-**'join()'**: permette al thread chiamante (il main), di mettersi in attesa finchè i thread su cui è invocato non completano la loro esecuzione.
-**'yield()'**: segnala allo scheduler che il thread corrente è dispostoa cedere la propria quota di utilizzo dalla CPU per consentire l'esecuzione di altri thread con la stessa priorità

## 3. gestione delle eccezioni
- **'InterruptedException'**: è un'eccezione di tipo *checked* sollevata quando un thread in stato di pausa (sleep()) o di attesa (yield()) viene interrotto. Nel codice viene gestita traite blocchi 'try-catch', stampando i messaggi d'errore con system.err

