import java.util.*;
public class Main{
	
	
	public static void main(String[] args){
		 Scanner sc= new Scanner(System.in);
		 Client c = new Client(101, "Manuel","Evans","4747471234","Rue O martin","manuevans@gmail.com");
		 Produit p = new Produit(103,"Fanta","Boisson",12.45);
		System.out.println("Achat d'un produit");
		System.out.println("Entrer le code du produit(101) --> ");
		int code = sc.nextInt();
			if(code==101){
				System.out.println("Entrer le montant verse par le client");
				double montant= sc.nextDouble();
				if(montant>=12.45){
					System.out.println("Montant Correct Achat reussi");
					System.out.println("Informations Client");
					c.afficheClient();
					System.out.println("Informations Produit");
					p.afficheClient();
					System.out.println("Info Achat");
					System.out.println("Nom Client--> "+ c.getNom()+ " "+ c.getPrenom());
					System.out.println("Nom produit--> "+ p.getNom());
					System.out.println("Montant verse--> "+ montant);
					System.out.println("Montant produit-->"+ p.getPrix());
					System.out.println("Monnaie-->"+ (montant-p.getPrix()));
				}else{
					System.out.println("Montant incorrect");
				}
			}else{
				System.out.println("Code Invalide");
			}
		}
}