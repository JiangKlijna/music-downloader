package com.jiangklijna.md.common

import com.jiangklijna.md.bean.Music
import okhttp3.Response
import org.jsoup.Jsoup
import com.jiangklijna.md.common.Function.println

// service
object Resolve {

	fun wy_search(response: Response?): List<Music> {
		val doc = response.getDocument()
		doc.title().println()
		return emptyList()
	}

	fun xm_search(response: Response?): List<Music> {
		val doc = response.getDocument()
		doc.title().println()
		return emptyList()
	}

	fun qq_search(response: Response?): List<Music> {
		val doc = response.getDocument()
		doc.title().println()
		return emptyList()
	}

	fun bd_search(response: Response?): List<Music> {
		val doc = response.getDocument()
		doc.title().println()
		return emptyList()
	}

	fun kg_search(response: Response?): List<Music> {
		val doc = response.getDocument()
		doc.title().println()
		return emptyList()
	}


//	fun Response?.getDocument() = SAXReader().read(this?.body()?.byteStream())

	fun Response?.getDocument() = Jsoup.parse(this?.body()?.byteStream(), "utf-8", this?.request()?.url()?.toString())
}