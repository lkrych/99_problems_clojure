(ns compress.example.test
  (:use clojure.test))
(load-file "./compress.clj")
(deftest compress_test
  (is (= [] (compress [])))
  (is (= [1 2 3] (compress [1 2 3])))
  (is (= [1 2 3] (compress [1 2 2 3 3]))) 
  (is (= [1 2 3 1 2] (compress [1 2 2 3 3 1 1 2]))) 
)
(run-tests)