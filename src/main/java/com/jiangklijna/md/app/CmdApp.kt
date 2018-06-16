package com.jiangklijna.md.app

import com.jiangklijna.md.bean.Music
import com.jiangklijna.md.bean.MusicItem
import com.jiangklijna.md.command.BaseCmd
import com.jiangklijna.md.command.FirstCmd
import com.jiangklijna.md.command.SecondCmd
import com.jiangklijna.md.command.ThirdCmd
import java.util.*

class CmdApp {

	val command: String
		get() = scanner.next()

	val first = FirstCmd(this)
	val second = SecondCmd(this)
	val third = ThirdCmd(this)

	fun start() {
		println("音乐下载器, 输入:exit退出")
		first.work()
	}

	fun stop() {
		System.gc()
		System.exit(0)
	}

	fun onMusicCallBack(music: Music) {
		second.work(music)
		second.destory()
	}

	fun onMusicItemCallBack(item: MusicItem) {
		third.work(item)
		third.destory()
	}

	fun goto(from: BaseCmd, to: BaseCmd) {
		to.work()
		from.destory()
	}

	companion object {
		val run = { CmdApp().start() }
		val scanner = Scanner(System.`in`)
	}
}
