(ns stepwise.client-test
  (:require [clojure.test :refer :all]
            [stepwise.client :as client]))

(deftest localhost-client?-test
  (is (false? (client/localhost-client? @client/stock-default-client)))
  (is (true? (client/localhost-client? (client/localhost-client)))))
