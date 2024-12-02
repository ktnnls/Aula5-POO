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
