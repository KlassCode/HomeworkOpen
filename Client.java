public class Client{
	private int code;
	private String nom;
	private String prenom;
	private String telephone;
	private String adresse;
	private String email;
	
	public Client(){
		
	}
	public Client(int code,String nom, String prenom, String telephone, String adresse, String email){
		this.code=code;
		this.nom=nom;
		this.prenom=prenom;
		this.telephone= telephone;
		this.adresse= adresse;
		this.email= email;
	}
	public void afficheClient(){
		System.out.println("Nom "+ this.nom+"\nPrenom "+this.prenom+"\nTelephone "+this.telephone+"\nAdresse "+ this.adresse+ "\nMail "+ this.email);
	}
	public String getNom(){
		return this.nom;
	}
	public String getPrenom(){
		return this.prenom;
	}
	public String getTelephone(){
		return this.telephone;
	}
	public String getAdresse(){
		return this.adresse;
	}
	public String getEmail(){
		return this.email;
	}
	public void setNom(String nom){
		this.nom=nom;
	}
	public void setPrenom(String prenom){
		this.prenom=prenom;
	}
	public void setTelephone(String telephone){
		this.telephone=telephone;
	}
	public void setAdresse(String adresse){
		this.adresse=adresse;
	}
	public void setEmail(String email){
		this.email=email;
	}
}