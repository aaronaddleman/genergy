(ns genergy.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [genergy.core-test]))

(doo-tests 'genergy.core-test)
