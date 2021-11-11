package note

import cats.Group

/**
 * 音程の操作は群をなす
 */
object IntervalGroupInstance extends Group[Interval] {
  override def inverse(a: Interval): Interval = Interval(-a.fifths, -a.octave)

  // 楽典では単位元は一度。キレるぞ
  override def empty: Interval = Interval(0, 0)

  override def combine(x: Interval, y: Interval): Interval = Interval(x.fifths + y.fifths, x.octave + y.octave)
}
