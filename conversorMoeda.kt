fun main(){
    println("""
        Moedas Existentes:
        BRL - REAL
        USA - Dollar
        EUR - Euro  
        """.trimIndent()) 

    print("Informe a moeda origem (Ex: BRL): ")

    var moedaorigem = readLine()!!.uppercase()

    print("Informe a moeda destino (Ex: USD): ")

    var moedadestino = readLine()!!.uppercase()

    print("Informe a quantia em $moedaorigem: " )
    var quantia: Float = readLine()?.toFloatOrNull() ?: 0f

    var TaxaRealparaDolar = 4.95
    var TaxaRealparaEuro = 5.38
    var TaxaDolarparaEuro = 1.10

    var conversao = when{
        moedaorigem == "BRL" && moedadestino == "USD" -> quantia / TaxaRealparaDolar
        moedaorigem == "BRL" && moedadestino == "EUR" -> quantia / TaxaRealparaEuro
        moedaorigem == "USD" && moedadestino == "BRL" -> quantia * TaxaRealparaDolar
        moedaorigem == "USD" && moedadestino == "EUR" -> quantia / TaxaDolarparaEuro
        moedaorigem == "EUR" && moedadestino == "BRL" -> quantia * TaxaRealparaEuro
        moedaorigem == "EUR" && moedadestino == "USD" -> quantia * TaxaDolarparaEuro
        else -> quantia
    }

    println("O valor em $moedadestino = %.2f" .format(conversao))
}