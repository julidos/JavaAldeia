public class NinjaBasico extends Ninja {

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, Aldeia aldeia, Rank rank) {
        super(nome, idade, aldeia, rank);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println(this.toString());
    }

}
