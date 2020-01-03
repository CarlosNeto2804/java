# Calculadora do Número de Erdos

## História
O matemático húngaro Paul Erdõs (?Budapeste, Hungria, 1913 – †Varsóvia, Polônia, 1996),
um dos mais brilhantes do século XX, é considerado o mais prolífico matemático da história, podendo ser comparado apenas a Leonard
Euler: Erdõs publicou mais artigos, enquanto
que Euler publicou mais páginas. Trabalhou
em problemas de combinatória, teoria dos grafos, teoria dos números, análise clássica, teoria
da aproximação, teoria dos conjuntos e teoria
das probabilidades, tendo publicado 1525 artigos em colaboração com 511 outros matemáticos. Em termos de estilo matemático é considerado muito mais um “solucionador de problemas” do que um “desenvolvedor de teorias”.
Em toda sua carreira, Erdõs oferecia prêmios em
dinheiro para soluções de problemas não resolvidos. Esses prêmios variavam de $25, para problemas mais simples, a vários milhares de dólares para problemas que eram difíceis de atacar e eram matematicamente significativos. O
problema mais conhecido com um prêmio Erdõs provavelmente é a conjectura de Collatz, conhecido também como o Problema 3n + 1. Erdõs ofereceu 500 dólares por uma solução.
Em homenagem a este gênio húngaro, os matemáticos criaram um número, denominado
número de Erdõs. Toda pessoa que escreveu um artigo com Erdõs tem o número 1. Todos
que não possuem número 1, mas escreveram algum artigo juntamente com alguém que possui
número 1, possuem número 2. E assim por diante. Quando nenhuma ligacão pode ser estabelecida entre Erdõs e uma pessoa, diz-se que esta possui número de Erdõs infinito. Por exemplo,
o número de Erdõs de Albert Einstein é 2. E, talvez surpreendentemente, o número de Erdõs de Bill Gates é 4.

## Projeto
Programa que, a partir de uma lista de autores de artigos, determina o número de Erdõs de todos eles.

## Regras
- O projeto deve conter apenas o Scanner da API do Java;
- Usar vetor ou matriz para armazenar os dados;

## Composição

- Classe Autor
- Classe Classificador
- Classe Main

## Entrada

- O programa deve ler vários conjuntos de testes. 
- A primeira linha de um conjunto de
teste contém um número inteiro A, com 1 ≤ A ≤ 100, que indica o número de artigos. 
- Cada uma das A linhas seguintes contém a lista de autores de um artigo. 
- Cada autor é identificado pela inicial de seu nome, em maiúscula, seguida pelo seu último sobrenome.
Por exemplo, **P. Erdõs**. 
- O sobrenome de um autor possui, no máximo, 15 letras, e apenas a letra inicial aparece
em maiúscula. 
- Suponha também que não existem letras acentuadas. Assim, consideramos **“P. Erdos”** ao invés de **“P. Erdõs”**. 
- Os autores são separados por vírgulas e a lista de autores de um artigo termina com um ponto. 
- Um único espaço em branco separa a abreviatura do nome
do sobrenome, bem como o nome de um autor do anterior.
- Espaços em branco não são usados em outros locais. 
- Um artigo possui, no máximo, 10 autores, e o total de autores em um caso de teste não excede 100. 
- O final da entrada é indicado por A = 0.

### Exemplo:

```txt
5
P. Erdos, A. Selberg.
P. Erdos, J. Silva, M. Souza.
M. Souza, A. Selberg, A. Oliveira.
J. Ninguem, M. Ninguem.
P. Duarte, A. Oliveira.
2
Z. Silva, P. Erdos.
Z. Souza.
0
```

## Saída
- Para cada conjunto de teste da entrada o programa deve produzir um conjunto de linhas
na saída. 
- A primeira linha deve conter um identificador do conjunto de teste, no formato
“Teste n”, onde n é numerado sequencialmente a partir de 1. - A seguir deve aparecer uma linha para cada autor do conjunto de testes, exceto o próprio P. Erdõs. 
- Cada linha deve conter o nome do autor seguido pelo caractere ‘:’, um espaço em branco e o seu número de Erdõs.
- Caso o número de Erdõs de um determinado autor seja infinito, escreva ‘infinito’. 
- A saída deve ser ordenada pelo sobrenome do autor e em caso de mesmo sobrenome, o desempate deve ser feito pela inicial do primeiro nome.
- Imprimir uma linha em branco ao final de cada conjunto de teste

### Exemplo:
```
Teste 1
P. Duarte: 3
J. Ninguem: infinito
M. Ninguem: infinito
A. Oliveira: 2
A. Selberg: 1
J. Silva: 1
M. Souza: 1

Teste 2
Z. Silva: 1
Z. Souza: infinito

```
## Agradecimentos 
Professor Phelipe Fabres