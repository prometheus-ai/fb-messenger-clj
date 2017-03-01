# fb-messenger-clj

A Clojure Library for the [Facebook Messenger Platform](https://developers.facebook.com/docs/messenger-platform).

### About

This library has the following functions:

	(authenticate params)
	(send-text-message recipientId message)

### Installation

`fb-messenger` is available as a Maven artifact from [Clojars](http://clojars.org/fb-messenger).

With Leiningen/Boot:

[![Clojars Project](http://clojars.org/fb-messenger/latest-version.svg)](http://clojars.org/fb-messenger)

### Quickstart

The Facebook Messenger Library is provided by the `fb-messenger` namespace.

First, require the namespace needed (for example `auth`) in the REPL:

	(require '[fb-messenger.auth :as fb])

Or in your application:

	(ns my-app.core
	  (:require [fb-messenger.auth :as fb]))

### Code Examples

See how to set up a Facebook Messenger Bot in the [wiki](https://github.com/prometheus-ai/fb-messenger-clj/wiki).

Code examples include:

* Echo Bot
* Processing a text message

### License

The use and distribution terms for this software are covered by the [Eclipse Public License 1.0](http://opensource.org/licenses/eclipse-1.0.php). You must not remove this notice, or any other, from this software.

Disclaimer: This software is **not** affiliated to Facebook or represents Facebook in any way.
