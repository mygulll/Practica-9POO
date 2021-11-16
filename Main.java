import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) {
        BufferedReader br = null;
        int[] numeros = new int[21];
        String[] numeross = new String[21];
        ArrayList <String> num = new ArrayList<>();

        //Inicio de lectura
        try {
            br =new BufferedReader(new FileReader("practica9.csv"));
            String line = br.readLine();
            while (null!=line) {
                String [] fields = line.split(",");
                //System.out.println(Arrays.toString(fields));

                for (int i = 0; i < 20; i++) {
                    numeross[i] = fields[i];
                    num.add(fields[i]);
                }

                line = br.readLine();
            }

        } catch (Exception e) {
            System.out.println("Error al abrir ");
        } finally {
            try{
                if(br != null) {
                    br.close();
                }
            }
            catch (Exception e){
                System.out.println("Error al cerrar el archivo");
            }
        }
        //Fin de lectura
        //System.out.println(numeross[0]);
        //String str = numeross[0];

//Desconozco cual sea la razon por la cual no permite el paso de STRING a Integer.
        //System.out.println(Integer.parseInt(num.get(0)));

        for (int i = 0; i < numeross.length-1; i++) {
            System.out.println(numeross[i]+" ");
        }



    }



}

class Alumno{
    String nombre;
    int Matricula;
    int[] calificaciones;
    float promedio;


}
