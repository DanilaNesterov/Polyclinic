package polyclinic

import users.Doctor
import users.Patient

class Polyclinic(
    val name: String,
    val address: String
) {
    val patients: MutableList<Patient> = mutableListOf()
    val doctors: MutableList<Doctor> = mutableListOf()
}