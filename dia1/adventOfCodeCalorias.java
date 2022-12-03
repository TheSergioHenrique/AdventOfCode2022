import java.io.*;

public class adventOfCodeCalorias {
	//passo1-lerArquivo.
	public static void main (String[] args) throws exception, IOException{
		// Passando o arquivo de leitura como parametro.
		File file = new File("D:\\JavaCodigos\\AdventOfCode\\src\\inputElfos.txt");
		//criando um buffered reader para ler o arquivo.
		BufferedReader br = new BufferedReader(new FileReader(file));
		//criando uma variavel string.
		String listao;
		
		int calorias = 0;
		int temMaisCalorias=0;
		// Condiçao sempre é true até um caractere aparecer na String.
		while ((listao = br.readLine()) != null)
			
		
	//passo2-Separar os espaços vazios. 
		for(String dividir : listao.split("\n")) {
			String stringCalorias = dividir.trim(); 
			//System.out.println(stringCalorias);
			if(stringCalorias.isBlank()) {
				if(calorias>temMaisCalorias) {
					temMaisCalorias= calorias;
				}
				calorias=0;
				continue;				
			}
			calorias += Integer.parseInt(stringCalorias);
		}
		System.out.println(temMaisCalorias);
	}
}
