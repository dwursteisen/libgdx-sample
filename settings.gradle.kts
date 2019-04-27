include(":desktop")
include(":core")
include(":android")

sourceControl {
    gitRepository(uri("https://github.com/dwursteisen/libgdx-addons.git")) {
        producesModule("com.github.dwursteisen.libgdx-addons:libgdx-gradle-plugin")
    }
}
