package ejecutable;

import modelo.Fecha;

public class Test {
    public static void main(String[] args) {
        Fecha f = new Fecha(2,11,1970);

        Fecha f2 = new Fecha(2,10,1970);

        Fecha f3 = new Fecha("10/11/2022");

        System.out.println("Día: "+ f.getDia());
        System.out.println("Mes: "+ f.getMes());
        System.out.println("Año: "+ f.getYear());
        System.out.println(f);
        System.out.println("Día: "+ f2.getDia());
        System.out.println("Mes: "+ f2.getMes());
        System.out.println("Año: "+ f2.getYear());
        System.out.println(f2);
        System.out.println(f3);

        if(f.equals(f2)){
            System.out.println("Las fechas son iguales");
        }else{
            System.out.println("Las fechas no son iguales");
        }
    }
}