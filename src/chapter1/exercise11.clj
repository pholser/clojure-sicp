(ns chapter1.exercise11)

(defn f-recur [n]
  (if (< n 3)
      n
      (+ (f-recur (- n 1)) (* 2 (f-recur (- n 2))) (* 3 (f-recur (- n 3))))))

(defn f-iter [a b c count]
  (if (< count 3)
      a
      (f-iter (+ a (* 2 b) (* 3 c))
              a
              b
              (- count 1))))

(defn f [n]
  (if (< n 3)
      n
      (f-iter 2 1 0 n)))

