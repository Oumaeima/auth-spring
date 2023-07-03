package com.tracetech.flux.iservice.securite;

import java.util.List;

import com.tracetech.flux.iservice.framework.IGenericService;
import com.tracetech.flux.model.securite.Profil;
import com.tracetech.flux.model.securite.ProfilDroit;

public interface IProfilDroitService extends IGenericService<ProfilDroit> {
    List<ProfilDroit> listByProfil(Profil profil);
}
