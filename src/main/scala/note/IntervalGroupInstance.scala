package note

import cats.Group

/** 音程の操作は群をなす
  */
given IntervalGroupInstance: Group[Interval] with
  def inverse(a: Interval): Interval = Interval(-a.fifths, -a.octave)

  // 楽典では単位元は一度。キレるぞ
  def empty: Interval = Interval(0, 0)

  def combine(x: Interval, y: Interval): Interval =
    Interval(x.fifths + y.fifths, x.octave + y.octave)
