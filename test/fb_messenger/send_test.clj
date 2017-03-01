(ns fb-messenger.send-test
  (:require [clojure.test :refer :all]
            [fb-messenger.send :refer :all]
            [clj-http.client :as client]))

(deftest send-text-message-base-url-token-recipient-id-text-test
  (testing "Correct case"
    (with-redefs [client/post (fn [url headers] nil)]
      (is (= nil (send-text-message "" "" "" ""))))))

(deftest send-text-message-recipient-id-text-test
  (testing "Correct case"
    (with-redefs [client/post (fn [url headers] nil)]
      (do
        (set-base-url! "")
        (set-token! "")
        (is (= nil (send-text-message "" "")))))))
