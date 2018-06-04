package com.jiangklijna.md.command

import com.jiangklijna.md.app.CmdApp

class SecondCmd(val app: CmdApp) : BaseCmd {

	override fun work() {
		print()
		analysis(app.command)()
	}

	override fun print() {
		println("")
	}

	override fun analysis(key: String): () -> Unit {
		if (key == ":back") return app::back
		else
			return {}
	}
}