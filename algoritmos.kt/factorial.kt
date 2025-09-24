fun factorial(numero:Int): Int 
{
    if (numero == 0 || numero == 1)
    {
        
        return 1
    }
    else 
    {
         return numero * factorial(numero - 1)
    }
}
 
fun main ()
{
    val numero = 7  
    val result = factorial(numero) 
    println("El factorial de $numero es $result ")
}
