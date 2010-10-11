(ns chapter1.exercise4tests
  (:use clojure.test
        [chapter1.exercise4]))

(deftest both-positive
  (is (= 7 (a-plus-abs-b 3 4))))
(deftest b-negative
  (is (= 11 (a-plus-abs-b 5 -6))))
(deftest b-zero
  (is (= 7 (a-plus-abs-b 7 0))))
(deftest a-negative
  (is (= 1 (a-plus-abs-b -2 -3))))

(run-all-tests #"chapter1.exercise4tests")
