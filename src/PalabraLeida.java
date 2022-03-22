public class PalabraLeida {
    private String s;

    public PalabraLeida(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }

    public int numeroDeLetras(){
        return s.length();
    }

    public boolean empiezaPorVocal(){
        return esVocal(s.charAt(0));
    }

    public boolean acabaEnVocal(){
        return esVocal(s.charAt(s.length()-1));
    }

    private boolean esVocal(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int numeroDeVocales(){
        int num = 0;
        for (int i = 0; i < s.length(); i++)
            if(esVocal(s.charAt(i)))
                num++;
        return num;
    }

    public boolean contieneE(){
        for (int i = 0; i < s.length(); i++)
            if(Character.toLowerCase(s.charAt(i)) == 'e')
                return true;
        return false;
    }
}
