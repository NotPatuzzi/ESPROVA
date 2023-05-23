# ESERCIZIO DI INFO 
Si vuole progettare un’applicazione per gestire il noleggio di Veicoli. I veicoli sono identificati da una Targa e caratterizzati da un Modello e una Tariffa giornaliera. I veicoli sono suddivisi in furgoni e automobili. Le automobili hanno un numero di posti, i furgoni hanno una capacità di carico espressa in kg.
Per ogni veicolo si hanno molti noleggi, caratterizzati da un ID univoco di tipo intero, una data inizio, un numero giorni, un costo e un cliente. I clienti sono identificati dal codice fiscale e hanno un nome e cognome.

L’applicazione deve avere le seguenti funzionalità, testale nel main:

Visualizzare i noleggi, con i dati significativi del veicolo e del cliente fornendo la Targa oppure il Codice Fiscale del cliente
Visualizzare una scheda di dettaglio di un noleggio in cui sono riportati anche in modo completo i dati del veicolo e del cliente. Il singolo noleggio è identificato con l’ID.
Inserire un nuovo noleggio verificando che il veicolo non sia impegnato. Il costo del noleggio si calcola moltiplicando la tariffa per il numero di giorni.
Data una targa calcolare il totale in euro dei noleggi
Dato un codice fiscale calcolare il totale in euro dei noleggi
Ricavare il totale in euro dei noleggi raggruppato per auto.

# GIT

come iniziare 

![comandi1](comandi1.PNG)

configurazione 

![comandi2](comandi2.PNG)

fare: 
add
commit
branch
remote

![comandi3](comandi3.PNG)

fatti quelli precedenti: 
push # (meglio con il token se lo richiede) 
add . # per aggiungere tutto 

![comandi4](comandi4.PNG)
![comandi5](comandi5.PNG)
![comandi6](comandi6.PNG)


spazio vuoto
![spazio](spazio.PNG)











# Git-tutorial
Introduzione a git

## PortableGit
Scaricare l'ultima versione di PortableGit: https://github.com/git-for-windows/git/releases/

![PortableGit](PortableGit.PNG)

Eseguire il file exe scaricato.

![exe](exe.PNG)

Aprire il programma `git-bash` nella cartella di PortableGit appena creata.

![git-bash](git-bash.PNG)

## Creazione progetto
Creare una cartella per il progetto sul Desktop chiamata `Esercitazione16maggio`.
Su git-bash eseguire
```
cd  $HOME/path/to/Esercitazione16maggio
```
dove `path/to/` rappresenta il percorso della cartella `Esercitazione16maggio`.

Creare un file `README.md` in Blocco note, che sarà il readme file del repository Git, e scrivere al suo interno la traccia dell'esercitazione indicata su Classroom.
Salvare il file.

### Creazione repository su Github
- Aprire il sito github.com
- Effettuare il login
- Cliccare su `New`

![newRepo](newRepo.PNG)
- Creare un nuovo repository `Esercitazione16maggio`, prestando attenzione a non creare un Readme di default.

![repo](repo.PNG)

### Configurazione del repository locale e sincronizzazione
Da `git-bash` eseguire i seguenti comandi:
```
git init  # Inizializza il repository locale
git add README.md  # Inserimento del file README.md nell'area di staging
git commit -m "first commit"  # Creazione del primo commit, che serve a sincronizzare il repository locale con lo stage
git branch -M main  # Creazione del branch main, da usare come default
git remote add origin https://github.com/<username>/Esercitazione16maggio  # Connessione del repository remoto al repository locale
git push -u origin main  # Sincronizzazione del repository remoto con quello locale
```
Nel caso in cui appaia questa finestra

![credential](credential.PNG) 

selezionare `manager-ui`.

Nel caso, invece, in cui il comando `push` non dovesse andare a buon fine a causa di problemi con l'autenticazione, è stato configurato un account globale, pertanto bisogna eseguire questi passi:
- aprire il seguente link https://github.com/settings/tokens
- generare un token mediante `Generate new token (classic)`
- confermare l'accesso inserendo la propria password, se richiesto
- in `Note` inserire un messaggio come "token di accesso"
- `Expiration`: "No expiration"
- In `Select scopes` spuntare la casella accanto a `repo`, in modo tale da avere la situazione sottostante
- generare il token e salvarlo in un file di testo

![token](token.PNG)

Dopodiché, eseguire nuovamente il comando `push` usando il seguente formato:
```
git push https://<username>:<token>@github.com/<username>/<reponame>.git
```
dove `<username>` è il vostro username, al posto di `<token>` bisogna inserire il token creato prima e `<reponame>` è il nome del repository sul quale si vuole effettuare il `push` (in questo caso, `<reponame>` è `Git-tutorial`).

## Aggiunta di nuovi file al repository
1. Creare un nuovo file `main.c` nel workspace
2. Implementare un programma che, dati in input 10 numeri positivi, trovi il massimo e lo visualizzi a video
3. Aggiungere il nuovo file nell'area di staging
4. Sincronizzare l'area di staging con il repository locale (usando un messaggio di commit congruo)
5. Sincronizzare il repository remoto con quello locale

## Migioramento del file README.md
- Aggiungere la traccia dell'esercizio svolto
- Aggiungere una descrizione del codice
- Inserire una sezione in cui vengono spiegati i comandi utilizzati per la creazione di questo repository in stile tutorial
- Spiegare, in una nuova sezione, le funzioni base di Git

Per ognuno dei punti, effettuare, separatamente, i punti da 2 a 5 per sincronizzare i repository.

Di seguito vi sono delle istruzioni per migliorare la formattazione del file README.md

**NOTA: Il repository che creerete in questa esercitazione vi sarà utile per le prossime esercitazioni.**

## Inserire immagini nel README.md
Aggiungere l'immagine `img.jpg` al progetto ed inserirla nel testo con il seguente comando:
```![](img.png)```

## Inserire sezioni
Le sezioni possono essere create inserendo un `#` prima del titolo della sezione. Si può modificare il tipo di sezione usando da uno a sei `#`. È importante separare i `#` dal titolo con uno spazio.

## Inserire codice e citazioni
Il codice può essere inserito delimitandolo con tre backtick `.

Le citazioni possono essere fatte aggiungendo `>` prima del testo.