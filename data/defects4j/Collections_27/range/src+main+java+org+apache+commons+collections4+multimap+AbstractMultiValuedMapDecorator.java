{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultiValuedMapDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 186,
      "comment": "\n * Decorates another \u003ccode\u003eMultiValuedMap\u003c/code\u003e to provide additional behaviour.\n * \u003cp\u003e\n * Each method call made on this \u003ccode\u003eMultiValuedMap\u003c/code\u003e is forwarded to the\n * decorated \u003ccode\u003eMultiValuedMap\u003c/code\u003e. This class is used as a framework to build\n * to extensions such as synchronized and unmodifiable behaviour.\n *\n * @param \u003cK\u003e the type of key elements\n * @param \u003cV\u003e the type of value elements\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " MultiValuedMap to decorate "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.AbstractMultiValuedMapDecorator(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e)",
      "begin_line": 57,
      "end_line": 62,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.decorated()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * The decorated multi-valued map.\n     *\n     * @return the map to decorate\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.size()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.isEmpty()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.containsKey(java.lang.Object)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.containsValue(java.lang.Object)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.containsMapping(java.lang.Object, java.lang.Object)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.get(K)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.remove(java.lang.Object)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.removeMapping(java.lang.Object, java.lang.Object)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.clear()",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.put(K, V)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.keySet()",
      "begin_line": 123,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.entries()",
      "begin_line": 128,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.keys()",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.values()",
      "begin_line": 138,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.asMap()",
      "begin_line": 143,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.putAll(K, java.lang.Iterable\u003c? extends V\u003e)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.putAll(org.apache.commons.collections4.MultiValuedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 158,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.mapIterator()",
      "begin_line": 163,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.equals(java.lang.Object)",
      "begin_line": 168,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.hashCode()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.toString()",
      "begin_line": 181,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 38)"
      ]
    }
  ]
}