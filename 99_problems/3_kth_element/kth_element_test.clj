(ns clojure.kth_element.test.example
  (:use clojure.test))
(load-file "./kth_element.clj")
(deftest test_kth_element
  (is (= nil (kth_element 4 [])))
  (is (= 3 (kth_element 3 [1 2 3])))
  (is (= 5 (kth_element 5 [1 2 3 4 5])))
)
(run-tests)