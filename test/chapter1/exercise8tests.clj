(ns chapter1.exercise8tests
  (:use clojure.test
        [chapter1.exercise8]))

(deftest simple
  (is (= 3 (cbrt 27))))

(run-all-tests #"chapter1.exercise8tests")
