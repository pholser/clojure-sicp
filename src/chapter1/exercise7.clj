(ns chapter1.exercise7)

(defn average [x y]
  (/ (+ x y) 2))

(defn improve [guess x]
  (average guess (/ x guess)))

(defn good-enough? [guess last-guess x]
  (< (Math/abs (/ (- guess last-guess) guess)) 0.00000001))

(defn sqrt-iter [guess last-guess x]
  (if (good-enough? guess last-guess x)
      guess
      (sqrt-iter (improve guess x) guess x)))

(defn sqrt [x] (sqrt-iter 1.0 0 x))
