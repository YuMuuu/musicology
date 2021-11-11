package cadenza


import com.flowtick.graphs.Relation
import com.flowtick.graphs.defaults.id.identifyAny

sealed trait Cadenza

object Cadenza {
  case object T extends Cadenza

  case object S extends Cadenza

  case object D extends Cadenza
}

object CadenzaGraph {

  import cadenza.Cadenza._
  import com.flowtick.graphs.Graph
  import com.flowtick.graphs.defaults._

  val a: Relation[Unit, Cadenza] = (T: Cadenza) --> ((), S: Cadenza)
  val b: Relation[Unit, Cadenza] = (S: Cadenza) --> ((), D: Cadenza)
  val c: Relation[Unit, Cadenza] = (T: Cadenza) --> ((), D: Cadenza)

  val e: Relation[Unit, Cadenza] = (T: Cadenza) --> ((), T: Cadenza)
  val f: Relation[Unit, Cadenza] = (S: Cadenza) --> ((), S: Cadenza)
  val g: Relation[Unit, Cadenza] = (D: Cadenza) --> ((), D: Cadenza)

  val graph: Graph[Unit, Cadenza] = Graph.fromEdges(Set[Relation[Unit, Cadenza]](a, b, c, e, f, g))

}
