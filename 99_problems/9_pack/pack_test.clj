(ns pack.example.test
  (:use clojure.test))
(load-file "./pack.clj")
(deftest pack_test
  (is (= [] (pack [])))
  (is (= [[1 1 1]] (pack [1 1 1])))
  (is (= [[1] [2] [3]] (pack [1 2 3])))
  (is (= [[1 1 1 1] [2] [3 3] [1 1] [4 4] [5 5 5 5]] (pack [1 1 1 1 2 3 3 1 1 4 4 5 5 5 5])))
)
(run-tests)