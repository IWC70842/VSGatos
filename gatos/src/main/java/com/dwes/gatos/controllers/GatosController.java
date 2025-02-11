package com.dwes.gatos.controllers;

/**
 *  Controller de la API de gatos
 * 
 *  @author José Antonio Pozo González IWC70842@educastur.es
 *          Módulo de Desarrollo Wen en Entorno Servidor 24/25
 */

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwes.gatos.models.Gato;
import com.dwes.gatos.services.GatosService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/gatos")
public class GatosController {

  @Autowired
  GatosService gatosService;

  /**
   * Método para obtener la lista completa de gatos
   * 
   * @return List<Gato>
   */
  @GetMapping
  public List<Gato> getGatos() {
    return this.gatosService.getGatos();
  }

  /**
   * Método para obtener un gato en concreto pasando la id de dicho gato
   * 
   * @param id
   * @return Optional<Gato>
   */
  @GetMapping("/{id}")
  public Optional<Gato> getGatoById(@PathVariable("id") Long id) {
    return this.gatosService.getGatoById(id);
  }

  /**
   * Método para añadir un gato a la base de datos
   * 
   * @param gato
   * @return Gato
   */
  @PostMapping
  public Gato gato(@RequestBody Gato gato) {
    return this.gatosService.saveGato(gato);
  }

  /**
   * Método para eliminar un gato de la base de datos pasando la id de dicho gato
   * 
   * @param id
   * @return String
   */
  @DeleteMapping("/{id}")
  public String deleteGatoById(@PathVariable("id") Long id) {
    boolean ok = this.gatosService.deleteGatoById(id);

    if (ok) {
      return "Gato con id " + id + " eliminado correctamente.";
    } else {
      return "Error, gato con id " + id + " no ha podido ser eliminado.";
    }
  }

  /**
   * Método para actualizar los datos de un gato pasando los datos a actualizar y
   * la id del gato
   * 
   * @param request
   * @param id
   * @return Gato
   */
  @PutMapping("/{id}")
  public Gato updateGatoById(@RequestBody Gato request, @PathVariable("id") Long id) {
    return this.gatosService.updateGatoById(request, id);
  }
}
