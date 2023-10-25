package com.pruebaCSTINTTDATA.infoclientes.servicio;

import com.pruebaCSTINTTDATA.infoclientes.dto.ClienteDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ServicioTest {

    private Servicio servicio;

    @BeforeEach
    public void setUp() {
        servicio = new Servicio();
    }

    @Test
    public void obtenerInformacionCliente_ValidarClienteEncontrado_DeberiaRetornarDTO() {
        ClienteDTO clienteDto = servicio.obtenerInformacionCliente("C", "23445322");

        assertEquals("Juan", clienteDto.getPrimerNombre());
        assertEquals("Pérez", clienteDto.getPrimerApellido());
        assertEquals("123456789", clienteDto.getTelefono());
        assertEquals("Calle 123", clienteDto.getDireccion());
        assertEquals("Bogotá", clienteDto.getCiudad());
    }


    @Test
    public void obtenerInformacionCliente_ValidarSolicitudIncorrecta_DeberiaLanzarIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> servicio.obtenerInformacionCliente("X", "23445322"));
    }

    @Test
    public void obtenerInformacionCliente_ValidarNumeroDocumentoInvalido_DeberiaLanzarIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> servicio.obtenerInformacionCliente("C", "ABCD"));
    }
}
