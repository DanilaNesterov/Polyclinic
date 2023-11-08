package users

import chat.Chat
import chat.ChatBox
import chat.ChatParticipant
import schedule.Schedule

class Doctor(
    var firstName: String = "",
    var lastName: String = "",
    var patronymic: String = "",
    var specialization: String = "",
    val login: String = "",
    val password: String = "",
    val chat: Chat = ChatBox()



    ): ChatParticipant, User
{

    val schedule: Schedule = Schedule(this)
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
                "Специализация: $specialization \n")
    }
}