public class Rettangolo  extends  Forma {

    private double altezza;

    private double base;

    public Rettangolo(double altezza, double base) {

        super(TipoForma.Rettangolo);

                this.base = base;
        this.altezza = altezza
    }

    @Override
    public double calcoloArea() {
        return  base * altezza;
    }
}
