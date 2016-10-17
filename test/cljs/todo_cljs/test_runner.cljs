(ns todo-cljs.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [todo-cljs.core-test]
   [todo-cljs.common-test]))

(enable-console-print!)

(doo-tests 'todo-cljs.core-test
           'todo-cljs.common-test)
