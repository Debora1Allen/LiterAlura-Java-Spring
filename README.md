# LiterAlura

Breve descrição ou introdução do seu projeto.

## Índice

1. [Introdução](#introdução)
2. [Recursos](#recursos)
3. [Estrutura](#estrutura)
4. [Configuração](#setup)
5. [Uso](#uso)
6. [Contribuindo](#contribuindo)
7. [Licença](#licença)

## Introdução

Forneça uma visão geral concisa do seu aplicativo. Mencione seu propósito, principais recursos e público-alvo.

## Características

- Recurso 1: Concultar Catálogo de Autores
- Recurso 2: Listagem de livros por idiomas
- Recurso 3: Listagem de autores vivos em determinado ano
- ...

## Estrutura

```
LiterAlura/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── literalura/
│   │   │           └── gutendexapi/
│   │   │               ├── controller/
│   │   │               │   └── GutendexController.java
│   │   │               ├── model/
│   │   │               │   ├── Author.java
│   │   │               │   └── Book.java
│   │   │               ├── repository/
│   │   │               │   ├── AuthorRepository.java
│   │   │               │   └── BookRepository.java
│   │   │               └── service/
│   │   │                   └── GutendexService.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── literalura/
│                   └── gutendexapi/
│                       └── GutendexApiApplicationTests.java
├── build.gradle
└── settings.gradle

```

## Configurar

```bash
#Clone o repositório
git clone git@github.com:Debora1Allen/LiterAlura-Java-Spring.git

# Navegue até o diretório do projeto
cd LiterAlura

# Build o projeto
./gradlew build

# Execute o aplicativo
./gradlew bootRun
```

## Licença
License
MIT©2023 debora1allen

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions: The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software. THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.