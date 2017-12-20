import java.io.*;
public class e1p9 {
       
        public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String linia;
        String nom;
		int numero;
        int nota;
        int i = 0;
        int suma = 0;
        int notamax = 0;
        int notabaj = 10;
        int notamedia;
        
        //Preguntem el numero de alumnes
        System.out.println("Hola aquest programa et fara automaticament la nota minima, maxima i mitjana.");
        System.out.println("Introdueix el numero de alumnes (maxim 35): ");
        linia = reader.readLine();
        numero = Integer.parseInt(linia);

	while ((numero>=50) || (numero<=0)){
			System.out.println("Error ! El numero que has introduit es mayor o menor de 50. Torna a introduir el numero: ");
			linia = reader.readLine();
			numero = Integer.parseInt(linia);
		}
	for (i=1;i<=numero;i=i+1){
		//Pregunta el nom
		System.out.println("Introdueix el nom: ");
		nom = reader.readLine();
		
		//Pregunta les notes
		System.out.println("Introdueix la nota: ");
		linia = reader.readLine();
		nota = Integer.parseInt(linia);
		suma=suma+nota;

		
		if (nota>=notamax){
			notamax=nota;
			}
		if (nota<=notabaj){
			notabaj=nota;
			}
         }
         notamedia = suma/numero;
         		
		System.out.println("La nota mes alta es " +notamax);  
		System.out.println("La nota mes baixa es " +notabaj);
		System.out.println( "La nota media es " +notamedia );

    }
}
