package Programas_hecho_para_practicar;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Prueba_con_libreria_joda_time {
    public static void main(String[] args) {
            System.out.println("Fecha del Día de Hoy ----->" +LocalDate.now());
        System.out.println("Hora Actual-------------------->"+LocalTime.now());
        System.out.println("Fecha y Hora Actual ----------->"+LocalDateTime.now());
        System.out.println("El momento actual ------------->"+Instant.now());

        //Uso de off
        System.out.println("Fecha de mi cumpleaños -->" +LocalDate.of(2004,Month.OCTOBER,31));
        System.out.println("Hora exacta ------------>"+LocalDateTime.of(1990,Month.DECEMBER,24,20,
                01,15,0017));
        //Provocando un error
        System.out.println("Periodo Bisiesto de 2019 "+LocalDate.of(2020,Month.FEBRUARY,29));

        System.out.println("Dia Actual  ...:"+LocalDate.now().getDayOfMonth());
        System.out.println("Mes actual  ...:"+LocalDate.now().getMonth()+" "+LocalDate.now().getMonthValue());
        System.out.println("Año Actual ....:"+LocalDate.now().getYear());

        /*la clase LocalDate tiene los siguientes métodos:

        plusDays()/ minusDays() --> Sumar o restar días a una fecha dada

        plusWeek()/ minusWeek() --> Sumar o restar semanas a una fecha dada

        plusMoths() / minusMoths() --> Sumar o restar meses a una fecha dada

        plusYears() / minusYears() ---> Sumar o restar años a una fecha dada

         */
        System.out.println("La fecha dentro de 2 días .......:"+LocalDate.now().plusDays(2));
        System.out.println("La fecha y hora de hace 48 horas.:"+LocalDateTime.now().minusHours(48));


        //TemporalAdjuster

        System.out.println("El primer día del Próximo mes es -->"+
                LocalDate.now().with(
                        TemporalAdjusters.firstDayOfNextMonth())
                        .getDayOfWeek());

        //Tiempo trasncurrido entre fechas y horas

        LocalDate fechaNacimiento=LocalDate.of(2004,Month.OCTOBER,31);

        System.out.println("La edad que tienes en Años es de "+
                ChronoUnit.YEARS.between(fechaNacimiento,LocalDate.now()));

        // Si queremos determinar cuanto falta para el fin de Año
        LocalDate hoy =LocalDate.now();
        LocalDate finAnio = hoy.with(TemporalAdjusters.lastDayOfYear());
        Period hastafindeAnio =hoy.until(finAnio);
        int meses = finAnio.getMonthValue();
        int dias= hastafindeAnio.getDays();
        System.out.println("Faltan "+meses+" Meses "+dias+" días hasta final de año");

        //Parseado de fechas

        LocalDate fechaDeHoy = LocalDate.parse("2024-09-01");
        LocalDate sietedeOtubre =LocalDate.parse("07/10/2024",
                DateTimeFormatter.ofPattern("d/M/yyyy"));
        System.out.println("Fecha de Hoy *****>"+fechaDeHoy);
        System.out.println("Otra fecha *******>"+sietedeOtubre);

    }
}
