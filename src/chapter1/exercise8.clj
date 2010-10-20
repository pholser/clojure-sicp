(ns chapter1.exercise8)

(defn improve [guess x]
  (/ (+ (/ x (* guess guess)) (* 2 guess)) 3))

(defn good-enough? [guess last-guess x]
  (< (Math/abs (/ (- guess last-guess) guess)) 0.00000001))

(defn cbrt-iter [guess last-guess x]
  (if (good-enough? guess last-guess x)
      guess
      (recur (improve guess x) guess x)))

(defn cbrt [x] (cbrt-iter 1.0 0 x))
