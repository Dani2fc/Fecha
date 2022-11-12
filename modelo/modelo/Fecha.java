package modelo;

public class Fecha{
    // -----------------
    // Atributos
    // -----------------
    private int dia;
    private int mes;
    private int year;
    private int dias;
    private int diasA = 0;
    private String x;

    // -----------------
    // Métodos
    // -----------------

    // Método constructor
    public Fecha(int d, int m, int y){
        this.dia = d;
        this.mes = m;
        this.year = y;
    }

    // Constructor sin parámetros
    public Fecha(){
        this.dia = 0;
        this.mes = 0;
        this.year = 0;
    }

    // Constructor con parámetro String d/m/a
    public Fecha(String s){
        // Con ayuda de indexOf buscamos los /
        int posDia = s.indexOf("/");
        int posMes = s.lastIndexOf("/");
        // Extraemos los datos reduciendo la cadena a strings pequeños para poder usar Integer.parseInt
        String sDia = s.substring(0, posDia);
        dia = Integer.parseInt(sDia);
        String sMes = s.substring((posDia + 1), posMes);
        mes = Integer.parseInt(sMes);
        String sYear = s.substring(posMes + 1);
        year = Integer.parseInt(sYear);
    }

    // Método para convertir fechas a días (1 año = 360 días)
    private int fechaToDias(){
        if(mes == 1){
            dias = dia;
        }else if(mes == 2){
            dias = (dia + 30);
        }else if(mes == 3){
            dias = (dia + 60);
        }else if(mes == 4){
            dias = (dia + 90);
        }else if(mes == 5){
            dias = (dia + 120);
        }else if(mes == 6){
            dias = (dia + 150);
        }else if(mes == 7){
            dias = (dia + 180);
        }else if(mes == 8){
            dias = (dia + 210);
        }else if(mes == 9){
            dias = (dia + 240);
        }else if(mes == 10){
            dias = (dia + 270);
        }else if(mes == 11){
            dias = (dia + 300);
        }else{
            dias = (dia + 330);
        }
        return dias;
    }

    // Método para convertir los días a una fecha
    private String diasToFecha(){
        if(dias < 30){
            x = dia + "/ 1";
        }else if(dias > 30 & dias < 60){
            x = dia + "/ 2";
        }else if(dias > 60 & dias < 90){
            x = dia + "/ 3";
        }else if(dias > 90 & dias < 120){
            x = dia + "/ 4";
        }else if(dias > 120 & dias < 150){
            x = dia + "/ 5";
        }else if(dias > 150 & dias < 180){
            x = dia + "/ 6";
        }else if(dias > 180 & dias < 210){
            x = dia + "/ 7";
        }else if(dias > 210 & dias < 240){
            x = dia + "/ 8";
        }else if(dias > 240 & dias < 270){
            x = dia + "/ 9";
        }else if(dias > 270 & dias < 300){
            x = dia + "/ 10";
        }else if(dias > 300 & dias < 330){
            x = dia + "/ 11";
        }else{
            x = dia + "/ 12";
        }

        if(dias > 360){
            year = year + 1;
        }else{
            year = year + 0;
        }

        return x + "/"+ year;
    }

    // Método para adicionar días a una fecha
    public String addDias(int d){
        this.diasA = d;
        int y = getMes();
        y = fechaToDias();
        d = d + y;
        return diasToFecha();
    }

    // Métodos de acceso (setter and getter)
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // Método sobreescrito de la clase Object
    public String toString(){
        return dia + "/"+ mes+ "/"+ year;
    }

    public boolean equals(Object o){
        Fecha otra = (Fecha)o;
        return (dia==otra.dia) && (mes==otra.mes) && (year==otra.year);
    }
}