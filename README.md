# liferay-camunda-workflow-api
Liferay 7 Service Builder providing JSON WS API endpoints so that workflow-related operations can be triggered remotely

Provides a REST API endpoint to terminate a worklow and approve or deny the associated entry.


Building and Installing:

* Import into Liferay IDE as Liferay Module or possibly Gradle Project
* Execute build from the eclipse view "gradle tasks" for the root project
* this will generate a deployable jar file in build/libs/
* deploy the jar in liferay

The endpoint will be available under the liferay URL "/api/jsonws/camunda.camunda" with the function "update-status"

It expects a paramter "status" which can either be "approved" or "denied" - depending on the desired entry status.

It also expects a parameter "context" containing the liferay workflow's context as a map / json object