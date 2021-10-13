package Streamingmusique;

public class Main {

	public static void main(String[] args) {
		
		MusiqueImpl mus1 = new MusiqueImpl("Hello","eminem","dr dre","rap") ;
		MusiqueImpl mus2 = new MusiqueImpl("byby","melisa","mr XX","pop") ;
		MusiqueImpl mus3 = new MusiqueImpl("sousou","doudou","fli","pop") ;
		MusiqueImpl mus4 = new MusiqueImpl("doudou","koukou","didi","rap") ;
		MusiqueImpl mus5 = new MusiqueImpl("sasir","camel","lala","country") ;
		MusiqueImpl mus6 = new MusiqueImpl("nounou","amine","khaled","tango") ;
		MusiqueImpl mus7 = new MusiqueImpl("loulou","eminem","loulou","rap") ;
		MusiqueImpl mus8 = new MusiqueImpl("friend","ennemy","love","pop") ;
		
		
		System.out.println("AFFICHAGE MUSIQUE");
		mus1.afficherMusique();
		mus6.afficherMusique();
		System.out.println("*******************************************************************************");
		System.out.println("verification de l'instance");
		System.out.println("mus1 vs mus2: =====> "+mus1.verifierInstance(mus2));
		System.out.println("mus6 vs mus6: =====> "+mus6.verifierInstance(mus6));
		System.out.println("*******************************************************************************");
		System.out.println("Affichage musique playlist");
		

		MusiqueImpl[] pl1MM = {mus1,mus6,mus8} ;
		MusiqueImpl[] pl2MM = {mus2,mus4,mus5} ;
		MusiqueImpl[] pl3MM = {mus3,mus7} ;
		
		
		PlayListeImpl pl1 = new PlayListeImpl(pl1MM) ;
		PlayListeImpl pl2 = new PlayListeImpl(pl2MM) ;
		PlayListeImpl pl3 = new PlayListeImpl(pl3MM) ;
		
		pl1.afficherMusiquesPlaylist();
		System.out.println("*******************************************************************************");
		pl2.afficherMusiquesPlaylist();
		System.out.println("*******************************************************************************");
		System.out.println("ajouterMusique");
		pl1.ajouterMusique(mus4);
		pl1.ajouterMusique(mus1);	
		pl1.afficherMusiquesPlaylist();
		
		System.out.println("*******************************************************************************");
		/*System.out.println("eliminer doublon") ;
		
		pl1.eliminerDoublons(); 
		
		pl1.afficherMusiquesPlaylist();**/
		System.out.println("*******************************************************************************");
		System.out.println("afficher deux playlist") ;
		pl1.afficherDeuxPlaylist(pl2);
		
		System.out.println("*******************************************************************************");
		System.out.println("trie playlist par autheur") ;
		System.out.println(" playlist non triée :") ;
		pl2.afficherMusiquesPlaylist();
		System.out.println("*******************************************************************************");
		System.out.println(" playlist  triée par autheur:") ;
		MusiqueImpl[]  musiqueTrie = pl2.triePlaylistAuteur() ;
		pl2.setAllMusique(musiqueTrie);
		pl2.afficherMusiquesPlaylist(); 
		
		System.out.println("*******************************************************************************");
		System.out.println("trie playlist par interprete") ;
		System.out.println(" playlist non triée :") ;
		pl2.afficherMusiquesPlaylist();
		System.out.println("*******************************************************************************");
		System.out.println(" playlist  triée par interpreter:") ;
		MusiqueImpl[]  musiqueTrie2 = pl2.triePlaylistinterprete() ;
		pl2.setAllMusique(musiqueTrie2);
		pl2.afficherMusiquesPlaylist(); 
			
			
		}
		
		
		
		
		
		
	}


