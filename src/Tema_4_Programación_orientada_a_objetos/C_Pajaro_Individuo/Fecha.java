package Tema_4_Programación_orientada_a_objetos.C_Pajaro_Individuo;

/**
 * Subclase de Individuo con verificacion de fecha,comprobacion de bisiesto y modificacion de fecha
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año = 0;

    public Fecha() {

    }//Fin 1ºconstructor

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void setDia(int d) {
        dia = d;
    }

    public void setMes(int m) {
        mes = m;
    }

    public void setAño(int a) {
        año = a;
    }

    //Fin setters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
    //Fin getters

    //Metodos
    public boolean fechaCorrecta() {
        boolean verificacion = false;
        if (año % 4 == 0 && año % 100 != 0 || (año % 400 == 0)) {
            if (mes == 2) {
                if (dia <= 29&&dia>=1) {
                    verificacion = true;
                    System.out.println("Fecha valida");
                } else {
                    verificacion = false;
                    System.out.println("Fecha imposible");
                }//Fin del tercer if de comprovacion de febrero bisiesto
            } else if (mes == 4 | mes == 6 | mes == 9 || mes == 11) {
                if (dia <= 30&&dia>=1) {
                    verificacion = true;
                    System.out.println("Fecha valida");
                } else {
                    verificacion = false;
                    System.out.println("Fecha imposible");
                }//Fin del tercer if de comprovacion de meses con 30 días
            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia <= 31&& dia>=1) {
                    verificacion = true;
                    System.out.println("Fecha valida");
                } else {
                    verificacion = false;
                    System.out.println("Fecha imposible");
                }//Fin del tercer if de comprovacion de meses con 31 días
            } else {
                System.out.println("Fecha imposible");
            }//Fin del else de meses imposibles
        } else {
            if (mes == 2) {
                if (dia <= 28&&dia>=1) {
                    verificacion = true;
                    System.out.println("Fecha valida");
                } else {
                    verificacion = false;
                    System.out.println("Fecha imposible");
                }//Fin del tercer if de comprovacion de febrero
            } else if (mes == 4 | mes == 6 | mes == 9 || mes == 11) {
                if (dia <= 30&&dia>=1) {
                    verificacion = true;
                    System.out.println("Fecha valida");
                } else {
                    verificacion = false;
                    System.out.println("Fecha imposible");
                }//Fin del tercer if de comprovacion de meses con 30 días
            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia <= 31&&dia>=1) {
                    verificacion = true;
                    System.out.println("Fecha valida");
                } else {
                    verificacion = false;
                    System.out.println("Fecha imposible");
                }//Fin del tercer if de comprovacion de meses con 31 días
            }//Fin del else de mes de 31 dias
        }//Fin del else de año normal
        return verificacion; }//Fin de fechaCorrecta
        public static boolean esBisiesto ( int año ){
            return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
        }//Fin de esBisiesto


    public void diaSiguiente() {
        if (dia < 28 || (dia == 28 && mes == 2 && !(año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) || (dia == 29 && mes == 2 && (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0))) {
            dia++;
        } else if ((dia == 28 && mes == 2 && (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) || dia == 29 || dia == 30) {
            dia = 1;
            if (mes == 12) {
                mes = 1;
                año++;
            } else {
                mes++;
            }//Fin del primer else del segundo if
        } else if (dia == 31) {
            dia = 1;
            if (mes == 12) {
                mes = 1;
                año++;
            } else {
                mes++;
            }//Fin del   primer else del tercer if
        }//Fin del  segundo else-if
    }//Fin de diaSiguiente
    public void formateoFecha(){
        System.out.println(dia+"/"+mes+"/"+año);
    }//Fin de formateoFecha
}//Fin de la clase