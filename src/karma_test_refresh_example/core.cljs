(ns karma-test-refresh-example.core
  (:require
    [reagent.core :as r]))

(defn mount-root []
  (r/render [:h1 "FOOBAR!"]
    (.getElementById js/document "app")))

(defn init []
  (mount-root))
