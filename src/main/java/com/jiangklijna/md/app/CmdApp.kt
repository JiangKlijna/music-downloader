package com.jiangklijna.md.app

import com.jiangklijna.md.bean.Music
import com.jiangklijna.md.command.FirstCmd
import com.jiangklijna.md.command.SecondCmd
import java.util.*

class CmdApp {

	val command: String
		get() = scanner.next()

	val first = FirstCmd(this)
	val second = SecondCmd(this)

	fun start() {
		println("音乐下载器, 输入:exit退出")
		first.work()
	}

	fun back() {

	}

	fun stop() {
		System.gc()
		System.exit(0)
	}

	fun onMusicCallBack(music: Music) {
		second.work(music)
	}

	companion object {
		val run = { CmdApp().start() }
		val scanner = Scanner(System.`in`)
	}
}
