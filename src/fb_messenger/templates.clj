(ns fb-messenger.templates
  (:gen-class))

(defn image-message [image-url]
  {:attachment {:type    "image"
                :payload {:url image-url}}})

(defn video-message [video-url]
  {:attachment {:type    "video"
                :payload {:url video-url}}})

(defn audio-message [audio-url]
  {:attachment {:type    "audio"
                :payload {:url audio-url}}})

(defn file-message [file-url]
  {:attachment {:type    "file"
                :payload {:url file-url}}})

(defn text-message [text]
  {:text text})

(defn quick-replies-message [text quick-replies]
  {:text          text
   :quick_replies quick-replies})

(defn button-template [text buttons]
  {:attachment {:type    "template"
                :payload { :template_type "button"
                           :text          text
                           :buttons       buttons}}})

(defn generic-template [elements]
  {:attachment {:type    "template"
                :payload { :template_type "generic"
                           :elements       elements}}})

(defn url-button [title url]
  {:type "web_url"
   :title title
   :url url})

(defn postback-button [title postback]
  {:type "postback"
   :title title
   :payload postback})

(defn quick-reply
  [title payload]
  {:content_type "text"
   :title title
   :payload payload}
  [title payload image-url]
  {:content_type "text"
   :title title
   :payload payload
   :image_url image-url})

(defn location-quick-reply []
  {:content_type "location"})

