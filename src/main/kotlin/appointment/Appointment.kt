package appointment

import users.Doctor
import users.Patient
import java.time.LocalDate
import java.time.LocalTime

class Appointment(
    private val patient: Patient,
    private val doctor: Doctor,
    private val timeForAppointment: TimeForAppointment,
    private val complaints: String
) {
}