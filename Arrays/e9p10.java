import java.io.*;
public class e9p10 {


// Asignem el nombre maxim d'alumnes del curs.

        final static int MAX=50;
        public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        int notas[];
        notas = new int[MAX+1];
        String linia;
        int numero;
        int correcio;
        int nota2;
        

//Preguntem el numero de alumnes.
     
        System.out.println("Introdueix el numero de alumnes (maxim 50): ");
        linia = reader.readLine();
        numero = Integer.parseInt(linia);

    while ((numero>=MAX+1) || (numero<=0)){
            System.out.println("Error ! El numero que has introduit es mayor o menor de 50. Torna a introduir el numero: ");
            linia = reader.readLine();
            numero = Integer.parseInt(linia);
        }

//Pregunta les notes
        
    for (i=1;i<=numero;i=i+1){
        System.out.println("Introdueix la nota: ");
        linia = reader.readLine();
        notas[i] = Integer.parseInt(linia);
        }

    System.out.println("Inicials");
// Notas Inicials.

        for (i=1;i<numero+1;i++){
            System.out.print("("+i+")"+notas[i]+",");
            }
        
// Insersio de notas.
        System.out.println("");
        System.out.println("En quina posicio vols inserir la nota ?");
        linia = reader.readLine();
        correcio = Integer.parseInt(linia);
        
        System.out.println("Quina es la nota");
        linia = reader.readLine();
        nota2 = Integer.parseInt(linia);

        
        for (i=numero;i>=correcio;i--){
            notas[i+1] = notas[i];
            }
        
        notas[correcio] = nota2;
        numero++;
        for (i=1;i<numero+1;i++){
            System.out.print("("+i+")"+notas[i]+",");    
    }
        }
        }
