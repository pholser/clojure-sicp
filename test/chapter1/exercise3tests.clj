(ns chapter1.exercise3tests
  (:use clojure.test
        [chapter1.exercise3]))

(deftest all-three-equal
  (is (= 18 (sum-of-squares-of-two-largest 3 3 3))))
(deftest all-three-equal-different-number
  (is (= 50 (sum-of-squares-of-two-largest 5 5 5))))
(deftest first-two
  (is (= 41 (sum-of-squares-of-two-largest 5 4 3))))
(deftest last-two
  (is (= 61 (sum-of-squares-of-two-largest 4 5 6))))
(deftest bookends
  (is (= 145 (sum-of-squares-of-two-largest 9 8 7))))

(run-all-tests #"chapter1.exercise3tests")
