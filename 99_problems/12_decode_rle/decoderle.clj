(defn decoderle [list]
  (mapcat ;; concats the return function of the anonymous function applied to each element
    (fn [coll] 
      (let [[count & el] coll]
      (flatten(repeat count el))
      )) list)
)