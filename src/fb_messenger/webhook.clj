(ns fb-messenger.webhook)

(defn handle-events
  "processes incoming facebook webhook events"
  [message-handler request]
  (let [data   (:params request)
        object (:object data)]
    (when (= object "page")
      (doseq [entry (:entry data)]
        (doseq [messaging-event (:messaging entry)]
          (message-handler messaging-event))))))
