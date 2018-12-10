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
			stage('git clone'){
			  steps{
			      sh 'sudo rm -r *;sudo git clone https://github.com/selvakann/devops.git'
			  }
			}
		    stage('terraform init'){
			  steps{
			      sh '/var/lib/jenksin/workspace/devops/hasipcorp/ terraform init'
			  }
			}
		    stage('terraform plan'){
			  steps{
			      sh '/var/lib/jenksin/workspace/devops/hasipcorp/ terraform plan'
			  }
			}
		
	}
}	