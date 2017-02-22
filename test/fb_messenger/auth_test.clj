(ns fb-messenger.auth-test
  (:require [clojure.test :refer :all]
            [fb-messenger.auth :refer :all]))

(deftest authenticate-test
  (testing "Correct case."
    (is (= "test-challenge" (authenticate {"hub.mode" "subscribe", "hub.verify_token" "test-token", "hub.challenge" "test-challenge"} "test-token"))))

  (testing "Different mode"
    (is (= nil (authenticate {"hub.mode" "something else", "hub.verify_token" "test-token", "hub.challenge" "test-challenge"} "test-token"))))

  (testing "Wrong token"
    (is (= nil (authenticate {"hub.mode" "subscribe", "hub.verify_token" "test-token", "hub.challenge" "test-challenge"} "wrong-token")))))
