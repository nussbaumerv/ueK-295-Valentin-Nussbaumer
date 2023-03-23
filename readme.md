# Order Businessobjekt - Projektauftrag üK 295 
## Dokumentation
### Benötigte Software herunterladen

| Software   |Download link |Installation Guide|
|:----------:|:-------------:|:------:|
| IntelliJ IDEA |https://www.jetbrains.com/idea/download/|https://www.jetbrains.com/help/idea/installation-guide.html|
| Postman |https://www.postman.com/downloads/|https://learning.postman.com/docs/getting-started/installation-and-updates/|
| Docker |https://www.docker.com/products/docker-desktop/|https://docs.docker.com/get-started/|

#### Dieses Programm herunterladen
Programm mit CMD klonen
```bash
git clone https://github.com/nussbaumerv/ueK-295-Valentin-Nussbaumer.git
```
Programm als ZIP herunterladen
https://github.com/nussbaumerv/ueK-295-Valentin-Nussbaumer/archive/refs/heads/main.zip

### Docker installieren
Man kann den benötigten Docker Container entweder über das Docker Desktop Programm installieren oder über folgenden CMD Befehl.

CMD Befehl
```bash
docker run -d -p 5432:5432 -e POSTGRES_PASSWORD=postgres --name uek295db postgres
```
Über folgenden CMD Befehl kann man überprüfen, ob der Container korrekt erstellt wurde.
```bash
docker ps
```
Falls alles korrekt ist, sollte etwas dieser Art in der CMD erscheinen.
```bash
CONTAINER ID   IMAGE      COMMAND                  CREATED       STATUS        PORTS                    NAMES
b66d376ea3e7   postgres   "docker-entrypoint.s…"   12 days ago   Up 13 hours   0.0.0.0:5432->5432/tcp   uek295db
```
## Programm starten
Als letzten Schritt muss man die IntelliJ IDE starten und den heruntergeladen Ordner als Projekt öffnen. <br>
Wenn das Projekt geöffnet ist, kann man in der rechten Seitenleiste auf das Gradle Icon klicken und unter Tasks > application auf "bootRun" doppelt klicken.

## Überprüfen
Wenn alles funktioniert hat, sollte unter folgenden URL: http://localhost:8080/welcome <br>
Dieser Text erscheinen
```bash
Hi there
```
## OpenAPI definition (Swagger)
Wenn alle korrekt eingerichtet ist, kann man unter folgenden URL: http://localhost:8080/swagger-ui/index.html#/ <br>
Die verschiedenen Methoden von dem Programm sehen.

## Postman
Über Postman können Requests getätigt werden und Tests durchgeführt werden. <br>
Meine Postman Tests finden Sie hier: https://github.com/nussbaumerv/ueK-295-Valentin-Nussbaumer/blob/main/uek295-Order/Postman-Tests.js
