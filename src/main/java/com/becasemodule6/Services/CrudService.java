package com.becasemodule6.Services;

import java.util.List;

public interface CrudService <E>{
    List<E> findAll();

    E save(E e);

    void delete(Long id);

    E findById(Long id);
}
