{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/map/AbstractReferenceMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractReferenceMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractHashedMap\u003cK, V\u003e"
      ],
      "begin_line": 82,
      "end_line": 1058,
      "comment": "\n * An abstract implementation of a hash-based map that allows the entries to\n * be removed by the garbage collector.\n * \u003cp\u003e\n * This class implements all the features necessary for a subclass reference\n * hash-based map. Key-value entries are stored in instances of the\n * \u003ccode\u003eReferenceEntry\u003c/code\u003e class which can be overridden and replaced.\n * The iterators can similarly be replaced, without the need to replace the KeySet,\n * EntrySet and Values view classes.\n * \u003cp\u003e\n * Overridable methods are provided to change the default hashing behaviour, and\n * to change how entries are added to and removed from the map. Hopefully, all you\n * need for unusual subclasses is here.\n * \u003cp\u003e\n * When you construct an \u003ccode\u003eAbstractReferenceMap\u003c/code\u003e, you can specify what\n * kind of references are used to store the map\u0027s keys and values.\n * If non-hard references are used, then the garbage collector can remove\n * mappings if a key or value becomes unreachable, or if the JVM\u0027s memory is\n * running low. For information on how the different reference types behave,\n * see {@link Reference}.\n * \u003cp\u003e\n * Different types of references can be specified for keys and values.\n * The keys can be configured to be weak but the values hard,\n * in which case this class will behave like a\n * \u003ca href\u003d\"http://java.sun.com/j2se/1.4/docs/api/java/util/WeakHashMap.html\"\u003e\n * \u003ccode\u003eWeakHashMap\u003c/code\u003e\u003c/a\u003e. However, you can also specify hard keys and\n * weak values, or any other combination. The default constructor uses\n * hard keys and soft values, providing a memory-sensitive cache.\n * \u003cp\u003e\n * This {@link Map} implementation does \u003ci\u003enot\u003c/i\u003e allow null elements.\n * Attempting to add a null key or value to the map will raise a\n * \u003ccode\u003eNullPointerException\u003c/code\u003e.\n * \u003cp\u003e\n * All the available iterators can be reset back to the start by casting to\n * \u003ccode\u003eResettableIterator\u003c/code\u003e and calling \u003ccode\u003ereset()\u003c/code\u003e.\n * \u003cp\u003e\n * This implementation is not synchronized.\n * You can use {@link java.util.Collections#synchronizedMap} to\n * provide synchronized access to a \u003ccode\u003eReferenceMap\u003c/code\u003e.\n *\n * @see java.lang.ref.Reference\n * @since 3.1 (extracted from ReferenceMap in 3.0)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " value "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength.resolve(int)",
      "begin_line": 99,
      "end_line": 110,
      "comment": "\n         * Resolve enum from int.\n         * @param value  the int value\n         * @return ReferenceType\n         * @throws IllegalArgumentException if the specified value is invalid.\n         ",
      "child_ranges": [
        "(line 100,col 13)-(line 109,col 13)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength.ReferenceStrength(int)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 13)-(line 113,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "keyType"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * The reference type for keys.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "valueType"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * The reference type for values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "purgeValues"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * Should the value be automatically purged when the associated key has been collected?\n     "
    },
    {
      "type": "field",
      "varNames": [
        "queue"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * ReferenceQueue used to eliminate stale mappings.\n     * See purge.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.AbstractReferenceMap()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Constructor used during deserialization.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.AbstractReferenceMap(org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength, org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength, int, float, boolean)",
      "begin_line": 164,
      "end_line": 171,
      "comment": "\n     * Constructs a new empty map with the specified reference types,\n     * load factor and initial capacity.\n     *\n     * @param keyType  the type of reference to use for keys;\n     *   must be {@link ReferenceStrength#HARD HARD},\n     *   {@link ReferenceStrength#SOFT SOFT},\n     *   {@link ReferenceStrength#WEAK WEAK}\n     * @param valueType  the type of reference to use for values;\n     *   must be {@link ReferenceStrength#HARD},\n     *   {@link ReferenceStrength#SOFT SOFT},\n     *   {@link ReferenceStrength#WEAK WEAK}\n     * @param capacity  the initial capacity for the map\n     * @param loadFactor  the load factor for the map\n     * @param purgeValues  should the value be automatically purged when the\n     *   key is garbage collected\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 36)",
        "(line 168,col 9)-(line 168,col 31)",
        "(line 169,col 9)-(line 169,col 35)",
        "(line 170,col 9)-(line 170,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.init()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * Initialise this subclass during construction, cloning or deserialization.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.size()",
      "begin_line": 187,
      "end_line": 191,
      "comment": "\n     * Gets the size of the map.\n     *\n     * @return the size\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 26)",
        "(line 190,col 9)-(line 190,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.isEmpty()",
      "begin_line": 198,
      "end_line": 202,
      "comment": "\n     * Checks whether the map is currently empty.\n     *\n     * @return true if the map is currently size zero\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 26)",
        "(line 201,col 9)-(line 201,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.containsKey(java.lang.Object)",
      "begin_line": 210,
      "end_line": 218,
      "comment": "\n     * Checks whether the map contains the specified key.\n     *\n     * @param key  the key to search for\n     * @return true if the map contains the key\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 26)",
        "(line 213,col 9)-(line 213,col 48)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.containsValue(java.lang.Object)",
      "begin_line": 226,
      "end_line": 233,
      "comment": "\n     * Checks whether the map contains the specified value.\n     *\n     * @param value  the value to search for\n     * @return true if the map contains the value\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 26)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.get(java.lang.Object)",
      "begin_line": 241,
      "end_line": 249,
      "comment": "\n     * Gets the value mapped to the key specified.\n     *\n     * @param key  the key\n     * @return the mapped value, null if no match\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 26)",
        "(line 244,col 9)-(line 244,col 48)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.put(K, V)",
      "begin_line": 261,
      "end_line": 272,
      "comment": "\n     * Puts a key-value mapping into this map.\n     * Neither the key nor the value may be null.\n     *\n     * @param key  the key to add, must not be null\n     * @param value  the value to add, must not be null\n     * @return the value previously mapped to this key, null if none\n     * @throws NullPointerException if either the key or value is null\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 268,col 9)",
        "(line 270,col 9)-(line 270,col 27)",
        "(line 271,col 9)-(line 271,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.remove(java.lang.Object)",
      "begin_line": 280,
      "end_line": 287,
      "comment": "\n     * Removes the specified mapping from this map.\n     *\n     * @param key  the mapping to remove\n     * @return the value mapped to the removed key, null if key not in map\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 27)",
        "(line 286,col 9)-(line 286,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.clear()",
      "begin_line": 292,
      "end_line": 296,
      "comment": "\n     * Clears this map.\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 22)",
        "(line 295,col 9)-(line 295,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.mapIterator()",
      "begin_line": 305,
      "end_line": 308,
      "comment": "\n     * Gets a MapIterator over the reference map.\n     * The iterator only returns valid key/value pairs.\n     *\n     * @return a map iterator\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.entrySet()",
      "begin_line": 317,
      "end_line": 323,
      "comment": "\n     * Returns a set view of this map\u0027s entries.\n     * An iterator returned entry is valid until \u003ccode\u003enext()\u003c/code\u003e is called again.\n     * The \u003ccode\u003esetValue()\u003c/code\u003e method on the \u003ccode\u003etoArray\u003c/code\u003e entries has no effect.\n     *\n     * @return a set view of this map\u0027s entries\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.keySet()",
      "begin_line": 330,
      "end_line": 336,
      "comment": "\n     * Returns a set view of this map\u0027s keys.\n     *\n     * @return a set view of this map\u0027s keys\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.values()",
      "begin_line": 343,
      "end_line": 349,
      "comment": "\n     * Returns a collection view of this map\u0027s values.\n     *\n     * @return a set view of this map\u0027s values\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.purgeBeforeRead()",
      "begin_line": 357,
      "end_line": 359,
      "comment": "\n     * Purges stale mappings from this map before read operations.\n     * \u003cp\u003e\n     * This implementation calls {@link #purge()} to maintain a consistent state.\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.purgeBeforeWrite()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\n     * Purges stale mappings from this map before write operations.\n     * \u003cp\u003e\n     * This implementation calls {@link #purge()} to maintain a consistent state.\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.purge()",
      "begin_line": 378,
      "end_line": 384,
      "comment": "\n     * Purges stale mappings from this map.\n     * \u003cp\u003e\n     * Note that this method is not synchronized!  Special\n     * care must be taken if, for instance, you want stale\n     * mappings to be removed on a periodic basis by some\n     * background thread.\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 40)",
        "(line 380,col 9)-(line 383,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.purge(java.lang.ref.Reference\u003c?\u003e)",
      "begin_line": 391,
      "end_line": 413,
      "comment": "\n     * Purges the specified reference.\n     *\n     * @param ref  the reference to purge\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 40)",
        "(line 396,col 9)-(line 396,col 55)",
        "(line 397,col 9)-(line 397,col 40)",
        "(line 398,col 9)-(line 398,col 44)",
        "(line 399,col 9)-(line 411,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.getEntry(java.lang.Object)",
      "begin_line": 422,
      "end_line": 428,
      "comment": "\n     * Gets the entry mapped to the key specified.\n     *\n     * @param key  the key\n     * @return the entry, null if no match\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.hashEntry(java.lang.Object, java.lang.Object)",
      "begin_line": 438,
      "end_line": 441,
      "comment": "\n     * Gets the hash code for a MapEntry.\n     * Subclasses can override this, for example to use the identityHashCode.\n     *\n     * @param key  the key to get a hash code for, may be null\n     * @param value  the value to get a hash code for, may be null\n     * @return the hash code, as per the MapEntry specification\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 440,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.isEqualKey(java.lang.Object, java.lang.Object)",
      "begin_line": 453,
      "end_line": 458,
      "comment": "\n     * Compares two keys, in internal converted form, to see if they are equal.\n     * \u003cp\u003e\n     * This implementation converts the key from the entry to a real reference\n     * before comparison.\n     *\n     * @param key1  the first key to compare passed in from outside\n     * @param key2  the second key extracted from the entry via \u003ccode\u003eentry.key\u003c/code\u003e\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 86)",
        "(line 457,col 9)-(line 457,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.createEntry(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e, int, K, V)",
      "begin_line": 469,
      "end_line": 473,
      "comment": "\n     * Creates a ReferenceEntry instead of a HashEntry.\n     *\n     * @param next  the next entry in sequence\n     * @param hashCode  the hash code to use\n     * @param key  the key to store\n     * @param value  the value to store\n     * @return the newly created entry\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.createEntrySetIterator()",
      "begin_line": 480,
      "end_line": 483,
      "comment": "\n     * Creates an entry set iterator.\n     *\n     * @return the entrySet iterator\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.createKeySetIterator()",
      "begin_line": 490,
      "end_line": 493,
      "comment": "\n     * Creates an key set iterator.\n     *\n     * @return the keySet iterator\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.createValuesIterator()",
      "begin_line": 500,
      "end_line": 503,
      "comment": "\n     * Creates an values iterator.\n     *\n     * @return the values iterator\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReferenceEntrySet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractHashedMap.EntrySet\u003cK, V\u003e"
      ],
      "begin_line": 509,
      "end_line": 529,
      "comment": "\n     * EntrySet implementation.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntrySet.ReferenceEntrySet(org.apache.commons.collections4.map.AbstractHashedMap\u003cK, V\u003e)",
      "begin_line": 511,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 512,col 13)-(line 512,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntrySet.toArray()",
      "begin_line": 515,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 517,col 13)-(line 517,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntrySet.toArray(T[])",
      "begin_line": 520,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 523,col 13)-(line 523,col 91)",
        "(line 524,col 13)-(line 526,col 13)",
        "(line 527,col 13)-(line 527,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReferenceKeySet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractHashedMap.KeySet\u003cK\u003e"
      ],
      "begin_line": 535,
      "end_line": 555,
      "comment": "\n     * KeySet implementation.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceKeySet.ReferenceKeySet(org.apache.commons.collections4.map.AbstractHashedMap\u003cK, ?\u003e)",
      "begin_line": 537,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 538,col 13)-(line 538,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceKeySet.toArray()",
      "begin_line": 541,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 543,col 13)-(line 543,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceKeySet.toArray(T[])",
      "begin_line": 546,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 549,col 13)-(line 549,col 58)",
        "(line 550,col 13)-(line 552,col 13)",
        "(line 553,col 13)-(line 553,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReferenceValues",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractHashedMap.Values\u003cV\u003e"
      ],
      "begin_line": 561,
      "end_line": 581,
      "comment": "\n     * Values implementation.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceValues.ReferenceValues(org.apache.commons.collections4.map.AbstractHashedMap\u003c?, V\u003e)",
      "begin_line": 563,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 564,col 13)-(line 564,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceValues.toArray()",
      "begin_line": 567,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 569,col 13)-(line 569,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceValues.toArray(T[])",
      "begin_line": 572,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 575,col 13)-(line 575,col 58)",
        "(line 576,col 13)-(line 578,col 13)",
        "(line 579,col 13)-(line 579,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReferenceEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e"
      ],
      "begin_line": 592,
      "end_line": 750,
      "comment": "\n     * A MapEntry implementation for the map.\n     * \u003cp\u003e\n     * If getKey() or getValue() returns null, it means\n     * the mapping is stale and should be removed.\n     *\n     * @since 3.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 594,
      "end_line": 594,
      "comment": " The parent map "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntry.ReferenceEntry(org.apache.commons.collections4.map.AbstractReferenceMap\u003cK, V\u003e, org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e, int, K, V)",
      "begin_line": 605,
      "end_line": 611,
      "comment": "\n         * Creates a new entry object for the ReferenceMap.\n         *\n         * @param parent  the parent map\n         * @param next  the next entry in the hash bucket\n         * @param hashCode  the hash code of the key\n         * @param key  the key\n         * @param value  the value\n         ",
      "child_ranges": [
        "(line 607,col 13)-(line 607,col 46)",
        "(line 608,col 13)-(line 608,col 33)",
        "(line 609,col 13)-(line 609,col 66)",
        "(line 610,col 13)-(line 610,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntry.getKey()",
      "begin_line": 619,
      "end_line": 623,
      "comment": "\n         * Gets the key from the entry.\n         * This method dereferences weak and soft keys and thus may return null.\n         *\n         * @return the key, which may be null if it was garbage collected\n         ",
      "child_ranges": [
        "(line 622,col 13)-(line 622,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntry.getValue()",
      "begin_line": 631,
      "end_line": 635,
      "comment": "\n         * Gets the value from the entry.\n         * This method dereferences weak and soft value and thus may return null.\n         *\n         * @return the value, which may be null if it was garbage collected\n         ",
      "child_ranges": [
        "(line 634,col 13)-(line 634,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntry.setValue(V)",
      "begin_line": 643,
      "end_line": 652,
      "comment": "\n         * Sets the value of the entry.\n         *\n         * @param obj  the object to store\n         * @return the previous value\n         ",
      "child_ranges": [
        "(line 646,col 13)-(line 646,col 37)",
        "(line 647,col 13)-(line 649,col 13)",
        "(line 650,col 13)-(line 650,col 65)",
        "(line 651,col 13)-(line 651,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntry.equals(java.lang.Object)",
      "begin_line": 663,
      "end_line": 682,
      "comment": "\n         * Compares this map entry to another.\n         * \u003cp\u003e\n         * This implementation uses \u003ccode\u003eisEqualKey\u003c/code\u003e and\n         * \u003ccode\u003eisEqualValue\u003c/code\u003e on the main map for comparison.\n         *\n         * @param obj  the other map entry to compare to\n         * @return true if equal, false if not\n         ",
      "child_ranges": [
        "(line 665,col 13)-(line 667,col 13)",
        "(line 668,col 13)-(line 670,col 13)",
        "(line 672,col 13)-(line 672,col 63)",
        "(line 673,col 13)-(line 673,col 51)",
        "(line 674,col 13)-(line 674,col 55)",
        "(line 675,col 13)-(line 677,col 13)",
        "(line 680,col 13)-(line 681,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntry.hashCode()",
      "begin_line": 691,
      "end_line": 694,
      "comment": "\n         * Gets the hashcode of the entry using temporary hard references.\n         * \u003cp\u003e\n         * This implementation uses \u003ccode\u003ehashEntry\u003c/code\u003e on the main map.\n         *\n         * @return the hashcode of the entry\n         ",
      "child_ranges": [
        "(line 693,col 13)-(line 693,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntry.toReference(org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength, T, int)",
      "begin_line": 708,
      "end_line": 719,
      "comment": "\n         * Constructs a reference of the given type to the given referent.\n         * The reference is registered with the queue for later purging.\n         *\n         * @param \u003cT\u003e the type of the referenced object\n         * @param type  HARD, SOFT or WEAK\n         * @param referent  the object to refer to\n         * @param hash  the hash code of the \u003ci\u003ekey\u003c/i\u003e of the mapping;\n         *    this number might be different from referent.hashCode() if\n         *    the referent represents a value and not a key\n         * @return the reference to the object\n         ",
      "child_ranges": [
        "(line 709,col 13)-(line 711,col 13)",
        "(line 712,col 13)-(line 714,col 13)",
        "(line 715,col 13)-(line 717,col 13)",
        "(line 718,col 13)-(line 718,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntry.purge(java.lang.ref.Reference\u003c?\u003e)",
      "begin_line": 726,
      "end_line": 740,
      "comment": "\n         * Purges the specified reference\n         * @param ref  the reference to purge\n         * @return true or false\n         ",
      "child_ranges": [
        "(line 727,col 13)-(line 727,col 79)",
        "(line 728,col 13)-(line 728,col 80)",
        "(line 729,col 13)-(line 738,col 13)",
        "(line 739,col 13)-(line 739,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntry.next()",
      "begin_line": 747,
      "end_line": 749,
      "comment": "\n         * Gets the next entry in the bucket.\n         *\n         * @return the next entry in the bucket\n         ",
      "child_ranges": [
        "(line 748,col 13)-(line 748,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReferenceBaseIterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 756,
      "end_line": 847,
      "comment": "\n     * Base iterator class.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 758,
      "end_line": 758,
      "comment": " The parent map "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 761,
      "end_line": 761,
      "comment": " These fields keep track of where we are in the table."
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 762,
      "end_line": 762,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previous"
      ],
      "begin_line": 763,
      "end_line": 763,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentKey",
        "nextKey"
      ],
      "begin_line": 768,
      "end_line": 768,
      "comment": " returns true, next() will actually return a valid element."
    },
    {
      "type": "field",
      "varNames": [
        "currentValue",
        "nextValue"
      ],
      "begin_line": 769,
      "end_line": 769,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 771,
      "end_line": 771,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceBaseIterator.ReferenceBaseIterator(org.apache.commons.collections4.map.AbstractReferenceMap\u003cK, V\u003e)",
      "begin_line": 773,
      "end_line": 780,
      "comment": "",
      "child_ranges": [
        "(line 774,col 13)-(line 774,col 20)",
        "(line 775,col 13)-(line 775,col 33)",
        "(line 776,col 13)-(line 776,col 64)",
        "(line 779,col 13)-(line 779,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceBaseIterator.hasNext()",
      "begin_line": 782,
      "end_line": 805,
      "comment": "",
      "child_ranges": [
        "(line 783,col 13)-(line 783,col 23)",
        "(line 784,col 13)-(line 803,col 13)",
        "(line 804,col 13)-(line 804,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceBaseIterator.checkMod()",
      "begin_line": 807,
      "end_line": 811,
      "comment": "",
      "child_ranges": [
        "(line 808,col 13)-(line 810,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceBaseIterator.nextNull()",
      "begin_line": 813,
      "end_line": 815,
      "comment": "",
      "child_ranges": [
        "(line 814,col 13)-(line 814,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceBaseIterator.nextEntry()",
      "begin_line": 817,
      "end_line": 829,
      "comment": "",
      "child_ranges": [
        "(line 818,col 13)-(line 818,col 23)",
        "(line 819,col 13)-(line 821,col 13)",
        "(line 822,col 13)-(line 822,col 29)",
        "(line 823,col 13)-(line 823,col 33)",
        "(line 824,col 13)-(line 824,col 33)",
        "(line 825,col 13)-(line 825,col 37)",
        "(line 826,col 13)-(line 826,col 27)",
        "(line 827,col 13)-(line 827,col 29)",
        "(line 828,col 13)-(line 828,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceBaseIterator.currentEntry()",
      "begin_line": 831,
      "end_line": 834,
      "comment": "",
      "child_ranges": [
        "(line 832,col 13)-(line 832,col 23)",
        "(line 833,col 13)-(line 833,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceBaseIterator.remove()",
      "begin_line": 836,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 837,col 13)-(line 837,col 23)",
        "(line 838,col 13)-(line 840,col 13)",
        "(line 841,col 13)-(line 841,col 38)",
        "(line 842,col 13)-(line 842,col 28)",
        "(line 843,col 13)-(line 843,col 30)",
        "(line 844,col 13)-(line 844,col 32)",
        "(line 845,col 13)-(line 845,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReferenceEntrySetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceBaseIterator\u003cK, V\u003e",
        "java.util.Iterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 852,
      "end_line": 863,
      "comment": "\n     * The EntrySet iterator.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntrySetIterator.ReferenceEntrySetIterator(org.apache.commons.collections4.map.AbstractReferenceMap\u003cK, V\u003e)",
      "begin_line": 855,
      "end_line": 857,
      "comment": "",
      "child_ranges": [
        "(line 856,col 13)-(line 856,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntrySetIterator.next()",
      "begin_line": 859,
      "end_line": 861,
      "comment": "",
      "child_ranges": [
        "(line 860,col 13)-(line 860,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReferenceKeySetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceBaseIterator\u003cK, java.lang.Object\u003e",
        "java.util.Iterator\u003cK\u003e"
      ],
      "begin_line": 868,
      "end_line": 878,
      "comment": "\n     * The keySet iterator.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceKeySetIterator.ReferenceKeySetIterator(org.apache.commons.collections4.map.AbstractReferenceMap\u003cK, ?\u003e)",
      "begin_line": 870,
      "end_line": 873,
      "comment": "",
      "child_ranges": [
        "(line 872,col 13)-(line 872,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceKeySetIterator.next()",
      "begin_line": 875,
      "end_line": 877,
      "comment": "",
      "child_ranges": [
        "(line 876,col 13)-(line 876,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReferenceValuesIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceBaseIterator\u003cjava.lang.Object, V\u003e",
        "java.util.Iterator\u003cV\u003e"
      ],
      "begin_line": 883,
      "end_line": 893,
      "comment": "\n     * The values iterator.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceValuesIterator.ReferenceValuesIterator(org.apache.commons.collections4.map.AbstractReferenceMap\u003c?, V\u003e)",
      "begin_line": 885,
      "end_line": 888,
      "comment": "",
      "child_ranges": [
        "(line 887,col 13)-(line 887,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceValuesIterator.next()",
      "begin_line": 890,
      "end_line": 892,
      "comment": "",
      "child_ranges": [
        "(line 891,col 13)-(line 891,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReferenceMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceBaseIterator\u003cK, V\u003e",
        "org.apache.commons.collections4.MapIterator\u003cK, V\u003e"
      ],
      "begin_line": 898,
      "end_line": 931,
      "comment": "\n     * The MapIterator implementation.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceMapIterator.ReferenceMapIterator(org.apache.commons.collections4.map.AbstractReferenceMap\u003cK, V\u003e)",
      "begin_line": 900,
      "end_line": 902,
      "comment": "",
      "child_ranges": [
        "(line 901,col 13)-(line 901,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceMapIterator.next()",
      "begin_line": 904,
      "end_line": 906,
      "comment": "",
      "child_ranges": [
        "(line 905,col 13)-(line 905,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceMapIterator.getKey()",
      "begin_line": 908,
      "end_line": 914,
      "comment": "",
      "child_ranges": [
        "(line 909,col 13)-(line 909,col 59)",
        "(line 910,col 13)-(line 912,col 13)",
        "(line 913,col 13)-(line 913,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceMapIterator.getValue()",
      "begin_line": 916,
      "end_line": 922,
      "comment": "",
      "child_ranges": [
        "(line 917,col 13)-(line 917,col 59)",
        "(line 918,col 13)-(line 920,col 13)",
        "(line 921,col 13)-(line 921,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceMapIterator.setValue(V)",
      "begin_line": 924,
      "end_line": 930,
      "comment": "",
      "child_ranges": [
        "(line 925,col 13)-(line 925,col 59)",
        "(line 926,col 13)-(line 928,col 13)",
        "(line 929,col 13)-(line 929,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SoftRef",
      "is_interface": false,
      "parent_types": [
        "java.lang.ref.SoftReference\u003cT\u003e"
      ],
      "begin_line": 941,
      "end_line": 954,
      "comment": "\n     * A soft reference holder.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hash"
      ],
      "begin_line": 943,
      "end_line": 943,
      "comment": " the hashCode of the key (even if the reference points to a value) "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.SoftRef.SoftRef(int, T, java.lang.ref.ReferenceQueue\u003c? super T\u003e)",
      "begin_line": 945,
      "end_line": 948,
      "comment": "",
      "child_ranges": [
        "(line 946,col 13)-(line 946,col 24)",
        "(line 947,col 13)-(line 947,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.SoftRef.hashCode()",
      "begin_line": 950,
      "end_line": 953,
      "comment": "",
      "child_ranges": [
        "(line 952,col 13)-(line 952,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WeakRef",
      "is_interface": false,
      "parent_types": [
        "java.lang.ref.WeakReference\u003cT\u003e"
      ],
      "begin_line": 959,
      "end_line": 972,
      "comment": "\n     * A weak reference holder.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hash"
      ],
      "begin_line": 961,
      "end_line": 961,
      "comment": " the hashCode of the key (even if the reference points to a value) "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.WeakRef.WeakRef(int, T, java.lang.ref.ReferenceQueue\u003c? super T\u003e)",
      "begin_line": 963,
      "end_line": 966,
      "comment": "",
      "child_ranges": [
        "(line 964,col 13)-(line 964,col 24)",
        "(line 965,col 13)-(line 965,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.WeakRef.hashCode()",
      "begin_line": 968,
      "end_line": 971,
      "comment": "",
      "child_ranges": [
        "(line 970,col 13)-(line 970,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.doWriteObject(java.io.ObjectOutputStream)",
      "begin_line": 994,
      "end_line": 1007,
      "comment": "\n     * Replaces the superclass method to store the state of this class.\n     * \u003cp\u003e\n     * Serialization is not one of the JDK\u0027s nicest topics. Normal serialization will\n     * initialise the superclass before the subclass. Sometimes however, this isn\u0027t\n     * what you want, as in this case the \u003ccode\u003eput()\u003c/code\u003e method on read can be\n     * affected by subclass state.\n     * \u003cp\u003e\n     * The solution adopted here is to serialize the state data of this class in\n     * this protected method. This method must be called by the\n     * \u003ccode\u003ewriteObject()\u003c/code\u003e of the first serializable subclass.\n     * \u003cp\u003e\n     * Subclasses may override if they have a specific field that must be present\n     * on read before this implementation will work. Generally, the read determines\n     * what must be serialized here, if anything.\n     *\n     * @param out  the output stream\n     * @throws IOException if an error occurs while writing to the stream\n     ",
      "child_ranges": [
        "(line 996,col 9)-(line 996,col 36)",
        "(line 997,col 9)-(line 997,col 38)",
        "(line 998,col 9)-(line 998,col 38)",
        "(line 999,col 9)-(line 999,col 35)",
        "(line 1000,col 9)-(line 1000,col 34)",
        "(line 1001,col 9)-(line 1004,col 9)",
        "(line 1005,col 9)-(line 1005,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.doReadObject(java.io.ObjectInputStream)",
      "begin_line": 1028,
      "end_line": 1048,
      "comment": "\n     * Replaces the superclass method to read the state of this class.\n     * \u003cp\u003e\n     * Serialization is not one of the JDK\u0027s nicest topics. Normal serialization will\n     * initialise the superclass before the subclass. Sometimes however, this isn\u0027t\n     * what you want, as in this case the \u003ccode\u003eput()\u003c/code\u003e method on read can be\n     * affected by subclass state.\n     * \u003cp\u003e\n     * The solution adopted here is to deserialize the state data of this class in\n     * this protected method. This method must be called by the\n     * \u003ccode\u003ereadObject()\u003c/code\u003e of the first serializable subclass.\n     * \u003cp\u003e\n     * Subclasses may override if the subclass has a specific field that must be present\n     * before \u003ccode\u003eput()\u003c/code\u003e or \u003ccode\u003ecalculateThreshold()\u003c/code\u003e will work correctly.\n     *\n     * @param in  the input stream\n     * @throws IOException if an error occurs while reading from the stream\n     * @throws ClassNotFoundException if an object read from the stream can not be loaded\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1031,col 63)",
        "(line 1032,col 9)-(line 1032,col 65)",
        "(line 1033,col 9)-(line 1033,col 44)",
        "(line 1034,col 9)-(line 1034,col 41)",
        "(line 1035,col 9)-(line 1035,col 42)",
        "(line 1036,col 9)-(line 1036,col 15)",
        "(line 1037,col 9)-(line 1037,col 39)",
        "(line 1038,col 9)-(line 1045,col 9)",
        "(line 1046,col 9)-(line 1046,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractReferenceMap.isKeyType(org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength)",
      "begin_line": 1055,
      "end_line": 1057,
      "comment": "\n     * Provided protected read-only access to the key type.\n     * @param type the type to check against.\n     * @return true if keyType has the specified type\n     ",
      "child_ranges": [
        "(line 1056,col 9)-(line 1056,col 36)"
      ]
    }
  ]
}