package com.dwes.gatos.services;

/**
 *  Clase Service de la API de gatos
 * 
 *  @author José Antonio Pozo González IWC70842@educastur.es
 *          Módulo de Desarrollo Wen en Entorno Servidor 24/25
 */

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwes.gatos.models.Gato;
import com.dwes.gatos.repositories.GatoRepository;

@Service
public class GatosService {

  @Autowired
  GatoRepository gatoRepository;

  /**
   * Método para obtener el listado completo de gatos
   * 
   * @return List<Gato>
   */
  public List<Gato> getGatos() {
    return (List<Gato>) gatoRepository.findAll();
  }

  /**
   * Método para obtener un gato determinado dando su id
   * 
   * @param id
   * @return Optional<Gato>
   */
  public Optional<Gato> getGatoById(Long id) {
    return gatoRepository.findById(id);
  }

  /**
   * Método para almacenar un gato en la base de datos
   * 
   * @param gato
   * @return Gato
   */
  public Gato saveGato(Gato gato) {
    return gatoRepository.save(gato);
  }

  /**
   * Método para eliminar un gato de la base de datos dando su id
   * 
   * @param id
   * @return Boolean
   */
  public Boolean deleteGatoById(Long id) {
    try {
      gatoRepository.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  /**
   * Método para actualizar los datos de un gato facilitando los datos y su id
   * 
   * @param request
   * @param id
   * @return Gato
   */
  public Gato updateGatoById(Gato request, Long id) {
    Gato gato = gatoRepository.findById(id).get();

    gato.setEdadAproximada(request.getEdadAproximada());
    gato.setRaza(request.getRaza());
    gato.setColores(request.getColores());
    gato.setSexo(request.getSexo());
    gato.setPelaje(request.getPelaje());
    gato.setTamano(request.getTamano());
    gato.setFechaEntrada(request.getFechaEntrada());
    gato.setFechaSalida(request.getFechaSalida());
    gato.setMotivoEntrada(request.getMotivoEntrada());
    gato.setMotivoSalida(request.getMotivoSalida());

    return gato;
  }

}
