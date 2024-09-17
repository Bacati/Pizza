package fr.eni.Pizza.app.bll;

import fr.eni.Pizza.app.bo.Commande;
import fr.eni.Pizza.app.bo.Produit;

import java.util.List;

public interface CommandeManager {

    void deleteCommandeById(Long id_commande);

    List<Commande> getAllCommandes();

    List<Commande> getUncloturedCommandes();

    List<Commande> getCommandesByEtat(Long id_etat);

    Commande getCommandeById (Long id_commande);

    void saveCommande(Commande commande);

    void updateEtatFromCommande(Commande commande);

    void cancelBasket(Long id_commande_en_cours);

    Long createBasket(Long id_utilisateur, Produit produit);

    void deleteProductInBasket(Long id_commande_en_cours, Long id_product);

    boolean  productInBasket (Long id_commande_en_cours, Long id_produit);

    void updateProductInBasket(Long id_commande_en_cours, Produit produit);

    void finishBasket(Long id_commande_en_cours);
}
