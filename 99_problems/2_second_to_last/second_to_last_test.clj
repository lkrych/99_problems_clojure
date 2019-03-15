(ns clojure.second_to_last.test.example
  (:use clojure.test))
  (load-file "./second_to_last.clj")
  (deftest test_second_to_last 
    (is (= nil (second_to_last [])))
    (is (= nil (second_to_last [1])))
    (is (= 2 (second_to_last [1 2 3])))
  )
(run-all-tests)