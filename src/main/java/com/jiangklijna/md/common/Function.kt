package com.jiangklijna.md.common

object Function {

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
}