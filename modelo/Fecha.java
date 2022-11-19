package modelo;

public class Fecha{
    // -----------------
    // Atributos
    // -----------------
    protected int dia;
    protected int mes;
    protected int year;

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
    private int fechaToDias()
    {
        return year * 360 + mes * 30 + dia;
    }

    // Método para convertir los días a una fecha
    private void diasToFecha(int i)
    {
        year =(int)(i/360);
        mes = (int)(i%360/30);
        dia = (int)(i%30);
    }

    // Método para adicionar días a una fecha
    

    public void addDias(int d)
    {
        int sum = fechaToDias()+d;
        diasToFecha(sum);
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