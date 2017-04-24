package pl.koronawoj.service;

import java.util.List;

import pl.koronawoj.domain.Appointment;

public interface AppointmentService {
	Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}
