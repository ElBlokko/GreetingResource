package s22;

import io.quarkus.amazon.lambda.http.model.AwsProxyRequestContext;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GreetingResource {

    private static final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();

    @POST
    @Path("/{facade : (v1/service-storage/)?}data-set")
    public Response createDataSet(Data data, @Context AwsProxyRequestContext context)
    {
        validatorFactory.getValidator().validate(data);
        return null;
    }
}
