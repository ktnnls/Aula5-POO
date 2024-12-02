# Aula5-POO
EXERCÍCIO 1


Simulador de Operações de Computadores
Este é um projeto em Java que simula operações relacionadas ao cálculo de valores de diferentes tipos de computadores, como Desktops e Notebooks. O objetivo principal é demonstrar o uso de herança, polimorfismo e coleções na linguagem Java.

📋 Funcionalidades
Criação de instâncias de computadores do tipo Desktop e Notebook.
Cálculo do valor total de setups de computadores com base nas configurações especificadas.
Uso de uma lista para armazenar múltiplos computadores e calcular o custo total.
📂 Estrutura do Projeto
O projeto está organizado da seguinte forma:

Classes
Computador (superclasse): Define atributos básicos como memória e número de processadores, além de um método abstrato para calcular o valor.
Desktop (subclasse): Estende Computador e adiciona o atributo acessorios. Implementa o cálculo de valor com base na quantidade de memória, processadores e acessórios.
Notebook (subclasse): Estende Computador e adiciona o atributo polegadasTela. Calcula o valor com base na quantidade de memória, processadores e tamanho da tela.
Principal (classe principal): Contém o método main para executar a lógica do programa, incluindo a criação de instâncias, armazenamento em uma lista e cálculo do valor total.

🛠️ Tecnologias Utilizadas
Java 8+
IDE de Desenvolvimento (IntelliJ, Eclipse, etc.)

✨ Pontos de Aprendizado
Uso de herança para estruturar classes.
Implementação de métodos abstratos.
Manipulação de listas para armazenar e iterar sobre objetos.
Prática com construtores, métodos e sobrescrita de métodos.

#EXERCÍCIO 2 

Sistema de Impressão Genérica com Interface Imprimivel
Este projeto em Java exemplifica o uso de interfaces, polimorfismo e listas para realizar operações genéricas de impressão de diferentes tipos de objetos. Através da interface Imprimivel, o sistema permite que objetos de diferentes classes implementem o método imprimir de forma personalizada.

📋 Descrição
O projeto foi desenvolvido para ilustrar como diferentes entidades podem ser tratadas de maneira uniforme, utilizando uma interface como base comum. Classes como Funcionario, Carro e Quadrado implementam a interface Imprimivel, o que garante a presença do método imprimir, adaptado às suas respectivas características.

📂 Estrutura do Projeto
Interface Imprimivel
Define o contrato para que qualquer classe que implemente a interface possua o método imprimir.

Classes Implementadoras

Funcionario: Representa um funcionário com atributos nome e cpf.
Carro: Representa um carro com atributos marca, cor e portas.
Quadrado: Representa uma forma geométrica quadrada, com o atributo medidaLado.
Classe Principal
Contém o método main, responsável por:

Criar objetos de diferentes classes que implementam Imprimivel.
Armazenar esses objetos em uma lista.
Invocar o método imprimir de cada objeto de forma uniforme.
🛠️ Tecnologias Utilizadas
Linguagem de programação: Java
Paradigma de programação: Orientação a Objetos (OO)
🚀 Funcionalidades
Polimorfismo com Interface:
Objetos de diferentes tipos (Funcionario, Carro, Quadrado) são tratados de forma uniforme através da interface Imprimivel.

Impressão Personalizada:
Cada classe implementa seu próprio comportamento para o método imprimir.

Uso de Listas:
Armazenamento e manipulação de objetos heterogêneos em uma lista genérica (ArrayList).

✨ Pontos de Aprendizado
Implementação de interfaces para estruturar contratos de comportamento.
Uso do polimorfismo para manipular objetos de diferentes tipos de forma genérica.
Prática com listas para organizar e processar coleções de objetos.
