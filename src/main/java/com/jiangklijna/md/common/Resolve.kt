package com.jiangklijna.md.common

import com.jiangklijna.md.bean.Music
import com.jiangklijna.md.bean.MusicPlatform
import com.jiangklijna.md.common.Function.println
import okhttp3.Response
import org.jsoup.Jsoup

// service
object Resolve {

	fun wy_search(response: Response?): List<Music> {
		val doc = response.getDocument()
		doc.title().println()
		return emptyList()
	}

	fun xm_search(response: Response?): List<Music> {
		val doc = response.getDocument()
		val table = doc.body().getElementsByClass("track_list").first()
		val trs = table.getElementsByTag("tr").apply { removeAt(0) }
		return List(trs.size, {
			val tr = trs[it]
			val song_name = tr.getElementsByClass("song_name").first()
			Music(
					name = song_name.text(),
					author = tr.getElementsByClass("song_artist").first().text(),
					platform = MusicPlatform.xm,
					infoUrl = "http:" + song_name.getElementsByTag("a").attr("href")
			)
		})
	}

	fun qq_search(response: Response?): List<Music> {
		val doc = response.getDocument()
		doc.title().println()
		return emptyList()
	}

	fun bd_search(response: Response?): List<Music> {
		val doc = response.getDocument()
		val div = doc.body().getElementById("result_container")
		val lis = div.getElementsByClass("song-item-hook")
		return List(lis.size, {
			val li = lis[it]
			val song_title = li.getElementsByClass("song-title").first()
			Music(
					name = song_title.text(),
					author = li.getElementsByClass("singer").first().text(),
					platform = MusicPlatform.bd,
					infoUrl = "http://music.taihe.com" + song_title.getElementsByTag("a").attr("href")
			)
		})
	}

	fun kg_search(response: Response?): List<Music> {
		val doc = response.getDocument()
		doc.title().println()
		return emptyList()
	}


//	fun Response?.getDocument() = SAXReader().read(this?.body()?.byteStream())

	fun Response?.getDocument() = Jsoup.parse(this?.body()?.byteStream(), "utf-8", this?.request()?.url()?.toString())
}