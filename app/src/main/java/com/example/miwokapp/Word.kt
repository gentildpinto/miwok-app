package com.example.miwokapp

class Word {
    public val defaultTranslation: String
    public val miwokTranslation: String
    public var imageResourceID: Int? = null

    constructor(pDefaultTranslation: String, pMiwokTranslation: String) {
        defaultTranslation = pDefaultTranslation
        miwokTranslation = pMiwokTranslation
    }
    constructor(pDefaultTranslation: String, pMiwokTranslation: String, pImageResourceID: Int?) {
        defaultTranslation = pDefaultTranslation
        miwokTranslation = pMiwokTranslation
        imageResourceID = pImageResourceID
    }
}