public class Ejemplo {
    public static void main(String[] args) {
        reemplazaCadena();
        System.out.println("\n----------------\n");
        region();
        System.out.println("\n----------------\n");
        divideCadenas("Java#HTML#Perl","#",0);
        System.out.println("\n----------------\n");
        ejemplosPosOcurrencia("Welcome to Java");
        System.out.println("\n----------------\n");
        pruebaStringBuilder();
    }

    public static void reemplazaCadena(){
        String cadena = "Estamos dando clase de Java curso 2022 por la tarde, en el tema de expresiones regulares de Java";
        String nuevaCadena = cadena.replace("Java","JAVA");
        System.out.println(nuevaCadena);
        System.out.println(nuevaCadena.replace("a","A"));
        System.out.println(cadena.replaceFirst("a","A"));
        System.out.println(cadena.replaceFirst("\\d","Y"));
        System.out.println(cadena.replaceAll("\\d","x"));

        String otra = "sb45daba56";
        // String expReg1 = "\\d";
        String expReg1 = "[0-9]";
        // String expReg2 = "5[\\d\\w]";
        String expReg2 = "5[a-zA-Z0-9]";
        System.out.println(otra.replaceAll(expReg1,"H"));
        System.out.println(otra.replaceAll(expReg2,"T"));
    }

    public static void region(){
        String cadena = "Estamos en programacion 2022";
        int posIndiceEnCadena = cadena.indexOf("programacion");
        System.out.println("Valor devuelto: "+cadena.regionMatches(posIndiceEnCadena,"programaciones",0,"programacion".length()));
        System.out.println("Valor devuelto: "+cadena.regionMatches(posIndiceEnCadena,"Programacion",0,"programacion".length()));
        System.out.println("Valor devuelto: "+cadena.regionMatches(true, posIndiceEnCadena,"Programaciones",0,"programacion".length()));
    }

    /*
    split() con un segundo argumento:
        0 -> tantos como pueda
        1 -> divide en 1 grupo
        2 -> divide en 2 grupos a partir del separador
        3.. -> divide en 3.. grupos a partir del separador
     */

    public static void divideCadenas(String cadena, String patron, int num){
        String[] tokens = cadena.split(patron,num);
        for (String s: tokens)
            System.out.println(s);
        String s = "ab12bktdk12c89";
        String expReg1 = "12[b|c]";
        String[] t = s.split(expReg1,0);
        for (String e:t)
            System.out.println(e);
    }

    public static void ejemplosPosOcurrencia(String cadena){
        System.out.println("La W se encuentra en la posicion "+cadena.indexOf("W"));
        System.out.println("La O se encuentra en la posicion "+cadena.indexOf("O"));
        System.out.println("La O a partir de 5 posiciones, se encuentra en la posicion "+cadena.indexOf("o",5));
        System.out.println("La cadena come se encuentra en la posicion "+cadena.indexOf("come"));
        System.out.println("La cadena Java se encuentra en la posicion "+cadena.indexOf("Java"));
        System.out.println("La cadena Java a partir del indice 2, se encuentra en la posicion "+cadena.indexOf("Java",2));
        System.out.println("La cadena Java a partir del indice 12, se encuentra en la posicion "+cadena.indexOf("Java",12));
        System.out.println("La ocurrencia de la O, anterior al indice, se encuentra en la posicion "+cadena.lastIndexOf("o"));
        System.out.println("La ocurrencia de la O, anterior al indice, se encuentra en la posicion "+cadena.lastIndexOf("o",5));
        System.out.println("La ocurrencia de la O, anterior al indice, se encuentra en la posicion "+cadena.lastIndexOf("o",3));
        System.out.println("La ocurrencia de cont, se encuentra en la posicion "+cadena.lastIndexOf("come"));
        System.out.println("La ocurrencia de Java, anterior a la posiciones 5 es "+cadena.lastIndexOf("Java",5));
    }

    public static void pruebaStringBuilder(){
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder(20);
        System.out.println("La capacidad es de "+stringBuilder1.capacity());
        StringBuilder stringBuilder2 = new StringBuilder("Hola");

        stringBuilder.append("Inserto cadena");
        stringBuilder1.append("Inserto en uno de tamaño 20");
        System.out.println("La nueva capcidad es de "+stringBuilder1.capacity());
        stringBuilder2.append(" que tal estas");

        System.out.println(stringBuilder);
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);

        stringBuilder2.insert(4,", como te llamas,");
        System.out.println(stringBuilder2);
        stringBuilder2.delete(6,22);
        System.out.println(stringBuilder2);
        stringBuilder2.deleteCharAt(4);
        System.out.println(stringBuilder2);
        stringBuilder2.reverse();
        System.out.println(stringBuilder2);
        stringBuilder2.reverse().replace(5,12,"como");
        System.out.println(stringBuilder2);
        stringBuilder2.setCharAt(0,'h');
        System.out.println(stringBuilder2);
    }
}
