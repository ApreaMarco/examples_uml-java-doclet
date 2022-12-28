## Step 1: Clone repository ##
To clone this repository:
```console
foo@bar:~$ git clone https://github.com/ApreaMarco/examples_uml-java-doclet ~/git/examples_uml-java-doclet
Clone in '/home/foo/git/examples_uml-java-doclet' in corso...
remote: Enumerating objects: 27, done.
remote: Counting objects: 100% (27/27), done.
remote: Compressing objects: 100% (9/9), done.
remote: Total 27 (delta 4), reused 27 (delta 4), pack-reused 0
Ricezione degli oggetti: 100% (27/27), 4.83 KiB | 4.83 MiB/s, fatto.
Risoluzione dei delta: 100% (4/4), fatto.
```
```console
foo@bar:~$ cd ~/git/examples_uml-java-doclet
foo@bar:~/git/examples_uml-java-doclet$ git status
Sul branch master
Il tuo branch è aggiornato rispetto a 'origin/master'.

non c'è nulla di cui eseguire il commit, l'albero di lavoro è pulito
```
## Step 2: Choose an example to build ##
Navigate to folder that contains this repository, and choose and example to build under maven, like follow:
```console
foo@bar:~/git/examples_uml-java-doclet$ ls
ES01
```
```console
foo@bar:~/git/examples_uml-java-doclet$ cd ES01
foo@bar:~/git/examples_uml-java-doclet/ES01$ mvn validate 
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------< it.edu.marconi:examples_uml-java-doclet >---------------
[INFO] Building examples_uml-java-doclet 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.061 s
[INFO] Finished at: 2022-12-28T01:56:52+01:00
[INFO] ------------------------------------------------------------------------
```
```console
foo@bar:~/git/examples_uml-java-doclet/ES01$ mvn compile
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------< it.edu.marconi:examples_uml-java-doclet >---------------
[INFO] Building examples_uml-java-doclet 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ examples_uml-java-doclet ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/foo/git/examples_uml-java-doclet/ES01/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ examples_uml-java-doclet ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 6 source files to /home/foo/git/examples_uml-java-doclet/ES01/target/classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.856 s
[INFO] Finished at: 2022-12-28T01:58:00+01:00
[INFO] ------------------------------------------------------------------------
```
```console
foo@bar:~/git/examples_uml-java-doclet/ES01$ mvn clean install
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------< it.edu.marconi:examples_uml-java-doclet >---------------
[INFO] Building examples_uml-java-doclet 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ examples_uml-java-doclet ---
[INFO] Deleting /home/foo/git/examples_uml-java-doclet/ES01/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ examples_uml-java-doclet ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/foo/git/examples_uml-java-doclet/ES01/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ examples_uml-java-doclet ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 6 source files to /home/foo/git/examples_uml-java-doclet/ES01/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ examples_uml-java-doclet ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/foo/git/examples_uml-java-doclet/ES01/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ examples_uml-java-doclet ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ examples_uml-java-doclet ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ examples_uml-java-doclet ---
[INFO] Building jar: /home/foo/git/examples_uml-java-doclet/ES01/target/examples_uml-java-doclet-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ examples_uml-java-doclet ---
[INFO] Installing /home/foo/git/examples_uml-java-doclet/ES01/target/examples_uml-java-doclet-1.0-SNAPSHOT.jar to /home/foo/.m2/repository/it/edu/marconi/examples_uml-java-doclet/1.0-SNAPSHOT/examples_uml-java-doclet-1.0-SNAPSHOT.jar
[INFO] Installing /home/foo/git/examples_uml-java-doclet/ES01/pom.xml to /home/foo/.m2/repository/it/edu/marconi/examples_uml-java-doclet/1.0-SNAPSHOT/examples_uml-java-doclet-1.0-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.047 s
[INFO] Finished at: 2022-12-28T02:03:38+01:00
[INFO] ------------------------------------------------------------------------
```
## Step 3: Generate JavaDoc using uml-java-doclet ##
To generate JavaDoc using [uml-java-doclet](https://github.com/ApreaMarco/uml-java-doclet):
```console
foo@bar:~/git/examples_uml-java-doclet/ES01$ mvn generate-sources javadoc:javadoc
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------< it.edu.marconi:examples_uml-java-doclet >---------------
[INFO] Building examples_uml-java-doclet 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> maven-javadoc-plugin:3.4.1:javadoc (default-cli) > generate-sources @ examples_uml-java-doclet >>>
[INFO] 
[INFO] <<< maven-javadoc-plugin:3.4.1:javadoc (default-cli) < generate-sources @ examples_uml-java-doclet <<<
[INFO] 
[INFO] 
[INFO] --- maven-javadoc-plugin:3.4.1:javadoc (default-cli) @ examples_uml-java-doclet ---
Downloading from jitpack.io: https://jitpack.io/com/github/ApreaMarco/uml-java-doclet/master-SNAPSHOT/maven-metadata.xml
Downloaded from jitpack.io: https://jitpack.io/com/github/ApreaMarco/uml-java-doclet/master-SNAPSHOT/maven-metadata.xml (394 B at 526 B/s)
Downloading from jitpack.io: https://jitpack.io/com/github/ApreaMarco/uml-java-doclet/master-d9e7de017d-1/uml-java-doclet-master-d9e7de017d-1.pom
Downloaded from jitpack.io: https://jitpack.io/com/github/ApreaMarco/uml-java-doclet/master-d9e7de017d-1/uml-java-doclet-master-d9e7de017d-1.pom (3.1 kB at 38 kB/s)
Downloading from jitpack.io: https://jitpack.io/com/github/ApreaMarco/uml-java-doclet/master-d9e7de017d-1/uml-java-doclet-master-d9e7de017d-1.jar
Downloaded from jitpack.io: https://jitpack.io/com/github/ApreaMarco/uml-java-doclet/master-d9e7de017d-1/uml-java-doclet-master-d9e7de017d-1.jar (53 kB at 543 kB/s)
[INFO] No previous run data found, generating javadoc.
[INFO] 
Loading source files for package it.edu.marconi.azienda...
Constructing Javadoc information...
Generating Javadocs...
Using arguments:
-doclet it.edu.marconi.umljavadoclet.UmlJavaDoclet -docletpath /home/foo/.m2/repository/com/github/ApreaMarco/uml-java-doclet/master-d9e7de017d-1/uml-java-doclet-master-d9e7de017d-1.jar:/home/foo/.m2/repository/net/sourceforge/plantuml/plantuml/1.2022.8/plantuml-1.2022.8.jar -doclet it.edu.marconi.umljavadoclet.UmlJavaDoclet -docletpath /home/foo/.m2/repository/com/github/ApreaMarco/uml-java-doclet/master-d9e7de017d-1/uml-java-doclet-master-d9e7de017d-1.jar:/home/foo/.m2/repository/net/sourceforge/plantuml/plantuml/1.2022.8/plantuml-1.2022.8.jar -encoding UTF-8 -protected -source 1.8 -sourcepath /home/foo/git/examples_uml-java-doclet/ES01/src/main/java -output-model true -author -bottom Copyright &#169; 2022. All rights reserved. -charset UTF-8 -d /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs -docencoding UTF-8 -doctitle examples_uml-java-doclet 1.0-SNAPSHOT API -linkoffline https://docs.oracle.com/javase/8/docs/api /home/foo/git/examples_uml-java-doclet/ES01/target/javadoc-bundle-options -use -version -windowtitle examples_uml-java-doclet 1.0-SNAPSHOT API Using java doc dir: /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs
uml-java-doclet options: linetype=ortho dependencies=public output-model=true puml-include-file=null exclude-classes=null exclude-packages=null 
Standard Doclet version 1.8.0_333
Building tree for all the packages and classes...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/it/edu/marconi/azienda/AziendaList.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/it/edu/marconi/azienda/AziendaMap.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/it/edu/marconi/azienda/Dipendente.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/it/edu/marconi/azienda/Impiegato.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/it/edu/marconi/azienda/Main.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/it/edu/marconi/azienda/Quadro.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/it/edu/marconi/azienda/package-frame.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/it/edu/marconi/azienda/package-summary.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/it/edu/marconi/azienda/package-tree.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/constant-values.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/it/edu/marconi/azienda/class-use/Quadro.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/it/edu/marconi/azienda/class-use/Main.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/it/edu/marconi/azienda/class-use/Impiegato.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/it/edu/marconi/azienda/class-use/Dipendente.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/it/edu/marconi/azienda/class-use/AziendaMap.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/it/edu/marconi/azienda/class-use/AziendaList.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/it/edu/marconi/azienda/package-use.html...
Building index for all the packages and classes...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/overview-tree.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/index-all.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/deprecated-list.html...
Building index for all classes...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/allclasses-frame.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/allclasses-noframe.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/index.html...
Generating /home/foo/git/examples_uml-java-doclet/ES01/target/site/apidocs/help-doc.html...
=======================================================================================
Class: it.edu.marconi.azienda.Quadro
  extends: it.edu.marconi.azienda.Impiegato
Class: it.edu.marconi.azienda.Main
Class: it.edu.marconi.azienda.Impiegato
  extended by: it.edu.marconi.azienda.Quadro
  extends: it.edu.marconi.azienda.Dipendente
Class: it.edu.marconi.azienda.Dipendente
  extended by: it.edu.marconi.azienda.Impiegato
  had by: it.edu.marconi.azienda.AziendaMap mapDipendenti many
  had by: it.edu.marconi.azienda.AziendaList listaDipendenti many
Class: it.edu.marconi.azienda.AziendaMap
  has: java.util.Map<Integer, Dipendente> mapDipendenti
  has: it.edu.marconi.azienda.Dipendente mapDipendenti many
Class: it.edu.marconi.azienda.AziendaList
  has: java.util.List<Dipendente> listaDipendenti
  has: it.edu.marconi.azienda.Dipendente listaDipendenti many
Package: it.edu.marconi.azienda
  Class: it.edu.marconi.azienda.Quadro
  Class: it.edu.marconi.azienda.Main
  Class: it.edu.marconi.azienda.Impiegato
  Class: it.edu.marconi.azienda.Dipendente
  Class: it.edu.marconi.azienda.AziendaMap
  Class: it.edu.marconi.azienda.AziendaList

=======================================================================================
Using PlantUML version 1.2022.8
Generating diagrams...
Generated diagram for class it.edu.marconi.azienda.Quadro
Generated diagram for class it.edu.marconi.azienda.Main
Generated diagram for class it.edu.marconi.azienda.Impiegato
Generated diagram for class it.edu.marconi.azienda.Dipendente
Generated diagram for class it.edu.marconi.azienda.AziendaMap
Generated diagram for class it.edu.marconi.azienda.AziendaList
Generated diagram for package it.edu.marconi.azienda
ERROR: Could not find html file overview-summary.html
ERROR: Could not update html page for overview diagram
42 warnings
[WARNING] Javadoc Warnings
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/AziendaList.java:37: warning: no description for @return
[WARNING] * @return
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/AziendaList.java:46: warning: no description for @param
[WARNING] * @param nomeAzienda
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/AziendaList.java:55: warning: no description for @param
[WARNING] * @param dipendente
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/AziendaList.java:64: warning: no description for @return
[WARNING] * @return
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/AziendaList.java:77: warning: no description for @return
[WARNING] * @return
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/AziendaList.java:27: warning: no description for @param
[WARNING] * @param nomeAzienda
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/AziendaMap.java:35: warning: no description for @return
[WARNING] * @return
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/AziendaMap.java:44: warning: no description for @param
[WARNING] * @param nomeAzienda
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/AziendaMap.java:53: warning: no description for @param
[WARNING] * @param chiave
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/AziendaMap.java:54: warning: no description for @param
[WARNING] * @param valore
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/AziendaMap.java:63: warning: no description for @return
[WARNING] * @return
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/AziendaMap.java:76: warning: no description for @return
[WARNING] * @return
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/AziendaMap.java:25: warning: no description for @param
[WARNING] * @param nomeAzienda
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Dipendente.java:42: warning: no description for @return
[WARNING] * @return
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Dipendente.java:51: warning: no description for @param
[WARNING] * @param id
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Dipendente.java:60: warning: no description for @return
[WARNING] * @return
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Dipendente.java:69: warning: no description for @param
[WARNING] * @param nome
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Dipendente.java:78: warning: no description for @return
[WARNING] * @return
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Dipendente.java:87: warning: no description for @param
[WARNING] * @param cognome
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Dipendente.java:96: warning: no description for @return
[WARNING] * @return
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Dipendente.java:105: warning: no description for @param
[WARNING] * @param stipendioBase
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Dipendente.java:114: warning: no description for @return
[WARNING] * @return
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Dipendente.java:123: warning: no description for @return
[WARNING] * @return
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Dipendente.java:27: warning: no description for @param
[WARNING] * @param id
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Dipendente.java:28: warning: no description for @param
[WARNING] * @param cognome
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Dipendente.java:29: warning: no description for @param
[WARNING] * @param nome
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Dipendente.java:30: warning: no description for @param
[WARNING] * @param stipendioBase
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Impiegato.java:31: warning: no description for @return
[WARNING] * @return
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Impiegato.java:40: warning: no description for @param
[WARNING] * @param bonus
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Impiegato.java:49: warning: no description for @return
[WARNING] * @return
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Impiegato.java:64: warning: no description for @return
[WARNING] * @return
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Impiegato.java:18: warning: no description for @param
[WARNING] * @param id
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Impiegato.java:19: warning: no description for @param
[WARNING] * @param cognome
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Impiegato.java:20: warning: no description for @param
[WARNING] * @param nome
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Impiegato.java:21: warning: no description for @param
[WARNING] * @param stipendioBase
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Main.java:19: warning: no description for @param
[WARNING] * @param args
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Quadro.java:36: warning: no description for @return
[WARNING] * @return
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Quadro.java:21: warning: no description for @param
[WARNING] * @param id
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Quadro.java:22: warning: no description for @param
[WARNING] * @param cognome
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Quadro.java:23: warning: no description for @param
[WARNING] * @param nome
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Quadro.java:24: warning: no description for @param
[WARNING] * @param stipendioBase
[WARNING] ^
[WARNING] /home/foo/git/examples_uml-java-doclet/ES01/src/main/java/it/edu/marconi/azienda/Quadro.java:25: warning: no description for @param
[WARNING] * @param bonus
[WARNING] ^
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.951 s
[INFO] Finished at: 2022-12-28T02:15:38+01:00
[INFO] ------------------------------------------------------------------------
```
The resulted JavaDoc is into the folder: **../git/examples_uml-java-doclet/ES01/target/site/apidocs/**

Open index.html with your preferite browser to navigate the generated JavaDoc.
