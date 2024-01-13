public class Triangolo  extends  Forma {

        private double altezza;

    private double base;

 public Triangolo ( double altezza, double base) {

   super(TipoForma.Triangolo);
   this.base = base;
   this.altezza = altezza;


 }

    @Override
    public double calcoloArea() {
        return  (base * altezza) / 2;
    }
}
