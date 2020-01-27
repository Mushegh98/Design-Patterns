public class AdapterJavaToDatabase extends JavaDataBase implements DataBase {
    @Override
    public void insert() {
        ObjectInsert();
    }

    @Override
    public void update() {
        ObjectUpdate();
    }

    @Override
    public void select() {
        ObjectSelect();
    }

    @Override
    public void remove() {
        ObjectRemove();
    }
}
