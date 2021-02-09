package com.imaginatic.mysimplecleanarchitecture.di

import com.imaginatic.mysimplecleanarchitecture.data.IMessageDataSource
import com.imaginatic.mysimplecleanarchitecture.data.MessageDataSource
import com.imaginatic.mysimplecleanarchitecture.data.MessageRepository
import com.imaginatic.mysimplecleanarchitecture.domain.IMessageRepository
import com.imaginatic.mysimplecleanarchitecture.domain.MessageInteractor
import com.imaginatic.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository() : IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}