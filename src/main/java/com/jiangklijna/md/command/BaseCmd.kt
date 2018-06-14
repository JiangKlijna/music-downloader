package com.jiangklijna.md.command

import com.jiangklijna.md.app.CmdApp

interface BaseCmd {

	val app: CmdApp

	fun work(isPrint: Boolean = true) {
		if (isPrint) print()
		analysis(app.command)()
	}

	fun print()

	fun analysis(key: String): () -> Unit?

	fun destory()
}