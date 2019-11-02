package com.wangdaye.common.bus.event;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.wangdaye.base.unsplash.Collection;
import com.wangdaye.base.unsplash.Photo;

public class PhotoEvent {

    @NonNull public Photo photo;
    @Nullable public Collection collection;
    public Event event;

    public enum Event {
        UPDATE, ADD_TO_COLLECTION, REMOVE_FROM_COLLECTION
    }

    public PhotoEvent(@NonNull Photo photo) {
        this.photo = photo;
        this.collection = null;
        this.event = Event.UPDATE;
    }

    public PhotoEvent(@NonNull Photo photo, @NonNull Collection collection, Event event) {
        this.photo = photo;
        this.collection = collection;
        this.event = event;
    }
}
