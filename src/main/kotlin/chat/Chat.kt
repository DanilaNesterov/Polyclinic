package chat

interface Chat {
    fun sendMessage(message: String, chatParticipant: ChatParticipant)
}