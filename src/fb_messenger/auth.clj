(ns fb-messenger.auth)

(defn authenticate [params token]
  (let [mode (get params "hub.mode")
        verify-token (get params "hub.verify_token")
        challenge (get params "hub.challenge")]
    (when (and (= mode "subscribe") (= verify-token token))
      challenge)))
