package com.jiangklijna.md.common

import com.jiangklijna.md.bean.Music
import com.jiangklijna.md.bean.MusicItem
import com.jiangklijna.md.bean.MusicPlatform
import java.io.File

object Logic {


	fun MusicPlatform.search(key: String, pageNum: Int, cb: (List<Music>?) -> Unit, isAsync: Boolean = true)
			= when (this) {
		MusicPlatform.wy -> this@Logic::wy_search
		MusicPlatform.xm -> this@Logic::xm_search
		MusicPlatform.qq -> this@Logic::qq_search
		MusicPlatform.bd -> this@Logic::bd_search
		MusicPlatform.kg -> this@Logic::kg_search
	}(key, pageNum, cb, isAsync)


	fun Music.findItem(cb: (List<MusicItem>?) -> Unit, isAsync: Boolean = true) {

	}

	fun MusicItem.download(file: File, cb: (Int?) -> Unit, isAsync: Boolean = true) {

	}

	// 网易云音乐搜索
	fun wy_search(key: String, pageNum: Int, cb: (List<Music>?) -> Unit, isAsync: Boolean = true) {

	}

	// 虾米音乐搜索
	fun xm_search(key: String, pageNum: Int, cb: (List<Music>?) -> Unit, isAsync: Boolean = true) {

	}

	// qq音乐搜索
	fun qq_search(key: String, pageNum: Int, cb: (List<Music>?) -> Unit, isAsync: Boolean = true) {

	}

	// 百度音乐搜索
	fun bd_search(key: String, pageNum: Int, cb: (List<Music>?) -> Unit, isAsync: Boolean = true) {

	}

	// 酷狗音乐搜索
	fun kg_search(key: String, pageNum: Int, cb: (List<Music>?) -> Unit, isAsync: Boolean = true) {
	}
}