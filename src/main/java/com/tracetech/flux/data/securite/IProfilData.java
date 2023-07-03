package com.tracetech.flux.data.securite;

import com.tracetech.flux.model.securite.Profil;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfilData extends JpaRepository<Profil, Long>{
    
}
