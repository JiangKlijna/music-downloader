package com.jiangklijna.md.command

import com.jiangklijna.md.app.CmdApp
import com.jiangklijna.md.bean.Music

// 选出一个MusicItem
class SecondCmd(val cmdApp: CmdApp) : BaseCmd {

	override val app: CmdApp
		get() = cmdApp

	var music: Music? = null

	fun work(m: Music) {
		music = m
		work()
	}

	override fun print() {
		println("")
	}

	override fun analysis(key: String): () -> Unit {
		return when (key) {
			":exit" -> app::stop
			":back" -> app::back
			else -> ({})
		}
	}

	override fun destory() {

	}
}