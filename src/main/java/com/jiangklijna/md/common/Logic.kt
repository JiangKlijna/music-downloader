package com.jiangklijna.md.common

import com.jiangklijna.md.bean.Music
import com.jiangklijna.md.bean.MusicItem
import com.jiangklijna.md.bean.MusicPlatform
import java.io.File

object Logic {


	fun MusicPlatform.search(key: String): List<Music> {
		return emptyList()
	}

	fun Music.findItem(): List<MusicItem> {
		return emptyList()
	}

	fun MusicItem.download(file: File) {

	}

}