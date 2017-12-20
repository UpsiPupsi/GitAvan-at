
import java.io.*;
public class e5p10 {
 // Asignem el nombre maxim d'alumnes del curs
       
        final static int NOT=50;
        public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
 //Declarem les variables
 
        String linia;
        String nom;
        int numero;
        int nota[];
        nota = new int[NOT];
        int i = 0;
        int y = 0;
        int z = 0;
        int correcio = 0;
        int suma = 0;
        int notamax = 0;
        int notabaj = 10;
        float notamedia = 0;
       
        
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
    
        if (nota[i]>=notamax){
            notamax=nota[i];
            }
        if (nota[i]<=notabaj){
            notabaj=nota[i];
            }
         
         notamedia = (notamedia+nota[i])/numero;
                      }
         
        System.out.print("Inicial: ");
    for (y=1;y<=numero-1;y++){
        
        System.out.print(nota[y] +",");
}
        System.out.println(nota[numero]);
        
    System.out.println("Nota maxima " +notamax);  
    System.out.println("Nota minima " +notabaj);
    System.out.println("Media " +notamedia);
    
    System.out.println("Introdueix la posicio de la nota que vols canviar: ");
    linia = reader.readLine();
    correcio = Integer.parseInt(linia);
    
    System.out.println("Nota nueva ");
    linia = reader.readLine();
    z = Integer.parseInt(linia);
    
    nota[correcio]=z;
    
       notamax = 0;
       notabaj = 10;
       notamedia = 0;    
       
    for (i=1;i<=numero;i=i+1){
    
        if (nota[i]>=notamax){
            notamax=nota[i];
            }
        if (nota[i]<=notabaj){
            notabaj=nota[i];
            }
         
         notamedia = (notamedia+nota[i])/numero;
                      }
         
        System.out.print("Inicial: ");
    for (y=1;y<=numero-1;y++){
        
        System.out.print(nota[y] +",");
}
        System.out.println(nota[numero]);

    System.out.println("Nota maxima " +notamax);  
    System.out.println("Nota minima " +notabaj);
    System.out.println("Media " +notamedia);
}
}
