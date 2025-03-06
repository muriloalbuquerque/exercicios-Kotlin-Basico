fun main(args: Array<String>) {
// **Exercício 1:**
// Crie uma variável `numero` do tipo Int e atribua um valor qualquer.
// Use um `if` para verificar se o número é maior que 10. Imprima "Maior que 10" ou "Menor ou igual a 10".
    //println("Digite um numero: ")
/*val numero: Int =readLine()!!.toInt()
    numero != null
    if (numero >= 10) {
        println("Maior que dez")
    }else if (numero <= 10){
        println("Menor que dez")
    }else{
        println("O numero é nulo.")
    }*/
// **Exercício 2:**
// Crie uma variável `temperatura` do tipo Double e atribua um valor.
// Se a temperatura for maior que 25, imprima "Está quente",
// se for menor ou igual a 25, imprima "Está frio". Use um `if/else`.
/*    println("Diga a temperatura e descubra se esta quente, frio ou ambiente: ")
val temperatura = readln().toDouble()
    if (temperatura >= 25) {
        println("Esta quente.")
    } else if (temperatura < 25 && temperatura >= 20) {
        println("Clima normal")
    }else {
        println("Está frio")
    }*/
// **Exercício 3:**
// Crie uma variável `nome` do tipo String. Atribua seu nome a ela.
// Use o `when` para verificar se o nome é "Murilo".
// Se for, imprima "Olá, Murilo!" e se não, imprima "Olá, visitante!".
/*    println("Quem esta acessando? ")
val name = readln().toString()
    when {
        name.equals("Murilo",  true) -> println("Olá Murilo")
        else -> println("Ola visitante")

    }*/
// **Exercício 4:**
// Crie duas variáveis, `a` e `b` do tipo Int. Atribua valores a ambas.
// Use operadores aritméticos para imprimir a soma, subtração, multiplicação e divisão.
/*    println("Escolha dois numeros e descubra a soma, subtração, multiplicação e divisão.")
    print("Escolha o primeiro numero:")
val a = readLine()!!.toDouble()
    print("Escolha o segundo numero")
val b = readLine()!!.toDouble()

println("A soma de a + b = ${a + b}")
println("A subtração de a - b = ${a - b}")
println("A multiplicação de a * b = ${a * b}")
println("A divisão de a / b = ${a / b}")*/

// **Exercício 5:**
// Crie uma variável `isActive` do tipo Boolean e atribua `true` ou `false` a ela.
// Se `isActive` for verdadeiro, imprima "Está ativo", se for falso, imprima "Não está ativo".
/*    print("Descubra se esta ativado ou desativado escrevendo 'true' ou 'false': ")
val isActive = readLine().toBoolean()
    if(isActive == true) {
        println("esta ativo")
    }else {
        println("Esta desativado")
    }*/
// **Exercício 6:**
// Crie uma variável `numero` do tipo Int que pode ser nulo. Atribua `null` a ela.
// Usando o operador `?.`, imprima o valor de `numero` multiplicado por 2, caso não seja nulo.
// Se for nulo, imprima "Valor nulo".
   /* print("Escolha um número e descubra o dobro dele: ")
    val numeroMultiplicado = readLine()?.toIntOrNull()
    if (numeroMultiplicado == null) {
        println("O numero é nulo")
    }else{
        println("O dobro do seu numero é igual a : ${numeroMultiplicado * 2}")
    }*/

}