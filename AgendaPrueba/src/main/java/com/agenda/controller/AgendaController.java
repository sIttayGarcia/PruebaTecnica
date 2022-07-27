package com.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.entity.Agenda;
import com.agenda.service.AgendaService;

@RestController
@RequestMapping("/contacts")
public class AgendaController {
	
	@Autowired
	AgendaService agendaService;
	
	@GetMapping
	public ResponseEntity <List<Agenda>>ListarContactos(){
		List<Agenda>contactos= agendaService.getAll();
		if(contactos.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(contactos);
	}
	@GetMapping("/{id}")
	public ResponseEntity <Agenda> ObtenerContacto(@PathVariable int id){
		Agenda agenda = agendaService.getContactoByid(id);
		if(agenda==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(agenda);

	}
	@PostMapping
	public ResponseEntity<Agenda> GuardarContacto(@RequestBody Agenda agenda){
		Agenda nuevoContacto= agendaService.saveContacto(agenda);
		return ResponseEntity.ok(nuevoContacto);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String>eliminar (@PathVariable int id){
		String mensaje= agendaService.eliminar(id);
		return new ResponseEntity<String>(mensaje,HttpStatus.OK);
	}
}
