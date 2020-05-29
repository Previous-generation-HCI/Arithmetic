package com.explore.truth.universe.binarysearch.cooper

/**
 * Created by cooper
 * 2020/5/29.
 * Email: 1239604859@qq.com
 */

/**
 * @return Int: 如果存在的话范围source对应的位置, 不存在返回 -1
 */
fun binarySearch(source: IntArray, target: Int): Int {
    var start = 0
    var end = source.size - 1
    while (start <= end) {
        val mid = (start + end).shr(1)
        val midValue = source[mid]
        when {
            midValue < target -> {
                start = mid + 1
            }
            midValue > target -> {
                end = mid - 1
            }
            else -> {
                return mid
            }
        }
    }
    return -1
}
