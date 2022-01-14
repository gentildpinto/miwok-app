package com.example.miwokapp

class Word {
    val defaultTranslation: String
    val miwokTranslation: String
    var imageResourceID: Int = -1

    constructor(englishWord: String, miwokWord: String) {
        defaultTranslation = englishWord
        miwokTranslation = miwokWord
    }

    constructor(englishWord: String, miwokWord: String, resourceID: Int) {
        defaultTranslation = englishWord
        miwokTranslation = miwokWord
        imageResourceID = resourceID
    }
}