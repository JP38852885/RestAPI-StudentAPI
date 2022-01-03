package springboot.api.tutorial.config;

import io.swagger.annotations.*;

@SwaggerDefinition(
        info = @Info(
                description = "RestAPI to Automate",
                version = "V12.0.12",
                title = "Tutorial - RestAPI",
                contact = @Contact(
                   name = "RestAPI Automation - Quality Thoughts",
                   email = "info@qualitythought.com",
                   url = "https://www.qualitythought.in/"
                ),
                license = @License(
                   name = "Apache 2.0", 
                   url = "http://www.apache.org/licenses/LICENSE-2.0"
                )
        ),
        consumes = {"application/json", "application/xml"},
        produces = {"application/json", "application/xml"},
        schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS},
        externalDocs = @ExternalDocs(value = "Read This For Sure", url = "https://www.qualitythought.in/")
)
public interface ApiDocumentationConfig {

}