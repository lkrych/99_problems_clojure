(ns flatten.example.test
  (:use clojure.test))
(load-file "./flatten.clj")
(deftest flatten_test
  (is (= [] (flatten [])))
  (is (= [1 2 3] (flatten [1 [2] 3])))
  (is (= [1 2 3 4] (flatten [1 [2 [3]] 4])))
)
(run-tests)