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
	public int getCode(){
		return code;
	}
	public String getNom(){
		return nom;
	}
	public String getCategorie(){
		return categorie;
	}
	public double getPrix(){
		return prix;
	}
	public void setNom(String nom){
		this.nom= nom;
	}
	public void setCategorie(String categorie){
		this.categorie= categorie;
	}
	public void setPrix(double prix){
		this.prix= prix;
	}
}