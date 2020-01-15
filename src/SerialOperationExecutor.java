import java.util.ArrayList;
import java.util.List;

public class SerialOperationExecutor {
    private final List<SerialOperation> serials = new ArrayList<>();

    public String executeOperation (SerialOperation serialOperation) {
        serials.add(serialOperation);
        return serialOperation.execute();
    }
}
