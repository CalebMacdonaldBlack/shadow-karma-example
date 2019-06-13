(ns karma-test-refresh-example.core
  (:require
    [reagent.core :as r]
    ["react-map-gl" :default ReactMapGL]))

(defn view []
  (r/with-let [viewport (r/atom {:width 400 :height 400 :latitude 37.7577 :longitude -122.4376 :zoom 8})]
    [:> ReactMapGL (merge @viewport
                     {:mapboxApiAccessToken "TOKEN_HERE"
                      :onViewportChange     (fn [vp] (reset! viewport (js->clj vp)))})]))

(defn mount-root []
  (r/render [view]
    (.getElementById js/document "app")))

(defn init []
  (mount-root))
