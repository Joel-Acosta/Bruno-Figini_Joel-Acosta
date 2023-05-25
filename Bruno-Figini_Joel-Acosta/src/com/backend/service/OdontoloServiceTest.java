package com.backend.service;

import com.backend.dao.impl.OdontologoDaoH2;
import com.backend.entity.Odontologo;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontoloServiceTest {
    private OdontoloService odontoloService = new OdontoloService(new OdontologoDaoH2());

    @Test
    public void deberiaListarTodosLosOdontologos() {
        List<Odontologo> odontologos = odontoloService.listarTodos();
        assertFalse(odontologos.isEmpty());
        assertTrue(odontologos.size() >= 2);

    }

}