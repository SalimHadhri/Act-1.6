package Streamingmusique;

public class MusiqueImpl implements Musique{

	
	
	private String titre ;
	private String autheur;
	private String interprete ;
	private String genre ;
	
	

	public MusiqueImpl() {
	}

	
	public MusiqueImpl(String titre, String autheur, String interprete, String genre) {
		this.titre = titre;
		this.autheur = autheur;
		this.interprete = interprete;
		this.genre = genre;
	}

	

	public void afficherMusique() {
		System.out.println(this.toString());
	}

	public boolean verifierInstance(MusiqueImpl m) {

		boolean isit = false ;
		
			if(this.titre.equals(m.getTitre()) && this.autheur.equals(m.getAutheur())&&
					this.interprete.equals(m.getInterprete()) && this.genre.equals(m.getGenre())) {
				isit= true ;
			}else{
				isit= false ;
			}

		return isit ;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getAutheur() {
		return autheur;
	}


	public void setAutheur(String autheur) {
		this.autheur = autheur;
	}


	public String getInterprete() {
		return interprete;
	}


	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public String toString() {
		return "Musique :: [titre=" + titre + ", autheur=" + autheur + ", interprete=" + interprete + ", genre="
				+ genre + "]";
	}
	
	
	
}
