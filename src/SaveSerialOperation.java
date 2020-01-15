public class SaveSerialOperation implements SerialOperation {
    private Serial serial;

    public SaveSerialOperation(Serial serial) {
        this.serial = serial;
    }

    @Override
    public String execute() {
        return serial.save();
    }
}
