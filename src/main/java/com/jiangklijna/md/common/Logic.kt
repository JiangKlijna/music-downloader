package com.jiangklijna.md.common

import com.jiangklijna.md.bean.Music
import com.jiangklijna.md.bean.MusicItem
import com.jiangklijna.md.bean.MusicPlatform
import java.io.File

object Logic {


	inline fun MusicPlatform.search(key: String, pageNum: Int, cb: (List<Music>?) -> Unit, isAsync: Boolean = true) {

	}

	inline fun Music.findItem(cb: (List<MusicItem>?) -> Unit, isAsync: Boolean = true) {

	}

	inline fun MusicItem.download(file: File, cb: (Int?) -> Unit, isAsync: Boolean = true) {

	}

}