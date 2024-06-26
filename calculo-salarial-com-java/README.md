# Desafio

Faça um programa que calcule e imprima o salário a ser transferido para um funcionário.

Para realizar o cálculo receba o valor bruto do salário e o adicional dos benefícios.

O sálario a ser transferido é calculado da seguinte forma:

***(valor bruto do salário - percentual de imposto mediante ao salário) + adicional dos benefícios***

Para calcular o ***percentual de imposto*** segue as alíquotas:
```
De R$ 0.00 à R$ 1100.00 = 5%
De R$ 1100.01 à R$ 2500.00 = 10%
Maior que R$ 2500.00 = 15%
```

## Entrada

A entrada consiste em vários arquivos de teste, que conterá o **valor bruto do sálario** e **adicional de benefícios**. Conforme mostrado no exemplo de entrada logo abaixo.

## Saída

Para cada arquivo de entrada, terá um arquivo de saída. E como mencionado no Desafio, será gerado uma linha com um número que será a diferença entre o valor bruto do salário e o percentual de imposto mediante a faixa salarial somando com o adicional de benefícios. Use o exemplo abaixo para clarear o que está sendo pedido.

|   Entrada   |  Saída  |
| ----------- | ------- |
| 2000.00     | 2050.00 |
|  250.00     |         |