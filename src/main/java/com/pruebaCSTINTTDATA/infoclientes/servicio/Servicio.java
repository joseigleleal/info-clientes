package com.pruebaCSTINTTDATA.infoclientes.servicio;

import com.pruebaCSTINTTDATA.infoclientes.dto.ClienteDTO;
import com.pruebaCSTINTTDATA.infoclientes.modelo.Cliente;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class Servicio {

    // Mock de datos del cliente
    Long id = 23445322L;
    String tipoDocumento ="C";
    String primerNombre = "Juan";
    String primerApellido = "Pérez";
    String telefono = "123456789";
    String direccion = "Calle 123";
    String ciudad = "Bogotá";
    Cliente cliente = new Cliente(id, tipoDocumento, primerNombre, primerApellido, telefono, direccion, ciudad);

    public ClienteDTO obtenerInformacionCliente(String tipoDocumento, String numDocumento) {
        if (!validarTipoDocumento(tipoDocumento) || !validarNumeroDocumento(numDocumento)) {
            throw new IllegalArgumentException("Solicitud incorrecta");
        }

        if ("23445322".equals(cliente.getId().toString())) {
            // Devuelvo un DTO para evitar el acceso a info no desaeada.
            ClienteDTO clienteDto = new ClienteDTO(cliente.getPrimerNombre(),cliente.getPrimerApellido(), cliente.getTelefono(),cliente.getDireccion(),cliente.getCiudad());
            return clienteDto;
        } else {
            throw new NoSuchElementException("Cliente no encontrado");

        }
    }

    private boolean validarTipoDocumento(String tipoDocumento) {
        return "C".equals(tipoDocumento) || "P".equals(tipoDocumento);
    }

    private boolean validarNumeroDocumento(String numeroDocumento) {
        // Verificar si el número de documento tiene al menos 4 caracteres y todos son dígitos
        return numeroDocumento.length() >= 4 && numeroDocumento.matches("\\d+") ;
    }
}
