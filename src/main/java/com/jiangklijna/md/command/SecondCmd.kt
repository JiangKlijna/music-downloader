package com.jiangklijna.md.command

import com.jiangklijna.md.app.CmdApp
import com.jiangklijna.md.bean.MusicPlatform
import com.jiangklijna.md.common.Logic.search

class SecondCmd(val app: CmdApp) : BaseCmd {

	var platform: MusicPlatform = MusicPlatform.wy

	override fun print() {
		println(platform.title + "搜索:(:)")
		val list = platform.search(app.command)
		list.forEachIndexed { index, music -> println(music) }
	}

	override fun analysis(key: String): () -> Unit {
		if (key == ":back") return app::back
		else
			return {}
	}
}