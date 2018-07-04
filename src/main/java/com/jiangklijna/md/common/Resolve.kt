package com.jiangklijna.md.common

import com.jiangklijna.md.bean.Music
import okhttp3.Response
import org.dom4j.io.SAXReader

// service
object Resolve {

	fun wy_search(response: Response?): List<Music> {
		val doc = response.getDocument()

		return emptyList()
	}

	fun xm_search(response: Response?): List<Music> {
		val doc = response.getDocument()

		return emptyList()
	}

	fun qq_search(response: Response?): List<Music> {
		val doc = response.getDocument()

		return emptyList()
	}

	fun bd_search(response: Response?): List<Music> {
		val doc = response.getDocument()

		return emptyList()
	}

	fun kg_search(response: Response?): List<Music> {
		val doc = response.getDocument()

		return emptyList()
	}


	fun Response?.getDocument() = SAXReader().read(this?.body()?.byteStream())
}