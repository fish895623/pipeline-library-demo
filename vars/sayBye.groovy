
def call(agent = any) {
  pipeline {
    agent ${agent}
    stages {
      stage('A') {
        steps {
          echo "This is Step A"
        }
      }
    }
  }
}
