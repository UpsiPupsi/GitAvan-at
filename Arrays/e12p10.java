import java.io.*;

public class e12p10 {


// Asignem el nombre maxim d'alumnes del curs
        final static int MAX=50;
        public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
               
        int i;
		int A;
		int B;
		int C;
        int X[];
        X = new int[MAX];
        int Y[];
        Y = new int[MAX];
        int Z[];
        Z = new int[MAX];
        String linia;
        
        System.out.println("Ara sumarem dos arrays ");
        
        //Introduccio del primer valor.
        
        System.out.println("Introdueix el primer valor");
        linia = reader.readLine();
        A = Integer.parseInt(linia);
       
        for (i=0;i<=10;i++){ 
			A=A+1;
			X[i]=A;
		}
	
	
        // Introduccio del segon valor.
       
        System.out.println("\nIntrodueix el segon valor");
        linia = reader.readLine();
        B = Integer.parseInt(linia);
        
       for (i=0;i<=10;i++){ 
			B=B+1;
			Y[i]=B;
		}
		 for (i=0;i<=10;i++){ 
			Z[i] = X[i]+Y[i];

		}
		
		// Mostrem les dos arrays.
		System.out.print("[1] = ");
		for (i=0;i<=9;i++){
			System.out.print(X[i]+", ");
		}
		System.out.println(X[10]);

		System.out.print("\n[2] = ");
		for (i=0;i<=9;i++){
			System.out.print(Y[i]+", ");
		}
		System.out.println(Y[10]);
		// Fem la operació.
		
			System.out.print("\n[1+2] = ");
		for (i=0;i<=9;i++){
			System.out.print(Z[i]+", ");
		}
       System.out.println(Z[10]);
}
}
