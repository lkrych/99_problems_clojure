(ns decoderle.test.example
  (:use clojure.test ))
(load-file "./decoderle.clj")
(deftest decode_rle
  (is (= [] (decoderle [])))
  (is (= ["a" "b" "c"] (decoderle [[1 "a"] [1 "b"] [1 "c"]])))
  (is (= ["a" "a" "a" "b" "b" "c" "d" "a" "a"] (decoderle [[3 "a"] [2 "b"] [1 "c"] [1 "d"] [2 "a"]])))
)
(run-tests)