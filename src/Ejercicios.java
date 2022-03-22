
public class Ejercicios {

    public static void Ej1(String[] r) throws Exception {
        if(r.length!=2)
            throw new Exception("No hay 2 argumentos!!");
        String texto = r[0];
        String substring = r[1];
        int index = texto.indexOf(substring);
        String inicio = texto.substring(0,index);
        String fin = texto.substring(index+substring.length(),texto.length());

        System.out.println(inicio+fin);
    }

    public static void Ej2(String[] r) throws Exception{
        if(r.length!=2)
            throw new Exception("No hay 2 argumentos!!");
        String texto = r[1];
        String termina = r[2];
        System.out.println(texto+" termina en "+termina+" = "+termina.endsWith(termina));
    }

    public static void Ej3(String s){
        String[] e = s.split("");
        for (String r:e)
            System.out.println(r);
    }

    public static void Ej4(String s){
        String[] e = s.split("-");
        int[] i = new int[e.length];
        for(int c = 0; c < i.length; c++)
            i[c] = Integer.parseInt(e[c]);
        System.out.println((i[0]+i[1]));
    }

    public static void Ej5(String s){
        String[] e = s.split("-");
        int i = 0;
        for(int c = 0; c < e.length; c++)
            i += Integer.parseInt(e[c]);
        System.out.println(i);
    }

    public static void Ej6(){
        StringBuilder s = new StringBuilder("En un lugar cuyo nombre");
        s.insert(12,"de la Mancha, ");
        System.out.println(s);
        s.insert(s.indexOf("Mancha") + "Mancha".length() +2,"de ");
        System.out.println(s);
        s.append(" no quiero acordarme");
        System.out.println(s);
        s.replace(s.indexOf("Mancha"),s.indexOf("Mancha")+ "Mancha".length(),"");
        System.out.println(s);
        s.replace(s.indexOf("E"),s.indexOf("E")+1,"e");
        System.out.println(s);
        System.out.println(s.reverse());
        s.reverse();
        s.replace(s.indexOf("lugar"),s.indexOf("lugar")+ "lugar".length(),"sitio");
        System.out.println(s);
    }

    public static void Ej7(String s){
        StringBuilder s1 = new StringBuilder(s);
        if(s.equalsIgnoreCase(s1.reverse().toString()))
            System.out.println("Es un palindromo");
        else
            System.out.println("No es un palindromo");
    }

    public static void Ej8(){
        String s = "Estamos en clase de programacion en Java";
        System.out.println("clase = "+s.indexOf("clase"));
        System.out.println("Java = "+s.indexOf("Java"));
        System.out.println("en = "+s.lastIndexOf("en",23));
        System.out.println("a = "+s.indexOf("a",10));
    }
}