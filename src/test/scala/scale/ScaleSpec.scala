package scale

import note.Pitch

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import cats.data.NonEmptyList

class ScaleSpec extends AnyFlatSpec with should.Matchers:

  "major scala" should "c major scaleの構成音がドレミファソラシである" in {
    ScaleImpl.cMajorScale.oneOctavetangePitches shouldBe NonEmptyList.of(
      Pitch.c4,
      Pitch.d4,
      Pitch.e4,
      Pitch.f4,
      Pitch.g4,
      Pitch.a4,
      Pitch.b4
    )
  }

  "minor scala" should "c major scaleの構成音がドレミbファソラbシbである" in {
    ScaleImpl.cMinorScale.oneOctavetangePitches shouldBe NonEmptyList.of(
      Pitch.c4,
      Pitch.d4,
      Pitch.eb4,
      Pitch.f4,
      Pitch.g4,
      Pitch.ab4,
      Pitch.bb4
    )
  }
