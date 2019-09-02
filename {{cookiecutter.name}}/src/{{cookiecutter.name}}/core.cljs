(ns ^:figwheel-hooks {{cookiecutter.name}}.core
    (:require [goog.dom :as dom]
              [reagent.core :as reagent :refer [atom]]))

(defonce state (atom {:text "Hello world!"}))

(defn hello []
  [:div
   [:h1 (:text @state)]
   [:h3 "Edit this in core.cljs and watch it change!"]])

(defn mount []
  (when-let [element (dom/getElement "app")]
    (reagent/render-component [hello] element)))

(mount)
