# lista-exercicios-02-java
Lista de exercícios 02 - Programação Orientada a Objetos

01 - Explique por que é considerado boa prática usar getters e setters em vez de tornar os atributos públicos em uma classe. Dê um exemplo onde usar um setter permite controlar melhor a integridade dos dados de um objeto.


No que concerne às boas práticas em utilizar getters e setters em vez de tornar os atributos de uma classe públicos, pois isso ajuda a manter o encapsulamento e permite controlar a forma como os dados de um objeto são acessados e modificados. Quando um atributo é público, qualquer parte do programa pode alterar seu valor diretamente, sem nenhuma verificação, o que pode causar dados inválidos ou comprometer a integridade do objeto. Como já foi citado em sala, em POO existe o conceito de mínimo acesso, em que uma instância do código deve ter acesso apenas à parte necessária, e nada além disso. Dessa forma, com getters e setters, o acesso aos atributos é realizado por meio de métodos, permitindo definir regras para consultar ou alterar seus valores. Assim, a classe consegue proteger seus dados e garantir que determinadas condições sejam respeitadas.

Por exemplo, considere uma classe Conta que possui um atributo saldo. Se esse atributo fosse público, seria possível alterar seu valor diretamente, inclusive atribuindo um valor negativo, como conta.saldo = -500. Utilizando um setter, podemos verificar o valor antes de realizar a alteração e impedir que o saldo receba valores inválidos.

Exemplo:

public class Conta {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("O saldo não pode ser negativo.");
        }
    }
}

Nesse caso, o setter setSaldo() controla a alteração do atributo e impede que o objeto receba um saldo negativo. Dessa forma, o encapsulamento ajuda a preservar a integridade dos dados da classe.

--------------------------------------------------------------------------------------------

02 - Considere que você está modelando um sistema de controle de biblioteca.
Responda:
a) Quais informações você considera relevantes para representar um livro em um sistema?
Algumas informações importantes seriam:
código;
título;
autor;
ano de publicação;
editora;
quantidade de páginas;
gênero;
quantidade disponível no estoque da biblioteca;
situação do livro (disponível ou emprestado).

b) Por que podemos dizer que uma classe Livro seria uma abstração no seu código?
A classe Livro é uma abstração porque representa, no código, apenas as características e comportamentos de um livro que são relevantes para o sistema da biblioteca. Detalhes do livro físico que não importam para o sistema, como cor da capa, peso ou tipo de papel, são deixados de lado. Em contrapartida, são mantidos atributos como título, autor, código e disponibilidade, e comportamentos como emprestar e devolver. Assim, a classe funciona como um modelo simplificado que esconde a complexidade do objeto real e expõe só o necessário.


c) Liste ao menos 3 métodos que fariam sentido existir nessa classe.
Alguns métodos que fariam sentido na classe Livro são: emprestar(), que altera a situação do livro para indisponível; devolver(), que o torna disponível novamente; e estaDisponivel(), que informa se o livro pode ser emprestado. Também seriam úteis exibirInfo(), para mostrar os dados do livro, e getters como getTitulo() e getAutor(), para acessar as informações de forma controlada.