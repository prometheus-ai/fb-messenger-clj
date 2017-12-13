# Introduction to fb-messenger-clj

fb-messenger-clj is a Clojure library for the [Facebook Messenger Bot API](https://developers.facebook.com/docs/messenger-platform).

The goal of this library is to provide easy-to-use functions, well defined documentation & application examples so you can start with development and get results right away.

### Installation

`fb-messenger` is available as a Maven artifact from [Clojars](http://clojars.org/fb-messenger).

With Leiningen/Boot:

[![Clojars Project](http://clojars.org/fb-messenger/latest-version.svg)](http://clojars.org/fb-messenger)

### Quickstart

The Facebook Messenger Library is provided by the `fb-messenger` namespace.

First, require the namespace needed (for example `auth`) in the REPL:

```clj
(require '[fb-messenger.auth :as fb])
```

Or in your application:

```clj
(ns my-app.core
  (:require [fb-messenger.auth :as fb]))
```

### Documentation & Code Examples

See how to set up a Facebook Messenger Bot in the [Wiki](https://github.com/prometheus-ai/fb-messenger-clj/wiki).

Code examples:

* [Echo Bot Example](https://github.com/prometheus-ai/prometheus-sample) using `prometheus-ai/fb-messenger-clj`

* [Echo Bot Example ready for Heroku](https://github.com/prometheus-ai/prometheus-sample-heroku) using `prometheus-ai/fb-messenger-clj` including live demo

Further Code Examples in Clojure:

* [Facebook Messenger Bot in Clojure on Heroku](https://github.com/allanberger/fb-bot-clj-heroku)
* [Facebook Messenger Bot in Clojure on Google App Engine](https://github.com/lemmings-io/facebook-messenger-google-app-engine)
* [Facebook Messenger NLP Example in Clojure](https://github.com/prometheus-ai/fb-messenger-clj/wiki/Facebook-Messenger-NLP-in-Clojure)
* [Chatfuel JSON API & Broadcasting API Example](https://github.com/prometheus-ai/fb-messenger-clj/wiki/Chatfuel-JSON-API-&-Broadcasting-API-Example-in-Clojure)
* [Extract Latitude & Longitude from Images](https://www.netidee.at/prometheus/extracting-latitudelongitude-images)
* [Distance between two locations in Latitude & Longitude](https://www.netidee.at/prometheus/extracting-latitudelongitude-images)
* [ClojureScript on the server side using Lumo](https://glitch.com/edit/#!/lumo-clojurescript)

### About the library

This library has the following functions:

**Authentication** ([auth.clj](https://github.com/prometheus-ai/fb-messenger-clj/blob/master/src/fb_messenger/auth.clj))

```clj
(authenticate params)
```

**Sending Messages** ([send.clj](https://github.com/prometheus-ai/fb-messenger-clj/blob/master/src/fb_messenger/send.clj))

Send messages to users. ([Send Message API Facebook Documentation](https://developers.facebook.com/docs/messenger-platform/send-api-reference))

Send Message Handler:

```clj
(send-message recipient-id message)
```

Examples using the text and video message templates from below:

```clj
(send-message recipient-id (text-message "Hello World"))
(send-message recipient-id (video-message [video-url]))
```

**Available Message Templates** ([templates.clj](https://github.com/prometheus-ai/fb-messenger-clj/blob/master/src/fb_messenger/templates.clj))

Image:

```clj
(image-message [image-url])
```

Video:

```clj
(video-message [video-url])
```

Audio:

```clj
(audio-message [audio-url])
```

File:

```clj
(file-message [file-url])
```

Text:

```clj
(text-message [text])
```

Quick Replies:

```clj
(quick-replies-message [text quick-replies])
```

Button Template:

```clj
(button-template [text buttons])
```

Generic Template:

```clj
(generic-template [elements])
```

URL Button:

```clj
(url-button [title url])
```

Postback Button:

```clj
(postback-button [title postback])
```

Quick Reply Template:

```clj
(quick-reply [title payload *image-url*])
```

Location Quick Reply:

```clj
(location-quick-reply)
```

**Upload File Attachment**

You can send files by uploading them. ([File Attachment Facebook Documentation](https://developers.facebook.com/docs/messenger-platform/send-api-reference/file-attachment))

```clj
(upload-attachment type url)
```

**Set Facebook Messenger Profile:**

Set your Bot's properties via the [Facebook Messenger Profile API](https://developers.facebook.com/docs/messenger-platform/messenger-profile).

e.g. Persistent Menu, Get Started Button, Greeting Text, Domain Whitelisting, Account Linking, Payment Settings, Target Audience

```clj
(set-messenger-profile profile)
(get-user-profile psid)
```

### Register for a Facebook Page Access Token

To start using the Facebook Messenger Send/Receive service you'll need to setup a Facebook Page, [Facebook App](https://developers.facebook.com/apps/), create a Page Access Token and link the app to the page. We'll run through this step by step [here](https://github.com/prometheus-ai/fb-messenger-clj/wiki/Facebook-Setup/).

### Contributing

1. Use [parinfer](https://github.com/shaunlebron/parinfer).
2. Follow the [Clojure Style Guide](https://github.com/bbatsov/clojure-style-guide).

### License

The use and distribution terms for this software are covered by the [MIT License](https://github.com/prometheus-ai/fb-messenger-clj/blob/master/LICENSE). You must not remove this notice, or any other, from this software.

Disclaimer: This software is **not** affiliated to Facebook or represents Facebook in any way.
