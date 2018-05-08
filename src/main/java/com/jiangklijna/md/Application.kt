package com.jiangklijna.md

import com.jiangklijna.md.view.MainView
import javafx.stage.Stage

typealias FxApp = javafx.application.Application

class Application : FxApp() {

	override fun start(primaryStage: Stage) {
		primaryStage.scene = MainView.getScene()
		primaryStage.show()
	}

	override fun stop() {
		super.stop()
	}

	companion object {

		@JvmStatic
		fun main(args: Array<String>) =
				FxApp.launch(Application::class.java, *args)
	}
}
