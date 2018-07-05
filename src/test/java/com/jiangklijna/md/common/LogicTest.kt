package com.jiangklijna.md.common

import org.junit.Assert
import org.junit.Test

class LogicTest{

	@Test
	fun wy_search() {
		Logic.wy_search("abc", 1, {
			Assert.assertNotNull(it!!)
			Assert.assertFalse(it.isEmpty())
		}, false)
	}

	@Test
	fun xm_search() {
		Logic.xm_search("abc", 1, {
			Assert.assertNotNull(it!!)
			Assert.assertFalse(it.isEmpty())
		}, false)
	}

	@Test
	fun qq_search() {
		Logic.qq_search("abc", 1, {
			Assert.assertNotNull(it!!)
			Assert.assertFalse(it.isEmpty())
		}, false)
	}

	@Test
	fun bd_search() {
		Logic.bd_search("abc", 1, {
			Assert.assertNotNull(it!!)
			Assert.assertFalse(it.isEmpty())
		}, false)
	}

	@Test
	fun kg_search() {
		Logic.kg_search("abc", 1, {
			Assert.assertNotNull(it!!)
			Assert.assertFalse(it.isEmpty())
		}, false)
	}
}