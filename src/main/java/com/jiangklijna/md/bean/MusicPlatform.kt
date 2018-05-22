package com.jiangklijna.md.bean

enum class MusicPlatform(val title: String) {
	wy("网易音乐"),
	xm("虾米音乐"),
	qq("qq音乐"),
	bd("百度音乐"),
	kg("酷狗音乐");

	val path: String = "img/$name.png"
}
