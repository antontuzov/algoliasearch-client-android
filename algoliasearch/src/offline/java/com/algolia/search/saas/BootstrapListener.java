/*
 * Copyright (c) 2012-2016 Algolia
 * http://www.algolia.com/
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.algolia.search.saas;

import android.support.annotation.NonNull;

/**
 * Listener for events related to index bootstrapping.
 *
 * Notifications are sent on a per-index basis, but you may register the same listener for all indices.
 * Notifications are sent on the main thread.
 */
public interface BootstrapListener
{
    /**
     * Bootstrapping has just started.
     *
     * @param index The bootstrapping index.
     */
    public void bootstrapDidStart(@NonNull MirroredIndex index);

    /**
     * Bootstrapping has just finished.
     *
     * @param index The bootstrapping index.
     * @param error Null if success, otherwise indicates the error.
     */
    public void bootstrapDidFinish(@NonNull MirroredIndex index, Throwable error);
}
