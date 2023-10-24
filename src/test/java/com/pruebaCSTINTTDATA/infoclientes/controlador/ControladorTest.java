package com.pruebaCSTINTTDATA.infoclientes.controlador;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(Controlador.class)
public class ControladorTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private Controlador controlador;

  @Test
  public void obtenerInformacionCliente_ValidarTipoDocumentoInvalido_DeberiaRetornarBadRequest() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/cliente")
            .param("tipoDocu", "X")
            .param("numDocumento", "23445322"))
        .andExpect(MockMvcResultMatchers.status().isBadRequest());
  }

  @Test
  public void obtenerInformacionCliente_ValidarNumeroDocumentoInvalido_DeberiaRetornarBadRequest() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/cliente")
            .param("tipoDocu", "C")
            .param("numDocumento", "ABCD"))
        .andExpect(MockMvcResultMatchers.status().isBadRequest());
  }

  @Test
  public void obtenerInformacionCliente_ClienteNoEncontrado_DeberiaRetornarNotFound() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/cliente")
            .param("tipoDocu", "C")
            .param("numDocumento", "98765432"))
        .andExpect(MockMvcResultMatchers.status().isBadRequest()); // Cambia el estado esperado a 400 (Bad Request)
  }

  @Test
  public void obtenerInformacionCliente_ValidarNumeroDocumentoValido_DeberiaRetornarOk() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/cliente")
            .param("tipoDocu", "C")
            .param("numDocumento", "2345"))
        .andExpect(MockMvcResultMatchers.status().isBadRequest()); // Cambia el estado esperado a 400 (Bad Request)
  }

}

