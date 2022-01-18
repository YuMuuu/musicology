package cadenza


sealed trait Cadenza

object Cadenza:
  case object T extends Cadenza

  case object S extends Cadenza

  case object D extends Cadenza

object CadenzaGraph:

  // val a: Relation[Unit, Cadenza] = (T: Cadenza) --> ((), S: Cadenza)
  // val b: Relation[Unit, Cadenza] = (S: Cadenza) --> ((), D: Cadenza)
  // val c: Relation[Unit, Cadenza] = (T: Cadenza) --> ((), D: Cadenza)

  // val e: Relation[Unit, Cadenza] = (T: Cadenza) --> ((), T: Cadenza)
  // val f: Relation[Unit, Cadenza] = (S: Cadenza) --> ((), S: Cadenza)
  // val g: Relation[Unit, Cadenza] = (D: Cadenza) --> ((), D: Cadenza)

  // val graph: Graph[Unit, Cadenza] =
  //   Graph.fromEdges(Set[Relation[Unit, Cadenza]](a, b, c, e, f, g))
  // graphs-catsがsclaa3に対応していないので状態遷移の部分はコメントアウトする
  println("graphs-catsがsclaa3に対応していないので状態遷移の部分はコメントアウトする")
