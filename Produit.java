public class Produit{
	private int code;
	private String nom;
	private String categorie;
	private double prix;
	
	public Produit(){
		
	}
	public Produit(int code, String nom, String categorie, double prix){
		this.code= code;
		this.nom= nom;
		this.categorie= categorie;
		this.prix= prix;
	}
	public void afficheClient(){
		System.out.println("Code "+ this.code+"\nNom"+this.nom+"\nCategorie "+this.categorie+"\n Prix "+ this.prix);
	}
}