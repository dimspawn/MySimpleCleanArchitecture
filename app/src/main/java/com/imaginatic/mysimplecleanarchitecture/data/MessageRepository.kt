package com.imaginatic.mysimplecleanarchitecture.data

import com.imaginatic.mysimplecleanarchitecture.domain.IMessageRepository
import com.imaginatic.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}