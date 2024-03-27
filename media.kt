    fun main(){
        print ("Informe a quantidade de notas: ")

        var quant_nota = readLine()?.toIntOrNull() ?: 0

        var somanotas: Float = 0f

        for (cont in 1..quant_nota){
            print("Infome a nota $cont: ")
            var nota = readLine()?.toFloatOrNull() ?: 0f

            somanotas += nota
        }

        var media = somanotas / quant_nota

        var mediaformatada = "%.1f" .format(media)

        print("Media: $mediaformatada")
    } 