{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/AbstractMapDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMapDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractIterableMap\u003cK, V\u003e"
      ],
      "begin_line": 41,
      "end_line": 155,
      "comment": "\n * Provides a base decorator that enables additional functionality to be added\n * to a Map via decoration.\n * \u003cp\u003e\n * Methods are forwarded directly to the decorated map.\n * \u003cp\u003e\n * This implementation does not perform any special processing with\n * {@link #entrySet()}, {@link #keySet()} or {@link #values()}. Instead\n * it simply returns the set/collection from the wrapped map. This may be\n * undesirable, for example if you are trying to write a validating\n * implementation it would provide a loophole around the validation.\n * But, you might want that loophole, so this class is kept simple.\n *\n * @param \u003cK\u003e the type of the keys in the map\n * @param \u003cV\u003e the type of the values in the map\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The map to decorate "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.AbstractMapDecorator()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.AbstractMapDecorator(java.util.Map\u003cK, V\u003e)",
      "begin_line": 60,
      "end_line": 65,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.decorated()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Gets the map being decorated.\n     *\n     * @return the decorated map\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.clear()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.containsKey(java.lang.Object)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.containsValue(java.lang.Object)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.entrySet()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.get(java.lang.Object)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.isEmpty()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.keySet()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.put(K, V)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.remove(java.lang.Object)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.size()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.values()",
      "begin_line": 132,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.equals(java.lang.Object)",
      "begin_line": 137,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.hashCode()",
      "begin_line": 145,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.toString()",
      "begin_line": 150,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 38)"
      ]
    }
  ]
}