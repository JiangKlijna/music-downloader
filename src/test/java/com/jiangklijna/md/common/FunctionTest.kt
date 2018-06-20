package com.jiangklijna.md.common

import com.jiangklijna.md.common.Function.println
import com.jiangklijna.md.common.Function.random
import com.jiangklijna.md.common.Function.ifnot
import com.jiangklijna.md.common.Function.iftrue
import com.jiangklijna.md.common.Function.safeCast
import org.junit.Assert
import org.junit.Test

class FunctionTest {

	@Test
	fun testIf() {
		true.iftrue { }.ifnot { Assert.fail("it is true") }
		false.iftrue { Assert.fail("it is false") }.ifnot { }
	}

	@Test
	fun testSafeCast() {
		(1 as Any).safeCast<Int> { }
		(1 as Any).safeCast<String> { Assert.fail("it type is Int") }
	}

	@Test
	fun testRandom() {
		val arr = Array(100, { it })
		arr.random().println()
		arr.random { it.println() }
	}

}
