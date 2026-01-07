{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/CaseInsensitiveMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CaseInsensitiveMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractHashedMap\u003cK, V\u003e",
        "java.io.Serializable",
        "java.lang.Cloneable"
      ],
      "begin_line": 63,
      "end_line": 161,
      "comment": "\n * A case-insensitive \u003ccode\u003eMap\u003c/code\u003e.\n * \u003cp\u003e\n * Before keys are added to the map or compared to other existing keys, they are converted\n * to all lowercase in a locale-independent fashion by using information from the Unicode\n * data file.\n * \u003cp\u003e\n * Null keys are supported.\n * \u003cp\u003e\n * The \u003ccode\u003ekeySet()\u003c/code\u003e method returns all lowercase keys, or nulls.\n * \u003cp\u003e\n * Example:\n * \u003cpre\u003e\u003ccode\u003e\n *  Map\u0026lt;String, String\u0026gt; map \u003d new CaseInsensitiveMap\u0026lt;String, String\u0026gt;();\n *  map.put(\"One\", \"One\");\n *  map.put(\"Two\", \"Two\");\n *  map.put(null, \"Three\");\n *  map.put(\"one\", \"Four\");\n * \u003c/code\u003e\u003c/pre\u003e\n * creates a \u003ccode\u003eCaseInsensitiveMap\u003c/code\u003e with three entries.\u003cbr\u003e\n * \u003ccode\u003emap.get(null)\u003c/code\u003e returns \u003ccode\u003e\"Three\"\u003c/code\u003e and \u003ccode\u003emap.get(\"ONE\")\u003c/code\u003e\n * returns \u003ccode\u003e\"Four\".\u003c/code\u003e  The \u003ccode\u003eSet\u003c/code\u003e returned by \u003ccode\u003ekeySet()\u003c/code\u003e\n * equals \u003ccode\u003e{\"one\", \"two\", null}.\u003c/code\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eThis map will violate the detail of various Map and map view contracts.\u003c/note\u003e\n * As a general rule, don\u0027t compare this map to other maps. In particular, you can\u0027t\n * use decorators like {@link ListOrderedMap} on it, which silently assume that these\n * contracts are fulfilled.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that CaseInsensitiveMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedMap(Map)}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Serialisation version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.CaseInsensitiveMap.CaseInsensitiveMap()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Constructs a new empty map with default size and load factor.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.CaseInsensitiveMap.CaseInsensitiveMap(int)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Constructs a new, empty map with the specified initial capacity.\n     *\n     * @param initialCapacity  the initial capacity\n     * @throws IllegalArgumentException if the initial capacity is negative\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.CaseInsensitiveMap.CaseInsensitiveMap(int, float)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Constructs a new, empty map with the specified initial capacity and\n     * load factor.\n     *\n     * @param initialCapacity  the initial capacity\n     * @param loadFactor  the load factor\n     * @throws IllegalArgumentException if the initial capacity is negative\n     * @throws IllegalArgumentException if the load factor is less than zero\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.CaseInsensitiveMap.CaseInsensitiveMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Constructor copying elements from another map.\n     * \u003cp\u003e\n     * Keys will be converted to lower case strings, which may cause\n     * some entries to be removed (if string representation of keys differ\n     * only by character case).\n     *\n     * @param map  the map to copy\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CaseInsensitiveMap.convertKey(java.lang.Object)",
      "begin_line": 122,
      "end_line": 132,
      "comment": "\n     * Overrides convertKey() from {@link AbstractHashedMap} to convert keys to\n     * lower case.\n     * \u003cp\u003e\n     * Returns {@link AbstractHashedMap#NULL} if key is null.\n     *\n     * @param key  the key convert\n     * @return the converted key\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CaseInsensitiveMap.clone()",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\n     * Clones the map without cloning the keys or values.\n     *\n     * @return a shallow clone\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CaseInsensitiveMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Write the map out using a custom routine.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 33)",
        "(line 150,col 9)-(line 150,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CaseInsensitiveMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 156,
      "end_line": 159,
      "comment": "\n     * Read the map in using a custom routine.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 31)",
        "(line 158,col 9)-(line 158,col 25)"
      ]
    }
  ]
}