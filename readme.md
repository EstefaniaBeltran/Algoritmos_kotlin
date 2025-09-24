¡Claro! A continuación te dejo un ejemplo de cómo podrías redactar el archivo `README.md` para tu proyecto. Este archivo explica brevemente cómo funciona el código y qué hiciste en cada parte.

---

# Algoritmos en Kotlin

Este proyecto implementa varios algoritmos comunes en Kotlin. Los algoritmos incluidos son:

1. **Algoritmo DFS (Búsqueda en profundidad)**
2. **Algoritmo de Euclides (MCD)**
3. **Detección de números primos**
4. **Cálculo del factorial de un número**

## Descripción

### 1. Algoritmo DFS (Búsqueda en profundidad)

Este algoritmo implementa la búsqueda en profundidad (DFS) utilizando una lista de adyacencia para representar el grafo. El algoritmo explora de forma recursiva cada nodo y sus conexiones, marcando los nodos visitados para evitar ciclos.

* **Entrada**: El grafo representado como una lista de listas de enteros.
* **Salida**: La secuencia de nodos visitados, impresos en orden.

#### Implementación:

```kotlin
fun dfs(graph: List<List<Int>>, node: Int, visited: BooleanArray) {
    visited[node] = true
    println("Visitando nodo $node")
    
    for (neighbor in graph[node]) {
        if (!visited[neighbor]) {
            dfs(graph, neighbor, visited)
        }
    }
}
```

### 2. Algoritmo de Euclides (MCD)

Este algoritmo encuentra el Máximo Común Divisor (MCD) entre dos números utilizando el algoritmo de Euclides. La implementación usa un bucle `while` para realizar las divisiones sucesivas hasta encontrar el MCD.

* **Entrada**: Dos números enteros.
* **Salida**: El MCD de los dos números.

#### Implementación:

```kotlin
fun al_euclides(num1: Int, num2: Int): Int {
    var a = num1
    var b = num2
    while (b != 0) {
        val temp = a % b
        a = b
        b = temp
    }
    return a
}
```

### 3. Saber si un número es primo

En esta implementación, se verifica si un número es primo comprobando si es divisible solo por 1 y él mismo. Si el número tiene algún otro divisor, no es primo.

* **Entrada**: Un número entero.
* **Salida**: `true` si el número es primo, `false` si no lo es.

#### Implementación:

```kotlin
fun esPrimo(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2 until num) {
        if (num % i == 0) return false
    }
    return true
}
```

### 4. Cálculo del factorial de un número

Este algoritmo calcula el factorial de un número entero de manera recursiva.

* **Entrada**: Un número entero `n`.
* **Salida**: El factorial de `n` (n! = n × (n-1) × ... × 1).

#### Implementación:

```kotlin
fun factorial(n: Int): Int {
    if (n == 0) return 1
    return n * factorial(n - 1)
}
```

## Instrucciones para ejecutar el proyecto

1. Asegúrate de tener instalado **Kotlin** en tu sistema. Puedes descargarlo desde [aquí](https://kotlinlang.org/).
2. Abre el archivo `algoritmos.kt` en tu editor favorito.
3. Ejecuta el archivo para ver cómo funcionan los algoritmos.
4. Modifica los valores de entrada según desees para probar los algoritmos con diferentes datos.

## Estructura del proyecto

El proyecto contiene los siguientes archivos:

* **`algoritmos.kt`**: Contiene la implementación principal con todos los algoritmos.
* **`dfs.kt`**: Contiene la implementación del algoritmo de Búsqueda en Profundidad (DFS).
* **`euclides.kt`**: Contiene la implementación del algoritmo de Euclides para el cálculo del MCD.
* **`factorial.kt`**: Contiene la implementación para calcular el factorial de un número.
* **`primo.kt`**: Contiene la implementación para verificar si un número es primo.

