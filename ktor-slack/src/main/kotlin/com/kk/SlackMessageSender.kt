package com.kk

import com.slack.api.Slack
import com.slack.api.Slack.*
import com.slack.api.methods.MethodsClient
import com.slack.api.methods.request.chat.ChatPostMessageRequest
import com.slack.api.methods.response.chat.ChatPostMessageResponse

class SlackMessageSender {
    companion object{
        val slack = getInstance()
        val token = "xoxb-5--------------------------------------------XLKd" // put your token here
        val channel = "#kotlin-assignment-slack-api"
    }
}
fun SlackMessageSender.Companion.sendMessage(message:String): Boolean {

    val  methods:MethodsClient = slack.methods(token);

    val request: ChatPostMessageRequest = ChatPostMessageRequest.builder().channel(channel).text(message).build()

    val response:ChatPostMessageResponse = methods.chatPostMessage(request)

    return response.isOk
}