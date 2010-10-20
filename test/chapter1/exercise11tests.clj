(ns chapter1.exercise11tests
  (:use clojure.test
        [chapter1.exercise11]))

(deftest one
  (is (= 1 (f-recur 1))))
(deftest two
  (is (= 2 (f-recur 2))))
(deftest three
  (is (= 4 (f-recur 3))))
(deftest four
  (is (= 11 (f-recur 4))))
(deftest five
  (is (= 25 (f-recur 5))))

(deftest one-iter
  (is (= 1 (f 1))))
(deftest two-iter
  (is (= 2 (f 2))))
(deftest three-iter
  (is (= 4 (f 3))))
(deftest four-iter
  (is (= 11 (f 4))))
(deftest five-iter
  (is (= 25 (f 5))))

(run-all-tests #"chapter1.exercise11tests")
