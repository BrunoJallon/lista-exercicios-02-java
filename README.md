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

