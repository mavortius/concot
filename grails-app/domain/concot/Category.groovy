package concot

class Category {

    String name

    static constraints = {
        name nullable: false, blank: false, maxSize: 128, unique: true
    }

    @Override
    String toString() {
        name
    }
}
