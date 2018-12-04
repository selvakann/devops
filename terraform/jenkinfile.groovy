pipeline{
     agent {
	     node{
		  label 'master'
	 }
 }
	  stages {
		    stage('terraform started'){
			  steps{
			      sh 'echo "terraform start....!"'
			  }
			}
		    stage('terraform init'){
			  steps{
			      sh 'form terraform init'
			  }
			}
		    stage('terraform plan'){
			  steps{
			      sh 'echo "terraform plan....!"'
			  }
			}
		
	}
}	