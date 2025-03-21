package com.ssafy.keywe.data.dto

sealed class Status {
    data class Code(val code: Int) : Status()
    data class Message(val message: String) : Status()
}