package com.explore.truth.universe.binarysearch.cooper

import com.explore.truth.universe.binarysearch.intArray
import kotlin.system.measureTimeMillis
import kotlin.test.Test

/**
 * Created by cooper
 * 2020/5/29.
 * Email: 1239604859@qq.com
 */

class BSTest {
    @Test
    fun testBinarySearch() {
        var position = -1
        val time = measureTimeMillis {
            position = binarySearch(intArray, 6)
        }
        println("position: $position")
        println("time: $time")
    }
}