# Prao vecka 7, 2024

## Schema (prel)
|     | Måndag      | Tisdag    | Onsdag   | Torsdag  | Fredag |
|---|---|---|---|---|---|
|9:30  |            | Intro JVM     | Intro OpenJDK  |
|10    | Intro      | Utv.miljö     |           | 
|10:30 | Standup    |               | Standup   | Standup/triage
|11    | Intro Java | Lite git      | Intro JBS |
|12    | Lunch      | Lunch         | Lunch    | Lunch     | Lunch   |
|13-14 | Utv.miljö  | Bygga OpenJDK |          |
|14-16 | Utv.miljö  | Bygga OpenJDK |          |

På https://dev.java/ kan man kolla på t.ex. Playground för att testa lite Java-snuttar.

## Installera utvecklingsmiljö

* Ladda ner och installera VirtualBox
  - https://www.virtualbox.org/wiki/Downloads
* Ladda ner Boot ISO med Oracle Linux
  - https://yum.oracle.com/oracle-linux-isos.html

### Installera Oracle Linux i en ny VM

### Installera utvecklingsverktyg
Öppna en terminal i Linux
* Installera git
  * `sudo yum install git`

## Bygg OpenJDK
### Klona OpenJDK
Man kan skapa en fork av https://github.com/openjdk/jdk, som man sen klonar. Du kan klona denna fork:
*   `git clone --branch prao-2024 https://github.com/jaokim/jdk.git`
*   `git switch prao-2024`

### Bygg OpenJDK
Följ instruktionerna på https://github.com/openjdk/jdk/blob/master/doc/building.md


