public class Szkola {
    //singleton
    //prywatny konstruktor
    private String nazwa;
    private static Szkola szkola ;
    private Szkola(String nazwa){
        this.nazwa =nazwa;
    }
    public static Szkola getSzkola(String nazwa){
        if(Szkola.szkola == null) {
            szkola =  new Szkola(nazwa);
        }
            return szkola;
    }

}
