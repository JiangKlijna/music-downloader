package com.jiangklijna.md.command

import com.jiangklijna.md.app.CmdApp
import com.jiangklijna.md.bean.MusicItemTest
import org.junit.After
import org.junit.Before
import org.junit.Test

class ThirdCmdTest {

	val third = CmdApp().third

	@Before
	fun init() {
		third.work(MusicItemTest.fakeMusicItem)
		third.print()
	}

	@Test
	fun download() {
		third.analysis(":again")()
	}

	@After
	fun destory() {
		third.destory()
		third.analysis(":exit")()
	}
}