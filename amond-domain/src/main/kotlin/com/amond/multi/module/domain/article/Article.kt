package com.amond.multi.module.domain.article

data class Article(
    val idx: Long?,
    val content: String,
    var viewCount: Long
)