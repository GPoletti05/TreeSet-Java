import java.util.Comparator;

public class Ordena implements Comparator<Musica>{

	@Override
	public int compare(Musica musica1, Musica musica2 ) {
		return musica1.getTitulo().compareToIgnoreCase(musica2.getTitulo());
	}

}