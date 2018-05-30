package com.jiangklijna.md.app

import com.jiangklijna.md.common.Logic.search
import com.jiangklijna.md.bean.MusicPlatform
import java.util.*

class CmdApp {

	var level = 0
	var platform: MusicPlatform = MusicPlatform.wy

	val read = Scanner(System.`in`)

	fun start() {
		println(platform.title + "搜索:")
		val key = read.next()
		val list = platform.search(key)
		list.forEachIndexed { index, music -> println(music) }
	}


	companion object {
		val run = { CmdApp().start() }
	}
}
