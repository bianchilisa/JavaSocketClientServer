# JavaSocketClientServer

Questo progetto dimostra una semplice comunicazione client/server in Java utilizzando le socket TCP.

## 📂 Contenuto

- `HelloServer.java`: programma server TCP. Ascolta sulla porta 10000 e invia un messaggio.
- `HelloClient.java`: programma client TCP. Si connette al server in `localhost` e riceve il messaggio.
- `.vscode/launch.json`: configurazioni per eseguire facilmente client e server con GitHub Codespaces o Visual Studio Code.

## ▶️ Come eseguire in GitHub Codespaces

1. Vai su `<> Code` → tab `Codespaces` → clicca su `+ Create codespace on main`
2. Attendi l’apertura dell’ambiente Visual Studio Code online
3. Nella barra laterale sinistra, clicca su `Run and Debug` (icona ▶)
4. Scegli una delle configurazioni:
   - `Esegui HelloServer` → Avvia il server (in ascolto)
   - `Esegui HelloClient` → Avvia il client (che si connette al server)

⚠️ Assicurati di avviare prima il server, poi il client.

## 💡 Note

- Il server utilizza la porta `10000` e accetta connessioni su `localhost`.
- Client e server funzionano solo all'interno dello stesso ambiente (es. Codespaces o macchina locale).

## 🧪 Requisiti

- Java JDK 17 o superiore
- (Facoltativo) VS Code con estensione Java e cartella `.vscode` configurata
