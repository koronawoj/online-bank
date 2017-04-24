package pl.koronawoj.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pl.koronawoj.domain.Appointment;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
