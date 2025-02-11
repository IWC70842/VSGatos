package com.dwes.gatos.repositories;

/**
 * Interface de repositorio JPA 
 * 
 * @author José Antonio Pozo González IWC70842@educastur.es
 *         Módulo de Desarrollo Wen en Entorno Servidor 24/25
 */

import org.springframework.data.jpa.repository.JpaRepository;

import com.dwes.gatos.models.Gato;

public interface GatoRepository extends JpaRepository<Gato, Long> {

}
