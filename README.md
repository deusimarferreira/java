# Java Records
Neste artigo tratarei uma demonstração da Records, feature especificada na [JEP 359](https://openjdk.java.net/jeps/359) e, disponível a partir do Java 14 que visa simplificar a maneira como criamos os nossos DTO (Data Transfer Object), VO (Value Object) e POJO's (Plain Old Java Objects) por exemplo.

Vamos utilizar as classes Livro, Editora e Autor em nosso exemplo, todas possuem varias propriedades e implementações especificas para equals(), hashCode() e toString().

# Referências
1. Geração do diagramas com [yuml](https://yuml.me/diagram/scruffy/class/draw)
2. JDK Enhancement-Proposal [JEP 359](https://openjdk.java.net/jeps/359)