{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/map/PredicatedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicatedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 192,
      "comment": "\n * Decorates another \u003ccode\u003eMap\u003c/code\u003e to validate that additions\n * match a specified predicate.\n * \u003cp\u003e\n * This map exists to provide validation for the decorated map.\n * It is normally created to decorate an empty map.\n * If an object cannot be added to the map, an IllegalArgumentException is thrown.\n * \u003cp\u003e\n * One usage would be to ensure that no null keys are added to the map.\n * \u003cpre\u003eMap map \u003d PredicatedSet.decorate(new HashMap(), NotNullPredicate.INSTANCE, null);\u003c/pre\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that PredicatedMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedMap(Map)}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "keyPredicate"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The key predicate to use "
    },
    {
      "type": "field",
      "varNames": [
        "valuePredicate"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The value predicate to use "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PredicatedMap.predicatedMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Predicate\u003c? super K\u003e, org.apache.commons.collections4.Predicate\u003c? super V\u003e)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "\n     * Factory method to create a predicated (validating) map.\n     * \u003cp\u003e\n     * If there are any elements already in the list being decorated, they\n     * are validated.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @param keyPredicate  the predicate to validate the keys, null means no check\n     * @param valuePredicate  the predicate to validate to values, null means no check\n     * @return a new predicated map\n     * @throws IllegalArgumentException if the map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.PredicatedMap.PredicatedMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Predicate\u003c? super K\u003e, org.apache.commons.collections4.Predicate\u003c? super V\u003e)",
      "begin_line": 93,
      "end_line": 104,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @param keyPredicate  the predicate to validate the keys, null means no check\n     * @param valuePredicate  the predicate to validate to values, null means no check\n     * @throws IllegalArgumentException if the map is null\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 19)",
        "(line 96,col 9)-(line 96,col 41)",
        "(line 97,col 9)-(line 97,col 45)",
        "(line 99,col 9)-(line 99,col 71)",
        "(line 100,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PredicatedMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n     * Write the map out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 33)",
        "(line 116,col 9)-(line 116,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PredicatedMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 127,
      "end_line": 131,
      "comment": "\n     * Read the map in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 31)",
        "(line 130,col 9)-(line 130,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PredicatedMap.validate(K, V)",
      "begin_line": 141,
      "end_line": 148,
      "comment": "\n     * Validates a key value pair.\n     *\n     * @param key  the key to validate\n     * @param value  the value to validate\n     * @throws IllegalArgumentException if invalid\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PredicatedMap.checkSetValue(V)",
      "begin_line": 158,
      "end_line": 164,
      "comment": "\n     * Override to validate an object set into the map via \u003ccode\u003esetValue\u003c/code\u003e.\n     *\n     * @param value  the value to validate\n     * @return the value itself\n     * @throws IllegalArgumentException if invalid\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PredicatedMap.isSetValueChecking()",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\n     * Override to only return true when there is a value transformer.\n     *\n     * @return true if a value predicate is in use\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PredicatedMap.put(K, V)",
      "begin_line": 178,
      "end_line": 182,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 29)",
        "(line 181,col 9)-(line 181,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.PredicatedMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 184,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 32)"
      ]
    }
  ]
}