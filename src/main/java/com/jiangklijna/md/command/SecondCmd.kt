package com.jiangklijna.md.command

import com.jiangklijna.md.app.CmdApp
import com.jiangklijna.md.bean.MusicPlatform
import com.jiangklijna.md.common.Logic.search

class SecondCmd(val app: CmdApp) : BaseCmd {

	var platform: MusicPlatform = MusicPlatform.wy

	override fun print() {
		println(platform.title + "搜索:(:)")
		val key = app.cmd.next();
		val list = platform.search(key)
		list.forEachIndexed { index, music -> println(music) }
	}
}