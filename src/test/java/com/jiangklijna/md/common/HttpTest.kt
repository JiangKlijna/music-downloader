package com.jiangklijna.md.common

import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import org.junit.Assert
import org.junit.Test
import java.io.IOException
import java.net.URL

class HttpTest {

	@Test
	fun get() {
		val res = Http.getCall(URL("http://baidu.com")).execute()
		Assert.assertTrue(res.isSuccessful)
	}

	@Test
	fun post() {
		val res = Http.postCall(URL("http://baidu.com")).execute()
		Assert.assertTrue(res.isSuccessful)
	}

	@Test
	fun get_async() {
		val testThread = Thread.currentThread()
		Http.get("http://baidu.com", object : Callback {
			override fun onFailure(call: Call?, e: IOException?) {
				Assert.fail(e?.message)
			}

			override fun onResponse(call: Call?, response: Response) {
				Assert.assertNotEquals(Thread.currentThread(), testThread)
				Assert.assertTrue(response.isSuccessful)
			}
		}, true)
		Http.get("http://baidu.com", object : Callback {
			override fun onFailure(call: Call?, e: IOException?) {
				Assert.fail(e?.message)
			}

			override fun onResponse(call: Call?, response: Response) {
				Assert.assertEquals(Thread.currentThread(), testThread)
				Assert.assertTrue(response.isSuccessful)
			}
		}, false)
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
