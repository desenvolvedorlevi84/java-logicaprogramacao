public class ExemploOperadoresComparativoseLogicos { 
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        // operaçoes de comparações !!
        System.out.println("== Operações de Comparações ==");
        System.out.println(x == y); // true or false???
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println("== Operações Logicas ==");
        boolean a = true;
        System.out.println(a && true && 3 < 8);
        boolean vaiTerAula;
        boolean diaSemana = true;
        boolean feriado = false;
        vaiTerAula = diaSemana && !feriado;
        System.out.println(vaiTerAula);
    }
}