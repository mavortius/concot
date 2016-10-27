package concot

import grails.databinding.BindingFormat

class Quotation {

    BigDecimal value

    @BindingFormat('dd/MM/yyyy')
    Date date

    static belongsTo = [item:Item, currency:Currency, supplier:Supplier]

    static constraints = {

    }
}
