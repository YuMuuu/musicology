package note

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class PitchSpec extends AnyFlatSpec with should.Matchers:

  "pitch" should "c4の5度上がg4になる" in {
    Pitch.c4 + Interval(1, 0) shouldBe Pitch.g4
  }

  //  it should "c4の5度下がf3になる" in {
  //    Pitch.c4.+(Interval(-1, 0)) shouldBe Pitch(-1, 0)
  //  }
  it should "g4とc4の差は5度になる" in {
    Pitch.g4 - Pitch.c4 shouldBe Interval(1, 0)
  }

  it should "c4のmidinotenumberは60である" in {
    Pitch.c4.midiNoteNumber() shouldBe 60
  }

  it should "Pitch objectで定義されたpitchが正しいか" in {
    Pitch.a4.midiNoteNumber() shouldBe 57
    Pitch.bbb4.midiNoteNumber() shouldBe 57

    Pitch.as4.midiNoteNumber() shouldBe 58
    Pitch.bb4.midiNoteNumber() shouldBe 58

    Pitch.cb4.midiNoteNumber() shouldBe 59
    Pitch.b4.midiNoteNumber() shouldBe 59

    Pitch.bs4.midiNoteNumber() shouldBe 60
    Pitch.c4.midiNoteNumber() shouldBe 60
    Pitch.dbb4.midiNoteNumber() shouldBe 60

    Pitch.cs4.midiNoteNumber() shouldBe 61
    Pitch.db4.midiNoteNumber() shouldBe 61

    Pitch.d4.midiNoteNumber() shouldBe 62
    Pitch.ebb4.midiNoteNumber() shouldBe 62

    Pitch.ds4.midiNoteNumber() shouldBe 63
    Pitch.eb4.midiNoteNumber() shouldBe 63

    Pitch.e4.midiNoteNumber() shouldBe 64
    Pitch.fb4.midiNoteNumber() shouldBe 64

    Pitch.es4.midiNoteNumber() shouldBe 65
    Pitch.f4.midiNoteNumber() shouldBe 65

    Pitch.fs4.midiNoteNumber() shouldBe 66
    Pitch.gb4.midiNoteNumber() shouldBe 66

    Pitch.g4.midiNoteNumber() shouldBe 67
    Pitch.abb4.midiNoteNumber() shouldBe 67

    Pitch.gs4.midiNoteNumber() shouldBe 68
    Pitch.ab4.midiNoteNumber() shouldBe 68

  }
