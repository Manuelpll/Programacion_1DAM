package Programas_hecho_para_practicar.Otras_Posibles_Opciones_a_actividades_de_Clase;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    //Constructor por defecto
    public Fecha () {

    }
    //Constructor por parametros
    public Fecha (int dia, int mes, int año) {
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
    //SET y GET

    public void setDia(int d) {
        this.dia = d;
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int m) {
        this.mes = m;
    }

    public int getMes() {
        return mes;
    }

    public void setAño(int a) {
        this.año = a;
    }

    public int getAño() {
        return año;
    }
    //Metodo comprobar fecha correcta
    public boolean fechaCorrecta () {
        boolean diaCorrecto, mesCorrecto,añoCorrecto;
        añoCorrecto=año>0;
        mesCorrecto=mes >=1 && mes <=12;

        switch(mes) {
            case 2:
                if (esBisiesto()) {
                    diaCorrecto=dia>=1 && dia <= 29;
                }
                else {
                    diaCorrecto=dia >=1 && dia <=28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto=dia>=1 && dia <=30;
                break;
            default:
                diaCorrecto=dia>=1 && dia <=31;
        }//Fin switch
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }
    //Metodo comprobar si el año es bisiesto
    private boolean esBisiesto () {
        return(año%4==0 && año %100 !=0 || año % 400==0);
    }
    //Metodo que modifica la fecha actual y la cambia por el dia siguiente.
    public void diaSiguiente () {
        dia++;
        if (!fechaCorrecta()) {
            dia=1;
            mes++;
            if (!fechaCorrecta()) {
                mes=1;
                año++;
            }
        }
    }//Fin metodo diaSiguiente
}//Fin clase
