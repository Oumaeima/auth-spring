package com.tracetech.flux.service.securite;

import com.tracetech.flux.data.securite.IProfilDroitData;
import com.tracetech.flux.iservice.securite.IProfilDroitService;
import com.tracetech.flux.model.securite.Profil;
import com.tracetech.flux.model.securite.ProfilDroit;
import com.tracetech.flux.service.framework.GenericService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProfilDroitService extends GenericService<ProfilDroit, IProfilDroitData> implements IProfilDroitService {

    @Autowired
    private IProfilDroitData profilDroitData;

    @Override
    public List<ProfilDroit> listByProfil(Profil profil) {
        return profilDroitData.findByProfil(profil);
    }

}
