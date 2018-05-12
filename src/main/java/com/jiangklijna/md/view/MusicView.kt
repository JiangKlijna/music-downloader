package com.jiangklijna.md.view

import com.jiangklijna.md.bean.MusicPlatForm
import javafx.scene.layout.VBox

class MusicView : VBox() {

	init {
		MusicPlatForm::class.java.enumConstants.map {
			LogoView(it)
		}.run {
			children.addAll(this)
		}
	}
}