package com.jiangklijna.md.view

import javafx.fxml.Initializable
import javafx.scene.Scene
import javafx.scene.control.TextField
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import java.net.URL
import java.util.*

class MainView : VBox(), Initializable {

	val textField = TextField()
	val musicView = MusicView()
	val resultView = ResultView()

	init {
		val hbox = HBox()
		hbox.children.addAll(musicView, resultView)
		children.add(textField)
		children.add(hbox)
	}

	override fun initialize(location: URL?, resources: ResourceBundle?) {
	}

	companion object {
		fun getScene() = Scene(MainView())
	}
}