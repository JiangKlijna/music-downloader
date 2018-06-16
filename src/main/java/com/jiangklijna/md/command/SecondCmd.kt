package com.jiangklijna.md.command

import com.jiangklijna.md.app.CmdApp
import com.jiangklijna.md.bean.Music
import com.jiangklijna.md.bean.MusicItem
import com.jiangklijna.md.common.Logic.findItem

// 选出一个MusicItem
class SecondCmd(val cmdApp: CmdApp) : BaseCmd {

	override val app: CmdApp
		get() = cmdApp

	var music: Music? = null

	fun work(m: Music) {
		music = m
		m.findItem(callback)
	}

	override fun print() {
		println("")
	}

	override fun analysis(key: String): () -> Unit {
		return when (key) {
			":exit" -> app::stop
			":back" -> this::back
			else -> ({})
		}
	}

	val callback = { list: List<MusicItem>? ->
		work()
	}

	override fun back() = app.goto(this, app.first)

	override fun destory() {
		music = null
	}
}