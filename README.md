# Petclinic-CI-CD-Project


## 1. Create an Ubuntu EC2 instance in AWS account that will act as a Server for the Java Application. 

<img width="960" alt="1" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/355b381a-43f4-4115-bbaf-bb7316f86e19">


---------------------------------------------------------------------------

## 2. Install and configure the TomCat Server to run on port 8080 in the EC2 instance.


<img width="960" alt="2" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/45b50a4d-7011-4684-82fb-07c8cb27a5e4">



----------------------------------------------------------------------------

## 3. Also install Jenkins server on the same EC2 instance and configure it to run on nport 8082 of the same instance as the TomCat Server.

<img width="960" alt="3" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/b5a77d61-44dd-4dd0-983a-fc6162385476">


----------------------------------------------------------------------------

## 4. Install suggested plugins on the Jenkins server


<img width="960" alt="4" src="https://github.com/iamsouvik9/CI-CD-PetclinicProject/assets/79768737/ed915802-9c26-48ef-bc79-1e740a65d7ef">


----------------------------------------------------------------------------



## 5. Create another Ubuntu EC2 instance for the SonarQube server


<img width="960" alt="5" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/dffe61c7-5a98-4c81-b405-af3d00b6acfa">


----------------------------------------------------------------------------

## 6. Go to the Jenkins server. Manage Plugins -> Global Tool Configuration and configure the plugins

<img width="960" alt="6" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/6811ba25-7ca1-48ca-bd81-e9b768f240f7">


<img width="960" alt="7" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/6126691f-4173-4186-9357-836167f5212a">


<img width="960" alt="8" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/8fe770a1-60d1-44c0-a1fc-8b9e07681f55">


<img width="960" alt="9" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/d093545e-3325-42e6-9b69-3a0e1f77295b">


----------------------------------------------------------------------------

## 7. Login to the SonarQube server


<img width="960" alt="10" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/48a8e919-d55d-4597-aa2d-affa172074ec">

----------------------------------------------------------------------------


## 8. Update the password


<img width="960" alt="11" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/61c383bb-ad09-4fad-9273-9de8bef1c2e3">


----------------------------------------------------------------------------


## 9. Go to SonarQube server. Click on Administation -> Security ->Users. Generate a token to configure it with the Jenkins pipeline and copy the secret text.


<img width="960" alt="12" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/9d6e6d94-d1df-4a51-8218-393ab9e7e9c5">


----------------------------------------------------------------------------

## 10. Go to Jenkins Server. Manage Jenkins -> Credentials and click on add New credential.
Choose Secret text from the dropdown and paste the secret text.


<img width="960" alt="13" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/fb7122a8-480e-44f4-b71a-410415bbe31f">


----------------------------------------------------------------------------

## 11. Go to Manage Jenkins -> Configure System and under Sonar Server add the Sonar Server.


<img width="960" alt="14" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/b508c6b3-38c1-4a49-9c6d-2d3ccc476cc7">


---------------------------------------------------------------------------


## 12. Create a Pipeline in Jenkins and name it as Petclinic-pipeline

<img width="960" alt="15" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/a6276a2d-672a-4414-9238-acf9a2b7acfb">


----------------------------------------------------------------------------

## 13. Write a declarative pipeline for the Desired deployment


<img width="960" alt="20" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/4796af22-8bfc-41af-bfed-96e5078d4472">


----------------------------------------------------------------------------

## 14. Build the pipeline


<img width="960" alt="16" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/302f07b7-ee38-4670-8d45-aea595dd5421">



----------------------------------------------------------------------------

## 15. SonarQube dashboard after the code is tested for any vulnerability.


<img width="960" alt="17" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/151c5d0b-480c-45af-be64-81234e8b03d9">


----------------------------------------------------------------------------

## 16. Jenksins dashboard after the build is successful

<img width="960" alt="18" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/70ddfb63-1a3a-4770-bd14-ff4066cacb5c">


----------------------------------------------------------------------------

## 17. The website hosted successfully on the Tomcat server


<img width="960" alt="19" src="https://github.com/iamsouvik9/CI-CD-Petclinic-Project/assets/79768737/6c57b41b-8bc5-4f49-8138-86fc24552ead">


----------------------------------------------------------------------------

