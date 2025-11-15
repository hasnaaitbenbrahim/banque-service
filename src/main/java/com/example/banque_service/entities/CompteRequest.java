package com.example.banque_service.entities;
import lombok.Data;

public class CompteRequest {
    private Double solde;
    private String dateCreation;
    private TypeCompte type;
}
