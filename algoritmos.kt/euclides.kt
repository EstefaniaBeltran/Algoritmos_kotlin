fun al_euclides(num1: Int, num2: Int): Int
{
    var a = num1
    var b = num2

    
    while (b != 0) 
    {
        val temp = a % b  
        a = b 
        b = temp  
    }
    return a 
}

fun main()
{
    val numero1 = 57
    val numero2 = 75

    println("El MCD entre el numero $numero1 y el numero $numero2 es: ${al_euclides(numero1, numero2)}")
}
