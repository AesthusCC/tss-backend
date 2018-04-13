package tss.responses.information;

import org.jetbrains.annotations.Nls;

/**
 * Created by apple on 2018/4/13.
 */
public class AddClassroomResponse {

    @Nls
    private final String status;

    public AddClassroomResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
