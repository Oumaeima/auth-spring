package com.tracetech.flux.iservice.securite;

import java.util.List;

import com.tracetech.flux.iservice.framework.IGenericService;
import com.tracetech.flux.model.securite.Droit;
import com.tracetech.flux.model.securite.Utilisateur;

public interface IDroitService extends IGenericService<Droit> {
    List<Droit> listByUtilisatur(Utilisateur utilisateur);
}
