public class NinjaAvancado extends Ninja{

    String jutsuEspecial;

    public NinjaAvancado(String jutsuEspecial) {
        this.jutsuEspecial = jutsuEspecial;
    }

    public NinjaAvancado(String nome, int idade, Aldeia aldeia, Rank rank, String justuEspecial) {
        super(nome, idade, aldeia, rank);
        this.jutsuEspecial = jutsuEspecial;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println(this.toString());
        System.out.println("Jutsu Especial: " + jutsuEspecial);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nJutsu Especial: " + jutsuEspecial;
    }

}
