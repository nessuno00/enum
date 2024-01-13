public class Main {
    public static void main(String[] args) {


        Triangolo triangolo = new Triangolo(12, 8);

        Rettangolo rettangolo = new Rettangolo(15, 6);


        System.out.println("L'area del rettangolo è : " + rettangolo.calcoloArea());
        System.out.println("L'area del trinangolo è : " + triangolo.calcoloArea());

        System.out.println("Tipo di forma del triangolo : " + triangolo.getTipoForma());
        System.out.println("Tipo di forma del rettangolo : " + rettangolo.getTipoForma());

    }


    }