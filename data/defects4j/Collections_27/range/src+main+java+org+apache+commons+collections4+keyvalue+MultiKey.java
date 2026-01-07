{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/keyvalue/MultiKey.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiKey",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 45,
      "end_line": 281,
      "comment": "\n * A \u003ccode\u003eMultiKey\u003c/code\u003e allows multiple map keys to be merged together.\n * \u003cp\u003e\n * The purpose of this class is to avoid the need to write code to handle\n * maps of maps. An example might be the need to look up a file name by\n * key and locale. The typical solution might be nested maps. This class\n * can be used instead by creating an instance passing in the key and locale.\n * \u003cp\u003e\n * Example usage:\n * \u003cpre\u003e\n * // populate map with data mapping key+locale to localizedText\n * Map map \u003d new HashMap();\n * MultiKey multiKey \u003d new MultiKey(key, locale);\n * map.put(multiKey, localizedText);\n *\n * // later retrieve the localized text\n * MultiKey multiKey \u003d new MultiKey(key, locale);\n * String localizedText \u003d (String) map.get(multiKey);\n * \u003c/pre\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serialisation version "
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The individual keys "
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The cached hashCode "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.MultiKey.MultiKey(K, K)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Constructor taking two keys.\n     * \u003cp\u003e\n     * The keys should be immutable\n     * If they are not then they must not be changed after adding to the MultiKey.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.MultiKey.MultiKey(K, K, K)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Constructor taking three keys.\n     * \u003cp\u003e\n     * The keys should be immutable\n     * If they are not then they must not be changed after adding to the MultiKey.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.MultiKey.MultiKey(K, K, K, K)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * Constructor taking four keys.\n     * \u003cp\u003e\n     * The keys should be immutable\n     * If they are not then they must not be changed after adding to the MultiKey.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.MultiKey.MultiKey(K, K, K, K, K)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n     * Constructor taking five keys.\n     * \u003cp\u003e\n     * The keys should be immutable\n     * If they are not then they must not be changed after adding to the MultiKey.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @param key5  the fifth key\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.MultiKey.MultiKey(K[])",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Constructor taking an array of keys which is cloned.\n     * \u003cp\u003e\n     * The keys should be immutable\n     * If they are not then they must not be changed after adding to the MultiKey.\n     * \u003cp\u003e\n     * This is equivalent to \u003ccode\u003enew MultiKey(keys, true)\u003c/code\u003e.\n     *\n     * @param keys  the array of keys, not null\n     * @throws IllegalArgumentException if the key array is null\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.MultiKey.MultiKey(K[], boolean)",
      "begin_line": 157,
      "end_line": 169,
      "comment": "\n     * Constructor taking an array of keys, optionally choosing whether to clone.\n     * \u003cp\u003e\n     * \u003cb\u003eIf the array is not cloned, then it must not be modified.\u003c/b\u003e\n     * \u003cp\u003e\n     * This method is public for performance reasons only, to avoid a clone.\n     * The hashcode is calculated once here in this method.\n     * Therefore, changing the array passed in would not change the hashcode but\n     * would change the equals method, which is a bug.\n     * \u003cp\u003e\n     * This is the only fully safe usage of this constructor, as the object array\n     * is never made available in a variable:\n     * \u003cpre\u003e\n     * new MultiKey(new Object[] {...}, false);\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The keys should be immutable\n     * If they are not then they must not be changed after adding to the MultiKey.\n     *\n     * @param keys  the array of keys, not null\n     * @param makeClone  true to clone the array, false to assign it\n     * @throws IllegalArgumentException if the key array is null\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 16)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.MultiKey.getKeys()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Gets a clone of the array of keys.\n     * \u003cp\u003e\n     * The keys should be immutable\n     * If they are not then they must not be changed.\n     *\n     * @return the individual keys\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.MultiKey.getKey(int)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Gets the key at the specified index.\n     * \u003cp\u003e\n     * The key should be immutable.\n     * If it is not then it must not be changed.\n     *\n     * @param index  the index to retrieve\n     * @return the key at the index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.MultiKey.size()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Gets the size of the list of keys.\n     *\n     * @return the size of the list of keys\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.MultiKey.equals(java.lang.Object)",
      "begin_line": 219,
      "end_line": 229,
      "comment": "\n     * Compares this object to another.\n     * \u003cp\u003e\n     * To be equal, the other object must be a \u003ccode\u003eMultiKey\u003c/code\u003e with the\n     * same number of keys which are also equal.\n     *\n     * @param other  the other object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.MultiKey.hashCode()",
      "begin_line": 241,
      "end_line": 244,
      "comment": "\n     * Gets the combined hash code that is computed from all the keys.\n     * \u003cp\u003e\n     * This value is computed once and then cached, so elements should not\n     * change their hash codes once created (note that this is the same\n     * constraint that would be used if the individual keys elements were\n     * themselves {@link java.util.Map Map} keys.\n     *\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.MultiKey.toString()",
      "begin_line": 251,
      "end_line": 254,
      "comment": "\n     * Gets a debugging string version of the key.\n     *\n     * @return a debugging string\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.MultiKey.calculateHashCode(java.lang.Object[])",
      "begin_line": 260,
      "end_line": 269,
      "comment": "\n     * Calculate the hash code of the instance using the provided keys.\n     * @param keys the keys to calculate the hash code for\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 22)",
        "(line 263,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.MultiKey.readResolve()",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\n     * Recalculate the hash code after deserialization. The hash code of some\n     * keys might have change (hash codes based on the system hash code are\n     * only stable for the same process).\n     * @return the instance with recalculated hash code\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 32)",
        "(line 279,col 9)-(line 279,col 20)"
      ]
    }
  ]
}