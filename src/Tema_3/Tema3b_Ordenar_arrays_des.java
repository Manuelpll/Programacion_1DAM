package Tema_3;
/**
 * Cremos un programa que nos ordena un array de forma descendente
 *
 */
public class Tema3b_Ordenar_arrays_des {
    public static int[] bubblesort(int [] numbers){
        boolean swapped = true;
        int temp;
        for(int i=numbers.length-1;i>0 &&swapped;i--){
            swapped=false;
            for(int j=0;j<i;j++){
                if(numbers[j]<numbers[j+1]){
                    temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                    swapped=true;
                }//Fin del if
            }//Fin segundo for
        }//FIN primer for

        return numbers;
    }//Fin del método publico
    //Creamos un metodo para imprimir el array

    static void imprimirArrayUni(int a[],int length){
        System.out.println("El resultado es:[");
        for(int i=0;i<length;i++){
            System.out.print(a[i]+",");
        }//Fin del for
        System.out.print("]");
    }//Fin del metodo de imprimir
    public static int[] bubbleSort2des(int[] numbers){
        boolean swappwed =true;
        int i=0,temp;
        int j= numbers.length-1;
        while(i<j &&swappwed){
            swappwed=false;
            for(int k=i;k<j;k++){
                if(numbers[k]<numbers[k+1]){
                    temp= numbers[k];
                    numbers[k]=numbers[k+1];
                    numbers[k+1]=temp;
                    swappwed=true;
                }//Fin del if
            }//Fin del 1er for
            j--;
            if(swappwed){
                swappwed=false;
                for(int k=j;k>i;k--){
                    if(numbers[k]>numbers[k-1]){
                        temp=numbers[k];
                        numbers[k]=numbers[k-1];
                        numbers[k-1]=temp;
                        swappwed=true;
                    }//Fin segundo if
                }//Fin del 2º For
            }
        }//Fin del while
        return numbers;
    }//Fin proceso mejorado
    public static void main(String[] args) {
        int[] array ={10,1,5,40,12,34,44,12,11,9};
        int[] array2 ={10,1,5,40,12,34,44,12,11,9};
        int longitud=array.length;
        int longitud2=array2.length;
        bubblesort(array);
        imprimirArrayUni(array,longitud);
        System.out.println("Version mejorada");
        bubbleSort2des(array2);
        imprimirArrayUni(array2,longitud2);
    }//Fin del main
}//Fin del class
