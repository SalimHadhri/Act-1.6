package Streamingmusique;

public interface PlayListe {
	
	
	public void afficherMusiquesPlaylist();
	public void ajouterMusique(MusiqueImpl m) ;
	public void eliminerDoublons() ;
	public void afficherDeuxPlaylist(PlayListeImpl p);
	public  MusiqueImpl[] triePlaylistAuteur() ;
	public  MusiqueImpl[] triePlaylistinterprete();
	
	
	
	
	

}
