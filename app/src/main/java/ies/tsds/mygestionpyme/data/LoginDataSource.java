package ies.tsds.mygestionpyme.data;

import ies.tsds.mygestionpyme.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            try {
                // TODO: handle loggedInUser authentication
                if(username.equals("adm") && password.equals("1234")){
                    LoggedInUser fakeUser =
                            new LoggedInUser(java.util.UUID.randomUUID().toString(), "ADM");
                    return new Result.Success<>(fakeUser);
                } else {
                    return null;
                }
            } catch (Exception e) {
                return new Result.Error(new IOException("Error logging in", e));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}