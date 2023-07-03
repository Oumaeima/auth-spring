package com.tracetech.flux.iservice.framework;

import java.util.List;

import com.tracetech.flux.model.framework.ObjetPersistant;

public interface IGenericService<T extends ObjetPersistant> {

    T save(T t);

    void delete(Long id);

    T get(Long id);

    List<T> listAll();

    List<T> saveMany(List<T> listT);
}
