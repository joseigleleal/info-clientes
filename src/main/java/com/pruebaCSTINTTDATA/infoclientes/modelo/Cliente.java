package com.pruebaCSTINTTDATA.infoclientes.modelo;

public class Cliente {

  private Long id;

  private String tipoDocumento;
  private String primerNombre;
  private String primerApellido;
  private String telefono;
  private String direccion;
  private String ciudad;

  public Cliente(Long id, String tipoDocumento, String primerNombre, String primerApellido, String telefono, String direccion, String ciudad) {
    this.id = id;
    this.tipoDocumento = tipoDocumento;
    this.primerNombre = primerNombre;
    this.primerApellido = primerApellido;
    this.telefono = telefono;
    this.direccion = direccion;
    this.ciudad = ciudad;
  }
  public Cliente() {
  }
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTipoDocumento() {
    return tipoDocumento;
  }

  public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  public String getPrimerNombre() {
    return primerNombre;
  }

  public void setPrimerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
  }

  public String getPrimerApellido() {
    return primerApellido;
  }

  public void setPrimerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }
}
