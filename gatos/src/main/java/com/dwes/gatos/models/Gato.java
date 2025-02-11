package com.dwes.gatos.models;

/**
 * Entidad de Gato 
 * 
 * @author José Antonio Pozo González IWC70842@educastur.es
 *         Módulo de Desarrollo Wen en Entorno Servidor 24/25
 */

import java.time.LocalDate;

import com.dwes.gatos.constants.Pelaje;
import com.dwes.gatos.constants.Sexo;
import com.dwes.gatos.constants.Tamano;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gatos")
public class Gato {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private Integer edadAproximada;

  @Column
  private String raza;

  @Column
  private String colores;

  @Enumerated(EnumType.STRING)
  @Column
  private Sexo sexo;

  @Enumerated(EnumType.STRING)
  @Column
  private Pelaje pelaje;

  @Enumerated(EnumType.STRING)
  @Column
  private Tamano tamano;

  @Column
  private LocalDate fechaEntrada;

  @Column
  private LocalDate fechaSalida;

  @Column
  private String motivoEntrada;

  @Column
  private String motivoSalida;

  // GETTERS Y SETTERS

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Integer getEdadAproximada() {
    return edadAproximada;
  }

  public void setEdadAproximada(Integer edadAproximada) {
    this.edadAproximada = edadAproximada;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getColores() {
    return colores;
  }

  public void setColores(String colores) {
    this.colores = colores;
  }

  public Sexo getSexo() {
    return sexo;
  }

  public void setSexo(Sexo sexo) {
    this.sexo = sexo;
  }

  public Pelaje getPelaje() {
    return pelaje;
  }

  public void setPelaje(Pelaje pelaje) {
    this.pelaje = pelaje;
  }

  public Tamano getTamano() {
    return tamano;
  }

  public void setTamano(Tamano tamano) {
    this.tamano = tamano;
  }

  public LocalDate getFechaEntrada() {
    return fechaEntrada;
  }

  public void setFechaEntrada(LocalDate fechaEntrada) {
    this.fechaEntrada = fechaEntrada;
  }

  public LocalDate getFechaSalida() {
    return fechaSalida;
  }

  public void setFechaSalida(LocalDate fechaSalida) {
    this.fechaSalida = fechaSalida;
  }

  public String getMotivoEntrada() {
    return motivoEntrada;
  }

  public void setMotivoEntrada(String motivoEntrada) {
    this.motivoEntrada = motivoEntrada;
  }

  public String getMotivoSalida() {
    return motivoSalida;
  }

  public void setMotivoSalida(String motivoSalida) {
    this.motivoSalida = motivoSalida;
  }

}
