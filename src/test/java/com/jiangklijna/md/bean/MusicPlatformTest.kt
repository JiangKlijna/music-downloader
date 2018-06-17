package com.jiangklijna.md.bean

import org.junit.Assert
import org.junit.Test

class MusicPlatformTest {

	@Test
	fun nameEquals() {
		Assert.assertEquals(MusicPlatform.wy.name, "wy")
		Assert.assertEquals(MusicPlatform.xm.name, "xm")
		Assert.assertEquals(MusicPlatform.qq.name, "qq")
		Assert.assertEquals(MusicPlatform.bd.name, "bd")
		Assert.assertEquals(MusicPlatform.kg.name, "kg")
	}

	@Test
	fun ifExist() {
		val values = MusicPlatform.values()
		Assert.assertTrue(MusicPlatform.wy in values)
		Assert.assertTrue(MusicPlatform.xm in values)
		Assert.assertTrue(MusicPlatform.qq in values)
		Assert.assertTrue(MusicPlatform.bd in values)
		Assert.assertTrue(MusicPlatform.kg in values)
	}

	@Test
	fun ifPathExist() {
		MusicPlatform.values().forEach {
			val url = System::class.java.getResource(it.path)
			Assert.assertNotNull(url)
		}
	}

}