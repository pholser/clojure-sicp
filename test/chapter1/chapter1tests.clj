(ns chapter1.tests
  (:use clojure.test
        [chapter1.exercise2]))

(deftest value-of-expr
  (is (= (/ -37 150) expr)))

(run-all-tests #"chapter1.tests")
