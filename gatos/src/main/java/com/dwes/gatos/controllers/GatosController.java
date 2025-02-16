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
   * Método para obtener la lista completa de gatos almacenada en la base de datos.
   * 
   * @return List<Gato>. Devuelve una lista con todas las entidades Gato
   *         almacenadas en la base de datos.
   */
  @GetMapping
  public List<Gato> getGatos() {
    return this.gatosService.getGatos();
  }

  /**
   * Método para obtener un gato en concreto pasando la id de dicho gato.
   * 
   * @param id Id del gato en la base de datos.
   * @return Optional<Gato>. Si encuentra una coincidencia con la id de un gato en
   *         la base de datos nos devuelve el objeto Gato con dicha id.
   */
  @GetMapping("/{id}")
  public Optional<Gato> getGatoById(@PathVariable("id") Long id) {
    return this.gatosService.getGatoById(id);
  }

  /**
   * Método para añadir un gato a la base de datos.
   * 
   * @param gato Debemos pasar los parametros del objeto Gato a almacenar.
   * @return Gato. Nos devuelve el objeto Gato correctamente almacenado en la base
   *         de datos
   */
  @PostMapping
  public Gato gato(@RequestBody Gato gato) {
    return this.gatosService.saveGato(gato);
  }

  /**
   * Método para eliminar un gato de la base de datos pasando la id de dicho gato.
   * 
   * @param id Debemos facilitar la Id en la base de datos del gato que queremos
   *           eleminar.
   * @return String Nos devuelve un mensaje con la confirmación del borrado o el
   *         error en caso de que no encuentre un gato con esa id en la base de
   *         datos.
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
   * la id del gato.
   * 
   * @param request Debemos facilitar en el body de la request los datos del gato
   *                a modificar.
   * @param id      Debemos facilitar la id en la base de datos del gato que
   *                queremos actualizar.
   * @return Gato Nos devuelve el gato con los datos modificados.
   */
  @PutMapping("/{id}")
  public Gato updateGatoById(@RequestBody Gato request, @PathVariable("id") Long id) {
    return this.gatosService.updateGatoById(request, id);
  }
}
