package com.jiangklijna.md.command

import com.jiangklijna.md.app.CmdApp
import com.jiangklijna.md.bean.Music
import com.jiangklijna.md.bean.MusicPlatform
import com.jiangklijna.md.common.Logic.search
import java.util.*

// 选出一个Music
class FirstCmd(val cmdApp: CmdApp) : BaseCmd {

	override val app: CmdApp
		get() = cmdApp

	var platform: MusicPlatform = MusicPlatform.wy

	var pageNum = 1
	val list = LinkedList<Music>()

	override fun print() {
		println("当前选择的是${platform.title}, 输入:[id]切换音乐平台\n" +
				"-------------\n" +
				"|0  网易音乐|\n" +
				"|1  虾米音乐|\n" +
				"|2  q q 音乐|\n" +
				"|3  百度音乐|\n" +
				"|4  酷狗音乐|\n" +
				"-------------\n")
	}

	override fun analysis(key: String): () -> Unit {
		return when (key) {
			":exit" -> app::stop
			":back" -> this::back
			":prev" -> ({
				work(isPrint = false)
			})
			":next" -> ({
				work(isPrint = false)
			})
			":0", ":1", ":2", ":3", ":4" -> ({
				platform = MusicPlatform.values().get(key.last() - '0')
				work()
			})
			else -> ({
				platform.search(key, pageNum++, onSearchCallBack)
			})
		}
	}

	val onSearchCallBack = { list: List<Music>? ->

	}

	override fun back() = app.stop()

	override fun destory() {
		pageNum = 1
		list.clear()
	}
}