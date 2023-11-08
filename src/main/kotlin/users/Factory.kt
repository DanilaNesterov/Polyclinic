package users

import java.time.LocalDate

fun main() {
    val userCreator1: UserCreator = PatientCreator()
    val userCreator2: UserCreator = DoctorCreator()

    var user1 = userCreator1.createUser() as Patient
    val user2 = userCreator2.createUser() as Doctor

    user1.firstName = "Данила"
    user1.lastName = "Нестеров"
    user1.patronymic = "Андреевич"
    user1.sex = "Мужской"
    user1.phoneNumber = "+79833070007"
    user1.address = "г. Томск ул.Вершинина 39А"
    user1.dateOfBirth = LocalDate.of(2003, 11, 25)

    user2.firstName = "Петр"
    user2.lastName = "Петров"
    user2.patronymic = "Петрович"
    user2.specialization = "Хирург"

    user1.getInformation()
    user2.getInformation()



}