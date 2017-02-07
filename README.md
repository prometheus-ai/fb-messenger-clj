# fb-messenger-clj

A Clojure Library for the [Facebook Messenger Platform](https://developers.facebook.com/docs/messenger-platform).

### About

This library has following functions:

	(authenticate accessToken)
	(send-text-message recipientId message)

### Installation

`fb-messenger-clj` will be available soon as a Maven artifact from Clojars.

With Leiningen/Boot:

	[fb-messenger-clj "0.0.1"]

### Quickstart

The Facebook Messenger Library is provided by the `fb-messenger-clj.core` namespace.

First, require it in the REPL:

	(require '[fb-messenger-clj.core :as fb])

Or in your application:

	(ns my-app.core
	  (:require [fb-messenger-clj :as fb]))
	  
### Code Examples

See how to set up a Facebook Messenger Bot in the [wiki](https://github.com/prometheus-ai/fb-messenger-clj/wiki).

Code examples include:

* Echo Bot
* Processing a text message

### License

The use and distribution terms for this software are covered by the [Eclipse Public License 1.0](http://opensource.org/licenses/eclipse-1.0.php). You must not remove this notice, or any other, from this software.

Disclaimer: This software is **not** affiliated to Facebook or represents Facebook in any way.