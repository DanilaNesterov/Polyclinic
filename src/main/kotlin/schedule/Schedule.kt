package schedule

import appointment.Appointment
import users.Doctor

class Schedule(
    private val doctor: Doctor
) {
    val appointments: MutableList<Appointment> = mutableListOf()
}