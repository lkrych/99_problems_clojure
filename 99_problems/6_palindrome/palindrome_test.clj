(ns palindrome.clojure.example
  (:use clojure.test))
(load-file "./palindrome.clj")
(deftest test_palindrome
  (is (= true (palindrome? "")))
  (is (= true (palindrome? "a")))
  (is (= false (palindrome? "abc")))
  (is (= true (palindrome? "racecar")))
  )
(run-tests)