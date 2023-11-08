package chat

class ChatBox: Chat
{
    lateinit var doctor: ChatParticipant
    lateinit var patient: ChatParticipant
    override fun sendMessage(message: String, chatParticipant: ChatParticipant) {
        if (doctor == chatParticipant)
            doctor.getMessage(message)
        if (patient == chatParticipant)
            patient.getMessage(message)
    }


}