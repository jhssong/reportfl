{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/keyvalue/DefaultKeyValue.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultKeyValue",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.keyvalue.AbstractKeyValue\u003cK, V\u003e"
      ],
      "begin_line": 33,
      "end_line": 154,
      "comment": "\n * A mutable \u003ccode\u003eKeyValue\u003c/code\u003e pair that does not implement\n * {@link java.util.Map.Entry Map.Entry}.\n * \u003cp\u003e\n * Note that a \u003ccode\u003eDefaultKeyValue\u003c/code\u003e instance may not contain\n * itself as a key or value.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.DefaultKeyValue.DefaultKeyValue()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Constructs a new pair with a null key and null value.\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.DefaultKeyValue.DefaultKeyValue(K, V)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Constructs a new pair with the specified key and given value.\n     *\n     * @param key  the key for the entry, may be null\n     * @param value  the value for the entry, may be null\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.DefaultKeyValue.DefaultKeyValue(org.apache.commons.collections4.KeyValue\u003c? extends K, ? extends V\u003e)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Constructs a new pair from the specified \u003ccode\u003eKeyValue\u003c/code\u003e.\n     *\n     * @param pair  the pair to copy, must not be null\n     * @throws NullPointerException if the entry is null\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.DefaultKeyValue.DefaultKeyValue(java.util.Map.Entry\u003c? extends K, ? extends V\u003e)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Constructs a new pair from the specified \u003ccode\u003eMap.Entry\u003c/code\u003e.\n     *\n     * @param entry  the entry to copy, must not be null\n     * @throws NullPointerException if the entry is null\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.DefaultKeyValue.setKey(K)",
      "begin_line": 80,
      "end_line": 87,
      "comment": "\n     * Sets the key.\n     *\n     * @param key  the new key\n     * @return the old key\n     * @throws IllegalArgumentException if key is this object\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 86,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.DefaultKeyValue.setValue(V)",
      "begin_line": 96,
      "end_line": 103,
      "comment": "\n     * Sets the value.\n     *\n     * @return the old value of the value\n     * @param value the new value\n     * @throws IllegalArgumentException if value is this object\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 102,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.DefaultKeyValue.toMapEntry()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Returns a new \u003ccode\u003eMap.Entry\u003c/code\u003e object with key and value from this pair.\n     *\n     * @return a MapEntry instance\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.DefaultKeyValue.equals(java.lang.Object)",
      "begin_line": 125,
      "end_line": 138,
      "comment": "\n     * Compares this \u003ccode\u003eMap.Entry\u003c/code\u003e with another \u003ccode\u003eMap.Entry\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns true if the compared object is also a \u003ccode\u003eDefaultKeyValue\u003c/code\u003e,\n     * and its key and value are equal to this object\u0027s key and value.\n     *\n     * @param obj  the object to compare to\n     * @return true if equal key and value\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 72)",
        "(line 135,col 9)-(line 137,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.DefaultKeyValue.hashCode()",
      "begin_line": 148,
      "end_line": 152,
      "comment": "\n     * Gets a hashCode compatible with the equals method.\n     * \u003cp\u003e\n     * Implemented per API documentation of {@link java.util.Map.Entry#hashCode()},\n     * however subclasses may override this.\n     *\n     * @return a suitable hash code\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 151,col 64)"
      ]
    }
  ]
}