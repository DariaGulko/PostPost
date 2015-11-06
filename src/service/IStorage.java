package service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dariya on 04.11.2015.
 */
public interface IStorage {
    private Map storage;

    private static class InstanceHolder {
        private static final IStorage instance = new IStorage();
    }

    public static IStorage getInstance() {
        return InstanceHolder.instance;
    }

    private IStorage() {
        this.storage = new HashMap<>();
    }

    public void putToStorage(Object id, Object value) {
        this.storage.put(id, value);
    }

    public <T> T getById(Object id) throws ClassCastException{
        return (T) this.storage.get(id);
    }
    }
