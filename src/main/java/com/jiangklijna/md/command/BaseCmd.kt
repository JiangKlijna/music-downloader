package com.jiangklijna.md.command

import com.jiangklijna.md.app.CmdApp

interface BaseCmd {

	val app: CmdApp

	fun work() {
		print()
		analysis(app.command)()
	}

	fun print()

	fun analysis(key: String): () -> Unit

	fun destory()
}