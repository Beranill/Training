package com.beranill;

import java.util.ArrayList;

public class Sobes2 {
    public static void main(String[] args) {
        OrderService.OrderData order1 = new OrderService.OrderData(OrderService.Type.DELIVERY, "dollar", 500L);
        OrderService.OrderData order2 = new OrderService.OrderData(OrderService.Type.DELIVERY, "ruble", 300L);
        OrderService.OrderData order3 = new OrderService.OrderData(OrderService.Type.DELIVERY, "dollar", 200L);
        OrderService.OrderData order4 = new OrderService.OrderData(OrderService.Type.DELIVERY, "ruble", 780L);
        OrderService.OrderData order5 = new OrderService.OrderData(OrderService.Type.PICKUP, "ruble", 780L);

        ArrayList<OrderService.OrderData> list = new ArrayList<>();
        list.add(order1);
        list.add(order2);
        list.add(order3);
        list.add(order4);
        list.add(order5);

        for (OrderService.OrderData i :list){
            if (i.type == OrderService.Type.DELIVERY) {
                if (i.currency == "dollar"){
                    long difference = (findMax(list) - findMin(list));
                    //Тут должно быть добавление в список для дальнейшей соритровки
                } else if (i.currency == "ruble") {
                    long difference = (findMax(list) - findMin(list));
                    //Тут должно быть добавление в список для дальнейшей соритровки
                }
            }
        }

        //Сортировка по возрастания списка с результатами
        //Вывод на экран
    }

    public static long findMin(ArrayList<OrderService.OrderData> list) {
        long min = list.indexOf(0);
        for (OrderService.OrderData i :list){
        }
        return min;
    }
    public static long findMax(ArrayList<OrderService.OrderData> list) {
        long max = list.indexOf(0);
        for (OrderService.OrderData i :list){
        }
        return max;
    }
}

class OrderService{
    enum Type{DELIVERY, PICKUP}

    static class OrderData{
        final Type type;
        final String currency;
        final Long amount;


        OrderData(Type type, String currency, Long amount) {
            this.type = type;
            this.currency = currency;
            this.amount = amount;
        }

        String getCurrency(){
            return currency;
        }

        Type getType() {
            return type;
        }

        Long getAmount() {
            return amount;
        }
    }
}
