package chat

interface ChatParticipant {
    fun sendMessage(message: String)
    fun getMessage(message: String)
}