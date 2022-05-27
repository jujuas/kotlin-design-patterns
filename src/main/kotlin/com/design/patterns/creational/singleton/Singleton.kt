package com.design.patterns.creational.singleton
class Singleton {
        private constructor()
        companion object {
            private var instance: Singleton? = null
            fun getInstance(): Singleton {
                if (this.instance == null) this.instance = Singleton()
                return this.instance!!
            }
        }
}
