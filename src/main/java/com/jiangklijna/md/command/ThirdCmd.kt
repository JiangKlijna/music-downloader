package com.jiangklijna.md.command

import com.jiangklijna.md.app.CmdApp
import com.jiangklijna.md.bean.MusicItem

// 下载一个MusicItem
class ThirdCmd(val cmdApp: CmdApp) : BaseCmd {

	override val app: CmdApp
		get() = cmdApp

	var item: MusicItem? = null

	fun work(mi: MusicItem) {
		item = mi
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