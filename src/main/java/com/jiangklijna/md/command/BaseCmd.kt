package com.jiangklijna.md.command

interface BaseCmd {
	fun print()

	fun analysis(key: String): () -> Unit
}