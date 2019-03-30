(load-file "../9_pack/pack.clj")
(def rle 
  (comp ;comp composes functions, which means it runs them right to left, so pack runs first, grouping by like elements
    (partial map #(vector (count %) (first %))) ;then the map function 
    pack)) ;list is passed implicitly