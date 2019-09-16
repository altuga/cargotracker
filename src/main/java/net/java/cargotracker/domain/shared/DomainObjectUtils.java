/*
    The MIT License
    
    Copyright (c) 2019 Oracle and/or its affiliates
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.
*/
package net.java.cargotracker.domain.shared;

// TODO Make this a CDI singleton?
public class DomainObjectUtils {

    /**
     * @param actual actual value
     * @param safe a null-safe value
     * @param <T> type
     * @return actual value, if it's not null, or safe value if the actual value
     * is null.
     */
    public static <T> T nullSafe(T actual, T safe) {
        return actual == null ? safe : actual;
    }

    // TODO wrappers for some of the commons-lang code:
    //
    // EqualsBuilder that uses sameIdentity/sameValue,
    // better validation (varargs etc) 
    /**
     * Prevent instantiation.
     */
    private DomainObjectUtils() {
    }
}
