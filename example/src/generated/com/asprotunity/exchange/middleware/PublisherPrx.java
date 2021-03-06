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

public interface PublisherPrx extends Ice.ObjectPrx {
    public void subscribe(SubscriberPrx sub);

    public void subscribe(SubscriberPrx sub, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_subscribe(SubscriberPrx sub);

    public Ice.AsyncResult begin_subscribe(SubscriberPrx sub, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_subscribe(SubscriberPrx sub, Ice.Callback __cb);

    public Ice.AsyncResult begin_subscribe(SubscriberPrx sub, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_subscribe(SubscriberPrx sub, Callback_Publisher_subscribe __cb);

    public Ice.AsyncResult begin_subscribe(SubscriberPrx sub, java.util.Map<String, String> __ctx, Callback_Publisher_subscribe __cb);

    public void end_subscribe(Ice.AsyncResult __result);

    public void unsubscribe(SubscriberPrx sub);

    public void unsubscribe(SubscriberPrx sub, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_unsubscribe(SubscriberPrx sub);

    public Ice.AsyncResult begin_unsubscribe(SubscriberPrx sub, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_unsubscribe(SubscriberPrx sub, Ice.Callback __cb);

    public Ice.AsyncResult begin_unsubscribe(SubscriberPrx sub, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_unsubscribe(SubscriberPrx sub, Callback_Publisher_unsubscribe __cb);

    public Ice.AsyncResult begin_unsubscribe(SubscriberPrx sub, java.util.Map<String, String> __ctx, Callback_Publisher_unsubscribe __cb);

    public void end_unsubscribe(Ice.AsyncResult __result);

    public Event queryLatestEvent(String security);

    public Event queryLatestEvent(String security, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_queryLatestEvent(String security);

    public Ice.AsyncResult begin_queryLatestEvent(String security, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_queryLatestEvent(String security, Ice.Callback __cb);

    public Ice.AsyncResult begin_queryLatestEvent(String security, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_queryLatestEvent(String security, Callback_Publisher_queryLatestEvent __cb);

    public Ice.AsyncResult begin_queryLatestEvent(String security, java.util.Map<String, String> __ctx, Callback_Publisher_queryLatestEvent __cb);

    public Event end_queryLatestEvent(Ice.AsyncResult __result);
}
