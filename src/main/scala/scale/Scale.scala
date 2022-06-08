package scale

import note.Interval
import note.Pitch

import cats.data.NonEmptyList
import cats.data.NonEmptySet

/** スケールを表す
  * @param base
  *   スケールのベース音を表す
  * @param notes
  *   baseから見た相対的なスケールの音
  * @param pitches
  *   絶対的なスケールの音
  */

//memo: notesに入れるintervalの制約が弱い？
//memo: １オクターブ分しかスケールではないみたいなモデリングになっている
trait Scale:
  def base: Pitch
  def notes: NonEmptyList[Interval] //NonEmptySetのほうが正しい？
  val oneOctavetangePitches: NonEmptyList[Pitch] =
    notes.map(base + _) //１オクターブ内のスケールの音程

case class MajorScale(base: Pitch) extends Scale:
  def notes = NonEmptyList.of(
    Interval(0, 0),
    Interval(2, -1),
    Interval(4, -2),
    Interval(-1, 1),
    Interval(1, 0),
    Interval(3, -2),
    Interval(5, -3)
  )

case class MinorScale(base: Pitch) extends Scale:
  def notes = NonEmptyList.of(
    Interval(0, 0),
    Interval(2, -1),
    Interval(-3, 2),
    Interval(-1, 1),
    Interval(1, 0),
    Interval(-4, 3),
    Interval(-2, 1)
  )

object ScaleImpl:
  val cMajorScale: MajorScale = MajorScale(Pitch.c4)
  val dMajorScale: MajorScale = MajorScale(Pitch.d4)
  val eMajorScale: MajorScale = MajorScale(Pitch.e4)
  val fMajorScale: MajorScale = MajorScale(Pitch.f4)
  val gMajorScale: MajorScale = MajorScale(Pitch.g4)
  val aMajorScale: MajorScale = MajorScale(Pitch.a4)
  val bMajorScale: MajorScale = MajorScale(Pitch.b4)

  val cMinorScale: MinorScale = MinorScale(Pitch.c4)
  val dMinorScale: MinorScale = MinorScale(Pitch.d4)
  val eMinorScale: MinorScale = MinorScale(Pitch.e4)
  val fMinorScale: MinorScale = MinorScale(Pitch.f4)
  val gMinorScale: MinorScale = MinorScale(Pitch.g4)
  val aMinorScale: MinorScale = MinorScale(Pitch.a4)
  val bMinorScale: MinorScale = MinorScale(Pitch.b4)
