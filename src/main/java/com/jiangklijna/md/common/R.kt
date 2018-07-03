package com.jiangklijna.md.common

object R {
    object Url {
        /**
         * @s
         */
        const val WY_SEARCH = "http://music.163.com/#/search/m/"
        /**
         * @key
         * resetful page
         */
        const val XM_SEARCH = "http://www.xiami.com/search/song/page/"
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
         * @searchKeyWord
         */
        const val KG_SEARCH = "http://www.kugou.com/yy/html/search.html#searchType=song"
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