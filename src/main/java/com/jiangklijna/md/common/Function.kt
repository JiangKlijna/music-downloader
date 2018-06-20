package com.jiangklijna.md.common

import java.util.*

object Function {

	val r = Random()

	fun Any?.println() = println(this)

	inline fun Boolean.iftrue(f: () -> Unit): Boolean {
		if (this) f()
		return this
	}

	inline fun Boolean.ifnot(f: () -> Unit): Boolean {
		if (!this) f()
		return this
	}

	inline fun <reified T> Any.safeCast(action: T.() -> Unit) {
		if (this is T) this.action()
	}

	fun <T> Array<T>.random(): T = this[r.nextInt(size)]

	inline fun <T> Array<T>.random(f: (T) -> Unit) = f(this[r.nextInt(size)])

}