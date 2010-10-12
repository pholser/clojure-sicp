(ns chapter1.exercise7tests
  (:use clojure.test
        [chapter1.exercise7]))

(deftest simple
  (is (= 3 (sqrt 9))))
(deftest small
  (is (= 1E-5 (sqrt 1E-10))))
(deftest large
  (is (= 1E28 (sqrt 1E56))))

(run-all-tests #"chapter1.exercise7tests")
