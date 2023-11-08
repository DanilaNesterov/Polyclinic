package users

import chat.Chat
import java.time.LocalDate

class PatientCreator: UserCreator {
    override fun createUser(): User {
        return Patient()

    }




}