package com.jiangklijna.md.app

class CmdApp {

	fun start() {
		println("hello")
	}

	companion object {
		val run = { CmdApp().start() }
	}
}
