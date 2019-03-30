(ns run_length_encode.test.example
  (:use clojure.test))
(load-file "./rle.clj")
(deftest test_rle
  (is (= [] (rle [])))
  (is (= [[1 "a"] [1 "b"] [1 "c"] [1 "d"]] (rle ["a" "b" "c" "d"])))
  (is (= [[3 "a"] [2 "b"] [1 "c"] [1 "d"] [2 "a"]] (rle ["a" "a" "a" "b" "b" "c" "d" "a" "a"])))
)
(run-tests)