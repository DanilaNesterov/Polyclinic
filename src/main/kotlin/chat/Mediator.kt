package chat

import users.Doctor
import users.Patient
import java.time.LocalDate

fun main() {
    val chatBox = ChatBox()

    val patient: ChatParticipant = Patient(
        "Данила",
        "Нестеров",
        "Андреевич",
        "Мужской",
        dateOfBirth = LocalDate.of(2003, 11, 25),
        chat = chatBox

    )

    val doctor: ChatParticipant = Doctor(
        "Иван",
        "Иванов",
        "Иванович",
        "Хирург",
        chat = chatBox
    )
    chatBox.patient = patient
    chatBox.doctor = doctor
    patient.sendMessage("Здравствуйте у меня поднялась температура. Какое лекарство мне принять?")
    doctor.sendMessage("Выпейте ибупрофен.")




}