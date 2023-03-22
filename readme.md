# Order Businessobjekt - Projektauftrag üK 295 
## Documentation
### Benötigte Software herrunterladen

| Software   |Download link |Installation Guide|
|:----------:|:-------------:|:------:|
| IntelliJ IDEA |https://www.jetbrains.com/idea/download/|https://www.jetbrains.com/help/idea/installation-guide.html|
| Postman |https://www.postman.com/downloads/|https://learning.postman.com/docs/getting-started/installation-and-updates/|
| Docker |https://www.docker.com/products/docker-desktop/|https://docs.docker.com/get-started/|

#### Dieses Programm herrunterladen
Programm mit CMD clonen
```bash
git clone https://github.com/nussbaumerv/ueK-295-Valentin-Nussbaumer.git
```
Programm als ZIP herrunterladen
https://github.com/nussbaumerv/ueK-295-Valentin-Nussbaumer/archive/refs/heads/main.zip

### Docker installieren
Man kann den benötigten Docker Container entweder über das Docker Desktop Porgramm installieren oder über folgeneden CMD befehl.

CMD Befehl
```bash
docker run -d -p 5432:5432 -e POSTGRES_PASSWORD=postgres --name uek295db postgres
```
Über folgenden CMD befehl kann man überprüfen ob der Container korrekt erstellt wurde.
```bash
docker ps
```
Fals alles korrekt ist solte etwas dieser Art in der CMD erscheinen.
```bash
CONTAINER ID   IMAGE      COMMAND                  CREATED       STATUS        PORTS                    NAMES
b66d376ea3e7   postgres   "docker-entrypoint.s…"   12 days ago   Up 13 hours   0.0.0.0:5432->5432/tcp   uek295db
```
## Programm starten
Als letzten schritt muss man die Intellij IDE starten und den herruntergeladen Ordner als Projekt öffnen. <br>
Wenn das Projekt geöffnet ist kann man in der Rechten Seitelasten auf das Gradle icon clicken und under Tasks > application auf "bootRun" doppelt clicken.

