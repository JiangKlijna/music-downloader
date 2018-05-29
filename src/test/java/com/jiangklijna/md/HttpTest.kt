package com.jiangklijna.md

import com.jiangklijna.md.common.Http
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import org.junit.Assert
import org.junit.Test
import java.io.IOException

class HttpTest {

	@Test
	fun get() {
		val res = Http.get("http://baidu.com")
		Assert.assertTrue(res.isSuccessful)
	}

	@Test
	fun post() {
		val res = Http.post("http://baidu.com")
		Assert.assertTrue(res.isSuccessful)
	}

	@Test
	fun get_callback() {
		val testThread = Thread.currentThread()
		val res = Http.get("http://baidu.com", object : Callback {
			override fun onFailure(call: Call?, e: IOException?) {
				Assert.fail(e?.message)
			}

			override fun onResponse(call: Call?, response: Response) {
				Assert.assertNotEquals(Thread.currentThread(), testThread)
				Assert.assertTrue(response.isSuccessful)
			}
		})
		Thread.sleep(1000)
	}

	@Test
	fun test_event() {
		val testThread = Thread.currentThread()
		Http.Event("123456", { s: String ->
			Assert.assertEquals(Thread.currentThread(), testThread)
		})
	}
}
