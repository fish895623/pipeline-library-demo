#!/usr/bin/env groovy

import sayBye

def call(String agent = 'any') {
  agent {
    dockerfile {
      filename '.docker/a.Dockerfile'
        args '--user 0:984'
        reuseNode true
    }
  }
  steps {
    // sh 'python3 test/test_main.py'
    sayHello 'asdf'
  }
}
