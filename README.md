# Java
Linguagem de programação orientada a Objetos mas tambem imperativa, funcional,reflexiva, concorrente
Java é multplataforma sendo compilado em ByteCode através de uma JDK e é executado através de uma JVM em qualquer S.O e servidores de aplicação 
Podendo ser exposta na Web em servidores on-premise ou em cloud através de API's que podem ser acessadas via front end ou por outros backends

## Tipos de Versões do Java :
  - JRE : Java Runtime Evironment - Apenas para execução possui a JVM que interpreta o ByteCode compilado .class ou em um jar 
  - JDK : Java Development Kit - Possui todo o kit de desenvolvimento como javac e javadoc para compilação e documentação

## Principais versões em uso no Mercado : 

  * 7 : Depreciada desde abril de 2015, utilizada para sistemas Legado com JSP,JSF,EJB  
  * 8 : Inclusão do Lambda e programação funcional dentro do Java, API de Data e Hora nativas desde Janeiro de 2019 a Oracle não dá mais suporte para o Java 8
  * 11 : Simplificação e Otimização funções Lambda e limpeza de dependencias melhorias no GC 

## Principais IDE's de Desenvolvimento : 
  - Eclipse
  - IntelliJ
  - Visual Studio Code

## Principais frameworks de desenvolvimento : 
  - Spring Boot (Varios Starters e facilitadores de criação de código para desenvolvimento padronizado Web,API e Batchs)
      - Spring MVC( Implementa o Design Pattern de View,Controller e Model mais utilizado para aplicações Web com Java)
      - Spring Data(Repositorys,JPA,JDBC já implementados para integração com Banco de Dados Oracle,MySlq,MongoDB)
      - Spring Web(RestFull API SOAP e Thymeleaf Web templates)
      - Spring WebServices(Reactive Flux)
  - Maven (Principal gerenciador de dependencias utilizado em java com XML POM injetando as dependencias de Libs)
  - Gradle(Gerenciador de dependencias mais simples com Yaml)
    
## Principais frameworks de testes :
  - Junit (Criação de testes Unitários de código Java)
  - Cucumber BDD - Testes Orientados a comportamento abordagem em grande uso e foco no mercado
  - Mockito - Para criação de Mocks de código para testes dos componentes desenvolvidos em Java

## Principais versionadores de Código : 
  - GitHub
  - Gitlab
  - BitBucket

## Principais servidores de aplicações java ; 
  - On premise
      - Tomcat (Utilizado para maquinas simples projetos iniciais) 
      - Jboss( Servidor mais robusto com mais recursos de gerenciamento)
      - IBM WebSphere (Servidor parrudo para volume grande de aplicações)
      - Openshift - Gerenciador de Containers para java e microserviços
  - Cloud
      - AWS - Amazon Web Services Java SDK
      - GCP - Google Cloud Plataform Java WebServices
      - Oracle WebLogic Server

# Conceitos : 

## Orientação a Objetos - 
    Paradigma de desenvolvimento que tem como propósito construção de código através de classes ,atributos e métodos 
    que definem os comportamentos dos objetos instanciados, conforme requisitos funcionais a serem desenvolvidos
    prove recursos como herança,Composição,delegação e polimorfismo entre componentes que quando integrados 
    formatam o software de forma coesa e refletindo ao mundo real mais fácil de se dar manutenção 
    se tornando extensivel e reutilizavel

    - Basicos :

        classe - um modelo ou especificação que define um tipo de objeto podendo conter atributos e métodos
            pacotes - caminho utilizado na compilação para geração dos bytecodes
            imports - link entre outras classes para compliação e referencia entre outras classes
            construtor - Metodo responsável em criar as instancias dos objetos chamado atravs do "new"
            atributo - toda classe pode ter 0 ou N atributos que serão parte do objeto assim que instanciado
            método - representa os comportamentos que o objeto vai ter dado a especificação na classe 

        objeto - Representa a instancia de uma classe onde um espaço em memória é utilizado para registrar 
                 o seu estado atual (um ou n valores), podendo possuir um agrupamento de dados e 
                 procedimentos definidos na classe,
        variaveis 
            tipos primitivos
            referencia
        operadores
            aritimeticos : +-*/
            decisão : & | && !
        instruções
            condicionais
                if , else , else if , switch-case
            repetição
                while,do-while e for
        modificadores de acesso
            public,private,protected, default

    Avançados : 

        API's Nativas :
            String,Array,ArrayList, Collections,Wrapper, Date 

        interfaces

        enums

        Exceptions

        herança

        polimorfismo

        Composição

        Delegação




