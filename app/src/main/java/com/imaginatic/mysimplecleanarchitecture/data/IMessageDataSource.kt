package com.imaginatic.mysimplecleanarchitecture.data

import com.imaginatic.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}