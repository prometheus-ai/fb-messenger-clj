# fb-messenger-clj

A Clojure Library for the [Facebook Messenger Platform](https://developers.facebook.com/docs/messenger-platform).

### About

This library has the following functions:

**Authentication**

	(authenticate params)

**[Send API Reference](https://developers.facebook.com/docs/messenger-platform/send-api-reference)**

Send messages to users.

**Send Message Handler**

	(send-message recipient-id message)

Examples using the text and video message templates from below:

	(send-message recipient-id (text-message "Hello World"))
	(send-message recipient-id (video-message [video-url]))

**Available Message Templates**

Image:

	(image-message [image-url])

Video:

	(video-message [video-url])

Audio:

	(audio-message [audio-url])

File:

	(file-message [file-url])

Text:

	(text-message [text])

Quick Replies:

	(quick-replies-message [text quick-replies])

Button Template:

	(button-template [text buttons])

Generic Template:

	(generic-template [elements])

URL Button:

	(url-button [title url])

Postback Button:

	(postback-button [title postback])

Quick Reply Template:

	(quick-reply [title payload *image-url*])

Location Quick Reply:

	(location-quick-reply)

**[Upload File Attachment](https://developers.facebook.com/docs/messenger-platform/send-api-reference/file-attachment)**

	(upload-attachment type url)

**Set [Facebook Messenger Profile](https://developers.facebook.com/docs/messenger-platform/messenger-profile):**

Set your Bot's properties via the Facebook Messenger Profile API.

e.g. Persistent Menu, Get Started Button, Greeting Text, Domain Whitelisting, Account Linking, Payment Settings, Target Audience

	(set-messenger-profile profile)
	(get-user-profile psid)

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

Code examples:

[Echo Bot](https://github.com/prometheus-ai/prometheus-sample)

### License

The use and distribution terms for this software are covered by the [Eclipse Public License 1.0](http://opensource.org/licenses/eclipse-1.0.php). You must not remove this notice, or any other, from this software.

Disclaimer: This software is **not** affiliated to Facebook or represents Facebook in any way.
