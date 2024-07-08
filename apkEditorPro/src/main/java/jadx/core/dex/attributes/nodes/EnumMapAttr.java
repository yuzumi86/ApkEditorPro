package jadx.core.dex.attributes.nodes;

import java.util.HashMap;
import java.util.Map;

import jadx.core.dex.attributes.AType;
import jadx.core.dex.attributes.IAttribute;
import jadx.core.dex.nodes.FieldNode;

public class EnumMapAttr implements IAttribute {

    private final Map<FieldNode, KeyValueMap> fieldsMap = new HashMap<FieldNode, KeyValueMap>();

    public KeyValueMap getMap(FieldNode field) {
        return fieldsMap.get(field);
    }

    public void add(FieldNode field, Object key, Object value) {
        KeyValueMap map = getMap(field);
        if (map == null) {
            map = new KeyValueMap();
            fieldsMap.put(field, map);
        }
        map.put(key, value);
    }

    @Override
    public AType<EnumMapAttr> getType() {
        return AType.ENUM_MAP;
    }

    @Override
    public String toString() {
        return "Enum fields map: " + fieldsMap;
    }

    public static class KeyValueMap {
        private final Map<Object, Object> map = new HashMap<Object, Object>();

        public Object get(Object key) {
            return map.get(key);
        }

        void put(Object key, Object value) {
            map.put(key, value);
        }
    }

}
