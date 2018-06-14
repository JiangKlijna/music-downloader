package com.jiangklijna.md.common

import com.jiangklijna.md.bean.Music
import com.jiangklijna.md.bean.MusicItem
import com.jiangklijna.md.bean.MusicPlatform
import java.io.File

object Logic {


	// 在一个平台下搜索音乐
	fun MusicPlatform.search(key: String, pageNum: Int, cb: (List<Music>?) -> Unit, isAsync: Boolean = true)
			= when (this) {
		MusicPlatform.wy -> this@Logic::wy_search
		MusicPlatform.xm -> this@Logic::xm_search
		MusicPlatform.qq -> this@Logic::qq_search
		MusicPlatform.bd -> this@Logic::bd_search
		MusicPlatform.kg -> this@Logic::kg_search
	}(key, pageNum, cb, isAsync)


	// 搜索一个音乐的所有可下载选项
	fun Music.findItem(cb: (List<MusicItem>?) -> Unit, isAsync: Boolean = true)
			= when (this.platform) {
		MusicPlatform.wy -> this@Logic::wy_findItem
		MusicPlatform.xm -> this@Logic::xm_findItem
		MusicPlatform.qq -> this@Logic::qq_findItem
		MusicPlatform.bd -> this@Logic::bd_findItem
		MusicPlatform.kg -> this@Logic::kg_findItem
	}(this, cb, isAsync)

	// 下载一个MusicItem
	fun MusicItem.download(cb: (Int?) -> Unit, isAsync: Boolean = true) {
		cb(null)
	}

	// 网易云音乐搜索
	fun wy_search(key: String, pageNum: Int, cb: (List<Music>?) -> Unit, isAsync: Boolean = true) {
		cb(null)
	}

	// 虾米音乐搜索
	fun xm_search(key: String, pageNum: Int, cb: (List<Music>?) -> Unit, isAsync: Boolean = true) {
		cb(null)
	}

	// qq音乐搜索
	fun qq_search(key: String, pageNum: Int, cb: (List<Music>?) -> Unit, isAsync: Boolean = true) {
		cb(null)
	}

	// 百度音乐搜索
	fun bd_search(key: String, pageNum: Int, cb: (List<Music>?) -> Unit, isAsync: Boolean = true) {
		cb(null)
	}

	// 酷狗音乐搜索
	fun kg_search(key: String, pageNum: Int, cb: (List<Music>?) -> Unit, isAsync: Boolean = true) {
		cb(null)
	}

	// 网易云音乐搜索
	fun wy_findItem(music: Music, cb: (List<MusicItem>?) -> Unit, isAsync: Boolean = true) {
		cb(null)
	}

	// 虾米音乐搜索
	fun xm_findItem(music: Music, cb: (List<MusicItem>?) -> Unit, isAsync: Boolean = true) {
		cb(null)
	}

	// qq音乐搜索
	fun qq_findItem(music: Music, cb: (List<MusicItem>?) -> Unit, isAsync: Boolean = true) {
		cb(null)
	}

	// 百度音乐搜索
	fun bd_findItem(music: Music, cb: (List<MusicItem>?) -> Unit, isAsync: Boolean = true) {
		cb(null)
	}

	// 酷狗音乐搜索
	fun kg_findItem(music: Music, cb: (List<MusicItem>?) -> Unit, isAsync: Boolean = true) {
		cb(null)
	}
}