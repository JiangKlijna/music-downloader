package com.jiangklijna.md.common

object R {
    object Url {
        /**
         * @s
         */
        const val WY_SEARCH = "http://music.163.com/#/search/m/"
        /**
         * @key
         */
        const val XM_SEARCH = "https://www.xiami.com/search"
        /**
         * @w
         * @page
         */
        const val QQ_SEARCH = "https://y.qq.com/portal/search.html#t=song"
        /**
         * @key
         * @start = (page*20)
         */
        const val BD_SEARCH = "http://music.taihe.com/search/song"
        /**
         * @keyword
         * @page
         */
        const val KG_SEARCH = "http://songsearch.kugou.com/song_search_v2?pagesize=20&"
    }

    object Setting {

        const val width = 800.0
        const val height = 800.0
        const val isResizable = false

        const val LOGO_PATH = "/img/logo.png"
        const val title = "Music Download"

        const val logo_side_length = 80.0
    }
}