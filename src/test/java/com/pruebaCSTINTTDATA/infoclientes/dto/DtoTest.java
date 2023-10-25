package com.pruebaCSTINTTDATA.infoclientes.dto;

import com.pruebaCSTINTTDATA.infoclientes.dto.ClienteDTO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DtoTest {

    @Test
    public void obtenerPrimerNombre_DeberiaRetornarElMismoValor() {
        String primerNombre = "Juan";
        ClienteDTO clienteDTO = new ClienteDTO(primerNombre, "Pérez", "123456789", "Calle 123", "Bogotá");
        assertEquals(primerNombre, clienteDTO.getPrimerNombre());
    }

    @Test
    public void obtenerPrimerApellido_DeberiaRetornarElMismoValor() {
        String primerApellido = "Pérez";
        ClienteDTO clienteDTO = new ClienteDTO("Juan", primerApellido, "123456789", "Calle 123", "Bogotá");
        assertEquals(primerApellido, clienteDTO.getPrimerApellido());
    }

    @Test
    public void obtenerTelefono_DeberiaRetornarElMismoValor() {
        String telefono = "123456789";
        ClienteDTO clienteDTO = new ClienteDTO("Juan", "Pérez", telefono, "Calle 123", "Bogotá");
        assertEquals(telefono, clienteDTO.getTelefono());
    }

    @Test
    public void obtenerDireccion_DeberiaRetornarElMismoValor() {
        String direccion = "Calle 123";
        ClienteDTO clienteDTO = new ClienteDTO("Juan", "Pérez", "123456789", direccion, "Bogotá");
        assertEquals(direccion, clienteDTO.getDireccion());
    }

    @Test
    public void obtenerCiudad_DeberiaRetornarElMismoValor() {
        String ciudad = "Bogotá";
        ClienteDTO clienteDTO = new ClienteDTO("Juan", "Pérez", "123456789", "Calle 123", ciudad);
        assertEquals(ciudad, clienteDTO.getCiudad());
    }
}

