package com.jiangklijna.md.common

import com.fasterxml.jackson.databind.ObjectMapper

object R {
	object Object {
		val Jackson = ObjectMapper()
	}

	object Url {
		/**
		 * @s
		 */
		const val WY_SEARCH = "http://music.163.com/#/search/m/"
		/**
		 * @key
		 */
		const val XM_SEARCH = "https://www.xiami.com/search"
		/**
		 * @w
		 * @p
		 */
		const val QQ_SEARCH = "https://c.y.qq.com/soso/fcgi-bin/client_search_cp?format=json&n=20&"
		/**
		 * @key
		 * @start = (page*20)
		 */
		const val BD_SEARCH = "http://music.taihe.com/search/song"
		/**
		 * @keyword
		 * @page
		 */
		const val KG_SEARCH = "http://songsearch.kugou.com/song_search_v2?pagesize=20&"
	}

	object Setting {

		const val width = 800.0
		const val height = 800.0
		const val isResizable = false

		const val LOGO_PATH = "/img/logo.png"
		const val title = "Music Download"

		const val logo_side_length = 80.0
	}
}