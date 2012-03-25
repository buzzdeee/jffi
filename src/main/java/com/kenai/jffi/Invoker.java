/*
 * Copyright (C) 2008, 2009 Wayne Meissner
 *
 * This file is part of jffi.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 
 * Alternatively, you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this work.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.kenai.jffi;

import java.math.BigDecimal;

/**
 * Provides native function invocation facilities.
 */
public abstract class Invoker {
    private final Foreign foreign;
    private final ObjectParameterInvoker objectParameterInvoker;

    /** Lazy initialization singleton holder */
    private static final class SingletonHolder {
        private static final Invoker INSTANCE = Platform.getPlatform().addressSize() == 64
                ? LP64.INSTANCE : ILP32.INSTANCE;
    }

    /**
     * Gets the <tt>Invoker</tt> singleton.
     *
     * @return An instance of <tt>Invoker</tt>.
     */
    public static Invoker getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /** Creates a new <tt>Invoker</tt> */
    private Invoker() {
        this(Foreign.getInstance(), ObjectParameterInvoker.getInstance());
    }

    Invoker(Foreign foreign, ObjectParameterInvoker objectParameterInvoker) {
        this.foreign = foreign;
        this.objectParameterInvoker = objectParameterInvoker;
    }

    /**
     * Gets the fast-path object parameter invoker.
     * 
     * @return An instance of {@link ObjectParameterInvoker}
     */
    public final ObjectParameterInvoker getObjectParameterInvoker() {
        return objectParameterInvoker;
    }

    /**
     * Invokes a function with no arguments, and returns a 32 bit integer.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @return A 32 bit integer value.
     */
    public final int invokeI0(CallContext context, long function) {
        return foreign.invokeI0(context.getAddress(), function);
    }

    /**
     * Invokes a function with one integer argument, and returns a 32 bit integer.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 A 32 bit integer argument.
     * @return A 32 bit integer value.
     */
    public final int invokeI1(CallContext context, long function, int arg1) {
        return foreign.invokeI1(context.getAddress(), function, arg1);
    }

    /**
     * Invokes a function with two integer arguments, and returns a 32 bit integer.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 The first 32 bit integer argument.
     * @param arg2 The second 32 bit integer argument.
     * @return A 32 bit integer value.
     */
    public final int invokeI2(CallContext context, long function, int arg1, int arg2) {
        return foreign.invokeI2(context.getAddress(), function, arg1, arg2);
    }

    /**
     * Invokes a function with three integer arguments, and returns a 32 bit integer.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 The first 32 bit integer argument.
     * @param arg2 The second 32 bit integer argument.
     * @param arg3 The third 32 bit integer argument.
     * @return A 32 bit integer value.
     */
    public final int invokeI3(CallContext context, long function, int arg1, int arg2, int arg3) {
        return foreign.invokeI3(context.getAddress(), function, arg1, arg2, arg3);
    }

    /**
     * Invokes a function with four integer arguments, and returns a 32 bit integer.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 The first 32 bit integer argument.
     * @param arg2 The second 32 bit integer argument.
     * @param arg3 The third 32 bit integer argument.
     * @param arg4 The fourth 32 bit integer argument.
     * @return A 32 bit integer value.
     */
    public final int invokeI4(CallContext context, long function, int arg1, int arg2, int arg3, int arg4) {
        return foreign.invokeI4(context.getAddress(), function, arg1, arg2, arg3, arg4);
    }

    /**
     * Invokes a function with five integer arguments, and returns a 32 bit integer.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 The first 32 bit integer argument.
     * @param arg2 The second 32 bit integer argument.
     * @param arg3 The third 32 bit integer argument.
     * @param arg4 The fourth 32 bit integer argument.
     * @param arg5 The fifth 32 bit integer argument.
     * @return A 32 bit integer value.
     */
    public final int invokeI5(CallContext context, long function, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return foreign.invokeI5(context.getAddress(), function, arg1, arg2, arg3, arg4, arg5);
    }

