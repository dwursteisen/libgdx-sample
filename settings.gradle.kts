include(":desktop")
include(":core")

sourceControl {
    gitRepository(uri("https://github.com/dwursteisen/libgdx-addons.git")) {
        producesModule("com.github.dwursteisen.libgdx-addons:libgdx-gradle-plugin")
    }
}
