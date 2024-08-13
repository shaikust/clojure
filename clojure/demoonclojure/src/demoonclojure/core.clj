(ns demoonclojure.core
  (:gen-class))
(declare greet)
(declare sum-list-set)
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (greet)
  (let [list1 [100,200,nil,400,nil,1,nil]
        set1 [100,200,300,nil,400,nil,500,600]]
  (println "summed list :")
  (println (sum-list-set list1 set1)))

  )

(defn greet[]
  (println "now calling the greet function")
  )
(defn sum-list-set[list1 set1]
  (let [list1(concat list1 (repeat (-(count set1)(count list1)) 0))
        set1(concat set1 (repeat (-(count list1)(count set1))0))
        sum-elements(fn[a b](+(or a 0)(or b 0)))]
    (mapv sum-elements list1 set1)
    )
  )
