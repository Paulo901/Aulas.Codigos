package Exceptions;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        
        
        try {
        metodo1();
        
        } catch(ArithmeticException | NullPointerException em){
        	em.getMessage();
        	System.out.println(em.getMessage());
        	
        }
        
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        throw new ArithmeticException("Mensagem Aleatória");
        /*
         Comentando para não dar erro de compilação
         
        System.out.println("Fim do metodo2");
        
        */
    }
}
