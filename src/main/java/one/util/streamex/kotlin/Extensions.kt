/*
 * Copyright 2015, 2023 StreamEx contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package one.util.streamex.kotlin

import com.google.common.collect.BiMap
import one.util.streamex.DoubleStreamEx
import one.util.streamex.IntStreamEx
import one.util.streamex.LongStreamEx
import one.util.streamex.StreamEx

/** Used to allow streamEx() method in [Array] instead of [StreamEx.of]. */
inline val <T> Array<T>.streamEx: StreamEx<T>
    get() = StreamEx.of(*this)

/** Used to allow streamEx method in [Collection] instead of [StreamEx.of]. */
inline val <T> Collection<T>.streamEx: StreamEx<T>
    get() = StreamEx.of(this)

/**
 * Used to allow streamEx method in [Double] array instead of
 * [DoubleStreamEx.of].
 */
inline val Array<Double>.streamEx: DoubleStreamEx
    get() = DoubleStreamEx.of(this)

/**
 * Used to allow streamEx method in [Int] array instead of
 * [IntStreamEx.of].
 */
inline val Array<Int>.streamEx: IntStreamEx
    get() = IntStreamEx.of(this)

/**
 * Used to allow streamEx method in [Long] array instead of
 * [IntStreamEx.of].
 */
inline val Array<Long>.streamEx: LongStreamEx
    get() = LongStreamEx.of(this)

/** Used to allow streamEx method in [Iterator] instead of [StreamEx.of]. */
inline val <T> Iterator<T>.streamEx: StreamEx<T>
    get() = StreamEx.of(this)

inline val <K, V> BiMap<K, V>.streamEx: StreamEx<Map.Entry<K, V>>
    get() = StreamEx.of(this.entries)