(ns chapter1.exercise2tests
  (:use clojure.test
        [chapter1.exercise2]))

(deftest value-of-expr
  (is (= (/ -37 150) expr)))

(run-all-tests #"chapter1.exercise2tests")
