package com.jiangklijna.md.command

import com.jiangklijna.md.app.CmdApp
import com.jiangklijna.md.bean.Music
import com.jiangklijna.md.bean.MusicPlatform
import com.jiangklijna.md.common.Logic.search

class FirstCmd(val app: CmdApp) : BaseCmd {

	var platform: MusicPlatform = MusicPlatform.wy

	override fun work() {
		print()
		analysis(app.command)()
	}

	override fun print() {
		println(platform.title + "搜索:(:)")
	}

	override fun analysis(key: String): () -> Unit {
		return when (key) {
			":back" -> app::back
			":0", ":1", ":2", ":3", ":4" -> ({
				platform = MusicPlatform.values().get(key.last() - '0')
				print()
			})
			else -> ({
				onSeaechCallback(platform.search(key))
			})
		}
	}

	fun onSeaechCallback(list: List<Music>) {
		list.forEachIndexed { index, music -> println(music) }
	}
}