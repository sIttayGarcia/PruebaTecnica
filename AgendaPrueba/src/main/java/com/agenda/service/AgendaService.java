package com.agenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.entity.Agenda;
import com.agenda.repository.AgendaRepository;

@Service
public class AgendaService {
	
	@Autowired
	private AgendaRepository agendaRepository;
	
	public List <Agenda> getAll(){
		return agendaRepository.findAll();
	}
	
	public Agenda getContactoByid(int id) {
		return agendaRepository.findById(id).orElse(null);
	}
	public Agenda saveContacto(Agenda agenda) {
		Agenda nuevoContacto = agendaRepository.save(agenda);
		return nuevoContacto;
	}
	public String eliminar(int id) {
		agendaRepository.deleteById(id);
		return "Eliminado";
	}

}
