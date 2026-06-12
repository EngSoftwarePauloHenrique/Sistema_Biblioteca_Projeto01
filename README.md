📚 Sistema de Biblioteca

Sistema de gerenciamento de biblioteca desenvolvido em Java utilizando Programação Orientada a Objetos (POO). O sistema permite o cadastro de livros e colaboradores, controle de empréstimos, devoluções e aplicação de multas.

🎯 Objetivo

Automatizar o gerenciamento de uma biblioteca através de uma aplicação de console, permitindo o controle de livros, colaboradores e empréstimos de forma simples e organizada.

🛠 Tecnologias Utilizadas
Java JDK 17+
Apache NetBeans IDE
Programação Orientada a Objetos (POO)
ArrayList (Collections Framework)
📋 Requisitos de Ambiente

Antes de executar o projeto, certifique-se de possuir:

Software Necessário
Java JDK 17 ou superior
Apache NetBeans IDE
Verificar Instalação do Java

No terminal execute:

java -version

Resultado esperado:

java version "17"

ou superior.

📥 Instalação do Projeto
1. Clonar o Repositório
git clone https://github.com/EngSoftwarePauloHenrique/Sistema_Biblioteca_Projeto01.git
2. Abrir o Projeto
Abra o Apache NetBeans.
Clique em:
File → Open Project
Selecione a pasta:
Sistema_Biblioteca_Projeto01
Clique em Open Project.
▶️ Execução do Sistema
Abra a classe:
src/sistemabiblioteca/Main.java
Execute pressionando:
F6

ou

Run Project
🚀 Funcionalidades
1. Cadastro de Livros

Permite cadastrar novos livros informando:

ID
Título
Autor
2. Cadastro de Colaboradores

Permite cadastrar colaboradores informando:

ID
Nome
3. Listagem de Livros

Exibe todos os livros cadastrados e sua situação:

Disponível
Emprestado
4. Listagem de Colaboradores

Exibe todos os colaboradores cadastrados.

5. Registro de Empréstimos

Fluxo:

Selecionar colaborador.
Selecionar livro.
Registrar empréstimo.

Resultado:

Empréstimo realizado com sucesso!
6. Geração de Multas

Fluxo:

Selecionar empréstimo.
Informar quantidade de dias em atraso.
Sistema calcula a multa.

Fórmula:

Valor da multa = Dias de atraso × R$ 2,00
7. Listagem de Empréstimos

Exibe todos os empréstimos ativos.

Exemplo:

João -> Java POO
Maria -> Estrutura de Dados
8. Devolução de Livros

Fluxo:

Selecionar empréstimo.
Registrar devolução.

Resultado:

Livro devolvido!
Empréstimo encerrado com sucesso!

O livro volta a ficar disponível para novos empréstimos.

🗂 Organização do Projeto
Sistema_Biblioteca_Projeto01/
│
├── src/
│   └── sistemabiblioteca/
│       ├── Main.java
│       ├── Biblioteca.java
│       ├── Livro.java
│       ├── Colaborador.java
│       ├── Emprestimo.java
│       └── Multa.java
│
└── README.md
📖 Descrição das Classes
Main.java

Responsável pela execução do sistema e exibição do menu principal.

Biblioteca.java

Gerencia:

Livros
Colaboradores
Empréstimos
Livro.java

Representa os livros cadastrados e controla sua disponibilidade.

Colaborador.java

Representa os usuários aptos a realizar empréstimos.

Emprestimo.java

Relaciona um colaborador a um livro emprestado.

Multa.java

Calcula e exibe multas por atraso.

🗄 Banco de Dados

Este projeto não utiliza banco de dados.

Todos os dados são armazenados temporariamente em memória utilizando ArrayList durante a execução da aplicação.


👨‍💻 Autor

Paulo Henrique Melo de Moraes

Projeto acadêmico desenvolvido para aplicação prática dos conceitos de Programação Orientada a Objetos em Java.

