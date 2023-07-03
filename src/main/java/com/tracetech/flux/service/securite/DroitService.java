package com.tracetech.flux.service.securite;

import java.util.List;

import javax.transaction.Transactional;

import com.tracetech.flux.data.securite.IDroitData;
import com.tracetech.flux.iservice.securite.IDroitService;
import com.tracetech.flux.model.securite.Droit;
import com.tracetech.flux.model.securite.Utilisateur;
import com.tracetech.flux.service.framework.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DroitService extends GenericService<Droit, IDroitData> implements IDroitService {

    @Autowired
    private IDroitData droitData;

    @Override
    public List<Droit> listByUtilisatur(Utilisateur utilisateur) {
        return droitData.listByUtilisateur(utilisateur);
    }
}
