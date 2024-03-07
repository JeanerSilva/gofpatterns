package src.main.java.singleton.singletonbasic;

public class Teste {
    
    public static void main (String[] args) {
       Singleton s1 = Singleton.getInstance("dado original");    
       Singleton s2 = Singleton.getInstance("Novo dado");    
       System.out.println(s2 == s1 ? "Criada apenas uma instância" : "Criadas mais de uma instância");

    }
}
