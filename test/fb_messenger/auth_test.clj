(ns fb-messenger.auth-test
  (:require [clojure.test :refer :all]
            [fb-messenger.auth :refer :all]))

(deftest authenticate-params-token-test
  (testing "Correct case"
    (is
      (=
        "test-challenge"
        (authenticate
          "test-token"
          {"hub.mode" "subscribe", "hub.verify_token" "test-token", "hub.challenge" "test-challenge"}))))

  (testing "Different mode"
    (is
      (=
        nil
        (authenticate
          "test-token"
          {"hub.mode" "something else", "hub.verify_token" "test-token", "hub.challenge" "test-challenge"}))))

  (testing "Wrong token"
    (is
      (=
        nil
        (authenticate
          "wrong-token"
          {"hub.mode" "subscribe", "hub.verify_token" "test-token", "hub.challenge" "test-challenge"})))))

(deftest authenticate-params-test
  (testing "Correct case"
    (do
      (set-token! "test-token")
      (is
        (=
          "test-challenge"
          (authenticate
            {"hub.mode" "subscribe", "hub.verify_token" "test-token", "hub.challenge" "test-challenge"}))))))
