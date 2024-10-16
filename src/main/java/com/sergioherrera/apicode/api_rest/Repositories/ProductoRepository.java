package com.sergioherrera.apicode.api_rest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergioherrera.apicode.api_rest.Entities.Producto;

                                            //Tipo de Entidad // E identificador de la entidad o modelo 
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
