fun main(args: Array<String>) {
    //Crie um código que pede para o usuário digitar o diâmetro de um círculo
    // (que será uma variável do tipo Int) e calcule a área e o perímetro (que serão Doubles).
   // 4 - Faça uma conversão de tipos (de Int para Double) quando for calcular os resultados

    var diametro:Int

 print("digite o diametro")
 diametro = readLine()!!.toInt()



    var pI=3.14
    var raio = diametro/ 2
    var area:Double= pI * (raio*raio)
    var perimetro: Double= 2 * pI * raio


    println("a area é: $area")
    println("o perimetro é: $perimetro")




}