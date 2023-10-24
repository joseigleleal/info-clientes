package com.pruebaCSTINTTDATA.infoclientes.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

  @Test
  public void crearCliente_DeberiaFuncionar() {
    Cliente cliente = new Cliente();
    assertNotNull(cliente);
  }

  @Test
  public void establecerPrimerNombre_DeberiaFuncionar() {
    Cliente cliente = new Cliente();
    cliente.setPrimerNombre("Juan");
    assertEquals("Juan", cliente.getPrimerNombre());
  }

  @Test
  public void establecerPrimerNombreYObtenerlo_DeberiaFuncionar() {
    Cliente cliente = new Cliente();
    cliente.setPrimerNombre("Juan");
    assertEquals("Juan", cliente.getPrimerNombre());
  }

  @Test
  public void establecerTelefonoYObtenerlo_DeberiaFuncionar() {
    Cliente cliente = new Cliente();
    cliente.setTelefono("123456789");
    assertEquals("123456789", cliente.getTelefono());
  }

  @Test
  public void crearCliente_SinParametros_DeberiaFuncionar() {
    Cliente cliente = new Cliente();
    assertNotNull(cliente);
  }

  @Test
  public void establecerPrimerApellidoYObtenerlo_DeberiaFuncionar() {
    Cliente cliente = new Cliente();
    cliente.setPrimerApellido("Pérez");
    assertEquals("Pérez", cliente.getPrimerApellido());
  }

  @Test
  public void establecerDireccionYObtenerlo_DeberiaFuncionar() {
    Cliente cliente = new Cliente();
    cliente.setDireccion("Calle 123");
    assertEquals("Calle 123", cliente.getDireccion());
  }

  @Test
  public void establecerCiudadYObtenerlo_DeberiaFuncionar() {
    Cliente cliente = new Cliente();
    cliente.setCiudad("Bogotá");
    assertEquals("Bogotá", cliente.getCiudad());
  }

  @Test
  public void establecerIdYObtenerlo_DeberiaFuncionar() {
    Cliente cliente = new Cliente();
    cliente.setId(1L);
    assertEquals(1L, cliente.getId());
  }
}
