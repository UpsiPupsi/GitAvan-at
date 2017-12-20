import java.io.*;
public class e2p10 {
        final static int NOT=50;
        public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String linia;
        String nom;
		int numero;
        int nota[];
        nota = new int[NOT];
        int i = 0;
        int suma = 0;
        int notamax = 0;
        int notabaj = 10;
        float notamedia;
        
        //Preguntem el numero de alumnes
        System.out.println("Hola aquest programa et fara automaticament la nota minima, maxima i mitjana.");
        System.out.println("Introdueix el numero de alumnes (maxim 50): ");
        linia = reader.readLine();
        numero = Integer.parseInt(linia);

	while ((numero>=NOT) || (numero<=0)){
			System.out.println("Error ! El numero que has introduit es mayor o menor de 50. Torna a introduir el numero: ");
			linia = reader.readLine();
			numero = Integer.parseInt(linia);
		}
	for (i=1;i<=numero;i=i+1){
	
	 	//Pregunta les notes
		System.out.println("Introdueix la nota: ");
		linia = reader.readLine();
		nota[i] = Integer.parseInt(linia);
		suma=suma+nota[i];

		
		if (nota[i]>=notamax){
			notamax=nota[i];
			}
		if (nota[i]<=notabaj){
			notabaj=nota[i];
			}
         }
         notamedia = suma/numero;
         		
		System.out.print(notamax +", ");  
		System.out.print(notabaj +", ");
		System.out.print(notamedia +", ");

    }
}
