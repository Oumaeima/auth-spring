package com.tracetech.flux.service.securite;

import com.tracetech.flux.data.securite.IProfilData;
import com.tracetech.flux.iservice.securite.IProfilService;
import com.tracetech.flux.model.securite.Profil;
import com.tracetech.flux.service.framework.GenericService;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProfilService extends GenericService<Profil, IProfilData> implements IProfilService{
    
    
}
