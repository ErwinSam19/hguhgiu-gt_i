package personnages;

public class Village {
	
		private String nom;
		private Chef chef;
		private int nbVillageois=0;
		private Gaulois[] villageois;
		
		public Village(String nom, int NbVillageoisMaximum) {
			this.nom = nom;
			villageois=new Gaulois[NbVillageoisMaximum];
		}
		public void ajouterHabitant(Gaulois gaulois) {
			villageois[nbVillageois]= gaulois;
			nbVillageois+=1;
			
		}
		public Gaulois trouverHabitant(int numero) {
			return villageois[numero];
		}
		public void setChef(Chef chef) {
			this.chef = chef;
		}
		
		public String getNom() {
			return nom;
		}
		
		
}
