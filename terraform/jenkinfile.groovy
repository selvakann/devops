pipeline{
     agent {
	     node{
		  label 'master'
	 }
 }
	  stages {
		    stage('terraform started'){
			  steps{
			      sh 'echo "terraform start"'
			  }
			}
			stage('git clone'){
			  steps{
			      sh 'rm -rf *; git clone https://github.com/selvakann/devops.git'
			  }
			}
		    stage('terraform init'){
			  steps{
			      sh 'terraform init'
			  }
			}
		    stage('terraform plan'){
			  steps{
			      sh 'terraform plan'
			  }
			}
		    stage('terraform end'){
			  steps{
			      sh 'echo "Ended......"'
			  }
			}
	}
}	
