import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return property if called"
    request{
        method GET()
        url("/api/properties") {
        }
    }
    response {
        body("[]")
        status 200
    }
}
