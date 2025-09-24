
# Algoritmos en Kotlin

Este proyecto implementa varios algoritmos comunes en Kotlin. Los algoritmos incluidos son:

1. Números primos
2. Cálculo del factorial de un número
3. Algoritmo DFS (Búsqueda en profundidad)
4. Algoritmo de Euclides (MCD)

## Descripción

### 1. Saber si un número es primo

En esta implementación, se verifica si un número es primo comprobando si es divisible solo por 1 y él mismo. Si el número tiene algún otro divisor, no es primo.

* Entrada: Un número entero.
* Salida: `true` si el número es primo, `false` si no lo es.
  
### 2. Cálculo del factorial de un número

Este algoritmo calcula el factorial de un número entero de manera recursiva.

* Entrada: Un número entero `n`.
* Salida: El factorial de `n` (n! = n × (n-1) × ... × 1).

### 3. Algoritmo DFS (Búsqueda en profundidad)

Este algoritmo implementa la búsqueda en profundidad (DFS) utilizando una lista de adyacencia para representar el grafo. El algoritmo explora de forma recursiva cada nodo y sus conexiones, marcando los nodos visitados para evitar ciclos.

* Entrada: El grafo representado como una lista de listas de enteros.
* Salida: La secuencia de nodos visitados, impresos en orden.

### 4. Algoritmo de Euclides (MCD)

Este algoritmo encuentra el Máximo Común Divisor (MCD) entre dos números utilizando el algoritmo de Euclides. La implementación usa un bucle `while` para realizar las divisiones sucesivas hasta encontrar el MCD.

* Entrada: Dos números enteros.
* Salida: El MCD de los dos números.



## Instrucciones para ejecutar el proyecto

1. Asegúrate de tener un compilador de Kotlin 
2. Abre el archivo `algoritmos.kt`.
3. Ejecuta el archivo para ver cómo funcionan los algoritmos.
4. Modifica los valores de entrada según desees para probar los algoritmos con diferentes datos.

## Estructura del proyecto

El proyecto contiene los siguientes archivos:

* **`algoritmos.kt`**: Contiene la implementación principal con todos los algoritmos.
* **`dfs.kt`**: Contiene la implementación del algoritmo de Búsqueda en Profundidad (DFS).
* **`euclides.kt`**: Contiene la implementación del algoritmo de Euclides para el cálculo del MCD.
* **`factorial.kt`**: Contiene la implementación para calcular el factorial de un número.
* **`primo.kt`**: Contiene la implementación para verificar si un número es primo.

