package com.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agenda.entity.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda,Integer> {

}
