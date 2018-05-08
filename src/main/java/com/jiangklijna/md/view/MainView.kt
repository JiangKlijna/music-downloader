package com.jiangklijna.md.view

import javafx.fxml.Initializable
import javafx.scene.Scene
import javafx.scene.control.ListView
import javafx.scene.control.TextField
import javafx.scene.layout.VBox
import java.net.URL
import java.util.*


class MainView : VBox(), Initializable {

	val textField = TextField()

	init {
		children.add(textField)
		children.add(ListView<String>())
	}

	override fun initialize(location: URL?, resources: ResourceBundle?) {
	}


	companion object {

		fun getScene() = Scene(MainView())
	}
}