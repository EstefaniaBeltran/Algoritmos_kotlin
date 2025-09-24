fun dfs(graph: List<List<Int>>, node: Int, visited: BooleanArray) 
{
 
    visited[node] = true
    println("Visitando nodo $node")

    
    for (neighbor in graph[node]) 
    {
        if (!visited[neighbor]) 
        {
            dfs(graph, neighbor, visited)  
        }
    }
}

fun main() 
{
  
    val graph = listOf(
        listOf(3, 4),  
        listOf(0, 5),  
        listOf(3),     
        listOf(0, 2),  
        listOf(1),     
        listOf(2)      
    )

    
    val visited = BooleanArray(graph.size)

    
    dfs(graph, 0, visited)
}
