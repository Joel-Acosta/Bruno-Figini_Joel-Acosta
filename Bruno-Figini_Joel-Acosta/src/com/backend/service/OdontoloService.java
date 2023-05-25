package com.backend.service;

import com.backend.dao.IDao;
import com.backend.entity.Odontologo;

import java.util.List;

public class OdontoloService {

    private IDao<Odontologo> odontologoIDao;

    public OdontoloService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo guardarOdontologo(Odontologo odontologo){return odontologoIDao.guardar(odontologo);}

    public List<Odontologo> listarTodos(){return odontologoIDao.listarTodos();}
}
