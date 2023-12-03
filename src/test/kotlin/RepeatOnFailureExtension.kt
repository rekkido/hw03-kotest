import io.kotest.core.annotation.AutoScan
import io.kotest.core.extensions.TestCaseExtension
import io.kotest.core.test.TestCase
import io.kotest.core.test.TestResult

@AutoScan
class RepeatOnFailureExtension : TestCaseExtension {
    private val repeat = 2
    override suspend fun intercept(testCase: TestCase, execute: suspend (TestCase) -> TestResult): TestResult {
        lateinit var result: TestResult
        for (i in 0..<repeat) {
            result = execute(testCase)
            if (result.isSuccess) break
        }
        return result
    }
}