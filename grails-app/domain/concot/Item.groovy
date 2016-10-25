package concot

class Item {

    String name

    static belongsTo = [category:Category]

    static constraints = {
        name nullable: false, blank: false, maxSize: 128
        category nullable: false
    }
}
