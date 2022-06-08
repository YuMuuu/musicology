package note

/** 相対的な音程を表す
  *
  * @param fifths
  *   cから何回五度上に移動したか
  * @param octave
  *   fifthsからoctave上に何回移動したか
  */
case class Interval(fifths: Int, octave: Int):
  def +(interval: Interval): Interval =
    Interval(this.fifths + interval.fifths, this.octave + interval.octave)

  def -(interval: Interval): Interval =
    Interval(this.fifths - interval.fifths, this.octave - interval.octave)

  def isSameFifths(that: Interval): Boolean = this.fifths == that.fifths

object Interval:
  val unit = Interval(0, 0) //基準音


  val oneOctaveUp = Interval(0, 1)
  val oneOctaveDown = Interval(0, -1)


object NamedInterval {
  // 各サイト記述が足りなかったり間違えてたりする

  // https://jp.yamaha.com/services/music_pal/study/score/pitch/index.html
  // https://happylilac.net/pdf/pg0023-music03-02.pdf
  // - それぞれの音程同士の関係
  // - これの減３度の説明間違えてない？？

  //http://guitarex.web.fc2.com/knowledge/degree_5.html
  //- ただしそう



  // - 完全系
  //   - 1 4 5 8
  // - 長短系
  //   - 2 3 6 7

  
  // 下記が全パターンある？？　減1度なんて存在するのか？
  //  n = 1, 4, 5, 6
  //  m = 2, 3, 6, 7 
  //  重減n 減n 完全n 増n 重減n
  //  重減m 減m 短m 長m 重増m
  
}


