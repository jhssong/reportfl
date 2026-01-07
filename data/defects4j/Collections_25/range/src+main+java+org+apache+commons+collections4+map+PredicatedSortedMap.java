{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/map/PredicatedSortedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicatedSortedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.PredicatedMap\u003cK, V\u003e",
        "java.util.SortedMap\u003cK, V\u003e"
      ],
      "begin_line": 51,
      "end_line": 128,
      "comment": "\n * Decorates another \u003ccode\u003eSortedMap\u003c/code\u003e to validate that additions\n * match a specified predicate.\n * \u003cp\u003e\n * This map exists to provide validation for the decorated map.\n * It is normally created to decorate an empty map.\n * If an object cannot be added to the map, an IllegalArgumentException is thrown.\n * \u003cp\u003e\n * One usage would be to ensure that no null keys are added to the map.\n * \u003cpre\u003e\n *   SortedMap map \u003d\n *     PredicatedSortedMap.predicatedSortedMap(new TreeMap(),\n *                                             NotNullPredicate.notNullPredicate(),\n *                                             null);\n * \u003c/pre\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that PredicatedSortedMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedSortedMap}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PredicatedSortedMap.predicatedSortedMap(java.util.SortedMap\u003cK, V\u003e, org.apache.commons.collections4.Predicate\u003c? super K\u003e, org.apache.commons.collections4.Predicate\u003c? super V\u003e)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Factory method to create a predicated (validating) sorted map.\n     * \u003cp\u003e\n     * If there are any elements already in the list being decorated, they\n     * are validated.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @param keyPredicate  the predicate to validate the keys, null means no check\n     * @param valuePredicate  the predicate to validate to values, null means no check\n     * @return a new predicated sorted map\n     * @throws IllegalArgumentException if the map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PredicatedSortedMap.PredicatedSortedMap(java.util.SortedMap\u003cK, V\u003e, org.apache.commons.collections4.Predicate\u003c? super K\u003e, org.apache.commons.collections4.Predicate\u003c? super V\u003e)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @param keyPredicate  the predicate to validate the keys, null means no check\n     * @param valuePredicate  the predicate to validate to values, null means no check\n     * @throws IllegalArgumentException if the map is null\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PredicatedSortedMap.getSortedMap()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Gets the map being decorated.\n     *\n     * @return the decorated map\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PredicatedSortedMap.firstKey()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PredicatedSortedMap.lastKey()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PredicatedSortedMap.comparator()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PredicatedSortedMap.subMap(K, K)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 74)",
        "(line 115,col 9)-(line 115,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PredicatedSortedMap.headMap(K)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 66)",
        "(line 120,col 9)-(line 120,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PredicatedSortedMap.tailMap(K)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 68)",
        "(line 125,col 9)-(line 125,col 80)"
      ]
    }
  ]
}