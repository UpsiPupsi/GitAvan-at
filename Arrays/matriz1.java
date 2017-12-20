import java.io.*; 
public class matriz1 {
    public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	int i;
	int y;
	int z;
	int j;
	j= 1;
	int matriz[][];
	matriz = new int[5][4];
		for (i=0;i<5;i++){
			i=i++;
		
			for (y=0;y < 4;y++){ 
				matriz[i][y] = j++;
				System.out.print(matriz[i][y]+"\t");
				}
				System.out.print("\n");
				}
	
    }
}

