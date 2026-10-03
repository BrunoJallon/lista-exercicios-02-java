public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int estoque;

    public Produto(int codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.estoque = estoque;
        setPreco(preco); // o preço inicial passa pela mesma validação do setter
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido: não é permitido valor negativo.");
        }
    }

    public void exibirInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Estoque: " + estoque);
    }
}
