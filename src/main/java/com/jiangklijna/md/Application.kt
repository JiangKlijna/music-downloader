package com.jiangklijna.md

import com.jiangklijna.md.app.CmdApp
import com.jiangklijna.md.app.FxApp
import com.jiangklijna.md.common.Function.ifnot
import com.jiangklijna.md.common.Function.iftrue
import com.jiangklijna.md.common.Function.println

object Application {

	val types = arrayListOf("fx", "cmd")
	val default_type = types.first()

	@JvmStatic
	fun main(args: Array<String>) {
		val type = if (args.isEmpty()) default_type else args.first()

		var tag = false
		type.equals(types.first(), true).iftrue { FxApp.run() }.run { tag = tag || this }
		type.equals(types.last(), true).iftrue { CmdApp.run() }.run { tag = tag || this }
		tag.ifnot { "command in $types".println() }
	}
}
