{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/map/AbstractHashedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractHashedMap",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractMap\u003cK, V\u003e",
        "org.apache.commons.collections4.IterableMap\u003cK, V\u003e"
      ],
      "begin_line": 58,
      "end_line": 1389,
      "comment": "\n * An abstract implementation of a hash-based map which provides numerous points for\n * subclasses to override.\n * \u003cp\u003e\n * This class implements all the features necessary for a subclass hash-based map.\n * Key-value entries are stored in instances of the \u003ccode\u003eHashEntry\u003c/code\u003e class,\n * which can be overridden and replaced. The iterators can similarly be replaced,\n * without the need to replace the KeySet, EntrySet and Values view classes.\n * \u003cp\u003e\n * Overridable methods are provided to change the default hashing behaviour, and\n * to change how entries are added to and removed from the map. Hopefully, all you\n * need for unusual subclasses is here.\n * \u003cp\u003e\n * NOTE: From Commons Collections 3.1 this class extends AbstractMap.\n * This is to provide backwards compatibility for ReferenceMap between v3.0 and v3.1.\n * This extends clause will be removed in v5.0.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "NO_NEXT_ENTRY"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_PREVIOUS_ENTRY"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REMOVE_INVALID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GETKEY_INVALID"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GETVALUE_INVALID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SETVALUE_INVALID"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CAPACITY"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The default capacity to use "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_THRESHOLD"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The default threshold to use "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LOAD_FACTOR"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The default load factor to use "
    },
    {
      "type": "field",
      "varNames": [
        "MAXIMUM_CAPACITY"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The maximum capacity allowed "
    },
    {
      "type": "field",
      "varNames": [
        "NULL"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " An object for masking null "
    },
    {
      "type": "field",
      "varNames": [
        "loadFactor"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Load factor, normally 0.75 "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The size of the map "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Map entries "
    },
    {
      "type": "field",
      "varNames": [
        "threshold"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Size at which to rehash "
    },
    {
      "type": "field",
      "varNames": [
        "modCount"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Modification count for iterators "
    },
    {
      "type": "field",
      "varNames": [
        "entrySet"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Entry set "
    },
    {
      "type": "field",
      "varNames": [
        "keySet"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Key set "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Values "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.AbstractHashedMap()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.AbstractHashedMap(int, float, int)",
      "begin_line": 109,
      "end_line": 116,
      "comment": "\n     * Constructor which performs no validation on the passed in parameters.\n     *\n     * @param initialCapacity  the initial capacity, must be a power of two\n     * @param loadFactor  the load factor, must be \u0026gt; 0.0f and generally \u0026lt; 1.0f\n     * @param threshold  the threshold, must be sensible\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 16)",
        "(line 112,col 9)-(line 112,col 37)",
        "(line 113,col 9)-(line 113,col 51)",
        "(line 114,col 9)-(line 114,col 35)",
        "(line 115,col 9)-(line 115,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.AbstractHashedMap(int)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Constructs a new, empty map with the specified initial capacity and\n     * default load factor.\n     *\n     * @param initialCapacity  the initial capacity\n     * @throws IllegalArgumentException if the initial capacity is negative\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.AbstractHashedMap(int, float)",
      "begin_line": 138,
      "end_line": 152,
      "comment": "\n     * Constructs a new, empty map with the specified initial capacity and\n     * load factor.\n     *\n     * @param initialCapacity  the initial capacity\n     * @param loadFactor  the load factor\n     * @throws IllegalArgumentException if the initial capacity is negative\n     * @throws IllegalArgumentException if the load factor is less than or equal to zero\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 16)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 37)",
        "(line 148,col 9)-(line 148,col 64)",
        "(line 149,col 9)-(line 149,col 73)",
        "(line 150,col 9)-(line 150,col 51)",
        "(line 151,col 9)-(line 151,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.AbstractHashedMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\n     * Constructor copying elements from another map.\n     *\n     * @param map  the map to copy\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 78)",
        "(line 162,col 9)-(line 162,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.init()",
      "begin_line": 168,
      "end_line": 169,
      "comment": "\n     * Initialise subclasses during construction, cloning or deserialization.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.get(java.lang.Object)",
      "begin_line": 178,
      "end_line": 190,
      "comment": "\n     * Gets the value mapped to the key specified.\n     *\n     * @param key  the key\n     * @return the mapped value, null if no match\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 30)",
        "(line 181,col 9)-(line 181,col 39)",
        "(line 182,col 9)-(line 182,col 71)",
        "(line 183,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.size()",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n     * Gets the size of the map.\n     *\n     * @return the size\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.isEmpty()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\n     * Checks whether the map is currently empty.\n     *\n     * @return true if the map is currently size zero\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.containsKey(java.lang.Object)",
      "begin_line": 219,
      "end_line": 231,
      "comment": "\n     * Checks whether the map contains the specified key.\n     *\n     * @param key  the key to search for\n     * @return true if the map contains the key\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 30)",
        "(line 222,col 9)-(line 222,col 39)",
        "(line 223,col 9)-(line 223,col 71)",
        "(line 224,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.containsValue(java.lang.Object)",
      "begin_line": 239,
      "end_line": 263,
      "comment": "\n     * Checks whether the map contains the specified value.\n     *\n     * @param value  the value to search for\n     * @return true if the map contains the value\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.put(K, V)",
      "begin_line": 273,
      "end_line": 290,
      "comment": "\n     * Puts a key-value mapping into this map.\n     *\n     * @param key  the key to add\n     * @param value  the value to add\n     * @return the value previously mapped to this key, null if none\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 52)",
        "(line 276,col 9)-(line 276,col 48)",
        "(line 277,col 9)-(line 277,col 59)",
        "(line 278,col 9)-(line 278,col 44)",
        "(line 279,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 48)",
        "(line 289,col 9)-(line 289,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 301,
      "end_line": 304,
      "comment": "\n     * Puts all the values from the specified map into this map.\n     * \u003cp\u003e\n     * This implementation iterates around the specified map and\n     * uses {@link #put(Object, Object)}.\n     *\n     * @param map  the map to add\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap._putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 318,
      "end_line": 328,
      "comment": "\n     * Puts all the values from the specified map into this map.\n     * \u003cp\u003e\n     * This implementation iterates around the specified map and\n     * uses {@link #put(Object, Object)}.\n     * \u003cp\u003e\n     * It is private to allow the constructor to still call it\n     * even when putAll is overriden.\n     *\n     * @param map  the map to add\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 39)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 70)",
        "(line 324,col 9)-(line 324,col 54)",
        "(line 325,col 9)-(line 327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.remove(java.lang.Object)",
      "begin_line": 336,
      "end_line": 353,
      "comment": "\n     * Removes the specified mapping from this map.\n     *\n     * @param key  the mapping to remove\n     * @return the value mapped to the removed key, null if key not in map\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 30)",
        "(line 339,col 9)-(line 339,col 39)",
        "(line 340,col 9)-(line 340,col 59)",
        "(line 341,col 9)-(line 341,col 44)",
        "(line 342,col 9)-(line 342,col 40)",
        "(line 343,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.clear()",
      "begin_line": 359,
      "end_line": 367,
      "comment": "\n     * Clears the map, resetting the size to zero and nullifying references\n     * to avoid garbage collection issues.\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 19)",
        "(line 362,col 9)-(line 362,col 49)",
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.convertKey(java.lang.Object)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\n     * Converts input keys to another object for storage in the map.\n     * This implementation masks nulls.\n     * Subclasses can override this to perform alternate key conversions.\n     * \u003cp\u003e\n     * The reverse conversion can be changed, if required, by overriding the\n     * getKey() method in the hash entry.\n     *\n     * @param key  the key convert\n     * @return the converted key\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.hash(java.lang.Object)",
      "begin_line": 393,
      "end_line": 401,
      "comment": "\n     * Gets the hash code for the key specified.\n     * This implementation uses the additional hashing routine from JDK1.4.\n     * Subclasses can override this to return alternate hash codes.\n     *\n     * @param key  the key to get a hash code for\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 31)",
        "(line 396,col 9)-(line 396,col 23)",
        "(line 397,col 9)-(line 397,col 23)",
        "(line 398,col 9)-(line 398,col 21)",
        "(line 399,col 9)-(line 399,col 23)",
        "(line 400,col 9)-(line 400,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.isEqualKey(java.lang.Object, java.lang.Object)",
      "begin_line": 412,
      "end_line": 414,
      "comment": "\n     * Compares two keys, in internal converted form, to see if they are equal.\n     * This implementation uses the equals method and assumes neither key is null.\n     * Subclasses can override this to match differently.\n     *\n     * @param key1  the first key to compare passed in from outside\n     * @param key2  the second key extracted from the entry via \u003ccode\u003eentry.key\u003c/code\u003e\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.isEqualValue(java.lang.Object, java.lang.Object)",
      "begin_line": 425,
      "end_line": 427,
      "comment": "\n     * Compares two values, in external form, to see if they are equal.\n     * This implementation uses the equals method and assumes neither value is null.\n     * Subclasses can override this to match differently.\n     *\n     * @param value1  the first value to compare passed in from outside\n     * @param value2  the second value extracted from the entry via \u003ccode\u003egetValue()\u003c/code\u003e\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.hashIndex(int, int)",
      "begin_line": 438,
      "end_line": 440,
      "comment": "\n     * Gets the index into the data storage for the hashCode specified.\n     * This implementation uses the least significant bits of the hashCode.\n     * Subclasses can override this to return alternate bucketing.\n     *\n     * @param hashCode  the hash code to use\n     * @param dataSize  the size of the data to pick a bucket from\n     * @return the bucket index\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.getEntry(java.lang.Object)",
      "begin_line": 453,
      "end_line": 464,
      "comment": "\n     * Gets the entry mapped to the key specified.\n     * \u003cp\u003e\n     * This method exists for subclasses that may need to perform a multi-step\n     * process accessing the entry. The public methods in this class don\u0027t use this\n     * method to gain a small performance boost.\n     *\n     * @param key  the key\n     * @return the entry, null if no match\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 30)",
        "(line 455,col 9)-(line 455,col 39)",
        "(line 456,col 9)-(line 456,col 71)",
        "(line 457,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.updateEntry(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e, V)",
      "begin_line": 476,
      "end_line": 478,
      "comment": "\n     * Updates an existing key-value mapping to change the value.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003esetValue()\u003c/code\u003e on the entry.\n     * Subclasses could override to handle changes to the map.\n     *\n     * @param entry  the entry to update\n     * @param newValue  the new value to store\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.reuseEntry(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e, int, int, K, V)",
      "begin_line": 492,
      "end_line": 498,
      "comment": "\n     * Reuses an existing key-value mapping, storing completely new data.\n     * \u003cp\u003e\n     * This implementation sets all the data fields on the entry.\n     * Subclasses could populate additional entry fields.\n     *\n     * @param entry  the entry to update, not null\n     * @param hashIndex  the index in the data array\n     * @param hashCode  the hash code of the key to add\n     * @param key  the key to add\n     * @param value  the value to add\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 37)",
        "(line 495,col 9)-(line 495,col 34)",
        "(line 496,col 9)-(line 496,col 24)",
        "(line 497,col 9)-(line 497,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.addMapping(int, int, K, V)",
      "begin_line": 514,
      "end_line": 520,
      "comment": "\n     * Adds a new key-value mapping into this map.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003ecreateEntry()\u003c/code\u003e, \u003ccode\u003eaddEntry()\u003c/code\u003e\n     * and \u003ccode\u003echeckCapacity()\u003c/code\u003e.\n     * It also handles changes to \u003ccode\u003emodCount\u003c/code\u003e and \u003ccode\u003esize\u003c/code\u003e.\n     * Subclasses could override to fully control adds to the map.\n     *\n     * @param hashIndex  the index into the data array to store at\n     * @param hashCode  the hash code of the key to add\n     * @param key  the key to add\n     * @param value  the value to add\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 19)",
        "(line 516,col 9)-(line 516,col 89)",
        "(line 517,col 9)-(line 517,col 35)",
        "(line 518,col 9)-(line 518,col 15)",
        "(line 519,col 9)-(line 519,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.createEntry(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e, int, K, V)",
      "begin_line": 535,
      "end_line": 537,
      "comment": "\n     * Creates an entry to store the key-value data.\n     * \u003cp\u003e\n     * This implementation creates a new HashEntry instance.\n     * Subclasses can override this to return a different storage class,\n     * or implement caching.\n     *\n     * @param next  the next entry in sequence\n     * @param hashCode  the hash code to use\n     * @param key  the key to store\n     * @param value  the value to store\n     * @return the newly created entry\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.addEntry(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e, int)",
      "begin_line": 548,
      "end_line": 550,
      "comment": "\n     * Adds an entry into this map.\n     * \u003cp\u003e\n     * This implementation adds the entry to the data storage table.\n     * Subclasses could override to handle changes to the map.\n     *\n     * @param entry  the entry to add\n     * @param hashIndex  the index into the data array to store at\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.removeMapping(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e, int, org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e)",
      "begin_line": 564,
      "end_line": 569,
      "comment": "\n     * Removes a mapping from the map.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003eremoveEntry()\u003c/code\u003e and \u003ccode\u003edestroyEntry()\u003c/code\u003e.\n     * It also handles changes to \u003ccode\u003emodCount\u003c/code\u003e and \u003ccode\u003esize\u003c/code\u003e.\n     * Subclasses could override to fully control removals from the map.\n     *\n     * @param entry  the entry to remove\n     * @param hashIndex  the index into the data structure\n     * @param previous  the previous entry in the chain\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 19)",
        "(line 566,col 9)-(line 566,col 48)",
        "(line 567,col 9)-(line 567,col 15)",
        "(line 568,col 9)-(line 568,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.removeEntry(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e, int, org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e)",
      "begin_line": 582,
      "end_line": 588,
      "comment": "\n     * Removes an entry from the chain stored in a particular index.\n     * \u003cp\u003e\n     * This implementation removes the entry from the data storage table.\n     * The size is not updated.\n     * Subclasses could override to handle changes to the map.\n     *\n     * @param entry  the entry to remove\n     * @param hashIndex  the index into the data structure\n     * @param previous  the previous entry in the chain\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 587,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.destroyEntry(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e)",
      "begin_line": 598,
      "end_line": 602,
      "comment": "\n     * Kills an entry ready for the garbage collector.\n     * \u003cp\u003e\n     * This implementation prepares the HashEntry for garbage collection.\n     * Subclasses can override this to implement caching (override clear as well).\n     *\n     * @param entry  the entry to destroy\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 26)",
        "(line 600,col 9)-(line 600,col 25)",
        "(line 601,col 9)-(line 601,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.checkCapacity()",
      "begin_line": 610,
      "end_line": 617,
      "comment": "\n     * Checks the capacity of the map and enlarges it if necessary.\n     * \u003cp\u003e\n     * This implementation uses the threshold to check if the map needs enlarging\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 616,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.ensureCapacity(int)",
      "begin_line": 624,
      "end_line": 654,
      "comment": "\n     * Changes the size of the data structure to the capacity proposed.\n     *\n     * @param newCapacity  the new capacity of the array (a power of two, less or equal to max)\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 44)",
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 653,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.calculateNewCapacity(int)",
      "begin_line": 663,
      "end_line": 676,
      "comment": "\n     * Calculates the new capacity of the map.\n     * This implementation normalizes the capacity to a power of two.\n     *\n     * @param proposedCapacity  the proposed capacity\n     * @return the normalized new capacity\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 28)",
        "(line 665,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 675,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.calculateThreshold(int, float)",
      "begin_line": 686,
      "end_line": 688,
      "comment": "\n     * Calculates the new threshold of the map, where it will be resized.\n     * This implementation uses the load factor.\n     *\n     * @param newCapacity  the new capacity\n     * @param factor  the load factor\n     * @return the new resize threshold\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.entryNext(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e)",
      "begin_line": 700,
      "end_line": 702,
      "comment": "\n     * Gets the \u003ccode\u003enext\u003c/code\u003e field from a \u003ccode\u003eHashEntry\u003c/code\u003e.\n     * Used in subclasses that have no visibility of the field.\n     *\n     * @param entry  the entry to query, must not be null\n     * @return the \u003ccode\u003enext\u003c/code\u003e field of the entry\n     * @throws NullPointerException if the entry is null\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.entryHashCode(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e)",
      "begin_line": 713,
      "end_line": 715,
      "comment": "\n     * Gets the \u003ccode\u003ehashCode\u003c/code\u003e field from a \u003ccode\u003eHashEntry\u003c/code\u003e.\n     * Used in subclasses that have no visibility of the field.\n     *\n     * @param entry  the entry to query, must not be null\n     * @return the \u003ccode\u003ehashCode\u003c/code\u003e field of the entry\n     * @throws NullPointerException if the entry is null\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 714,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.entryKey(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e)",
      "begin_line": 726,
      "end_line": 728,
      "comment": "\n     * Gets the \u003ccode\u003ekey\u003c/code\u003e field from a \u003ccode\u003eHashEntry\u003c/code\u003e.\n     * Used in subclasses that have no visibility of the field.\n     *\n     * @param entry  the entry to query, must not be null\n     * @return the \u003ccode\u003ekey\u003c/code\u003e field of the entry\n     * @throws NullPointerException if the entry is null\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.entryValue(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e)",
      "begin_line": 739,
      "end_line": 741,
      "comment": "\n     * Gets the \u003ccode\u003evalue\u003c/code\u003e field from a \u003ccode\u003eHashEntry\u003c/code\u003e.\n     * Used in subclasses that have no visibility of the field.\n     *\n     * @param entry  the entry to query, must not be null\n     * @return the \u003ccode\u003evalue\u003c/code\u003e field of the entry\n     * @throws NullPointerException if the entry is null\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.mapIterator()",
      "begin_line": 755,
      "end_line": 760,
      "comment": "\n     * Gets an iterator over the map.\n     * Changes made to the iterator affect this map.\n     * \u003cp\u003e\n     * A MapIterator returns the keys in the map. It also provides convenient\n     * methods to get the key and value, and set the value.\n     * It avoids the need to create an entrySet/keySet/values object.\n     * It also avoids creating the Map.Entry object.\n     *\n     * @return the map iterator\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 758,col 9)",
        "(line 759,col 9)-(line 759,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HashMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractHashedMap.HashIterator\u003cK, V\u003e",
        "org.apache.commons.collections4.MapIterator\u003cK, V\u003e"
      ],
      "begin_line": 765,
      "end_line": 798,
      "comment": "\n     * MapIterator implementation.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashMapIterator.HashMapIterator(org.apache.commons.collections4.map.AbstractHashedMap\u003cK, V\u003e)",
      "begin_line": 767,
      "end_line": 769,
      "comment": "",
      "child_ranges": [
        "(line 768,col 13)-(line 768,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashMapIterator.next()",
      "begin_line": 771,
      "end_line": 773,
      "comment": "",
      "child_ranges": [
        "(line 772,col 13)-(line 772,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashMapIterator.getKey()",
      "begin_line": 775,
      "end_line": 781,
      "comment": "",
      "child_ranges": [
        "(line 776,col 13)-(line 776,col 59)",
        "(line 777,col 13)-(line 779,col 13)",
        "(line 780,col 13)-(line 780,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashMapIterator.getValue()",
      "begin_line": 783,
      "end_line": 789,
      "comment": "",
      "child_ranges": [
        "(line 784,col 13)-(line 784,col 59)",
        "(line 785,col 13)-(line 787,col 13)",
        "(line 788,col 13)-(line 788,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashMapIterator.setValue(V)",
      "begin_line": 791,
      "end_line": 797,
      "comment": "",
      "child_ranges": [
        "(line 792,col 13)-(line 792,col 59)",
        "(line 793,col 13)-(line 795,col 13)",
        "(line 796,col 13)-(line 796,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.entrySet()",
      "begin_line": 808,
      "end_line": 814,
      "comment": "\n     * Gets the entrySet view of the map.\n     * Changes made to the view affect this map.\n     * To simply iterate through the entries, use {@link #mapIterator()}.\n     *\n     * @return the entrySet view\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 812,col 9)",
        "(line 813,col 9)-(line 813,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.createEntrySetIterator()",
      "begin_line": 822,
      "end_line": 827,
      "comment": "\n     * Creates an entry set iterator.\n     * Subclasses can override this to return iterators with different properties.\n     *\n     * @return the entrySet iterator\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 825,col 9)",
        "(line 826,col 9)-(line 826,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 832,
      "end_line": 878,
      "comment": "\n     * EntrySet implementation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 834,
      "end_line": 834,
      "comment": " The parent map "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.EntrySet.EntrySet(org.apache.commons.collections4.map.AbstractHashedMap\u003cK, V\u003e)",
      "begin_line": 836,
      "end_line": 839,
      "comment": "",
      "child_ranges": [
        "(line 837,col 13)-(line 837,col 20)",
        "(line 838,col 13)-(line 838,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.EntrySet.size()",
      "begin_line": 841,
      "end_line": 844,
      "comment": "",
      "child_ranges": [
        "(line 843,col 13)-(line 843,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.EntrySet.clear()",
      "begin_line": 846,
      "end_line": 849,
      "comment": "",
      "child_ranges": [
        "(line 848,col 13)-(line 848,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.EntrySet.contains(java.lang.Object)",
      "begin_line": 851,
      "end_line": 859,
      "comment": "",
      "child_ranges": [
        "(line 853,col 13)-(line 857,col 13)",
        "(line 858,col 13)-(line 858,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.EntrySet.remove(java.lang.Object)",
      "begin_line": 861,
      "end_line": 872,
      "comment": "",
      "child_ranges": [
        "(line 863,col 13)-(line 865,col 13)",
        "(line 866,col 13)-(line 868,col 13)",
        "(line 869,col 13)-(line 869,col 64)",
        "(line 870,col 13)-(line 870,col 42)",
        "(line 871,col 13)-(line 871,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.EntrySet.iterator()",
      "begin_line": 874,
      "end_line": 877,
      "comment": "",
      "child_ranges": [
        "(line 876,col 13)-(line 876,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractHashedMap.HashIterator\u003cK, V\u003e",
        "java.util.Iterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 883,
      "end_line": 892,
      "comment": "\n     * EntrySet iterator.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.EntrySetIterator.EntrySetIterator(org.apache.commons.collections4.map.AbstractHashedMap\u003cK, V\u003e)",
      "begin_line": 885,
      "end_line": 887,
      "comment": "",
      "child_ranges": [
        "(line 886,col 13)-(line 886,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.EntrySetIterator.next()",
      "begin_line": 889,
      "end_line": 891,
      "comment": "",
      "child_ranges": [
        "(line 890,col 13)-(line 890,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.keySet()",
      "begin_line": 902,
      "end_line": 908,
      "comment": "\n     * Gets the keySet view of the map.\n     * Changes made to the view affect this map.\n     * To simply iterate through the keys, use {@link #mapIterator()}.\n     *\n     * @return the keySet view\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 906,col 9)",
        "(line 907,col 9)-(line 907,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.createKeySetIterator()",
      "begin_line": 916,
      "end_line": 921,
      "comment": "\n     * Creates a key set iterator.\n     * Subclasses can override this to return iterators with different properties.\n     *\n     * @return the keySet iterator\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 919,col 9)",
        "(line 920,col 9)-(line 920,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cK\u003e"
      ],
      "begin_line": 926,
      "end_line": 961,
      "comment": "\n     * KeySet implementation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 928,
      "end_line": 928,
      "comment": " The parent map "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.KeySet.KeySet(org.apache.commons.collections4.map.AbstractHashedMap\u003cK, ?\u003e)",
      "begin_line": 930,
      "end_line": 933,
      "comment": "",
      "child_ranges": [
        "(line 931,col 13)-(line 931,col 20)",
        "(line 932,col 13)-(line 932,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.KeySet.size()",
      "begin_line": 935,
      "end_line": 938,
      "comment": "",
      "child_ranges": [
        "(line 937,col 13)-(line 937,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.KeySet.clear()",
      "begin_line": 940,
      "end_line": 943,
      "comment": "",
      "child_ranges": [
        "(line 942,col 13)-(line 942,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.KeySet.contains(java.lang.Object)",
      "begin_line": 945,
      "end_line": 948,
      "comment": "",
      "child_ranges": [
        "(line 947,col 13)-(line 947,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.KeySet.remove(java.lang.Object)",
      "begin_line": 950,
      "end_line": 955,
      "comment": "",
      "child_ranges": [
        "(line 952,col 13)-(line 952,col 59)",
        "(line 953,col 13)-(line 953,col 31)",
        "(line 954,col 13)-(line 954,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.KeySet.iterator()",
      "begin_line": 957,
      "end_line": 960,
      "comment": "",
      "child_ranges": [
        "(line 959,col 13)-(line 959,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeySetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractHashedMap.HashIterator\u003cK, java.lang.Object\u003e",
        "java.util.Iterator\u003cK\u003e"
      ],
      "begin_line": 966,
      "end_line": 976,
      "comment": "\n     * KeySet iterator.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.KeySetIterator.KeySetIterator(org.apache.commons.collections4.map.AbstractHashedMap\u003cK, ?\u003e)",
      "begin_line": 968,
      "end_line": 971,
      "comment": "",
      "child_ranges": [
        "(line 970,col 13)-(line 970,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.KeySetIterator.next()",
      "begin_line": 973,
      "end_line": 975,
      "comment": "",
      "child_ranges": [
        "(line 974,col 13)-(line 974,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.values()",
      "begin_line": 986,
      "end_line": 992,
      "comment": "\n     * Gets the values view of the map.\n     * Changes made to the view affect this map.\n     * To simply iterate through the values, use {@link #mapIterator()}.\n     *\n     * @return the values view\n     ",
      "child_ranges": [
        "(line 988,col 9)-(line 990,col 9)",
        "(line 991,col 9)-(line 991,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.createValuesIterator()",
      "begin_line": 1000,
      "end_line": 1005,
      "comment": "\n     * Creates a values iterator.\n     * Subclasses can override this to return iterators with different properties.\n     *\n     * @return the values iterator\n     ",
      "child_ranges": [
        "(line 1001,col 9)-(line 1003,col 9)",
        "(line 1004,col 9)-(line 1004,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Values",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cV\u003e"
      ],
      "begin_line": 1010,
      "end_line": 1038,
      "comment": "\n     * Values implementation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 1012,
      "end_line": 1012,
      "comment": " The parent map "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.Values.Values(org.apache.commons.collections4.map.AbstractHashedMap\u003c?, V\u003e)",
      "begin_line": 1014,
      "end_line": 1017,
      "comment": "",
      "child_ranges": [
        "(line 1015,col 13)-(line 1015,col 20)",
        "(line 1016,col 13)-(line 1016,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.Values.size()",
      "begin_line": 1019,
      "end_line": 1022,
      "comment": "",
      "child_ranges": [
        "(line 1021,col 13)-(line 1021,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.Values.clear()",
      "begin_line": 1024,
      "end_line": 1027,
      "comment": "",
      "child_ranges": [
        "(line 1026,col 13)-(line 1026,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.Values.contains(java.lang.Object)",
      "begin_line": 1029,
      "end_line": 1032,
      "comment": "",
      "child_ranges": [
        "(line 1031,col 13)-(line 1031,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.Values.iterator()",
      "begin_line": 1034,
      "end_line": 1037,
      "comment": "",
      "child_ranges": [
        "(line 1036,col 13)-(line 1036,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuesIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractHashedMap.HashIterator\u003cjava.lang.Object, V\u003e",
        "java.util.Iterator\u003cV\u003e"
      ],
      "begin_line": 1043,
      "end_line": 1053,
      "comment": "\n     * Values iterator.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.ValuesIterator.ValuesIterator(org.apache.commons.collections4.map.AbstractHashedMap\u003c?, V\u003e)",
      "begin_line": 1045,
      "end_line": 1048,
      "comment": "",
      "child_ranges": [
        "(line 1047,col 13)-(line 1047,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.ValuesIterator.next()",
      "begin_line": 1050,
      "end_line": 1052,
      "comment": "",
      "child_ranges": [
        "(line 1051,col 13)-(line 1051,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HashEntry",
      "is_interface": false,
      "parent_types": [
        "java.util.Map.Entry\u003cK, V\u003e",
        "org.apache.commons.collections4.KeyValue\u003cK, V\u003e"
      ],
      "begin_line": 1064,
      "end_line": 1126,
      "comment": "\n     * HashEntry used to store the data.\n     * \u003cp\u003e\n     * If you subclass \u003ccode\u003eAbstractHashedMap\u003c/code\u003e but not \u003ccode\u003eHashEntry\u003c/code\u003e\n     * then you will not be able to access the protected fields.\n     * The \u003ccode\u003eentryXxx()\u003c/code\u003e methods on \u003ccode\u003eAbstractHashedMap\u003c/code\u003e exist\n     * to provide the necessary access.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 1066,
      "end_line": 1066,
      "comment": " The next entry in the hash chain "
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 1068,
      "end_line": 1068,
      "comment": " The hash code of the key "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 1070,
      "end_line": 1070,
      "comment": " The key "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 1072,
      "end_line": 1072,
      "comment": " The value "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashEntry.HashEntry(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e, int, java.lang.Object, V)",
      "begin_line": 1074,
      "end_line": 1080,
      "comment": "",
      "child_ranges": [
        "(line 1075,col 13)-(line 1075,col 20)",
        "(line 1076,col 13)-(line 1076,col 29)",
        "(line 1077,col 13)-(line 1077,col 37)",
        "(line 1078,col 13)-(line 1078,col 27)",
        "(line 1079,col 13)-(line 1079,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashEntry.getKey()",
      "begin_line": 1082,
      "end_line": 1088,
      "comment": "",
      "child_ranges": [
        "(line 1084,col 13)-(line 1086,col 13)",
        "(line 1087,col 13)-(line 1087,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashEntry.getValue()",
      "begin_line": 1090,
      "end_line": 1093,
      "comment": "",
      "child_ranges": [
        "(line 1092,col 13)-(line 1092,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashEntry.setValue(V)",
      "begin_line": 1095,
      "end_line": 1100,
      "comment": "",
      "child_ranges": [
        "(line 1097,col 13)-(line 1097,col 42)",
        "(line 1098,col 13)-(line 1098,col 31)",
        "(line 1099,col 13)-(line 1099,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashEntry.equals(java.lang.Object)",
      "begin_line": 1102,
      "end_line": 1114,
      "comment": "",
      "child_ranges": [
        "(line 1104,col 13)-(line 1106,col 13)",
        "(line 1107,col 13)-(line 1109,col 13)",
        "(line 1110,col 13)-(line 1110,col 64)",
        "(line 1111,col 13)-(line 1113,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashEntry.hashCode()",
      "begin_line": 1116,
      "end_line": 1120,
      "comment": "",
      "child_ranges": [
        "(line 1118,col 13)-(line 1119,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashEntry.toString()",
      "begin_line": 1122,
      "end_line": 1125,
      "comment": "",
      "child_ranges": [
        "(line 1124,col 13)-(line 1124,col 98)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HashIterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1131,
      "end_line": 1205,
      "comment": "\n     * Base Iterator\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 1134,
      "end_line": 1134,
      "comment": " The parent map "
    },
    {
      "type": "field",
      "varNames": [
        "hashIndex"
      ],
      "begin_line": 1136,
      "end_line": 1136,
      "comment": " The current index into the array of buckets "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 1138,
      "end_line": 1138,
      "comment": " The last returned entry "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 1140,
      "end_line": 1140,
      "comment": " The next entry "
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 1142,
      "end_line": 1142,
      "comment": " The modification count expected "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashIterator.HashIterator(org.apache.commons.collections4.map.AbstractHashedMap\u003cK, V\u003e)",
      "begin_line": 1144,
      "end_line": 1156,
      "comment": "",
      "child_ranges": [
        "(line 1145,col 13)-(line 1145,col 20)",
        "(line 1146,col 13)-(line 1146,col 33)",
        "(line 1147,col 13)-(line 1147,col 55)",
        "(line 1148,col 13)-(line 1148,col 32)",
        "(line 1149,col 13)-(line 1149,col 40)",
        "(line 1150,col 13)-(line 1152,col 13)",
        "(line 1153,col 13)-(line 1153,col 29)",
        "(line 1154,col 13)-(line 1154,col 31)",
        "(line 1155,col 13)-(line 1155,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashIterator.hasNext()",
      "begin_line": 1158,
      "end_line": 1160,
      "comment": "",
      "child_ranges": [
        "(line 1159,col 13)-(line 1159,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashIterator.nextEntry()",
      "begin_line": 1162,
      "end_line": 1180,
      "comment": "",
      "child_ranges": [
        "(line 1163,col 13)-(line 1165,col 13)",
        "(line 1166,col 13)-(line 1166,col 52)",
        "(line 1167,col 13)-(line 1169,col 13)",
        "(line 1170,col 13)-(line 1170,col 55)",
        "(line 1171,col 13)-(line 1171,col 30)",
        "(line 1172,col 13)-(line 1172,col 48)",
        "(line 1173,col 13)-(line 1175,col 13)",
        "(line 1176,col 13)-(line 1176,col 21)",
        "(line 1177,col 13)-(line 1177,col 26)",
        "(line 1178,col 13)-(line 1178,col 30)",
        "(line 1179,col 13)-(line 1179,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashIterator.currentEntry()",
      "begin_line": 1182,
      "end_line": 1184,
      "comment": "",
      "child_ranges": [
        "(line 1183,col 13)-(line 1183,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashIterator.remove()",
      "begin_line": 1186,
      "end_line": 1196,
      "comment": "",
      "child_ranges": [
        "(line 1187,col 13)-(line 1189,col 13)",
        "(line 1190,col 13)-(line 1192,col 13)",
        "(line 1193,col 13)-(line 1193,col 41)",
        "(line 1194,col 13)-(line 1194,col 24)",
        "(line 1195,col 13)-(line 1195,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.HashIterator.toString()",
      "begin_line": 1198,
      "end_line": 1204,
      "comment": "",
      "child_ranges": [
        "(line 1200,col 13)-(line 1202,col 13)",
        "(line 1203,col 13)-(line 1203,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.doWriteObject(java.io.ObjectOutputStream)",
      "begin_line": 1228,
      "end_line": 1236,
      "comment": "\n     * Writes the map data to the stream. This method must be overridden if a\n     * subclass must be setup before \u003ccode\u003eput()\u003c/code\u003e is used.\n     * \u003cp\u003e\n     * Serialization is not one of the JDK\u0027s nicest topics. Normal serialization will\n     * initialise the superclass before the subclass. Sometimes however, this isn\u0027t\n     * what you want, as in this case the \u003ccode\u003eput()\u003c/code\u003e method on read can be\n     * affected by subclass state.\n     * \u003cp\u003e\n     * The solution adopted here is to serialize the state data of this class in\n     * this protected method. This method must be called by the\n     * \u003ccode\u003ewriteObject()\u003c/code\u003e of the first serializable subclass.\n     * \u003cp\u003e\n     * Subclasses may override if they have a specific field that must be present\n     * on read before this implementation will work. Generally, the read determines\n     * what must be serialized here, if anything.\n     *\n     * @param out  the output stream\n     * @throws IOException if an error occurs while writing tothe stream\n     ",
      "child_ranges": [
        "(line 1229,col 9)-(line 1229,col 35)",
        "(line 1230,col 9)-(line 1230,col 34)",
        "(line 1231,col 9)-(line 1231,col 27)",
        "(line 1232,col 9)-(line 1235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.doReadObject(java.io.ObjectInputStream)",
      "begin_line": 1258,
      "end_line": 1271,
      "comment": "\n     * Reads the map data from the stream. This method must be overridden if a\n     * subclass must be setup before \u003ccode\u003eput()\u003c/code\u003e is used.\n     * \u003cp\u003e\n     * Serialization is not one of the JDK\u0027s nicest topics. Normal serialization will\n     * initialise the superclass before the subclass. Sometimes however, this isn\u0027t\n     * what you want, as in this case the \u003ccode\u003eput()\u003c/code\u003e method on read can be\n     * affected by subclass state.\n     * \u003cp\u003e\n     * The solution adopted here is to deserialize the state data of this class in\n     * this protected method. This method must be called by the\n     * \u003ccode\u003ereadObject()\u003c/code\u003e of the first serializable subclass.\n     * \u003cp\u003e\n     * Subclasses may override if the subclass has a specific field that must be present\n     * before \u003ccode\u003eput()\u003c/code\u003e or \u003ccode\u003ecalculateThreshold()\u003c/code\u003e will work correctly.\n     *\n     * @param in  the input stream\n     * @throws IOException if an error occurs while reading from the stream\n     * @throws ClassNotFoundException if an object read from the stream can not be loaded\n     ",
      "child_ranges": [
        "(line 1260,col 9)-(line 1260,col 36)",
        "(line 1261,col 9)-(line 1261,col 42)",
        "(line 1262,col 9)-(line 1262,col 38)",
        "(line 1263,col 9)-(line 1263,col 15)",
        "(line 1264,col 9)-(line 1264,col 61)",
        "(line 1265,col 9)-(line 1265,col 39)",
        "(line 1266,col 9)-(line 1270,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.clone()",
      "begin_line": 1283,
      "end_line": 1300,
      "comment": "\n     * Clones the map without cloning the keys or values.\n     * \u003cp\u003e\n     * To implement \u003ccode\u003eclone()\u003c/code\u003e, a subclass must implement the\n     * \u003ccode\u003eCloneable\u003c/code\u003e interface and make this method public.\n     *\n     * @return a shallow clone\n     * @throws InternalError if {@link AbstractMap#clone()} failed\n     ",
      "child_ranges": [
        "(line 1286,col 9)-(line 1299,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.equals(java.lang.Object)",
      "begin_line": 1308,
      "end_line": 1341,
      "comment": "\n     * Compares this map with another.\n     *\n     * @param obj  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 1310,col 9)-(line 1312,col 9)",
        "(line 1313,col 9)-(line 1315,col 9)",
        "(line 1316,col 9)-(line 1316,col 44)",
        "(line 1317,col 9)-(line 1319,col 9)",
        "(line 1320,col 9)-(line 1320,col 50)",
        "(line 1321,col 9)-(line 1339,col 9)",
        "(line 1340,col 9)-(line 1340,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.hashCode()",
      "begin_line": 1348,
      "end_line": 1356,
      "comment": "\n     * Gets the standard Map hashCode.\n     *\n     * @return the hash code defined in the Map interface\n     ",
      "child_ranges": [
        "(line 1350,col 9)-(line 1350,col 22)",
        "(line 1351,col 9)-(line 1351,col 70)",
        "(line 1352,col 9)-(line 1354,col 9)",
        "(line 1355,col 9)-(line 1355,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractHashedMap.toString()",
      "begin_line": 1363,
      "end_line": 1388,
      "comment": "\n     * Gets the map as a String.\n     *\n     * @return a string version of the map\n     ",
      "child_ranges": [
        "(line 1365,col 9)-(line 1367,col 9)",
        "(line 1368,col 9)-(line 1368,col 65)",
        "(line 1369,col 9)-(line 1369,col 24)",
        "(line 1371,col 9)-(line 1371,col 51)",
        "(line 1372,col 9)-(line 1372,col 39)",
        "(line 1373,col 9)-(line 1384,col 9)",
        "(line 1386,col 9)-(line 1386,col 24)",
        "(line 1387,col 9)-(line 1387,col 30)"
      ]
    }
  ]
}