(ns stepwise.core-test
  (:require [clojure.test :refer :all]
            [stepwise.core :as sw]
            [stepwise.client :as client]))

(deftest ensure-state-machine-test
  (is (= "arn:aws:states:us-east-1:123456789012:stateMachine:adder"
         (sw/ensure-state-machine
           (client/localhost-client)
           :adder
           {:start-at :add
            :states   {:add {:type     :task
                             :resource :activity/add
                             :end      true}}}
           {}))))
