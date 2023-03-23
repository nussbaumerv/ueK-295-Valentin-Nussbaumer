pm.test("Existing user", function () {
    pm.response.to.not.have.status(401);
});

pm.test("User with required rights", function () {
    if(pm.response.to.not.have.status(401)){
        pm.response.to.not.have.status(403);
    }
});

pm.test("Status test", function () {
    pm.response.to.have.status(200);
});

pm.test("Valid Response body", function () {
    pm.response.to.be.ok;
    pm.response.to.be.withBody;
    pm.response.to.be.json;
});