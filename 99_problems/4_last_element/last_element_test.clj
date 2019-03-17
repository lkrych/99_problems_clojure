(ns last_element.clojure.test
  (:use clojure.test))
(load-file "./last_element.clj")
(deftest test_last_element
  (is (= (last_element []) nil))
  (is (= (last_element [1 2 3]) 3))
  (is (= (last_element [1 2 3 4 5]) 5))
)
(run-tests)