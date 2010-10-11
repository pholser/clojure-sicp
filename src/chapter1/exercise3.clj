(ns chapter1.exercise3)

(defn sum-of-squares-of-two-largest [a b c]
  (if (> a b) (if (> b c) (+ (* a a) (* b b)) (+ (* a a) (* c c)))
              (if (> a c) (+ (* a a) (* b b)) (+ (* b b) (* c c)))))
