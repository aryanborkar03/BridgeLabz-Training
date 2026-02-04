package com.futurelogistics;
public class Utility {

    public static boolean validate(String transportId) {
        return transportId.matches("[A-Z]{3}[0-9]{3}[A-Z]");
    }

    public static GoodsTransport parseDetails(String input) {
        String[] data = input.split(":");

        String transportId = data[0];
        if (!validate(transportId)) {
            System.out.println("Transport id " + transportId + " is invalid");
            System.out.println("Please provide a valid record");
            return null;
        }

        String date = data[1];
        int rating = Integer.parseInt(data[2]);
        String type = data[3];

        if (type.equalsIgnoreCase("BrickTransport")) {
            return new BrickTransport(
                    transportId, date, rating,
                    Float.parseFloat(data[4]),
                    Integer.parseInt(data[5]),
                    Float.parseFloat(data[6])
            );
        } else {
            return new TimberTransport(
                    transportId, date, rating,
                    Float.parseFloat(data[4]),
                    Float.parseFloat(data[5]),
                    data[6],
                    Float.parseFloat(data[7])
            );
        }
    }

    public static String findObjectType(GoodsTransport gt) {
        if (gt instanceof BrickTransport)
            return "BrickTransport";
        else
            return "TimberTransport";
    }
}
