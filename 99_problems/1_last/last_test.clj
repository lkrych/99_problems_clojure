(ns clojure.test.example
  (:use clojure.test))
  (load-file "./last.clj")
  (deftest testing-last-function
      (is (= nil (last_list [])))
      (is (= 1 (last_list [1])))
      (is (= 3 (last_list [1 2 3])))
    
  )
(run-all-tests)