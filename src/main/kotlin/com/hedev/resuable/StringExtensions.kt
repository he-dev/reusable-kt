package com.hedev.resuable

import java.util.TreeMap

private val regex = Regex("""\{(?<name>[a-z][a-z0-9_.-]*)\}""", RegexOption.IGNORE_CASE)

fun String.smartFormat(values: TreeMap<String, String>): String {
    return regex.replace(this) {
        values.getOrDefault(it.groups["name"]!!.value, it.value)
    }
}