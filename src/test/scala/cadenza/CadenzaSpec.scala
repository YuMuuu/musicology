package cadenza

import cadenza.Cadenza.T
import cadenza.CadenzaGraph.graph
import com.flowtick.graphs.algorithm.GraphOps
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class CadenzaSpec  extends AnyFlatSpec with should.Matchers {{
  import com.flowtick.graphs.Graph
  import com.flowtick.graphs.algorithm._
  import com.flowtick.graphs.defaults._


  "cadenza" should "描画できる" in {
    println("print graph")
    println(cadenza.CadenzaGraph.graph)
    println("-----")
    println("深さ優先探索")
    println(graph.dfs("T").steps.map(_.node.id).toList)
    println(graph.dfs("S").steps.map(_.node.id).toList)
    println("-----")
    println("幅優先探索")
    println(graph.bfs("T").steps.map(_.node.id).toList)
    println()
    println("-----")
    println("とぽそ")
    println(graph.topologicalSort)



//    List(Step((D: 'D'),None,Some(0)),
    //    Step((S: 'S'),None,Some(0)),
    //    Step((T: 'T'),None,Some(0)),
    //    Step((D: 'D'),Some(T-()-D: (T) --(())--> (D)),Some(1)),
    //    Step((S: 'S'),Some(T-()-S: (T) --(())--> (S)),Some(1)),
    //    Step((D: 'D'),Some(S-()-D: (S) --(())--> (D)),Some(2)))


  }
}
}
