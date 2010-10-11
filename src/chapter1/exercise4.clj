(ns chapter1.exercise4)

(defn a-plus-abs-b [a b]
  ((if (> b 0) + -) a b))
