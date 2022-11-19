package modelo;

public class FechaDetallada extends Fecha{
    // Atributos
    String mesDetallado = "";
    String rta;
    int dias;

    // Constructor
    public FechaDetallada(int d, int m, int y){
        super(d,m,y);
    }

    // Métodos
    public void fechaCompleja(int m){
        dias = year * 360 + mes * 30 + dia;
        m = (int)(dias%360/30);
        if(m == 1){
            mesDetallado = " de Enero de ";
        }else if(m == 2){
            mesDetallado = " de Febrero de ";
        }else if(m == 3){
            mesDetallado = " de Marzo de ";
        }else if(m == 4){
            mesDetallado = " de Abril de ";
        }else if(m == 5){
            mesDetallado = " de Mayo de ";
        }else if(m == 6){
            mesDetallado = " de Junio de ";
        }else if(m == 7){
            mesDetallado = " de Julio de ";
        }else if(m == 8){
            mesDetallado = " de Agosto de ";
        }else if(m == 9){
            mesDetallado = " de Septiembre de ";
        }else if(m == 10){
            mesDetallado = " de Octubre de ";
        }else if(m == 11){
            mesDetallado = " de Noviembre de ";
        }else{
            mesDetallado = " de Diciembre de ";
        }
    }

    public String toString(){
        return dia + mesDetallado + year;
    }
}
