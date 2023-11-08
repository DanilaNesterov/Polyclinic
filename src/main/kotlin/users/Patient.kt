package users

import appointment.Appointment
import appointment.TimeForAppointment
import chat.Chat
import chat.ChatBox
import chat.ChatParticipant
import java.time.LocalDate


class Patient(
    var firstName: String = "",
    var lastName: String = "",
    var patronymic: String = "",
    var sex: String = "",
    var address: String = "",
    var phoneNumber: String = "",
    var dateOfBirth: LocalDate = LocalDate.MIN,
    val login: String = "",
    val password: String = "",
    val chat: Chat = ChatBox()
) : ChatParticipant, User
{

    val appointments: MutableList<Appointment> = mutableListOf()
    fun makеAppointment(doctor: Doctor, timeForAppointment: TimeForAppointment, complaints: String){
        if(!timeForAppointment.timeIsFree)
            print("Выбранное время занято! Выберите другое время или дату!")
        else {
            timeForAppointment.timeIsFree = false
            val appointment = Appointment(this, doctor, timeForAppointment, complaints)
            doctor.schedule.appointments.add(appointment)
        }
    }

    override fun sendMessage(message: String) {
        chat.sendMessage(message, this)
    }

    override fun getMessage(message: String) {
        println("${this.firstName} ${this.lastName}: $message" )
    }

    override fun getInformation() {
        println("Имя: $firstName \n" +
                "Фамилия: $lastName \n" +
                "Отчество: $patronymic \n" +
                "Пол: $sex \n" +
                "Дата рождения: $dateOfBirth \n" +
                "Телефон: $phoneNumber \n" +
                "Адрес: $address \n")
    }

}