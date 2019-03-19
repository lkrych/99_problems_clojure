(ns reverse.clojure.test
(:use clojure.test))
(load-file "./reverse.clj")
(deftest test_reverse
  (is (= (recursive-reverse []) []))
  (is (= (recursive-reverse [1]) [1]))
  (is (= (recursive-reverse [3 2 1]) [1 2 3] ))
)
(run-tests)