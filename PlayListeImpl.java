package Streamingmusique;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Objects;

public class PlayListeImpl implements PlayListe{

	
	
	public static final int MAX_MUSIQUES = 10 ;
	private String nom;
	private String genre ;
	private int nombreTitres ;
	private MusiqueImpl[] allMusique= new MusiqueImpl[MAX_MUSIQUES] ;
	
	
	
	
	
	
	public PlayListeImpl() { 
	}

	
	
	
	public PlayListeImpl(MusiqueImpl[] allMusique) {
		this.allMusique = allMusique;
	}




	public PlayListeImpl(String nom, String genre, int nombreTitres, MusiqueImpl[] allMusique) {
		this.nom = nom;
		this.genre = genre;
		this.nombreTitres = nombreTitres;
		this.allMusique = allMusique;
	}




	public void afficherMusiquesPlaylist() {
		for(int i = 0 ; i<allMusique.length;i++) {
			this.allMusique[i].afficherMusique();
			
		}	
	}

	public void ajouterMusique(MusiqueImpl m) {
				
	//MusiqueImpl[] obj = allMusique ;
	//MusiqueImpl[] obj2 = new MusiqueImpl[obj.length+1] ;
	

	MusiqueImpl[] obj2 = new MusiqueImpl[allMusique.length+1] ;
	
		if (allMusique.length>MAX_MUSIQUES) {
			System.out.println("la playlist a le maximum de musiques");
		}else {


			for (int i = 0 ; i<allMusique.length;i++) {
				obj2[i] = allMusique[i] ;
			}
			obj2[allMusique.length] = m ;
			
	}
		setAllMusique(obj2);
		}
		
		
	
		
		
		
	

	public void eliminerDoublons() {
	}
		
		
		
	

	public void afficherDeuxPlaylist(PlayListeImpl p) {
		afficherMusiquesPlaylist(); 
		p.afficherMusiquesPlaylist();

	}

	
	public  MusiqueImpl minPosPlaylistAuteur (MusiqueImpl[] mm) {

		MusiqueImpl min = mm[0] ;
		
		for (int i =1 ; i< mm.length ; i++) {
			if (min.getAutheur().compareTo(mm[i].getAutheur()) >= 0 ){
				min = mm[i] ;
			}
		}
		return min ;
	}
	
	public  MusiqueImpl minPosinterprete (MusiqueImpl[] mm) {

		MusiqueImpl min = mm[0] ;
		
		for (int i =1 ; i< mm.length ; i++) {
			if (min.getInterprete().compareTo(mm[i].getInterprete()) >= 0 ){
				min = mm[i] ;
			}
		}
		return min ;
	}


	public  MusiqueImpl[] triePlaylistAuteur() {

		MusiqueImpl[] tabSorted = new MusiqueImpl[allMusique.length] ;

		for (int i = 0 ; i< allMusique.length ;i++) {
			MusiqueImpl[] copy = Arrays.copyOfRange(allMusique, i, allMusique.length);
			MusiqueImpl min = minPosPlaylistAuteur(copy) ;

			for (int j =1  ; j<allMusique.length ; j++){
				if (allMusique[j].equals(min)){
					tabSorted[i]= min;
					allMusique[j]=allMusique[i] ;

				}
			}
				
		}
		return tabSorted ;
	}


	public  MusiqueImpl[] triePlaylistinterprete() {

		MusiqueImpl[] tabSorted = new MusiqueImpl[allMusique.length] ;

		for (int i = 0 ; i< allMusique.length ;i++) {
			MusiqueImpl[] copy = Arrays.copyOfRange(allMusique, i, allMusique.length);
			MusiqueImpl min = minPosinterprete(copy) ;

			for (int j =1  ; j<allMusique.length ; j++){
				if (allMusique[j].equals(min)){
					tabSorted[i]= min;
					allMusique[j]=allMusique[i] ;

				}
			}
				
		}
		return tabSorted ;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getGenre() {
		return genre;
	}




	public void setGenre(String genre) {
		this.genre = genre;
	}




	public int getNombreTitres() {
		return nombreTitres;
	}




	public void setNombreTitres(int nombreTitres) {
		this.nombreTitres = nombreTitres;
	}




	public MusiqueImpl[] getAllMusique() {
		return allMusique;
	}




	public void setAllMusique(MusiqueImpl[] allMusique) {
		this.allMusique = allMusique;
	}




	public static int getMaxMusiques() {
		return MAX_MUSIQUES;
	}
	
	

}

/*MusiqueImpl musique = allMusique[0] ;

//for (int i=1 ; i <allMusique.length ; i++ ) {
MusiqueImpl[] noDoublon = new MusiqueImpl[allMusique.length] ;
int k =0 ;
//noDoublon[k] = allMusique[0] ;
MusiqueImpl min  = allMusique[0] ;
boolean add = false ;
			//for (int j=0;j<allMusique.length;j++) {
				add=false ;
						for (int i =1 ;i<allMusique.length;i++ ) {
							
							if (allMusique[i].equals(min) && add == false) {
									
									add = true ;
									
							
						}else if (!allMusique[i].equals(min) && add == false) {
							noDoublon[k] = allMusique[i] ;
							min =  allMusique[i] ;
							k++ ;
						}
							

			}
						setAllMusique(noDoublon);			

}
			
			
*/
