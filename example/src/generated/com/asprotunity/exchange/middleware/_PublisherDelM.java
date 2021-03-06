// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.0
//
// <auto-generated>
//
// Generated from file `middleware.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.asprotunity.exchange.middleware;

public final class _PublisherDelM extends Ice._ObjectDelM implements _PublisherDel {
    public Event
    queryLatestEvent(String security, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __observer)
            throws IceInternal.LocalExceptionWrapper {
        IceInternal.Outgoing __og = __handler.getOutgoing("queryLatestEvent", Ice.OperationMode.Normal, __ctx, __observer);
        try {
            try {
                IceInternal.BasicStream __os = __og.startWriteParams(Ice.FormatType.DefaultFormat);
                __os.writeString(security);
                __og.endWriteParams();
            } catch (Ice.LocalException __ex) {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try {
                if (!__ok) {
                    try {
                        __og.throwUserException();
                    } catch (Ice.UserException __ex) {
                        throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                    }
                }
                IceInternal.BasicStream __is = __og.startReadParams();
                Event __ret;
                __ret = new Event();
                __ret.__read(__is);
                __og.endReadParams();
                return __ret;
            } catch (Ice.LocalException __ex) {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        } finally {
            __handler.reclaimOutgoing(__og);
        }
    }

    public void
    subscribe(SubscriberPrx sub, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __observer)
            throws IceInternal.LocalExceptionWrapper {
        IceInternal.Outgoing __og = __handler.getOutgoing("subscribe", Ice.OperationMode.Normal, __ctx, __observer);
        try {
            try {
                IceInternal.BasicStream __os = __og.startWriteParams(Ice.FormatType.DefaultFormat);
                SubscriberPrxHelper.__write(__os, sub);
                __og.endWriteParams();
            } catch (Ice.LocalException __ex) {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            if (__og.hasResponse()) {
                try {
                    if (!__ok) {
                        try {
                            __og.throwUserException();
                        } catch (Ice.UserException __ex) {
                            throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                        }
                    }
                    __og.readEmptyParams();
                } catch (Ice.LocalException __ex) {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
        } finally {
            __handler.reclaimOutgoing(__og);
        }
    }

    public void
    unsubscribe(SubscriberPrx sub, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __observer)
            throws IceInternal.LocalExceptionWrapper {
        IceInternal.Outgoing __og = __handler.getOutgoing("unsubscribe", Ice.OperationMode.Normal, __ctx, __observer);
        try {
            try {
                IceInternal.BasicStream __os = __og.startWriteParams(Ice.FormatType.DefaultFormat);
                SubscriberPrxHelper.__write(__os, sub);
                __og.endWriteParams();
            } catch (Ice.LocalException __ex) {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            if (__og.hasResponse()) {
                try {
                    if (!__ok) {
                        try {
                            __og.throwUserException();
                        } catch (Ice.UserException __ex) {
                            throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                        }
                    }
                    __og.readEmptyParams();
                } catch (Ice.LocalException __ex) {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
        } finally {
            __handler.reclaimOutgoing(__og);
        }
    }
}
