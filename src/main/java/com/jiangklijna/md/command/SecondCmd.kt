package com.jiangklijna.md.command

import com.jiangklijna.md.app.CmdApp
import com.jiangklijna.md.bean.Music
import java.util.*

class SecondCmd(val app: CmdApp) : BaseCmd {

	val list: LinkedList<Music> = LinkedList()

	fun work(list: List<Music>) {
		this.list.clear()
		this.list.addAll(list)
		work()
	}

	override fun work() {
		print()
		analysis(app.command)()
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
}