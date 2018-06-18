package com.jiangklijna.md.bean

import org.junit.Assert
import org.junit.Test
import java.util.concurrent.atomic.AtomicInteger
import com.jiangklijna.md.common.Function.random

class MusicTest {

	val i = AtomicInteger(0)

	val fakeMusic: Music
		get() = Music(
				name = "fake${i.getAndIncrement()}",
				author = "faker${i.getAndIncrement()}",
				platform = MusicPlatform.values().random(),
				infoUrl = "http://fake${i.getAndIncrement()}.com"
		)

	@Test
	fun equalsTest() {
		Assert.assertNotEquals(fakeMusic, fakeMusic)
		fakeMusic.let {
			Assert.assertTrue(it == it.copy())
		}
	}

	@Test
	fun hashcodeTest() {
		fakeMusic.let {
			Assert.assertEquals(it.hashCode(), it.copy().hashCode())
		}
	}

}