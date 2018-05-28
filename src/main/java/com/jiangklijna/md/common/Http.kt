package com.jiangklijna.md.common

import okhttp3.*
import okio.BufferedSink
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

/**
 * Created by jiangKlijna on 7/27/2017.
 * 网络请求
 */
object Http {
	private val client = OkHttpClient()
	private val bus = EventBus.getDefault()
	private val type = MediaType.parse("application/x-www-form-urlencoded; charset=UTF-8")

	fun get(url: String) = client.newCall(Request.Builder().url(url).addHeader("User-Agent", UserAgent).get().build()).execute()

	fun post(url: String) = client.newCall(Request.Builder().url(url).addHeader("User-Agent", UserAgent).post(EmptyBody()).build()).execute()

	fun get(url: String, cb: Callback) = client.newCall(Request.Builder().url(url).addHeader("User-Agent", UserAgent).get().build()).enqueue(cb)

	fun post(url: String, cb: Callback) = client.newCall(Request.Builder().url(url).addHeader("User-Agent", UserAgent).post(EmptyBody()).build()).enqueue(cb)

	// 回调
	interface Runnable<T> {
		fun run(data: T)
	}

	// 通过EventBus 将网络请求的回调运行在ui线程
	class Event<T>(val data: T, val run: (T) -> Unit) {

		fun send() = bus.post(this)

		@Subscribe(threadMode = ThreadMode.MAIN)
		fun onEvent(o: Any) {
			run.invoke(data)
			bus.unregister(this)
		}

		init {
			bus.register(this)
		}
	}

	// 空的RequestBody
	class EmptyBody : RequestBody() {
		override fun contentType(): MediaType? = type

		override fun contentLength(): Long = 0

		override fun writeTo(sink: BufferedSink?) {}
	}

	const val UserAgent = "Mozilla/5.0 (Linux; U; Android 7.0) AppleWebKit/537.36 (KHTML, like Gecko)Version/4.0 Chrome/37.0.0.0 Mobile Safari/537.36"

}