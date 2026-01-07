{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/SingletonMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SingletonMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.OrderedMap\u003cK, V\u003e",
        "org.apache.commons.collections4.BoundedMap\u003cK, V\u003e",
        "org.apache.commons.collections4.KeyValue\u003cK, V\u003e",
        "java.io.Serializable",
        "java.lang.Cloneable"
      ],
      "begin_line": 59,
      "end_line": 606,
      "comment": "\n * A \u003ccode\u003eMap\u003c/code\u003e implementation that holds a single item and is fixed size.\n * \u003cp\u003e\n * The single key/value pair is specified at creation.\n * The map is fixed size so any action that would change the size is disallowed.\n * However, the \u003ccode\u003eput\u003c/code\u003e or \u003ccode\u003esetValue\u003c/code\u003e methods can \u003ci\u003echange\u003c/i\u003e\n * the value associated with the key.\n * \u003cp\u003e\n * If trying to remove or clear the map, an UnsupportedOperationException is thrown.\n * If trying to put a new mapping into the map, an  IllegalArgumentException is thrown.\n * The put method will only succeed if the key specified is the same as the\n * singleton key.\n * \u003cp\u003e\n * The key and value can be obtained by:\n * \u003cul\u003e\n * \u003cli\u003enormal Map methods and views\n * \u003cli\u003ethe \u003ccode\u003eMapIterator\u003c/code\u003e, see {@link #mapIterator()}\n * \u003cli\u003ethe \u003ccode\u003eKeyValue\u003c/code\u003e interface (just cast - no object creation)\n * \u003c/ul\u003e\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Singleton key "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Singleton value "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonMap()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Constructor that creates a map of \u003ccode\u003enull\u003c/code\u003e to \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 16)",
        "(line 75,col 9)-(line 75,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonMap(K, V)",
      "begin_line": 84,
      "end_line": 88,
      "comment": "\n     * Constructor specifying the key and value.\n     *\n     * @param key  the key to use\n     * @param value  the value to use\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 16)",
        "(line 86,col 9)-(line 86,col 23)",
        "(line 87,col 9)-(line 87,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonMap(org.apache.commons.collections4.KeyValue\u003cK, V\u003e)",
      "begin_line": 95,
      "end_line": 99,
      "comment": "\n     * Constructor specifying the key and value as a \u003ccode\u003eKeyValue\u003c/code\u003e.\n     *\n     * @param keyValue  the key value pair to use\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 16)",
        "(line 97,col 9)-(line 97,col 37)",
        "(line 98,col 9)-(line 98,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonMap(java.util.Map.Entry\u003c? extends K, ? extends V\u003e)",
      "begin_line": 106,
      "end_line": 110,
      "comment": "\n     * Constructor specifying the key and value as a \u003ccode\u003eMapEntry\u003c/code\u003e.\n     *\n     * @param mapEntry  the mapEntry to use\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 16)",
        "(line 108,col 9)-(line 108,col 37)",
        "(line 109,col 9)-(line 109,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 119,
      "end_line": 127,
      "comment": "\n     * Constructor copying elements from another map.\n     *\n     * @param map  the map to copy, must be size 1\n     * @throws NullPointerException if the map is null\n     * @throws IllegalArgumentException if the size is not 1\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 16)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 91)",
        "(line 125,col 9)-(line 125,col 34)",
        "(line 126,col 9)-(line 126,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.getKey()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "\n     * Gets the key.\n     *\n     * @return the key\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.getValue()",
      "begin_line": 146,
      "end_line": 149,
      "comment": "\n     * Gets the value.\n     *\n     * @return the value\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.setValue(V)",
      "begin_line": 157,
      "end_line": 161,
      "comment": "\n     * Sets the value.\n     *\n     * @param value  the new value to set\n     * @return the old value\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 33)",
        "(line 159,col 9)-(line 159,col 27)",
        "(line 160,col 9)-(line 160,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.isFull()",
      "begin_line": 170,
      "end_line": 173,
      "comment": "\n     * Is the map currently full, always true.\n     *\n     * @return true always\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.maxSize()",
      "begin_line": 180,
      "end_line": 183,
      "comment": "\n     * Gets the maximum size of the map, always 1.\n     *\n     * @return 1 always\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.get(java.lang.Object)",
      "begin_line": 193,
      "end_line": 199,
      "comment": "\n     * Gets the value mapped to the key specified.\n     *\n     * @param key  the key\n     * @return the mapped value, null if no match\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.size()",
      "begin_line": 206,
      "end_line": 209,
      "comment": "\n     * Gets the size of the map, always 1.\n     *\n     * @return the size of 1\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.isEmpty()",
      "begin_line": 216,
      "end_line": 219,
      "comment": "\n     * Checks whether the map is currently empty, which it never is.\n     *\n     * @return false always\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.containsKey(java.lang.Object)",
      "begin_line": 228,
      "end_line": 231,
      "comment": "\n     * Checks whether the map contains the specified key.\n     *\n     * @param key  the key to search for\n     * @return true if the map contains the key\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.containsValue(java.lang.Object)",
      "begin_line": 239,
      "end_line": 242,
      "comment": "\n     * Checks whether the map contains the specified value.\n     *\n     * @param value  the value to search for\n     * @return true if the map contains the key\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.put(K, V)",
      "begin_line": 256,
      "end_line": 262,
      "comment": "\n     * Puts a key-value mapping into this map where the key must match the existing key.\n     * \u003cp\u003e\n     * An IllegalArgumentException is thrown if the key does not match as the map\n     * is fixed size.\n     *\n     * @param key  the key to set, must be the key of the map\n     * @param value  the value to set\n     * @return the value previously mapped to this key, null if none\n     * @throws IllegalArgumentException if the key does not match\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 275,
      "end_line": 289,
      "comment": "\n     * Puts the values from the specified map into this map.\n     * \u003cp\u003e\n     * The map must be of size 0 or size 1.\n     * If it is size 1, the key must match the key of this map otherwise an\n     * IllegalArgumentException is thrown.\n     *\n     * @param map  the map to add, must be size 0 or 1, and the key must match\n     * @throws NullPointerException if the map is null\n     * @throws IllegalArgumentException if the key does not match\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 288,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.remove(java.lang.Object)",
      "begin_line": 298,
      "end_line": 301,
      "comment": "\n     * Unsupported operation.\n     *\n     * @param key  the mapping to remove\n     * @return the value mapped to the removed key, null if key not in map\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.clear()",
      "begin_line": 306,
      "end_line": 309,
      "comment": "\n     * Unsupported operation.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.entrySet()",
      "begin_line": 319,
      "end_line": 323,
      "comment": "\n     * Gets the entrySet view of the map.\n     * Changes made via \u003ccode\u003esetValue\u003c/code\u003e affect this map.\n     * To simply iterate through the entries, use {@link #mapIterator()}.\n     *\n     * @return the entrySet view\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 77)",
        "(line 322,col 9)-(line 322,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.keySet()",
      "begin_line": 332,
      "end_line": 335,
      "comment": "\n     * Gets the unmodifiable keySet view of the map.\n     * Changes made to the view affect this map.\n     * To simply iterate through the keys, use {@link #mapIterator()}.\n     *\n     * @return the keySet view\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.values()",
      "begin_line": 344,
      "end_line": 347,
      "comment": "\n     * Gets the unmodifiable values view of the map.\n     * Changes made to the view affect this map.\n     * To simply iterate through the values, use {@link #mapIterator()}.\n     *\n     * @return the values view\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.mapIterator()",
      "begin_line": 352,
      "end_line": 355,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.firstKey()",
      "begin_line": 362,
      "end_line": 365,
      "comment": "\n     * Gets the first (and only) key in the map.\n     *\n     * @return the key\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.lastKey()",
      "begin_line": 372,
      "end_line": 375,
      "comment": "\n     * Gets the last (and only) key in the map.\n     *\n     * @return the key\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.nextKey(K)",
      "begin_line": 383,
      "end_line": 386,
      "comment": "\n     * Gets the next key after the key specified, always null.\n     *\n     * @param key  the next key\n     * @return null always\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.previousKey(K)",
      "begin_line": 394,
      "end_line": 397,
      "comment": "\n     * Gets the previous key before the key specified, always null.\n     *\n     * @param key  the next key\n     * @return null always\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.isEqualKey(java.lang.Object)",
      "begin_line": 406,
      "end_line": 408,
      "comment": "\n     * Compares the specified key to the stored key.\n     *\n     * @param key  the key to compare\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.isEqualValue(java.lang.Object)",
      "begin_line": 416,
      "end_line": 418,
      "comment": "\n     * Compares the specified value to the stored value.\n     *\n     * @param value  the value to compare\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 77)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SingletonMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.OrderedMapIterator\u003cK, V\u003e",
        "org.apache.commons.collections4.ResettableIterator\u003cK\u003e"
      ],
      "begin_line": 424,
      "end_line": 504,
      "comment": "\n     * SingletonMapIterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 425,
      "end_line": 425,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasNext"
      ],
      "begin_line": 426,
      "end_line": 426,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "canGetSet"
      ],
      "begin_line": 427,
      "end_line": 427,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonMapIterator.SingletonMapIterator(org.apache.commons.collections4.map.SingletonMap\u003cK, V\u003e)",
      "begin_line": 429,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 430,col 13)-(line 430,col 20)",
        "(line 431,col 13)-(line 431,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonMapIterator.hasNext()",
      "begin_line": 434,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 436,col 13)-(line 436,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonMapIterator.next()",
      "begin_line": 439,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 441,col 13)-(line 443,col 13)",
        "(line 444,col 13)-(line 444,col 28)",
        "(line 445,col 13)-(line 445,col 29)",
        "(line 446,col 13)-(line 446,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonMapIterator.hasPrevious()",
      "begin_line": 449,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 451,col 13)-(line 451,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonMapIterator.previous()",
      "begin_line": 454,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 456,col 13)-(line 458,col 13)",
        "(line 459,col 13)-(line 459,col 27)",
        "(line 460,col 13)-(line 460,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonMapIterator.remove()",
      "begin_line": 463,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 465,col 13)-(line 465,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonMapIterator.getKey()",
      "begin_line": 468,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 470,col 13)-(line 472,col 13)",
        "(line 473,col 13)-(line 473,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonMapIterator.getValue()",
      "begin_line": 476,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 478,col 13)-(line 480,col 13)",
        "(line 481,col 13)-(line 481,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonMapIterator.setValue(V)",
      "begin_line": 484,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 486,col 13)-(line 488,col 13)",
        "(line 489,col 13)-(line 489,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonMapIterator.reset()",
      "begin_line": 492,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 494,col 13)-(line 494,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonMapIterator.toString()",
      "begin_line": 497,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 499,col 13)-(line 501,col 13)",
        "(line 502,col 13)-(line 502,col 67)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SingletonValues",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cV\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 510,
      "end_line": 539,
      "comment": "\n     * Values implementation for the SingletonMap.\n     * This class is needed as values is a view that must update as the map updates.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 511,
      "end_line": 511,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 512,
      "end_line": 512,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonValues.SingletonValues(org.apache.commons.collections4.map.SingletonMap\u003c?, V\u003e)",
      "begin_line": 514,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 515,col 13)-(line 515,col 20)",
        "(line 516,col 13)-(line 516,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonValues.size()",
      "begin_line": 519,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 521,col 13)-(line 521,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonValues.isEmpty()",
      "begin_line": 523,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 525,col 13)-(line 525,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonValues.contains(java.lang.Object)",
      "begin_line": 527,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 529,col 13)-(line 529,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonValues.clear()",
      "begin_line": 531,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 533,col 13)-(line 533,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.SingletonValues.iterator()",
      "begin_line": 535,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 537,col 13)-(line 537,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.clone()",
      "begin_line": 547,
      "end_line": 555,
      "comment": "\n     * Clones the map without cloning the key or value.\n     *\n     * @return a shallow clone\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 554,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.equals(java.lang.Object)",
      "begin_line": 563,
      "end_line": 577,
      "comment": "\n     * Compares this map with another.\n     *\n     * @param obj  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 571,col 46)",
        "(line 572,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 575,col 72)",
        "(line 576,col 9)-(line 576,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.hashCode()",
      "begin_line": 584,
      "end_line": 588,
      "comment": "\n     * Gets the standard Map hashCode.\n     *\n     * @return the hash code defined in the Map interface\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 587,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.SingletonMap.toString()",
      "begin_line": 595,
      "end_line": 604,
      "comment": "\n     * Gets the map as a String.\n     *\n     * @return a string version of the map\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 603,col 24)"
      ]
    }
  ]
}