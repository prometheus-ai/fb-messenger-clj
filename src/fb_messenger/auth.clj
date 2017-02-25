(ns fb-messenger.auth)

(def ^:dynamic *token* nil)

(defn set-token!
  [token]
  (alter-var-root #'*token* (constantly token)))

(defn authenticate
  ([params]
   (authenticate params *token*))
  ([params token]
   (let [mode (get params "hub.mode")
          verify-token (get params "hub.verify_token")
          challenge (get params "hub.challenge")]
      (when (and (= mode "subscribe") (= verify-token token))
        challenge))))
