package com.pruebaCSTINTTDATA.infoclientes.modelo;

import lombok.Data;

@Data
public class Cliente {

  private Long id;
  private String primerNombre;
  private String primerApellido;
  private String telefono;
  private String direccion;
  private String ciudad;

}
