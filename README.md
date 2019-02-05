# Exercício Número 3  - Intents
  
## Descrição  
Este aplicativo exibe em uma lista veículos populares. Os dados sobre os veículos são gerados na própria aplicação, então o aplicativo funciona sem conexão à internet.

O aluno terá de detectar cliques feitos nos itens do RecyclerView, e consequemente iniciar uma nova activity exibindo os detalhes do carro.

## O que não é necessário codificar e/ou configurar?
Já é fornecido o código base da aplicação, não será necessário usar APIs ou obter os dados de qualquer outra fonte.

## Configurar o Projecto No Seu Computador
Caso baixe e abra o projecto pela primeira vez no seu **Android Studio**. Na parte superior do editor, clique em **File > Sync Project With Gradle Files** para baixar as dependências do projecto e configurar o Gradle para que seja possível executar o projecto.

## Passos Para Resolução
Os passos para a resolução deste exercício são as que seguem:

 - 1 - Crie uma activity, tanto a classe como o layout, que irá exibir os detalhes do carro selecionado;
 - 2 - Use o método setOnClickListener do View a monitorar os cliques;
 - 3 - Obtenha a posição do View clicado;
 - 4 - Obtenha da ArrayList **cars** dentro do adapter, o objecto Car relacionado ao item clicado;
- 5 - Crie uma interface **OnCarItemClickedListener** com um método **onCarItemClicked**;
- 6 - Crie um constructor para CarsAdapter com um parâmetro do tipo OnCarItemClickedListener;
- 7 - Guarde o valor do parâmetro do constructor num campo privado com o mesmo nome;
- 8 - Implementar a interface **OnCarItemClickedListener** na MainActivity;
- 9 - Passe a instância do MainActivity ao construtor do CarsAdapter;
- 10 - Invoque o método **onCarItemClicked** passando o carro selecionado para notificar o MainActivity;
- 11 - No método **onCarItemClicked**, instancie um intent que terá como destino a activity que criou;
- 12 - Passe todos os atributos do carro como argumento no Intent;
- 13 - Use o método startActivity para iniciar a activity passando o intent;
- 14 - Recupere na nova activity todos os argumentos do intent;
- 15 - Mostre na activity os detalhes do carro;