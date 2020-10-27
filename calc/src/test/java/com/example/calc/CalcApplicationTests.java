package com.example.calc;

import com.example.calc.controller.calculadoraController;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import javax.ws.rs.core.MediaType;

import com.example.calc.Controller.OperationController;
import com.example.calc.Services.OperationService;
import com.example.calc.dto.EquationDTO;
import com.example.calc.services.calcService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@ExtendWith(SpringExtension.class)
@ActiveProfiles("Teste")
@WebMvcTest(controllers = calculadoraController.class)
@AutoConfigureMockMvc
class CalcApplicationTests {

    @Autowired
    MockMvc mvc;


	@MockBean   
    calcService service;

	@Test

    public void soma()throws Exception{
        
        String soma = "30";

        Mockito.when(service.soma(Mockito.anyDouble(), Mockito.anyDouble())).thenReturn(soma);

        String json = new ObjectMapper().writeValueAsString(soma);
        
        //Construindo a chamada da requisição
        MockHttpServletRequestBuilder request = 
                        MockMvcRequestBuilders.post("/calculadora/soma")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json);

        //Realizando a chamada de fato
        mvc.perform(request)
            .andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	public void subtracao()throws Exception{
       
        String sub = "15";

        Mockito.when(service.soma(Mockito.anyDouble(), Mockito.anyDouble())).thenReturn(sub);

        String json = new ObjectMapper().writeValueAsString(sub);
        
        //Construindo a chamada da requisição
        MockHttpServletRequestBuilder request = 
                        MockMvcRequestBuilders.post("/calculadora/subtracao")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json);

        //Realizando a chamada de fato
        mvc.perform(request)
            .andExpect(MockMvcResultMatchers.status().isOk());
    }
	public void multiplicacao()throws Exception{
       
        String sub = "15";

        Mockito.when(service.soma(Mockito.anyDouble(), Mockito.anyDouble())).thenReturn(sub);

        String json = new ObjectMapper().writeValueAsString(sub);
        
        //Construindo a chamada da requisição
        MockHttpServletRequestBuilder request = 
                        MockMvcRequestBuilders.post("/calculadora/multiplicacao")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json);

        //Realizando a chamada de fato
        mvc.perform(request)
            .andExpect(MockMvcResultMatchers.status().isOk());
    }


	public void divisao()throws Exception{
       
        String sub = "15";

        Mockito.when(service.soma(Mockito.anyDouble(), Mockito.anyDouble())).thenReturn(sub);

        String json = new ObjectMapper().writeValueAsString(sub);
        
        //Construindo a chamada da requisição
        MockHttpServletRequestBuilder request = 
                        MockMvcRequestBuilders.post("/calculadora/divisao")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json);

        //Realizando a chamada de fato
        mvc.perform(request)
            .andExpect(MockMvcResultMatchers.status().isOk());
    }
	public void potencia()throws Exception{
       
        String sub = "15";

        Mockito.when(service.soma(Mockito.anyDouble(), Mockito.anyDouble())).thenReturn(sub);

        String json = new ObjectMapper().writeValueAsString(sub);
        
        //Construindo a chamada da requisição
        MockHttpServletRequestBuilder request = 
                        MockMvcRequestBuilders.post("/calculadora/potencia")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json);

        //Realizando a chamada de fato
        mvc.perform(request)
            .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
