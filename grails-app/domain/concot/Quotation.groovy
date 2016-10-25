package concot

class Quotation {

    BigDecimal value
    Date date

    static belongsTo = [item:Item, currency:Currency, supplier:Supplier]

    static constraints = {

    }
}
