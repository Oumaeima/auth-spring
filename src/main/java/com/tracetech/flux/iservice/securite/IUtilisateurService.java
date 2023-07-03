package com.tracetech.flux.iservice.securite;

import com.tracetech.flux.dto.configuration.LecteurDto;
import com.tracetech.flux.dto.securite.UtilisateurDto;
import com.tracetech.flux.iservice.framework.IGenericService;
import com.tracetech.flux.model.securite.Utilisateur;

import java.util.List;

public interface IUtilisateurService extends IGenericService<Utilisateur> {

    Utilisateur getByLogin(String login);

    Utilisateur getMonCompte();

    void changeMotDePasse(UtilisateurDto utilisateur) throws Exception;

    void updateInfosUtilisateur(UtilisateurDto utilisateur);

}
