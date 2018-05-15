package com.jiangklijna.md.view

import com.jiangklijna.md.bean.MusicPlatForm
import com.jiangklijna.md.common.Setting.logo_side_length
import javafx.scene.Cursor
import javafx.scene.control.Label
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.BorderPane

class LogoView(val mp: MusicPlatForm) : BorderPane() {

	val image = ImageView().apply {
		image = Image(mp.path, logo_side_length, logo_side_length, false, true)
		cursor = Cursor.HAND
	}

	init {
		this.top = image
		this.center = Label(mp.title)
	}

}