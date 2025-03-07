// Questão 1: Operadores Lógicos
// a) Exemplo de uso de operadores lógicos AND (&&) e OR (||)
fun operadoresLogicos() {
    val a = true
    val b = false

    // Operador AND (&&) - ambos precisam ser verdadeiros
    if (a && b) {
        println("Ambos são verdadeiros")
    } else {
        println("Pelo menos um é falso") // Isso será impresso
    }

    // Operador OR (||) - basta um ser verdadeiro
    if (a || b) {
        println("Pelo menos um é verdadeiro") // Isso será impresso
    }
}

// b) Exercício para você:
// Crie uma função que verifique se uma pessoa tem permissão para votar (idade >= 16)
// e se ela é maior de idade (idade >= 18). Utilize operadores lógicos AND (&&) e OR (||)
// para verificar essas condições.
fun votation() {
    print("Quantos anos você tem? ")
    val age = readLine()!!.toInt()
    if (age >= 16 && age < 18) {
        println("Pode votar")
    }else if (age >= 18) {
        println("Pode votar e é maior de idade.")
    } else{
        println("Não pode votar, pois é menor de idade.")
    }
}

// Questão 2: Estrutura de controle if, else if, else
// a) Exemplo de uso de if, else if e else
//feito por I.A
fun controleIfElse() {
    val numero = 10

    if (numero > 10) {
        println("Maior que 10")
    } else if (numero == 10) {
        println("Igual a 10") // Isso será impresso
    } else {
        println("Menor que 10")
    }
}

// b) Exercício para você:
// Crie uma função que determine a classificação de um número de acordo com os seguintes critérios:
// - Se o número for maior que 1000, retorne "Número grande".
// - Se o número estiver entre 500 e 1000, retorne "Número médio".
// - Caso contrário, retorne "Número pequeno".
fun sizeNumeber(): String {
    print("Escolha um numero: ")
    val numSize = readLine()!!.toInt()
    if (numSize > 1000) {
        return "Número grande."
    }else if (numSize >= 500 && numSize <= 1000) {
        return "Número médio."
    }else {
        return "Número pequeno"
    }
}

// Questão 3: Estrutura when
// a) Exemplo de uso do when
fun controleWhen() {
    print("Escolha um numero de 1 a 5 e descubra qual o dia da semana: ")
    val diaDaSemana = readLine()!!.toInt()

    when (diaDaSemana) {
        1 -> println("Segunda-feira")
        2 -> println("Terça-feira")
        3 -> println("Quarta-feira") // Isso será impresso
        4 -> println("Quinta-feira")
        5 -> println("Sexta-feira")
        else -> println("Fim de semana")
    }
}

// b) Exercício para você:
// Crie uma função que use o `when` para determinar se um número é positivo, negativo ou zero.
fun typeNum() {
    print("Escolha um número: ")
    val typeNumero = readLine()!!.toInt()

    when (typeNumero) {
        in 1..Int.MAX_VALUE -> println("O número é positivo.")
        0 -> println("O número é 0.")
        else -> println("O número é negativo.")
    }
}

// Questão 4: Funções
// a) Exemplo de função simples em Kotlin
fun saudacao(nome: String): String {
    return "Olá, $nome!"
}

// b) Exercício para você:
// Crie uma função que receba dois números inteiros e retorne o produto deles.
fun twoNum(): Int {
    println("Escolha o primeiro número para o sistema multiplicar: ")
    print("")
    println("Escolha o segundo número para o sistema multiplicar: ")
    val num1 = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("Entrada inválida para o primeiro número.")
    val num2 = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("Entrada inválida para o segundo número.")
    return num1 * num2
}

fun main() {
    println(votation())
    println(sizeNumeber())
    controleWhen()
    typeNum()
    println(twoNum())


}
