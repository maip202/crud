package com.example.crud.marketplace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketplaceService {

    // Inyectar el repositorio en la capa Service
    @Autowired
    private  MarketplaceRepository marketplaceRepository;

    // Crear el método
    public List<Marketplace> getAllMarketplace() {
        return marketplaceRepository.findAll();
    }
}
