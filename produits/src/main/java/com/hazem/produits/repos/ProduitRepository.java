package com.hazem.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hazem.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
