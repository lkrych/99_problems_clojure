(ns reverse.clojure.test
(:use clojure.test))
(load-file "./reverse.clj")
(deftest test_reverse
  (is (= (rev []) nil))
  (is (= (rev [1]) [1]))
  (is (= (rev [3 2 1]) [1 2 3] ))
)
(run-tests)