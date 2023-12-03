import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MainTest : FunSpec({
    test("returnsFalse() returns false") {
        returnsFalse() shouldBe false
    }
    test("returnsTrue() returns true") {
        returnsTrue() shouldBe true
    }
})