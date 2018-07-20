package com.jiangklijna.md.bean

data class MusicItem(
		val name: String,
		val realUrl: String,
		val isMv: Boolean,
		val music: Music
) {
	fun getFile() = java.io.File("${music.name}-${music.author}-${music.platform}-$name")
}
