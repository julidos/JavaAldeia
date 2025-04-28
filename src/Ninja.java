public abstract class Ninja {
    protected static int contador = 0;
    protected int id;
    protected String nome;
    protected int idade;
    protected Aldeia aldeia;
    protected Rank rank;

    public Ninja() {
    }

    public Ninja(String nome, int idade, Aldeia aldeia, Rank rank) {
        this.id = ++contador;
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public abstract void mostrarInformacoes();

    @Override
    public String toString() {
        return "ID: " + id +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nAldeia: " + aldeia +
                "\nRank: " + rank;
    }

}
