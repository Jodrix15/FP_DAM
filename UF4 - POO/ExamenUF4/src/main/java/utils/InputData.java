package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputData {

    public static BufferedReader scanner(String msj){
        System.out.print(msj);
        return new BufferedReader(new InputStreamReader(System.in));
    }


    public static String inputStrLine(String msj) {
        String line = "";
        try{
            line = scanner(msj).readLine().toLowerCase();
        }catch(IOException e){
            System.out.println("Error en entrada de datos");
        }
        return line;
    }

    public static int inputInt(String msj) {
        String num = inputStrLine(msj);
        return CastData.toInt(num);
    }

    public static double inputDouble(String msj){
        String num = inputStrLine(msj);
        return CastData.toDouble(num);
    }

}
