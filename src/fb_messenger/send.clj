(ns fb-messenger.send
  (:require
    [clj-http.client :as client]))

(def ^:dynamic *base-url* "https://graph.facebook.com/v2.6")
(def ^:dynamic *token* nil)

(defn set-base-url!
  [base-url]
  (alter-var-root #'*base-url* (constantly base-url)))

(defn set-token!
  [token]
  (alter-var-root #'*token* (constantly token)))

(defn send-text-message
  ([recipient-id text]
   (send-text-message *base-url* *token* recipient-id text))
  ([base-url token recipient-id text]
   (client/post
    (str base-url "/me/messages?access_token=" token)
    {:form-params
      {:recipient {:id recipient-id}, :message {:text text}
       :content-type :json}})))
