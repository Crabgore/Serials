public class DeleteSerialOperation implements SerialOperation {
    private Serial serial;

    public DeleteSerialOperation(Serial serial) {
        this.serial = serial;
    }

    @Override
    public String execute() {
        return serial.delete();
    }
}
