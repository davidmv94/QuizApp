package com.davidthar.quizapp.model


/*
** Coded by David Montes on 08/03/2022.
** https://github.com/davidthar
*/

class QuizProvider {
    companion object{

        fun createQuestionList(randomSet : HashSet<Int>): List<QuizModel>{
            val randomQuestionList = mutableListOf<QuizModel>()
            randomSet.forEach{
                randomQuestionList.add(questions[it])
            }
            return randomQuestionList
        }

        private val questions = listOf(
            QuizModel(
                question = "Cual es el nombre del perro que protege la Piedra Filosofal?",
                url = "https://i.ibb.co/r4xY6CZ/1.jpg",
                answer1 = "Fluffy",
                answer2 = "El Grim",
                answer3 = "Scabbers",
                correctAnswer = 1
            ),
            QuizModel(
                question = "Quien es el heredero de Slytherin?",
                url = "https://i.ibb.co/hMQmgJG/2.jpg",
                answer1 = "Draco Malfoy",
                answer2 = "Sirius Black",
                answer3 = "Tom Riddle",
                correctAnswer = 3
            ),
            QuizModel(
                question = "En que calle vive la familia Dursley?",
                url = "https://i.ibb.co/b3hRzkF/3.jpg",
                answer1 = "Privet Drive",
                answer2 = "Grimmauld Place",
                answer3 = "Magnolia Crescent",
                correctAnswer = 1
            ),
            QuizModel(
                question = "A que niña mató el basilisco?",
                url = "https://i.ibb.co/LCvj2Dm/4.jpg",
                answer1 = "Ginny",
                answer2 = "Myrtle",
                answer3 = "Lavender",
                correctAnswer = 2
            ),
            QuizModel(
                question = "Quien le entrega la capa de invisibilidad a Harry?",
                url = "https://i.ibb.co/gb8XDXL/5.jpg",
                answer1 = "Profesora McGonagall",
                answer2 = "Dumbledore",
                answer3 = "Sirius Black",
                correctAnswer = 2
            ),
            QuizModel(
                question = "Que animales tiran del carruaje de Hogwarts?",
                url = "https://i.ibb.co/ZxsS6vx/6.jpg",
                answer1 = "Centauros",
                answer2 = "Hipogrifos",
                answer3 = "Thestrals",
                correctAnswer = 3
            ),
            QuizModel(
                question = "Cómo se llama la mascota de Neville?",
                url = "https://i.ibb.co/6wQDVQR/7.jpg",
                answer1 = "Trevor",
                answer2 = "Crookshanks",
                answer3 = "Scabbers",
                correctAnswer = 1
            ),
            QuizModel(
                question = "Cómo se llama el cuarto libro de la saga?",
                url = "https://i.ibb.co/2FRCZmG/8.jpg",
                answer1 = "La Orden del Fénix",
                answer2 = "El Misterio del Príncipe",
                answer3 = "El cáliz de fuego",
                correctAnswer = 3
            ),
            QuizModel(
                question = "Quien entrega a Harry su carta de Hogwarts?",
                url = "https://i.ibb.co/0hZqBzp/9.jpg",
                answer1 = "Dumbledore",
                answer2 = "Profesora McGonagall",
                answer3 = "Hagrid",
                correctAnswer = 3
            ),
            QuizModel(
                question = "A que familia servía Dobby?",
                url = "https://i.ibb.co/W0RKVyR/10.jpg",
                answer1 = "Dursley",
                answer2 = "Malfoy",
                answer3 = "Lestrange",
                correctAnswer = 2
            ),
            //10 ^
            QuizModel(
                question = "Que hermano de Ron muere en el último libro?",
                url = "https://i.ibb.co/JQTk0Q8/11.jpg",
                answer1 = "Fred",
                answer2 = "Charlie",
                answer3 = "George",
                correctAnswer = 1
            ),
            QuizModel(
                question = "A qué se dedican los padres de Hermione?",
                url = "https://i.ibb.co/kh4tCf9/12.jpg",
                answer1 = "Aurores",
                answer2 = "Médicos",
                answer3 = "Dentistas",
                correctAnswer = 3
            ),
            QuizModel(
                question = "Quién era realmente Scabbers?",
                url = "https://i.ibb.co/xHgM7cz/13.jpg",
                answer1 = "Sirius Black",
                answer2 = "Peter Pettigrew",
                answer3 = "Remus Lupin",
                correctAnswer = 2
            ),
            QuizModel(
                question = "Cómo se llama el hermano de Albus Dumbledore?",
                url = "https://i.ibb.co/dkZrscf/14.jpg",
                answer1 = "Alfred",
                answer2 = "Arthur",
                answer3 = "Aberforth",
                correctAnswer = 3
            ),
            QuizModel(
                question = "Cuál es el hechizo contra los dementores?",
                url = "https://i.ibb.co/BNdz469/15.jpg",
                answer1 = "Wingardium Leviosa",
                answer2 = "Expecto Patronum",
                answer3 = "Avada Kedavra",
                correctAnswer = 2
            ),
            QuizModel(
                question = "Cómo se llama el hipogrifo de Hagrid?",
                url = "https://i.ibb.co/kM1LQ09/16.jpg",
                answer1 = "Buckbeack",
                answer2 = "Dobby",
                answer3 = "Fawkes",
                correctAnswer = 1
            ),
            QuizModel(
                question = "Que día cumple años Harry?",
                url = "https://i.ibb.co/C79ng3g/17.jpg",
                answer1 = "31 de Agosto",
                answer2 = "31 de Mayo",
                answer3 = "31 de Julio",
                correctAnswer = 3
            ),
            QuizModel(
                question = "Que pelota otorga más puntos en el Quidditch?",
                url = "https://i.ibb.co/YD49Rzf/18.jpg",
                answer1 = "Bludger",
                answer2 = "Snitch Dorada",
                answer3 = "Quaffle",
                correctAnswer = 2
            ),
            QuizModel(
                question = "A que casa pertence Luna Lovegood?",
                url = "https://i.ibb.co/5MMwCD0/19.jpg",
                answer1 = "Ravenclaw",
                answer2 = "Hufflepuff",
                answer3 = "Gryffindor",
                correctAnswer = 1
            ),
            QuizModel(
                question = "Que muestra el espejo de Oesed?",
                url = "https://i.ibb.co/s6KBbbk/20.jpg",
                answer1 = "Futuro",
                answer2 = "Miedos",
                answer3 = "Deseos",
                correctAnswer = 3
            ),
            //20 ^
            QuizModel(
                question = "Cuantas maldiciones imperdonables existen?",
                url = "https://i.ibb.co/jwxdGfn/21.jpg",
                answer1 = "2",
                answer2 = "3",
                answer3 = "4",
                correctAnswer = 2
            ),
            QuizModel(
                question = "Hechizo para atraer objetos",
                url = "https://i.ibb.co/dLhp9Rj/22.jpg",
                answer1 = "Wingardium Leviosa",
                answer2 = "Accio",
                answer3 = "Lumos",
                correctAnswer = 2
            ),
            QuizModel(
                question = "Quién era el Príncipe Mestizo?",
                url = "https://i.ibb.co/P6fr4MV/23.jpg",
                answer1 = "Lord Voldemort",
                answer2 = "Remus Lupin",
                answer3 = "Severus Snape",
                correctAnswer = 3
            ),
            QuizModel(
                question = "Que otro niño podría haber sido el elegido?",
                url = "https://i.ibb.co/rsqYNKx/24.jpg",
                answer1 = "Neville Longbotton",
                answer2 = "Draco Malfoy",
                answer3 = "Ron Weasley",
                correctAnswer = 1
            ),
            QuizModel(
                question = "Quien mata finalmente a Dumbledore?",
                url = "https://i.ibb.co/Vp5PFRR/25.jpg",
                answer1 = "Draco Malfoy",
                answer2 = "Lord Voldemort",
                answer3 = "Severus Snape",
                correctAnswer = 3
            ),
            QuizModel(
                question = "Que quiere ser Harry de mayor?",
                url = "https://i.ibb.co/hR4xnTm/26.jpg",
                answer1 = "Director",
                answer2 = "Auror",
                answer3 = "Ministro de Magia",
                correctAnswer = 2
            ),
            QuizModel(
                question = "Quien creó la piedra filosofal?",
                url = "https://i.ibb.co/k4n5m7V/27.jpg",
                answer1 = "Nicolas Flammel",
                answer2 = "Albus Dumbledore",
                answer3 = "Gellert Grindewald",
                correctAnswer = 1
            ),
            QuizModel(
                question = "Que forma tiene el patronus de Harry?",
                url = "https://i.ibb.co/ZhPMJ5r/28.jpg",
                answer1 = "Nutria",
                answer2 = "Fénix",
                answer3 = "Ciervo",
                correctAnswer = 3
            ),
            QuizModel(
                question = "Que monstruo hay en la cámara de los secretos?",
                url = "https://i.ibb.co/vc8Ydy1/29.jpg",
                answer1 = "Acromántula",
                answer2 = "Basilisco",
                answer3 = "Trol",
                correctAnswer = 2
            ),
            QuizModel(
                question = "A quién deja Dumbledore en herencia el desiluminador?",
                url = "https://i.ibb.co/RgCZ9F5/30.jpg",
                answer1 = "Ron Weasley",
                answer2 = "Harry Potter",
                answer3 = "Hermione Granger",
                correctAnswer = 1
            )
        )
    }
}