    /**
     * Invokes a function with six integer arguments, and returns a 32 bit integer.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 The first 32 bit integer argument.
     * @param arg2 The second 32 bit integer argument.
     * @param arg3 The third 32 bit integer argument.
     * @param arg4 The fourth 32 bit integer argument.
     * @param arg5 The fifth 32 bit integer argument.
     * @param arg6 The sixth 32 bit integer argument.
     * @return A 32 bit integer value.
     */
    public final int invokeI6(CallContext context, long function, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        return foreign.invokeI6(context.getAddress(), function, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    /**
     * Invokes a function with no arguments, and returns a 32 bit integer.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @return A 32 bit integer value.
     */
    @Deprecated
    public final int invokeVrI(Function function) {
        return foreign.invokeI0(function.getContextAddress(), function.getFunctionAddress());
    }

    /**
     * Invokes a function with no arguments, and returns a 32 bit integer.
     *
     * This method does not save the errno value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @return A 32 bit integer value.
     */
    @Deprecated
    public final int invokeNoErrnoVrI(Function function) {
        return foreign.invokeI0NoErrno(function.getContextAddress(), function.getFunctionAddress());
    }

    /**
     * Invokes a function with one integer argument, and returns a 32 bit integer.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 A 32 bit integer argument.
     * @return A 32 bit integer value.
     */
    @Deprecated
    public final int invokeIrI(Function function, int arg1) {
        return foreign.invokeI1(function.getContextAddress(), function.getFunctionAddress(), arg1);
    }

    /**
     * Invokes a function with one integer argument, and returns a 32 bit integer.
     *
     * This method does not save the errno value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 A 32 bit integer argument.
     * @return A 32 bit integer value.
     */
    @Deprecated
    public final int invokeNoErrnoIrI(Function function, int arg1) {
        return foreign.invokeI1NoErrno(function.getContextAddress(), function.getFunctionAddress(), arg1);
    }

    /**
     * Invokes a function with two integer arguments, and returns a 32 bit integer.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The first 32 bit integer argument.
     * @param arg2 The second 32 bit integer argument.
     * @return A 32 bit integer value.
     */
    @Deprecated
    public final int invokeIIrI(Function function, int arg1, int arg2) {
        return foreign.invokeI2(function.getContextAddress(), function.getFunctionAddress(), arg1, arg2);
    }
    
    /**
     * Invokes a function with two integer arguments, and returns a 32 bit integer.
     *
     * This method does not save the errno value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The first 32 bit integer argument.
     * @param arg2 The second 32 bit integer argument.
     * @return A 32 bit integer value.
     */
    @Deprecated
    public final int invokeNoErrnoIIrI(Function function, int arg1, int arg2) {
        return foreign.invokeI2NoErrno(function.getContextAddress(), function.getFunctionAddress(), arg1, arg2);
    }

    /**
     * Invokes a function with three integer arguments, and returns a 32 bit integer.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The first 32 bit integer argument.
     * @param arg2 The second 32 bit integer argument.
     * @param arg3 The third 32 bit integer argument.
     * @return A 32 bit integer value.
     */
    @Deprecated
    public final int invokeIIIrI(Function function, int arg1, int arg2, int arg3) {
        return foreign.invokeI3(function.getContextAddress(), function.getFunctionAddress(), arg1, arg2, arg3);
    }

    /**
     * Invokes a function with three integer arguments, and returns a 32 bit integer.
     *
     * This method does not save the errno value.
     * 
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The first 32 bit integer argument.
     * @param arg2 The second 32 bit integer argument.
     * @param arg3 The third 32 bit integer argument.
     * @return A 32 bit integer value.
     */
    @Deprecated
    public final int invokeNoErrnoIIIrI(Function function, int arg1, int arg2, int arg3) {
        return foreign.invokeI3NoErrno(function.getContextAddress(), function.getFunctionAddress(), arg1, arg2, arg3);
    }

    /**
     * Invokes a function with four integer arguments, and returns a 32 bit integer.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The first 32 bit integer argument.
     * @param arg2 The second 32 bit integer argument.
     * @param arg3 The third 32 bit integer argument.
     * @param arg4 The fourth 32 bit integer argument.
     * @return A 32 bit integer value.
     */
    @Deprecated
    public final int invokeIIIIrI(Function function, int arg1, int arg2, int arg3, int arg4) {
        return foreign.invokeI4(function.getContextAddress(), function.getFunctionAddress(), arg1, arg2, arg3, arg4);
    }

    /**
     * Invokes a function with five integer arguments, and returns a 32 bit integer.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The first 32 bit integer argument.
     * @param arg2 The second 32 bit integer argument.
     * @param arg3 The third 32 bit integer argument.
     * @param arg4 The fourth 32 bit integer argument.
     * @param arg5 The fifth 32 bit integer argument.
     * @return A 32 bit integer value.
     */
    @Deprecated
    public final int invokeIIIIIrI(Function function, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return foreign.invokeI5(function.getContextAddress(), function.getFunctionAddress(), arg1, arg2, arg3, arg4, arg5);
    }

    /**
     * Invokes a function with six integer arguments, and returns a 32 bit integer.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The first 32 bit integer argument.
     * @param arg2 The second 32 bit integer argument.
     * @param arg3 The third 32 bit integer argument.
     * @param arg4 The fourth 32 bit integer argument.
     * @param arg5 The fifth 32 bit integer argument.
     * @param arg6 The sixth 32 bit integer argument.
     * @return A 32 bit integer value.
     */
    @Deprecated
    public final int invokeIIIIIIrI(Function function, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        return foreign.invokeI6(function.getContextAddress(), function.getFunctionAddress(), arg1, arg2, arg3, arg4, arg5, arg6);
    }

    /**
     * Invokes a function with no arguments, and returns a 64 bit integer.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @return A 64 bit integer value.
     */
    public final long invokeL0(CallContext context, long function) {
        return foreign.invokeL0(context.getAddress(), function);
    }

    /**
     * Invokes a function with one 64 bit integer argument, and returns a 64 bit integer.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 The 64 bit integer argument.
     * @return A 64 bit integer value.
     */
    public final long invokeL1(CallContext context, long function, long arg1) {
        return foreign.invokeL1(context.getAddress(), function, arg1);
    }

    /**
     * Invokes a function with two 64 bit integer arguments, and returns a 64 bit integer.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 The first 64 bit integer argument.
     * @param arg2 The second 64 bit integer argument.
     * @return A 64 bit integer value.
     */
    public final long invokeL2(CallContext context, long function, long arg1, long arg2) {
        return foreign.invokeL2(context.getAddress(), function, arg1, arg2);
    }

    /**
     * Invokes a function with three 64 bit integer arguments, and returns a 64 bit integer.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 The first 64 bit integer argument.
     * @param arg2 The second 64 bit integer argument.
     * @param arg3 The third 64 bit integer argument.
     * @return A 64 bit integer value.
     */
    public final long invokeL3(CallContext context, long function, long arg1, long arg2, long arg3) {
        return foreign.invokeL3(context.getAddress(), function, arg1, arg2, arg3);
    }

    /**
     * Invokes a function with four 64 bit integer arguments, and returns a 64 bit integer.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 The first 64 bit integer argument.
     * @param arg2 The second 64 bit integer argument.
     * @param arg3 The third 64 bit integer argument.
     * @param arg4 The fourth 64 bit integer argument.
     * @return A 64 bit integer value.
     */
    public final long invokeL4(CallContext context, long function, long arg1, long arg2, long arg3, long arg4) {
        return foreign.invokeL4(context.getAddress(), function, arg1, arg2, arg3, arg4);
    }

    /**
     * Invokes a function with five 64 bit integer arguments, and returns a 64 bit integer.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 The first 64 bit integer argument.
     * @param arg2 The second 64 bit integer argument.
     * @param arg3 The third 64 bit integer argument.
     * @param arg4 The fourth 64 bit integer argument.
     * @param arg5 The fifth 64 bit integer argument.
     * @return A 64 bit integer value.
     */
    public final long invokeL5(CallContext context, long function, long arg1, long arg2, long arg3, long arg4, long arg5) {
        return foreign.invokeL5(context.getAddress(), function, arg1, arg2, arg3, arg4, arg5);
    }

    /**
     * Invokes a function with six 64 bit integer arguments, and returns a 64 bit integer.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 The first 64 bit integer argument.
     * @param arg2 The second 64 bit integer argument.
     * @param arg3 The third 64 bit integer argument.
     * @param arg4 The fourth 64 bit integer argument.
     * @param arg5 The fifth 64 bit integer argument.
     * @param arg6 The sixth 64 bit integer argument.
     * @return A 64 bit integer value.
     */
    public final long invokeL6(CallContext context, long function, long arg1, long arg2, long arg3, long arg4, long arg5, long arg6) {
        return foreign.invokeL6(context.getAddress(), function, arg1, arg2, arg3, arg4, arg5, arg6);
    }


    /**
     * Invokes a function with no arguments, and returns a 64 bit integer.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @return A 64 bit integer value.
     */
    public final long invokeVrL(Function function) {
        return foreign.invokeL0(function.getContextAddress(), function.getFunctionAddress());
    }

    /**
     * Invokes a function with one 64 bit integer argument, and returns a 64 bit integer.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The 64 bit integer argument.
     * @return A 64 bit integer value.
     */
    public final long invokeLrL(Function function, long arg1) {
        return foreign.invokeL1(function.getContextAddress(), function.getFunctionAddress(), arg1);
    }
    
    /**
     * Invokes a function with two 64 bit integer arguments, and returns a 64 bit integer.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The first 64 bit integer argument.
     * @param arg2 The second 64 bit integer argument.
     * @return A 64 bit integer value.
     */
    public final long invokeLLrL(Function function, long arg1, long arg2) {
        return foreign.invokeL2(function.getContextAddress(), function.getFunctionAddress(), arg1, arg2);
    }

    /**
     * Invokes a function with three 64 bit integer arguments, and returns a 64 bit integer.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The first 64 bit integer argument.
     * @param arg2 The second 64 bit integer argument.
     * @param arg3 The third 64 bit integer argument.
     * @return A 64 bit integer value.
     */
    public final long invokeLLLrL(Function function, long arg1, long arg2, long arg3) {
        return foreign.invokeL3(function.getContextAddress(), function.getFunctionAddress(), arg1, arg2, arg3);
    }

    /**
     * Invokes a function with four 64 bit integer arguments, and returns a 64 bit integer.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The first 64 bit integer argument.
     * @param arg2 The second 64 bit integer argument.
     * @param arg3 The third 64 bit integer argument.
     * @param arg4 The fourth 64 bit integer argument.
     * @return A 64 bit integer value.
     */
    public final long invokeLLLLrL(Function function, long arg1, long arg2, long arg3, long arg4) {
        return foreign.invokeL4(function.getContextAddress(), function.getFunctionAddress(), arg1, arg2, arg3, arg4);
    }

    /**
     * Invokes a function with five 64 bit integer arguments, and returns a 64 bit integer.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The first 64 bit integer argument.
     * @param arg2 The second 64 bit integer argument.
     * @param arg3 The third 64 bit integer argument.
     * @param arg4 The fourth 64 bit integer argument.
     * @param arg5 The fifth 64 bit integer argument.
     * @return A 64 bit integer value.
     */
    public final long invokeLLLLLrL(Function function, long arg1, long arg2, long arg3, long arg4, long arg5) {
        return foreign.invokeL5(function.getContextAddress(), function.getFunctionAddress(), arg1, arg2, arg3, arg4, arg5);
    }

    /**
     * Invokes a function with six 64 bit integer arguments, and returns a 64 bit integer.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The first 64 bit integer argument.
     * @param arg2 The second 64 bit integer argument.
     * @param arg3 The third 64 bit integer argument.
     * @param arg4 The fourth 64 bit integer argument.
     * @param arg5 The fifth 64 bit integer argument.
     * @param arg6 The sixth 64 bit integer argument.
     * @return A 64 bit integer value.
     */
    public final long invokeLLLLLLrL(Function function, long arg1, long arg2, long arg3, long arg4, long arg5, long arg6) {
        return foreign.invokeL6(function.getContextAddress(), function.getFunctionAddress(), arg1, arg2, arg3, arg4, arg5, arg6);
    }

    /**
     * Invokes a function with no arguments, and returns a numeric value.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @return A numeric value.
     */
    public final long invokeN0(CallContext context, long function) {
        return foreign.invokeN0(context.getAddress(), function);
    }

    /**
     * Invokes a function with one numeric argument, and returns a numeric value.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 The numeric argument.
     * @return A numeric value.
     */
    public final long invokeN1(CallContext context, long function, long arg1) {
        return foreign.invokeN1(context.getAddress(), function, arg1);
    }

    /**
     * Invokes a function with two numeric arguments, and returns a numeric value.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 The first numeric argument.
     * @param arg2 The second numeric argument.
     * @return A numeric value.
     */
    public final long invokeN2(CallContext context, long function, long arg1, long arg2) {
        return foreign.invokeN2(context.getAddress(), function, arg1, arg2);
    }

    /**
     * Invokes a function with three numeric arguments, and returns a numeric value.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 The first numeric argument.
     * @param arg2 The second numeric argument.
     * @param arg3 The third numeric argument.
     * @return A numeric value.
     */
    public final long invokeN3(CallContext context, long function, long arg1, long arg2, long arg3) {
        return foreign.invokeN3(context.getAddress(), function, arg1, arg2, arg3);
    }

    /**
     * Invokes a function with four numeric arguments, and returns a numeric value.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 The first numeric argument.
     * @param arg2 The second numeric argument.
     * @param arg3 The third numeric argument.
     * @param arg4 The fourth numeric argument.
     * @return A numeric value.
     */
    public final long invokeN4(CallContext context, long function, long arg1, long arg2, long arg3, long arg4) {
        return foreign.invokeN4(context.getAddress(), function, arg1, arg2, arg3, arg4);
    }

    /**
     * Invokes a function with five numeric arguments, and returns a numeric value.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 The first numeric argument.
     * @param arg2 The second numeric argument.
     * @param arg3 The third numeric argument.
     * @param arg4 The fourth numeric argument.
     * @param arg5 The fifth numeric argument.
     * @return A numeric value.
     */
    public final long invokeN5(CallContext context, long function, long arg1, long arg2, long arg3, long arg4, long arg5) {
        return foreign.invokeN5(context.getAddress(), function, arg1, arg2, arg3, arg4, arg5);
    }

    /**
     * Invokes a function with six numeric arguments, and returns a numeric value.
     *
     * @param context The <t>CallContext</t> describing how to invoke the function.
     * @param function Address of the native function to invoke.
     * @param arg1 The first numeric argument.
     * @param arg2 The second numeric argument.
     * @param arg3 The third numeric argument.
     * @param arg4 The fourth numeric argument.
     * @param arg5 The fifth numeric argument.
     * @param arg6 The sixth numeric argument.
     * @return A numeric value.
     */
    public final long invokeN6(CallContext context, long function, long arg1, long arg2, long arg3, long arg4, long arg5, long arg6) {
        return foreign.invokeN6(context.getAddress(), function, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    /**
     * Invokes a function with no arguments, and returns a numeric value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @return A numeric value.
     */
    public final long invokeVrN(Function function) {
        return foreign.invokeN0(function.getContextAddress(), function.getFunctionAddress());
    }

    /**
     * Invokes a function with one numeric argument, and returns a numeric value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The numeric argument.
     * @return A numeric value.
     */
    public final long invokeNrN(Function function, long arg1) {
        return foreign.invokeN1(function.getContextAddress(), function.getFunctionAddress(), arg1);
    }

    /**
     * Invokes a function with two numeric arguments, and returns a numeric value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The first numeric argument.
     * @param arg2 The second numeric argument.
     * @return A numeric value.
     */
    public final long invokeNNrN(Function function, long arg1, long arg2) {
        return foreign.invokeN2(function.getContextAddress(), function.getFunctionAddress(), arg1, arg2);
    }

    /**
     * Invokes a function with three numeric arguments, and returns a numeric value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The first numeric argument.
     * @param arg2 The second numeric argument.
     * @param arg3 The third numeric argument.
     * @return A numeric value.
     */
    public final long invokeNNNrN(Function function, long arg1, long arg2, long arg3) {
        return foreign.invokeN3(function.getContextAddress(), function.getFunctionAddress(), arg1, arg2, arg3);
    }

    /**
     * Invokes a function with four numeric arguments, and returns a numeric value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The first numeric argument.
     * @param arg2 The second numeric argument.
     * @param arg3 The third numeric argument.
     * @param arg4 The fourth numeric argument.
     * @return A numeric value.
     */
    public final long invokeNNNNrN(Function function, long arg1, long arg2, long arg3, long arg4) {
        return foreign.invokeN4(function.getContextAddress(), function.getFunctionAddress(), arg1, arg2, arg3, arg4);
    }

    /**
     * Invokes a function with five numeric arguments, and returns a numeric value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The first numeric argument.
     * @param arg2 The second numeric argument.
     * @param arg3 The third numeric argument.
     * @param arg4 The fourth numeric argument.
     * @param arg5 The fifth numeric argument.
     * @return A numeric value.
     */
    public final long invokeNNNNNrN(Function function, long arg1, long arg2, long arg3, long arg4, long arg5) {
        return foreign.invokeN5(function.getContextAddress(), function.getFunctionAddress(), arg1, arg2, arg3, arg4, arg5);
    }

    /**
     * Invokes a function with six numeric arguments, and returns a numeric value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param arg1 The first numeric argument.
     * @param arg2 The second numeric argument.
     * @param arg3 The third numeric argument.
     * @param arg4 The fourth numeric argument.
     * @param arg5 The fifth numeric argument.
     * @param arg6 The sixth numeric argument.
     * @return A numeric value.
     */
    public final long invokeNNNNNNrN(Function function, long arg1, long arg2, long arg3, long arg4, long arg5, long arg6) {
        return foreign.invokeN6(function.getContextAddress(), function.getFunctionAddress(), arg1, arg2, arg3, arg4, arg5, arg6);
    }
    
    /**
     * Invokes a function with two numeric arguments, and returns a numeric value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param n1 first numeric argument.
     * @param n2 second numeric argument.
     * @param o1 array or buffer, to be passed as a pointer for the first numeric parameter.
     * @param o1off offset from the start of the array pr buffer.
     * @param o1len length of the array to use.
     * @param o1flags object flags (type, direction, parameter index).
     */
    @Deprecated
    public final long invokeNNO1rN(Function function, 
            long n1, long n2,
            Object o1, int o1off, int o1len, ObjectParameterInfo o1flags) {

        return foreign.invokeN2O1(function.getContextAddress(), function.getFunctionAddress(),
                n1, n2,
                o1, o1flags.asObjectInfo(), o1off, o1len);
    }
    
    /**
     * Invokes a function with two numeric arguments, and returns a numeric value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param n1 first numeric argument.
     * @param n2 second numeric argument.
     * @param o1 array or buffer, to be passed as a pointer for the first numeric parameter.
     * @param o1off offset from the start of the array pr buffer.
     * @param o1len length of the array to use.
     * @param o1flags object flags (type, direction, parameter index).
     */
    @Deprecated
    public final long invokeNNO2rN(Function function,
            long n1, long n2,
            Object o1, int o1off, int o1len, ObjectParameterInfo o1flags,
            Object o2, int o2off, int o2len, ObjectParameterInfo o2flags) {

        return foreign.invokeN2O2(function.getContextAddress(), function.getFunctionAddress(),
                n1, n2,
                o1, o1flags.asObjectInfo(), o1off, o1len,
                o2, o2flags.asObjectInfo(), o2off, o2len);
    }
    
    /**
     * Invokes a function with two numeric arguments, and returns a numeric value.
     *
     * @param function The <tt>Function</tt> to invoke.
     */
    @Deprecated
    public final long invokeNNNO1rN(Function function, 
            long n1, long n2, long n3,
            Object o1, int o1off, int o1len, ObjectParameterInfo o1flags) {

        return foreign.invokeN3O1(function.getContextAddress(), function.getFunctionAddress(),
                n1, n2, n3,
                o1, o1flags.asObjectInfo(), o1off, o1len);
    }

    /**
     * Invokes a function with two numeric arguments, and returns a numeric value.
     *
     * @param function The <tt>Function</tt> to invoke.
     */
    @Deprecated
    public final long invokeNNNO2rN(Function function, 
            long n1, long n2, long n3,
            Object o1, int o1off, int o1len, ObjectParameterInfo o1flags,
            Object o2, int o2off, int o2len, ObjectParameterInfo o2flags) {

        return foreign.invokeN3O2(function.getContextAddress(), function.getFunctionAddress(),
                n1, n2, n3,
                o1, o1flags.asObjectInfo(), o1off, o1len,
                o2, o2flags.asObjectInfo(), o2off, o2len);
    }

    private static RuntimeException newObjectCountError(int objCount) {
        return new RuntimeException("invalid object count: " + objCount);
    }

    private static RuntimeException newInsufficientObjectCountError(int objCount) {
        return new RuntimeException("invalid object count: " + objCount);
    }


    private static RuntimeException newHeapObjectCountError(int objCount) {
        return new RuntimeException("insufficient number of heap objects supplied (" + objCount + " required)");
    }


    public final long invokeN1O1(CallContext ctx, long function,
                                 long n1,
                                 Object o1, ObjectParameterStrategy s1, ObjectParameterInfo o1info) {
        return foreign.invokeN1O1(ctx.getAddress(), function, n1,
                s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
    }

    public final long invokeN2O1(CallContext ctx, long function,
                                 long n1, long n2,
                                 Object o1, ObjectParameterStrategy s1, ObjectParameterInfo o1info) {
        return foreign.invokeN2O1(ctx.getAddress(), function, n1, n2,
                s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
    }

    public final long invokeN2O2(CallContext ctx, long function,
                                 long n1, long n2,
                                 Object o1, ObjectParameterStrategy s1, ObjectParameterInfo o1info,
                                 Object o2, ObjectParameterStrategy s2, ObjectParameterInfo o2info) {
        return foreign.invokeN2O2(ctx.getAddress(), function, n1, n2,
                s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1),
                s2.object(o2), s2.objectInfo(o2info), s2.offset(o2), s2.length(o2));
    }


    public final long invokeN3O1(CallContext ctx, long function,
                                 long n1, long n2, long n3,
                                 Object o1, ObjectParameterStrategy s1, ObjectParameterInfo o1info) {
        return foreign.invokeN3O1(ctx.getAddress(), function, n1, n2, n3,
                s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
    }

    public final long invokeN3O2(CallContext ctx, long function,
                                 long n1, long n2, long n3,
                                 Object o1, ObjectParameterStrategy s1, ObjectParameterInfo o1info,
                                 Object o2, ObjectParameterStrategy s2, ObjectParameterInfo o2info) {
        return foreign.invokeN3O2(ctx.getAddress(), function, n1, n2, n3,
                s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1),
                s2.object(o2), s2.objectInfo(o2info), s2.offset(o2), s2.length(o2));
    }

    public final long invokeN3O3(CallContext ctx, long function,
                                 long n1, long n2, long n3,
                                 Object o1, ObjectParameterStrategy s1, ObjectParameterInfo o1info,
                                 Object o2, ObjectParameterStrategy s2, ObjectParameterInfo o2info,
                                 Object o3, ObjectParameterStrategy s3, ObjectParameterInfo o3info) {
        return foreign.invokeN3O3(ctx.getAddress(), function, n1, n2, n3,
                s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1),
                s2.object(o2), s2.objectInfo(o2info), s2.offset(o2), s2.length(o2),
                s3.object(o3), s3.objectInfo(o3info), s3.offset(o3), s3.length(o3));
    }


    public final long invokeN1(CallContext ctx, long function,
                                  long n1, int objCount,
                                  Object o1, ObjectParameterStrategy s1, ObjectParameterInfo o1info) {
        if (objCount == 1) {
            return foreign.invokeN1O1(ctx.getAddress(), function, n1,
                    s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));

        } else {
            throw newObjectCountError(objCount);
        }
    }

    public final long invokeN2(CallContext ctx, long function,
                                  long n1, long n2, int objCount,
                                  Object o1, ObjectParameterStrategy s1, ObjectParameterInfo o1info) {
        if (objCount == 1) {
            return foreign.invokeN2O1(ctx.getAddress(), function, n1, n2,
                    s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
        } else {
            throw newObjectCountError(objCount);
        }
    }

    public final long invokeN2(CallContext ctx, long function,
            long n1, long n2, int objCount,
            Object o1, ObjectParameterStrategy s1, ObjectParameterInfo o1info,
            Object o2, ObjectParameterStrategy s2, ObjectParameterInfo o2info) {
        if (objCount == 1) {
            // only one object is to be passed down as a a heap object - figure out which one
            if (!s1.isDirect()) {
                // do nothing, use the first param as-is

            } else {
                // move second into first place
                o1 = o2; s1 = s2; o1info = o2info;
            }

            return foreign.invokeN2O1(ctx.getAddress(), function, n1, n2,
                    s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));

        } else if (objCount == 2) {
            // Two objects to be passed as heap objects, just use both arguments as-is
            return foreign.invokeN2O2(ctx.getAddress(), function, n1, n2,
                s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1),
                s2.object(o2), s2.objectInfo(o2info), s2.offset(o2), s2.length(o2));

        } else {
            throw newObjectCountError(objCount);
        }
    }

    public final long invokeN3(CallContext ctx, long function,
            long n1, long n2, long n3, int objCount,
            Object o1, ObjectParameterStrategy s1, ObjectParameterInfo o1info) {
        if (objCount == 1) {
            return foreign.invokeN3O1(ctx.getAddress(), function, n1, n2, n3,
                    s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
        } else {
            throw newObjectCountError(objCount);
        }
    }


    public final long invokeN3(CallContext ctx, long function,
            long n1, long n2, long n3, int objCount,
            Object o1, ObjectParameterStrategy s1, ObjectParameterInfo o1info,
            Object o2, ObjectParameterStrategy s2, ObjectParameterInfo o2info) {
        if (objCount == 1) {
            // only one object is to be passed down as a a heap object - figure out which one
            if (!s1.isDirect()) {
                // do nothing, use the first param as-is

            } else {
                // move second into first place
                o1 = o2; s1 = s2; o1info = o2info;
            }

            return foreign.invokeN3O1(ctx.getAddress(), function, n1, n2, n3,
                    s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));

        } else if (objCount == 2) {
            return foreign.invokeN3O2(ctx.getAddress(), function, n1, n2, n3,
                    s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1),
                    s2.object(o2), s2.objectInfo(o2info), s2.offset(o2), s2.length(o2));

        } else {
            throw newObjectCountError(objCount);
        }
    }

    public final long invokeN3(CallContext ctx, long function,
            long n1, long n2, long n3, int objCount,
            Object o1, ObjectParameterStrategy s1, ObjectParameterInfo o1info,
            Object o2, ObjectParameterStrategy s2, ObjectParameterInfo o2info,
            Object o3, ObjectParameterStrategy s3, ObjectParameterInfo o3info) {

        if (objCount < 3) {
            int next;
            // Sort out which is the first non-direct object
            if (!s1.isDirect()) {
                // do nothing, use the first param as-is
                next = 2;

            } else if (!s2.isDirect()) {
                // move second into first place
                o1 = o2; s1 = s2; o1info = o2info;
                next = 3;

            } else {
                // move third into first place
                o1 = o3; s1 = s3; o1info = o3info;
                next = 4;
            }

            if (objCount == 1) {

                return foreign.invokeN3O1(ctx.getAddress(), function, n1, n2, n3,
                        s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));

            } else if (objCount == 2) {
                // Sort out which is the second non-direct object
                if (next <= 2 && !s2.isDirect()) {
                    // do nothing, use the second param as-is

                } else if (next <= 3) {
                    // move third param into second  place
                    o2 = o3; s2 = s3; o2info = o3info;

                } else {
                    throw newHeapObjectCountError(objCount);
                }

                return foreign.invokeN3O2(ctx.getAddress(), function, n1, n2, n3,
                        s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1),
                        s2.object(o2), s2.objectInfo(o2info), s2.offset(o2), s2.length(o2));
            } else {
                throw newObjectCountError(objCount);
            }
        }

