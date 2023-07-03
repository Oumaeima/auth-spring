package com.tracetech.flux.data.securite;

import com.tracetech.flux.model.securite.Profil;
import com.tracetech.flux.model.securite.ProfilDroit;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfilDroitData extends JpaRepository<ProfilDroit, Long>{

    List<ProfilDroit> findByProfil(Profil profil);
    
}
