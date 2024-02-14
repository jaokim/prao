# Prao vecka 7, 2024

## Schema (prel)
|     | Måndag      | Tisdag    | Onsdag   | Torsdag  | Fredag |
|---|---|---|---|---|---|
|10    | Intro      | Utv.miljö     | Intro OpenJDK | 
|10:30 | Standup    |               | Standup   | Standup/triage
|11    | Intro Java | Lite git      | Intro JBS |
|12    | Lunch      | Lunch         | Lunch    | Lunch     | Lunch   |
|13-14 | Utv.miljö  | Bygga OpenJDK |          |
|14-16 | Utv.miljö  | Bygga OpenJDK |          |

På https://dev.java/ kan man kolla på t.ex. Playground för att testa lite Java-snuttar.

## Installera utvecklingsmiljö

* Ladda ner och installera VirtualBox för "Windows Host"
  - https://www.virtualbox.org/wiki/Downloads
* Ladda ner "Boot ISO" med Oracle Linux
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

### Testa din JDK
* Kompilera nån egen Java-snutt och kör med din egenkompilerade JVM.
* Vad heter din JVM? Kör `java -version`, och ange vilken version du kör.
  - Kan du ändra informationen som skrivs ut när du kör "-version"?
 
### Din första bugg/krasch
Du har fått ett ärende:
* Hotspot kraschar: https://github.com/jaokim/prao/issues/1
  - Läs igenom ärendet och försök greppa ungefär vad som händer
  - Vilken version används?
  - Försök återskapa problemet -- finns det nån reproducer
  - Hur startar de JVM:en? Använder de några speciella argument?
 
  - Ledtrådar   
  - För att uppdatera ditt repo till senaste, kör `git pull -q`
 
### Mer om OpenJDK
* För att förstå lite mer om OpenJDK och hur man kan bidra, kolla på nån av dessa filmer:
  - https://www.youtube.com/watch?v=WPZiv1Ow2Qk
  - https://www.youtube.com/watch?v=bHcKTYy_Nec
  - 
* För att börja bidra till OpenJDK, finns det s.k. "starter bugs":
 - [https://bugs.openjdk.org](https://bugs.openjdk.org/issues/?jql=project%20%3D%20JDK%20AND%20labels%20%3D%20starter%20AND%20assignee%20is%20null%20AND%20component%20%3D%20hotspot%20AND%20status%20not%20in%20(Resolved%2C%20Closed))
