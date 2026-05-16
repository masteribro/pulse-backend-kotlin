package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class MediaFilter {

    public static List<MediaStorage> byType(List<MediaStorage> items, String type) {
        return items.stream()
                .filter(item -> item.getMediaType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }
}
