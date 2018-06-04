package com.jiangklijna.md.command

interface BaseCmd {

	fun work()

	fun print()

	fun analysis(key: String): () -> Unit
}