        // Three objects to be passed as heap objects, just use all arguments as-is
        return foreign.invokeN3O3(ctx.getAddress(), function, n1, n2, n3,
                s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1),
                s2.object(o2), s2.objectInfo(o2info), s2.offset(o2), s2.length(o2),
                s3.object(o3), s3.objectInfo(o3info), s3.offset(o3), s3.length(o3));
    }

    public final long invokeN4(CallContext ctx, long function,
            long n1, long n2, long n3, long n4, int objCount,
            Object o1, ObjectParameterStrategy s1, ObjectParameterInfo o1info) {

        if (objCount == 1) {
            return foreign.invokeN4O1(ctx.getAddress(), function, n1, n2, n3, n4,
                    s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
        } else {
            throw newObjectCountError(objCount);
        }
    }


    public final long invokeN4(CallContext ctx, long function,
            long n1, long n2, long n3, long n4, int objCount,
            Object o1, ObjectParameterStrategy s1, ObjectParameterInfo o1info,
            Object o2, ObjectParameterStrategy s2, ObjectParameterInfo o2info) {
        
        if (objCount == 1) {
            // only one object is to be passed down as a a heap object - figure out which one
            if (!s1.isDirect()) {
                // do nothing, use the first param as-is

            } else {
                // move second into first place
                o1 = o2; s1 = s2; o1info = o2info;
            }

            return foreign.invokeN4O1(ctx.getAddress(), function, n1, n2, n3, n4,
                    s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));

        } else if (objCount == 2) {
            // Two objects to be passed as heap objects, just use both arguments as-is
            return foreign.invokeN4O2(ctx.getAddress(), function, n1, n2, n3, n4,
                    s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1),
                    s2.object(o2), s2.objectInfo(o2info), s2.offset(o2), s2.length(o2));

        } else {
            throw newObjectCountError(objCount);
        }
    }
    
    public final long invokeN4(CallContext ctx, long function,
            long n1, long n2, long n3, long n4, int objCount,
            Object o1, ObjectParameterStrategy s1, ObjectParameterInfo o1info,
            Object o2, ObjectParameterStrategy s2, ObjectParameterInfo o2info,
            Object o3, ObjectParameterStrategy s3, ObjectParameterInfo o3info) {
        
        if (objCount < 3) {
            int next;
            // Sort out which is the first non-direct object
            if (!s1.isDirect()) {
                // do nothing, use the first param as-is
                next = 2;

            } else if (!s2.isDirect()) {
                // move second into first place
                o1 = o2; s1 = s2; o1info = o2info;
                next = 3;

            } else {
                // move third into first place
                o1 = o3; s1 = s3; o1info = o3info;
                next = 4;
            }


            if (objCount == 1) {
                return foreign.invokeN4O1(ctx.getAddress(), function, n1, n2, n3, n4,
                        s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));

            } else if (objCount == 2) {
                // Sort out which is the second non-direct object

                if (next <= 2 && !s2.isDirect()) {
                    // do nothing, use the second param as-is

                } else if (next <= 3 && !s3.isDirect()) {
                    // move third param into second  place
                    o2 = o3; s2 = s3; o2info = o3info;

                } else {
                    throw newInsufficientObjectCountError(objCount);
                }

                return foreign.invokeN4O2(ctx.getAddress(), function, n1, n2, n3, n4,
                        s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1),
                        s2.object(o2), s2.objectInfo(o2info), s2.offset(o2), s2.length(o2));
            } else {
                throw newObjectCountError(objCount);
            }
        }

        // Three objects to be passed as heap objects, just use all arguments as-is
        return foreign.invokeN4O3(ctx.getAddress(), function, n1, n2, n3, n4,
                s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1),
                s2.object(o2), s2.objectInfo(o2info), s2.offset(o2), s2.length(o2),
                s3.object(o3), s3.objectInfo(o3info), s3.offset(o3), s3.length(o3));
    }

    public final long invokeN4(CallContext ctx, long function,
            long n1, long n2, long n3, long n4, int objCount,
            Object o1, ObjectParameterStrategy s1, ObjectParameterInfo o1info,
            Object o2, ObjectParameterStrategy s2, ObjectParameterInfo o2info,
            Object o3, ObjectParameterStrategy s3, ObjectParameterInfo o3info,
            Object o4, ObjectParameterStrategy s4, ObjectParameterInfo o4info) {
        
        int next;
        // Sort out which is the first non-direct object
        if (!s1.isDirect()) {
            // do nothing, use the first param as-is
            next = 2;

        } else if (!s2.isDirect()) {
            // move second into first place
            o1 = o2; s1 = s2; o1info = o2info;
            next = 3;

        } else if (!s3.isDirect()) {
            // move third into first place
            o1 = o3; s1 = s3; o1info = o3info;
            next = 4;

        } else {
            // move fourth into first place
            o1 = o4; s1 = s4; o1info = o4info;
            next = 5;
        }

        if (objCount == 1) {
            return foreign.invokeN4O1(ctx.getAddress(), function, n1, n2, n3, n4,
                    s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
        }

        // Sort out which is the second non-direct object
        if (next <= 2 && !s2.isDirect()) {
            // do nothing, use the second param as-is
            next = 3;

        } else if (next <= 3 && !s3.isDirect()) {
            // move third param into second place
            o2 = o3; s2 = s3; o2info = o3info;
            next = 4;

        } else if (next <= 4) {
            // move fourth param into second place
            o2 = o4; s2 = s4; o2info = o4info;
            next = 5;
        }
        
        if (objCount == 2) {
            return foreign.invokeN4O2(ctx.getAddress(), function, n1, n2, n3, n4,
                    s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1),
                    s2.object(o2), s2.objectInfo(o2info), s2.offset(o2), s2.length(o2));
        }
        
        // Sort out third parameter
        if (next <= 3 && !s3.isDirect()) {
            // do nothing, use the third param as-is

        } else if (next <= 4) {
            // move fourth param into third place
            o3 = o4; s3 = s4; o3info = o4info;

        } else {
            throw newHeapObjectCountError(objCount);
        }

        if (objCount == 3) {
            return foreign.invokeN4O3(ctx.getAddress(), function, n1, n2, n3, n4,
                    s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1),
                    s2.object(o2), s2.objectInfo(o2info), s2.offset(o2), s2.length(o2),
                    s3.object(o3), s3.objectInfo(o3info), s3.offset(o3), s3.length(o3));

        } else {
            throw newObjectCountError(objCount);
        }
    }
    
    /**
     * Invokes a function and returns a native memory address.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param buffer A buffer containing the arguments to the function.
     * @return A native memory address.
     */
    public long invokeAddress(Function function, HeapInvocationBuffer buffer) {
        return invokeAddress(function.getCallContext(), function.getFunctionAddress(), buffer);
    }
    
    /**
     * Invokes a function and returns a native memory address.
     *
     * @param ctx The call context which describes how to call the native function.
     * @param function The address of the native function to invoke.
     * @param buffer A buffer containing the arguments to the function.
     * @return A native memory address.
     */
    public abstract long invokeAddress(CallContext ctx, long function, HeapInvocationBuffer buffer);

    /**
     * Invokes a function and returns a 32 bit integer value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param buffer A buffer containing the arguments to the function.
     * @return A native memory address.
     */
    public final int invokeInt(Function function, HeapInvocationBuffer buffer) {
        return invokeInt(function.getCallContext(), function.getFunctionAddress(), buffer);
    }
    
    /**
     * Invokes a function and returns a 32 bit integer value.
     *
     * @param ctx The call context which describes how to call the native function.
     * @param function The address of the native function to invoke.
     * @param buffer A buffer containing the arguments to the function.
     * @return A native memory address.
     */
    public final int invokeInt(CallContext ctx, long function, HeapInvocationBuffer buffer) {
        ObjectBuffer objectBuffer = buffer.objectBuffer();
        return objectBuffer != null
                ? invokeArrayWithObjectsInt32(ctx.getAddress(), function, buffer, objectBuffer)
                : foreign.invokeArrayReturnInt(ctx.getAddress(), function, buffer.array());
    }

    /**
     * Invokes a function and returns a 64 bit integer value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param buffer A buffer containing the arguments to the function.
     * @return A native memory address.
     */
    public final long invokeLong(Function function, HeapInvocationBuffer buffer) {
        return invokeLong(function.getCallContext(), function.getFunctionAddress(), buffer);
    }
    
    /**
     * Invokes a function and returns a 64 bit integer value.
     *
     * @param ctx The call context which describes how to call the native function.
     * @param function The address of the native function to invoke.
     * @param buffer A buffer containing the arguments to the function.
     * @return A native memory address.
     */
    public final long invokeLong(CallContext ctx, long function, HeapInvocationBuffer buffer) {
        ObjectBuffer objectBuffer = buffer.objectBuffer();
        return objectBuffer != null
                ? invokeArrayWithObjectsInt64(ctx.getAddress(), function, buffer, objectBuffer)
                : foreign.invokeArrayReturnLong(ctx.getAddress(), function, buffer.array());
    }

    /**
     * Invokes a function and returns a 32 bit floating point value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param buffer A buffer containing the arguments to the function.
     * @return A native memory address.
     */
    public final float invokeFloat(Function function, HeapInvocationBuffer buffer) {
        return invokeFloat(function.getCallContext(), function.getFunctionAddress(), buffer);
    }
    
    /**
     * Invokes a function and returns a 32 bit floating point value.
     *
     * @param ctx The call context which describes how to call the native function.
     * @param function The address of the native function to invoke.
     * @param buffer A buffer containing the arguments to the function.
     * @return A native memory address.
     */
    public final float invokeFloat(CallContext ctx, long function, HeapInvocationBuffer buffer) {
        ObjectBuffer objectBuffer = buffer.objectBuffer();
        return objectBuffer != null
            ? foreign.invokeArrayWithObjectsFloat(ctx.getAddress(), function, buffer.array(), objectBuffer.objectCount(), objectBuffer.info(), objectBuffer.objects())
            : foreign.invokeArrayReturnFloat(ctx.getAddress(), function, buffer.array());
    }
    

    /**
     * Invokes a function and returns a 64 bit floating point value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param buffer A buffer containing the arguments to the function.
     * @return A native memory address.
     */
    public final double invokeDouble(Function function, HeapInvocationBuffer buffer) {
        return invokeDouble(function.getCallContext(), function.getFunctionAddress(), buffer);
    }
    
    /**
     * Invokes a function and returns a 64 bit floating point value.
     *
     * @param ctx The call context describing how to call the native function.
     * @param function The address of the native function to invoke.
     * @param buffer A buffer containing the arguments to the function.
     * @return A native memory address.
     */
    public final double invokeDouble(CallContext ctx, long function, HeapInvocationBuffer buffer) {
        ObjectBuffer objectBuffer = buffer.objectBuffer();
        return objectBuffer != null
            ? foreign.invokeArrayWithObjectsDouble(ctx.getAddress(), function, buffer.array(), objectBuffer.objectCount(), objectBuffer.info(), objectBuffer.objects())
            : foreign.invokeArrayReturnDouble(ctx.getAddress(), function, buffer.array());
    }

    /**
     * Invokes a function and returns a 64 bit floating point value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param buffer A buffer containing the arguments to the function.
     * @return A native memory address.
     */
    public final BigDecimal invokeBigDecimal(Function function, HeapInvocationBuffer buffer) {
        return invokeBigDecimal(function.getCallContext(), function.getFunctionAddress(), buffer);
    }

    /**
     * Invokes a function and returns a 64 bit floating point value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param buffer A buffer containing the arguments to the function.
     * @return A native memory address.
     */
    public final BigDecimal invokeBigDecimal(CallContext ctx, long function, HeapInvocationBuffer buffer) {
        byte[] rval = invokeStruct(ctx, function, buffer);
        return new BigDecimal(foreign.longDoubleToString(rval, 0, rval.length));
    }

    /**
     * Invokes a function that returns a C struct by value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param buffer The parameter buffer.
     * @return A byte array with the return value encoded in native byte order.
     */
    public final byte[] invokeStruct(Function function, HeapInvocationBuffer buffer) {
        return invokeStruct(function.getCallContext(), function.getFunctionAddress(), buffer);
    }
    
    /**
     * Invokes a function that returns a C struct by value.
     *
     * @param ctx The call context which describes how to call the native function.
     * @param function The address of the native function to invoke.
     * @param buffer The parameter buffer.
     * @return A byte array with the return value encoded in native byte order.
     */
    public final byte[] invokeStruct(CallContext ctx, long function, HeapInvocationBuffer buffer) {
        byte[] returnBuffer = new byte[ctx.getReturnType().size()];
        invokeStruct(ctx, function, buffer, returnBuffer, 0);

        return returnBuffer;
    }

    /**
     * Invokes a function that returns a C struct by value.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param buffer The parameter buffer.
     * @param returnBuffer The output buffer to place the return value in.
     * @param offset The offset within returnBuffer to place the return value.
     */
    public final void invokeStruct(Function function, HeapInvocationBuffer buffer, byte[] returnBuffer, int offset) {
        invokeStruct(function.getCallContext(), function.getFunctionAddress(), buffer, returnBuffer, offset);
    }
    
    /**
     * Invokes a function that returns a C struct by value.
     *
     * @param ctx The call context which describes how to call the native function.
     * @param function The address of the native function to invoke.
     * @param buffer The parameter buffer.
     * @param returnBuffer The output buffer to place the return value in.
     * @param offset The offset within returnBuffer to place the return value.
     */
    public final void invokeStruct(CallContext ctx, long function, HeapInvocationBuffer buffer, byte[] returnBuffer, int offset) {
        ObjectBuffer objectBuffer = buffer.objectBuffer();
        if (objectBuffer != null) {
            foreign.invokeArrayWithObjectsReturnStruct(ctx.getAddress(), function,
                    buffer.array(), objectBuffer.objectCount(), objectBuffer.info(), objectBuffer.objects(),
                    returnBuffer, offset);
        } else {
            foreign.invokeArrayReturnStruct(ctx.getAddress(), function, buffer.array(), returnBuffer, offset);
        }
    }

    public final Object invokeObject(Function function, HeapInvocationBuffer buffer) {
        ObjectBuffer objectBuffer = buffer.objectBuffer();
        return foreign.invokeArrayWithObjectsReturnObject(function.getContextAddress(), function.getFunctionAddress(),
                buffer.array(), objectBuffer.objectCount(), objectBuffer.info(), objectBuffer.objects());
    }

    /**
     * Invokes a function, with the parameters loaded into native memory buffers,
     * and the function result is stored in a native memory buffer.
     *
     * @param function The <tt>Function</tt> to invoke.
     * @param returnBuffer The address of the native buffer to place the result
     * of the function call in.
     * @param parameters An array of addresses of the function parameters.
     */
    public final void invoke(Function function, long returnBuffer, long[] parameters) {
        foreign.invokePointerParameterArray(function.getContextAddress(), function.getFunctionAddress(), returnBuffer, parameters);
    }
    
    /**
     * Invokes a function, with the parameters loaded into native memory buffers,
     * and the function result is stored in a native memory buffer.
     *
     * @param ctx The call context which describes how to call the native function.
     * @param function The address of the native function to invoke.
     * @param returnBuffer The address of the native buffer to place the result
     * of the function call in.
     * @param parameters An array of addresses of the function parameters.
     */
    public final void invoke(CallContext ctx, long function, long returnBuffer, long[] parameters) {
        foreign.invokePointerParameterArray(ctx.getAddress(), function, returnBuffer, parameters);
    }

    /**
     * Convenience method to pass the objects and object descriptor array down as
     * normal arguments, so hotspot can optimize it.  This is faster than the native
     * code pulling the objects and descriptors out of arrays.
     *
     * @param function The native function to invoke.
     * @param buffer A buffer containing the arguments to the function.
     * @param objectBuffer A buffer containing objects to be passed to the native function.
     * @return A 32 bit integer value.
     */
    private int invokeArrayWithObjectsInt32(long ctx, long function, HeapInvocationBuffer buffer,
            ObjectBuffer objectBuffer) {

        Object[] objects = objectBuffer.objects();
        int[] info = objectBuffer.info();
        int objectCount = objectBuffer.objectCount();

        switch (objectCount) {
            case 1:
                return foreign.invokeArrayO1Int32(ctx, function, buffer.array(),
                        objects[0], info[0], info[1], info[2]);
            case 2:
                return foreign.invokeArrayO2Int32(ctx, function, buffer.array(),
                        objects[0], info[0], info[1], info[2],
                        objects[1], info[3], info[4], info[5]);
        }

        return foreign.invokeArrayWithObjectsInt32(ctx, function, buffer.array(),
            objectCount, info, objects);
    }
    
    /**
     * Convenience method to pass the objects and object descriptor array down as
     * normal arguments, so hotspot can optimize it.  This is faster than the native
     * code pulling the objects and descriptors out of arrays.
     *
     * @param function The native function to invoke.
     * @param buffer A buffer containing the arguments to the function.
     * @param objectBuffer A buffer containing objects to be passed to the native function.
     * @return A 64 bit integer value.
     */
    private long invokeArrayWithObjectsInt64(long ctx, long function, HeapInvocationBuffer buffer,
            ObjectBuffer objectBuffer) {

        Object[] objects = objectBuffer.objects();
        int[] info = objectBuffer.info();
        int objectCount = objectBuffer.objectCount();

        switch (objectCount) {
            case 1:
                return foreign.invokeArrayO1Int64(ctx, function, buffer.array(),
                        objects[0], info[0], info[1], info[2]);
            case 2:
                return foreign.invokeArrayO2Int64(ctx, function, buffer.array(),
                        objects[0], info[0], info[1], info[2],
                        objects[1], info[3], info[4], info[5]);
        }

        return foreign.invokeArrayWithObjectsInt64(ctx, function, buffer.array(),
            objectCount, info, objects);
    }

    /**
     * A 32 bit invoker implementation
     */
    private static final class ILP32 extends Invoker {
        private static final Invoker INSTANCE = new ILP32();
        /** A mask to apply to native memory addresses to cancel sign extension */
        private static final long ADDRESS_MASK = 0xffffffffL;
        
        public final long invokeAddress(CallContext ctx, long function, HeapInvocationBuffer buffer) {
            return ((long)invokeInt(ctx, function, buffer)) & ADDRESS_MASK;
        }
    }


    /**
     * A 64 bit invoker implementation
     */
    private static final class LP64 extends Invoker {
        private static final Invoker INSTANCE = new LP64();
        
        public final long invokeAddress(CallContext ctx, long function, HeapInvocationBuffer buffer) {
            return invokeLong(ctx, function, buffer);
        }
    }
}