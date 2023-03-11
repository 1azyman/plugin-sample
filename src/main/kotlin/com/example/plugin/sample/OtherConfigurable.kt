package com.example.plugin.sample


import com.intellij.openapi.options.BoundSearchableConfigurable
import com.intellij.openapi.ui.DialogPanel
import com.intellij.ui.dsl.builder.panel

/**
 * Created by Viliam Repan (lazyman).
 */
class OtherConfigurable : BoundSearchableConfigurable("title", "") {

    override fun createPanel(): DialogPanel {
        return panel {
            row() {
                checkBox("Ignore missing properties")
                    .comment("E.g. don't fail to upload object if not all properties have been replaced")
            }
            group("Experimental") {
                row() {
                    checkBox("Enable Query")
                        .comment("Enable plugin support for Query language")
                }
                row() {
                    checkBox("Enable Properties")
                        .comment("Enable plugin support for Properties language")
                }
            }
        }
    }
}
