package com.jiangklijna.md.app

import com.jiangklijna.md.common.Setting
import com.jiangklijna.md.view.MainView
import javafx.application.Application
import javafx.scene.image.Image
import javafx.stage.Stage

//typealias FxApp = javafx.application.Application

class FxApp : Application() {

	override fun start(primaryStage: Stage) {
		primaryStage.title = Setting.title
		primaryStage.minWidth = Setting.width
		primaryStage.maxWidth = Setting.width
		primaryStage.minHeight = Setting.height
		primaryStage.maxHeight = Setting.height
		primaryStage.isResizable = Setting.isResizable
		primaryStage.icons.add(Image(Setting.LOGO_PATH))
		primaryStage.scene = MainView.getScene()
		primaryStage.show()
	}

	override fun stop() {
		super.stop()
	}

	companion object {
		val run = { Application.launch(FxApp::class.java) }
	}
}
