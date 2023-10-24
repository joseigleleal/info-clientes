package com.pruebaCSTINTTDATA.infoclientes.controlador;

import com.pruebaCSTINTTDATA.infoclientes.modelo.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class Controlador {

  @GetMapping
  public ResponseEntity<Cliente> obtenerInformacionCliente(
      @RequestParam String tipoDocumento,
      @RequestParam String numDocumento) {

    if (!validarTipoDocumento(tipoDocumento) || !validarNumeroDocumento(numDocumento)) {
      return ResponseEntity.badRequest().build(); // Código 400 - Solicitud incorrecta
    }

    if (numDocumento.equals("23445322")) {
      // Mock de datos del cliente
      Cliente cliente = new Cliente();
      cliente.setPrimerNombre("Juan");
      cliente.setPrimerApellido("Pérez");
      cliente.setTelefono("123456789");
      cliente.setDireccion("Calle 123");
      cliente.setCiudad("Bogotá");
      return ResponseEntity.ok(cliente); // Código 200 - Respuesta exitosa
    } else {
      // En este punto, maneja errores inesperados y devuelve un código de estado 500.
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // Código 500 - Error interno del servidor
    }
  }

  private boolean validarTipoDocumento(String tipoDocumento) {
    return tipoDocumento.equals("C") || tipoDocumento.equals("P");
  }

  private boolean validarNumeroDocumento(String numeroDocumento) {
    // Verificar si el número de documento tiene al menos 4 caracteres y todos son dígitos
    if (numeroDocumento.length() >= 4) {
      return numeroDocumento.matches("\\d+");
    } else {
      return false;
    }
  }
}
