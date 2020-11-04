# Java client for SOAP services with WSDL
![License MIT](https://img.shields.io/badge/License-MIT-green)
![Java 1.8](https://img.shields.io/badge/Java-1.8-blue)

Cieľom projektu je demonštrovať jednoduchú klient aplikáciu konzumujúc webovú službu definované WSDL schémou.
Triedy pre volanie a spracovanie objektov služby sú vygenerované pomocou Maven pluginu z priložených suborov WSDL a XSD schémy.

Projekt je klientom k SOAP webovej aplikácie implementovanú v repozitári [Interes-Group/java-course-wsdl](https://github.com/Interes-Group/java-course-wsdl);

Vygenerované triedy sú umiestnené v `target/generated-sources/main/java/`.

## Build
Pre kompilovanie aplikácie
```
mvn clean package
```

## Run
Pre spustenie aplikácie
```
java -jar target/java-course-wsdl-client-1.0.0.jar
```