package com.jiangklijna.md.view

import com.jiangklijna.md.bean.MusicPlatform
import javafx.scene.layout.VBox

class MusicView : VBox() {

	init {
		MusicPlatform::class.java.enumConstants.map {
			LogoView(it)
		}.run {
			children.addAll(this)
		}
	}
}