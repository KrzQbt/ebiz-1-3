Aplikacja w KTOR

1. Pozwala na wysyłanie do platformy slack

Żeby użyć należy np. w przeglądarce wejść pod url i dodać parametr żądania message z wiadomością, np:
   http://127.0.0.1:8080/message?message=yourMessage

W com/kk/SlackMessageSender.kt należy ustawić własny token (ukryłem część), nazwę kanału. Do kanału po stronie slacka należy dodać aplikację (np komendą na kanale) dla której token był wygenerowany, inaczej w odpowiedzi przyjdzie błąd
