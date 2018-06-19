package com.jiangklijna.md.bean

import org.junit.Assert
import org.junit.Test
import java.util.concurrent.atomic.AtomicInteger
import java.util.*

class MusicItemTest {

	companion object {
		val i = AtomicInteger(0)

		val fakeMusicItem: MusicItem
			get() = MusicItem(
					name = "fake${i.getAndIncrement()}",
					realUrl = "http://fake${i.getAndIncrement()}.com",
					isMv = Random().nextBoolean(),
					music = MusicTest.fakeMusic
			)
	}

	@Test
	fun equalsTest() {
		Assert.assertNotEquals(fakeMusicItem, fakeMusicItem)
		fakeMusicItem.let {
			Assert.assertTrue(it == it.copy())
		}
	}

	@Test
	fun hashcodeTest() {
		fakeMusicItem.let {
			Assert.assertEquals(it.hashCode(), it.copy().hashCode())
		}
	}

}