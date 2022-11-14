public class Array {
    public static void main (String[] args) {
    	final int NUMELEMENTOS = 30;
      final int RANGOINICIO = 1;
      final int RANGOFIN = 10;
        
        int[] numeros = new int[NUMELEMENTOS];
        for (int i = 0; i < NUMELEMENTOS; i++) {
          numeros[i] = (int)(Math.random() * (RANGOFIN - RANGOINICIO + 1) + RANGOINICIO);
          System.out.print(numeros[i] + " ");
        }
        System.out.println();
        int[] count = new int[RANGOFIN + 1];
        for (int i = 0; i < NUMELEMENTOS; i++) {
          count[numeros[i]]++;
        }
        for (int i = RANGOINICIO; i <= RANGOFIN; i++) {
          System.out.println(i + " aparece " + count[i] + " veces");
        }
    }    
}
