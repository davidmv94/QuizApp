# Harry Potter Quiz App
Aplicacion #3 para el reto mensual de aplicaciones organizado por [MoureDev](https://github.com/mouredev)

[![Potter](https://raw.githubusercontent.com/davidthar/QuizApp/master/github_banner.png)](https://github.com/davidthar/QuizApp)


## Descarga de la aplicación
Puedes descargar la aplicación en formato .apk desde ------------

## Información sobre el reto
* Puedes encontrar más información sobre el reto [aquí](https://github.com/mouredev/Monthly-App-Challenge-2022)

## Requisitos:

* El diseño es de libre elección.
* La temática de las preguntas del cuestionario será de libre elección. Puede estar bien seguir un mismo tema (por ejemplo, preguntas sobre el universo "Harry Potter").
* En la pantalla inicial podrás comenzar a jugar o consultar el ranking de puntuaciones.
* El juego consistirá en 10 preguntas aleatorias con 3 respuestas y sólo una correcta. Recomendable crear más de 10 preguntas para que no siempre salgan las mismas. Cada vez que se responde a una pregunta, se pasará a la siguiente.
* Disponemos de 30 segundos para responder cada pregunta. El contador deberá aparecer en la pantalla, y si llega a 0 se tomará como respuesta incorrecta y se pasará a la siguiente pregunta.
* Al marcar una respuesta o finalizar el tiempo, se mostrará si se ha acertado o no la pregunta, dando feedback sobre cuál sería la respuesta correcta y navegando al cabo de un par de segundos a la siguiente pantalla.
* Sistema de puntuación:
	* Contador a 0 o respuesta incorrecta = 0 puntos.
	* Contador mayor 0 y respuesta correcta = [segundos restantes] puntos. Ej: Si quedaban 9 segundos para finalizar la cuenta atrás y se acierta la pregunta, se asignan 9 puntos.
* Una vez finalizada la pregunta número 10 se mostrará en una nueva pantalla la puntuación final y se deberá introducir un nombre para guardarla de forma persistente (aunque cerremos la app). Hecho estos se mostrará la pantalla de ranking.
* La pantalla de ranking muestra ordenados de mayor a menor los 10 mejores resultados y el nombre guardado. Desde esta pantalla siempre se podrá navegar a la pantalla inicial.
