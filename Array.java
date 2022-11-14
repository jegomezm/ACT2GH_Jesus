public class Array {
    public static void main (String[] args) {
    	final int NUMELEMENTOS = 20;
        final int RANGOINICIO = 1;
        final int RANGOFIN = 10;
        
        int[] numeros = new int[NUMELEMENTOS];
        for (int i = 0; i < NUMELEMENTOS; i++) {
          numeros[i] = (int)(Math.random() * (RANGOFIN - RANGOINICIO + 1) + RANGOINICIO);
          System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }    
}
