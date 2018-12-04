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
		    stage('copy the file'){
			  steps{
			      sh 'cp /home/ec2-user/terrajenkins/sg.tf'
			  }
			}
		    stage('terraform init'){
			  steps{
			      sh '/home/ec2-user/terrajenkins/ terraform init'
			  }
			}
		    stage('terraform end'){
			  steps{
			      sh 'echo "Ended......"'
			  }
			}
	}
}	
