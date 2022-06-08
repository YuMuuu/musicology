package note

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class IntervalSpec extends AnyFlatSpec with should.Matchers:
  "isSameFifths" should "基準音と基準音のオクターブ上は同一の５度の差がある" in{
    assert(Interval(0, 0) isSameFifths Interval(0, 1))
  }


// it should "cの5度上はgである" in {
//   Interval.c + Interval(1, 0) shouldBe Interval.g
// }

// it should "cの5度下はfである" in {
//   Interval.c + Interval(-1, 0) shouldBe Interval.f
// }

// it should "cの5度上とcの(12+1)*5度は同一で" in {
//   // g と f##
//   Interval.c + Interval(1, 0) shouldBe Interval.c + Interval(13, 0)
// }
