
import kotlin.math.sqrt



fun numPrimo(n: Int): Boolean {
    if (n <= 1) 
    {
        return false
    }
    if (n == 2)
    {
        return true 
    }
    if (n % 2 == 0) 
    {
        return false  
    }
    
    for (i in 3..sqrt(n.toDouble()).toInt() step 2) {
        if (n % i == 0) 
        {
            return false 
        }
    }
    return true  
}


fun main() {
    val numero = 7  
    if (numPrimo(numero))
    {
        println("$numero es primo")
    } 
    else 
    {
        println("$numero no es primo")
    }
}
