(ns chapter1.exercise10tests
  (:use clojure.test
        [chapter1.exercise10]))

(deftest one-and-ten
  (is (= 1024 (A 1 10))))
(deftest two-and-zero
  (is (= 0 (A 2 0))))
(deftest two-and-one
  (is (= 2 (A 2 1))))
(deftest two-and-two
  (is (= 4 (A 2 2))))
(deftest two-and-three
  (is (= 16 (A 2 3))))
(deftest two-and-four
  (is (= 65536 (A 2 4))))
(deftest three-and-three
  (is (= 65536 (A 3 3))))

; f(n) --> 2n
; g(n) --> 2^n
; h(n) --> 1 for n = 0, g(h(n - 1)) for n > 0

(run-all-tests #"chapter1.exercise10tests")
