# Estudos sobre JUnit 5

## Objetivo

A proposta desse projeto é estudar a documentação do JUnit 5 traduzindo-a com exemplos e com a meu entendimento sobre as 
coisas. 

Escreverei o meu entendimento dos tópicos no README e farei referencia ao código desse projeto que roda na prática o que
foi explicado.

Documentação
https://junit.org/junit5/docs/current/user-guide/

## O que é o JUnit 5

O JUnit 5 é composto por vários módulos de 3 subprojetos.

**JUnit Platform**: Essa é a estrutura do Junit para rodar os testes. Ele possui uma API de execução de testes (`Launcher API`)
que permite rodar testes através de código. Possui também o `JUnit 4 based Runner` que serve para rodar qualquer Engine de testes.
Além disso, possui um `Console Laucher` que permite rodar o JUnit via linha de comando. No fim das contas, as IDEs usam
o que o JUnit Platform oferece para nos dar a comodidade de rodar os testes.

**JUnit Jupiter**: Aqui estão as novas funcionalidades do JUnit 5 que dão mais eficiência para nós programadores usuários
do JUnit 5. Eles chamam do novo `programming model` e `extension model`. Esse módulo possui uma TestEngine que será executada
no `JUnit 4 based Runner` que de fato roda o leque de ferramentas que o Junit 5 nos oferece.

**JUnit Vintage**: Aqui está a TestEngine responsável por rodar os testes do JUnit 3 e 4 para que quem usa o JUnit 5 consiga
usar também testes escritos com as ferramentas do JUnit4. O objetivo é manter compatibilidade.

## Supported Java Versions

O JUnit 5 precisa de `Java 8` ou maior para rodar. Entretanto, ele consegue testar códigos java compilados antes dessa versão.

## Começando a utilizar o JUnit 5

### Baixando artefatos

Todos os artefatos disponíveis para uso do JUnit 5 estão [aqui](https://junit.org/junit5/docs/current/user-guide/#dependency-metadata)

## Mapa de dependências

![](https://junit.org/junit5/docs/current/user-guide/images/component-diagram.svg)

