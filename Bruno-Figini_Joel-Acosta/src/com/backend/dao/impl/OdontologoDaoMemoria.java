package com.backend.dao.impl;

import com.backend.dao.IDao;
import com.backend.entity.Odontologo;
import org.apache.log4j.Logger;

import java.util.List;

public class OdontologoDaoMemoria implements IDao<Odontologo> {

    private static final Logger LOGGER = Logger.getLogger(OdontologoDaoMemoria.class);

    private List<Odontologo> odontologoRepositorio;

    public OdontologoDaoMemoria() {
    }

    public OdontologoDaoMemoria(List<Odontologo> odontologoRepositorio) {
        this.odontologoRepositorio = odontologoRepositorio;
    }


    @Override
    public Odontologo guardar( Odontologo odontologo ) {
        odontologoRepositorio.add(odontologo);
        LOGGER.info("Odontologo guardado: " + odontologo);
        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {
        LOGGER.info("Listado de todos los odontologos: \n" + odontologoRepositorio);
        return odontologoRepositorio;
    }



}