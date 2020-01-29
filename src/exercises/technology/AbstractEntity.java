package exercises.technology;

abstract class AbstractEntity {
    int id;
    static int numIds;

    AbstractEntity(int id) {
        this.id = ++numIds;
    }
}
