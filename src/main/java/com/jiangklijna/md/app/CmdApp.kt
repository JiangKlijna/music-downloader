package com.jiangklijna.md.app

import com.jiangklijna.md.bean.Music
import com.jiangklijna.md.command.FirstCmd
import com.jiangklijna.md.command.SecondCmd
import java.util.*

class CmdApp {

	var level = 0
	val command: String
		get() = scanner.next()

	val first = FirstCmd(this)
	val second = SecondCmd(this)

	fun start() {
		level = 0
		println("音乐下载器, 输入:exit退出")
		first.work()
	}

	fun back() {

	}

	fun stop() {
		System.exit(0)
	}

	fun onSearchCallBack(list: List<Music>) {

	}

	companion object {
		val run = { CmdApp().start() }
		val scanner = Scanner(System.`in`)
	}
}
