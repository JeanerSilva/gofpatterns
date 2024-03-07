package src.main.java.singleton.singletonbasic;

public class Singleton {
    
    private String data;
    private static Singleton instance;

    private Singleton (String data){
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        if (instance == null){
            instance = new Singleton(data);
        }
        
        return instance;
    }

    public String getData() {
        return this.data;
    }

}
