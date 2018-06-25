package com.jiangklijna.md.command

import com.jiangklijna.md.app.CmdApp
import com.jiangklijna.md.bean.MusicItem
import com.jiangklijna.md.common.Logic.download

// 下载一个MusicItem
class ThirdCmd(val cmdApp: CmdApp) : BaseCmd {

	override val app: CmdApp
		get() = cmdApp

	var item: MusicItem? = null

	fun work(mi: MusicItem) {
		item = mi
	}

	override fun print() {
		println("正在下载${item?.music?.name}...\n" +
				"输入:again 可以在失败后再次下载\n" +
				"输入:exit 退出当前程序\n" +
				"输入:back 返回上次级\n")
	}

	override fun analysis(key: String): () -> Unit? {
		return when (key) {
			":exit" -> app::stop
			":back" -> this::back
			":again" -> this::download
			else -> ({ work(false) })
		}
	}

	fun download() = item?.download(this::onProgress)

	fun downloadFailure() {
		println("下载失败...\n" +
				"输入:again 重新下载\n" +
				"输入:exit 退出当前程序\n" +
				"输入:back 返回上次级\n")
		work(false)
	}

	fun downloadSuccess() {
		println("下载成功...\n" +
				"输入:again 重新下载\n" +
				"输入:exit 退出当前程序\n" +
				"输入:back 返回上次级\n")
		work(false)
	}

	fun onProgress(i: Int?) {
		i ?: return downloadFailure()
		if (i % 5 == 0) print("*")
		if (i == 100) downloadSuccess()
	}

	override fun back() = app.goto(this, app.second)

	override fun destory() {
		item = null
	}
}