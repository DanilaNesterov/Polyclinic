package users

import javax.print.Doc

class DoctorCreator: UserCreator {
    override fun createUser(): Doctor {
        return Doctor()

    }

}