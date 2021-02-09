import java.util.Scanner;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.List;

public class Principal {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int op;
		boolean temLista;
		String musicaComp;
		
		TreeSet<Musica> inf = new TreeSet<>(new Ordena());
		List<Musica> lista = null;
		
		do{
			System.out.println("1 - Adicionar uma musica\n2 - Imprimir todas as musicas\n3 - Imprimir depois de uma musica\n4 - Imprimir antes de uma musica\n0 - Sair");
			
			System.out.print("\nEscolha uma opcao: ");
			op = sc.nextInt();
			sc.nextLine();
			
			switch(op){
			
			case 1:
				System.out.print("Nome do titulo: ");
				String nome = sc.nextLine();
				System.out.print("Nome do artista: ");
				String artista = sc.nextLine();
				System.out.println("");
				Musica addMusica = new Musica(nome, artista);
				inf.add(addMusica);
				lista = new LinkedList<>(inf);
			break;
			case 2:
				for(int i = 0; i< lista.size(); i++) {
					System.out.printf("Musica: %s\nartista: %s\n\n", lista.get(i).getTitulo(),lista.get(i).getArtista());
				}
			break;
			case 3:
				temLista = false;
				System.out.print("Informe o nome da musica: ");
				musicaComp = sc.nextLine();
				for(int i = 0; i< lista.size(); i++) {
					if(temLista == true)
						System.out.printf("Musica: %s\nartista: %s\n\n", lista.get(i).getTitulo(),lista.get(i).getArtista());
					if(musicaComp.equals(lista.get(i).getTitulo()))
						temLista = true;
				}
			break;
			case 4:
				temLista = false;
				System.out.print("Informe o nome da musica: ");
				musicaComp = sc.nextLine();
				for(int i = 0; i< lista.size(); i++) {
					if(musicaComp.equals(lista.get(i).getTitulo()))
						temLista = true;
					if(temLista == false)
						System.out.printf("Musica %s\nartista: %s\n\n", lista.get(i).getTitulo(),lista.get(i).getArtista());
				}
			break;
			case 0:
				System.out.println("\nAté breve");
				break;
			default:
				System.out.println("\nOpção Inválida!");
				break;
			}
		}while(op != 0);
			
		sc.close();
	}
}