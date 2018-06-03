package com.jiangklijna.md.app

import com.jiangklijna.md.command.FirstCmd
import com.jiangklijna.md.command.SecondCmd
import java.util.*

class CmdApp {

	var level = 0
	val cmds = arrayOf(FirstCmd(this), SecondCmd(this))
	val cmd = Scanner(System.`in`)

	fun start() {
		level = 0
		cmds.first().print()
	}

	fun back() {
		
	}

	companion object {
		val run = { CmdApp().start() }
	}
}
