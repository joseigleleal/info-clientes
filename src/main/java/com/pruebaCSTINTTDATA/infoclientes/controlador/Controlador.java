package com.pruebaCSTINTTDATA.infoclientes.controlador;

import com.pruebaCSTINTTDATA.infoclientes.dto.ClienteDTO;
import com.pruebaCSTINTTDATA.infoclientes.servicio.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/cliente")
public class Controlador {

  @Autowired
  private Servicio clienteService;

  @GetMapping
  public ResponseEntity<ClienteDTO> obtenerInformacionCliente(
          @RequestParam String tipoDocumento,
          @RequestParam String numDocumento) {
    try {
      ClienteDTO clienteDto = clienteService.obtenerInformacionCliente(tipoDocumento, numDocumento);
      return ResponseEntity.ok(clienteDto); // Código 200
    } catch (IllegalArgumentException e) {
      return ResponseEntity.badRequest().build(); // Código 400 - Solicitud incorrecta
    } catch (NoSuchElementException e) {
      return ResponseEntity.notFound().build(); // Código 404 - Recurso no encontrado
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // Código 500 - Error interno del servidor
    }
  }
}
