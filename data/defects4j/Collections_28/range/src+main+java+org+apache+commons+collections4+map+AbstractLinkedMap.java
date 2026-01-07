{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/AbstractLinkedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLinkedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractHashedMap\u003cK, V\u003e",
        "org.apache.commons.collections4.OrderedMap\u003cK, V\u003e"
      ],
      "begin_line": 62,
      "end_line": 620,
      "comment": "\n * An abstract implementation of a hash-based map that links entries to create an\n * ordered map and which provides numerous points for subclasses to override.\n * \u003cp\u003e\n * This class implements all the features necessary for a subclass linked\n * hash-based map. Key-value entries are stored in instances of the\n * \u003ccode\u003eLinkEntry\u003c/code\u003e class which can be overridden and replaced.\n * The iterators can similarly be replaced, without the need to replace the KeySet,\n * EntrySet and Values view classes.\n * \u003cp\u003e\n * Overridable methods are provided to change the default hashing behaviour, and\n * to change how entries are added to and removed from the map. Hopefully, all you\n * need for unusual subclasses is here.\n * \u003cp\u003e\n * This implementation maintains order by original insertion, but subclasses\n * may work differently. The \u003ccode\u003eOrderedMap\u003c/code\u003e interface is implemented\n * to provide access to bidirectional iteration and extra convenience methods.\n * \u003cp\u003e\n * The \u003ccode\u003eorderedMapIterator()\u003c/code\u003e method provides direct access to a\n * bidirectional iterator. The iterators from the other views can also be cast\n * to \u003ccode\u003eOrderedIterator\u003c/code\u003e if required.\n * \u003cp\u003e\n * All the available iterators can be reset back to the start by casting to\n * \u003ccode\u003eResettableIterator\u003c/code\u003e and calling \u003ccode\u003ereset()\u003c/code\u003e.\n * \u003cp\u003e\n * The implementation is also designed to be subclassed, with lots of useful\n * methods exposed.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Header in the linked list "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.AbstractLinkedMap()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.AbstractLinkedMap(int, float, int)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Constructor which performs no validation on the passed in parameters.\n     *\n     * @param initialCapacity  the initial capacity, must be a power of two\n     * @param loadFactor  the load factor, must be \u003e 0.0f and generally \u003c 1.0f\n     * @param threshold  the threshold, must be sensible\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.AbstractLinkedMap(int)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Constructs a new, empty map with the specified initial capacity.\n     *\n     * @param initialCapacity  the initial capacity\n     * @throws IllegalArgumentException if the initial capacity is negative\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.AbstractLinkedMap(int, float)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Constructs a new, empty map with the specified initial capacity and\n     * load factor.\n     *\n     * @param initialCapacity  the initial capacity\n     * @param loadFactor  the load factor\n     * @throws IllegalArgumentException if the initial capacity is negative\n     * @throws IllegalArgumentException if the load factor is less than zero\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.AbstractLinkedMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Constructor copying elements from another map.\n     *\n     * @param map  the map to copy\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.init()",
      "begin_line": 125,
      "end_line": 129,
      "comment": "\n     * Initialise this subclass during construction.\n     * \u003cp\u003e\n     * NOTE: As from v3.2 this method calls\n     * {@link #createEntry(HashEntry, int, Object, Object)} to create\n     * the map entry object.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 51)",
        "(line 128,col 9)-(line 128,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.containsValue(java.lang.Object)",
      "begin_line": 138,
      "end_line": 155,
      "comment": "\n     * Checks whether the map contains the specified value.\n     *\n     * @param value  the value to search for\n     * @return true if the map contains the value\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.clear()",
      "begin_line": 161,
      "end_line": 166,
      "comment": "\n     * Clears the map, resetting the size to zero and nullifying references\n     * to avoid garbage collection issues.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 22)",
        "(line 165,col 9)-(line 165,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.firstKey()",
      "begin_line": 174,
      "end_line": 180,
      "comment": "\n     * Gets the first key in the map, which is the first inserted.\n     *\n     * @return the eldest key\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.lastKey()",
      "begin_line": 187,
      "end_line": 193,
      "comment": "\n     * Gets the last key in the map, which is the most recently inserted.\n     *\n     * @return the most recently inserted key\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.nextKey(java.lang.Object)",
      "begin_line": 201,
      "end_line": 205,
      "comment": "\n     * Gets the next key in sequence.\n     *\n     * @param key  the key to get after\n     * @return the next key\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 52)",
        "(line 204,col 9)-(line 204,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.getEntry(java.lang.Object)",
      "begin_line": 207,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.previousKey(java.lang.Object)",
      "begin_line": 218,
      "end_line": 222,
      "comment": "\n     * Gets the previous key in sequence.\n     *\n     * @param key  the key to get before\n     * @return the previous key\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 52)",
        "(line 221,col 9)-(line 221,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.getEntry(int)",
      "begin_line": 232,
      "end_line": 254,
      "comment": "\n     * Gets the key at the specified index.\n     *\n     * @param index  the index to retrieve\n     * @return the key at the specified index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 30)",
        "(line 240,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.addEntry(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e, int)",
      "begin_line": 265,
      "end_line": 273,
      "comment": "\n     * Adds an entry into this map, maintaining insertion order.\n     * \u003cp\u003e\n     * This implementation adds the entry to the data storage table and\n     * to the end of the linked list.\n     *\n     * @param entry  the entry to add\n     * @param hashIndex  the index into the data array to store at\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 61)",
        "(line 268,col 9)-(line 268,col 29)",
        "(line 269,col 9)-(line 269,col 36)",
        "(line 270,col 9)-(line 270,col 35)",
        "(line 271,col 9)-(line 271,col 29)",
        "(line 272,col 9)-(line 272,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.createEntry(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e, int, K, V)",
      "begin_line": 286,
      "end_line": 289,
      "comment": "\n     * Creates an entry to store the data.\n     * \u003cp\u003e\n     * This implementation creates a new LinkEntry instance.\n     *\n     * @param next  the next entry in sequence\n     * @param hashCode  the hash code to use\n     * @param key  the key to store\n     * @param value  the value to store\n     * @return the newly created entry\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.removeEntry(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e, int, org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e)",
      "begin_line": 301,
      "end_line": 309,
      "comment": "\n     * Removes an entry from the map and the linked list.\n     * \u003cp\u003e\n     * This implementation removes the entry from the linked list chain, then\n     * calls the superclass implementation.\n     *\n     * @param entry  the entry to remove\n     * @param hashIndex  the index into the data structure\n     * @param previous  the previous entry in the chain\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 61)",
        "(line 304,col 9)-(line 304,col 39)",
        "(line 305,col 9)-(line 305,col 40)",
        "(line 306,col 9)-(line 306,col 26)",
        "(line 307,col 9)-(line 307,col 27)",
        "(line 308,col 9)-(line 308,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.entryBefore(org.apache.commons.collections4.map.AbstractLinkedMap.LinkEntry\u003cK, V\u003e)",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n     * Gets the \u003ccode\u003ebefore\u003c/code\u003e field from a \u003ccode\u003eLinkEntry\u003c/code\u003e.\n     * Used in subclasses that have no visibility of the field.\n     *\n     * @param entry  the entry to query, must not be null\n     * @return the \u003ccode\u003ebefore\u003c/code\u003e field of the entry\n     * @throws NullPointerException if the entry is null\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.entryAfter(org.apache.commons.collections4.map.AbstractLinkedMap.LinkEntry\u003cK, V\u003e)",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * Gets the \u003ccode\u003eafter\u003c/code\u003e field from a \u003ccode\u003eLinkEntry\u003c/code\u003e.\n     * Used in subclasses that have no visibility of the field.\n     *\n     * @param entry  the entry to query, must not be null\n     * @return the \u003ccode\u003eafter\u003c/code\u003e field of the entry\n     * @throws NullPointerException if the entry is null\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.mapIterator()",
      "begin_line": 342,
      "end_line": 348,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinkMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractLinkedMap.LinkIterator\u003cK, V\u003e",
        "org.apache.commons.collections4.OrderedMapIterator\u003cK, V\u003e",
        "org.apache.commons.collections4.ResettableIterator\u003cK\u003e"
      ],
      "begin_line": 353,
      "end_line": 396,
      "comment": "\n     * MapIterator implementation.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.LinkMapIterator.LinkMapIterator(org.apache.commons.collections4.map.AbstractLinkedMap\u003cK, V\u003e)",
      "begin_line": 356,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 357,col 13)-(line 357,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.LinkMapIterator.next()",
      "begin_line": 360,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 362,col 13)-(line 362,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.LinkMapIterator.previous()",
      "begin_line": 365,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 367,col 13)-(line 367,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.LinkMapIterator.getKey()",
      "begin_line": 370,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 372,col 13)-(line 372,col 59)",
        "(line 373,col 13)-(line 375,col 13)",
        "(line 376,col 13)-(line 376,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.LinkMapIterator.getValue()",
      "begin_line": 379,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 381,col 13)-(line 381,col 59)",
        "(line 382,col 13)-(line 384,col 13)",
        "(line 385,col 13)-(line 385,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.LinkMapIterator.setValue(V)",
      "begin_line": 388,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 390,col 13)-(line 390,col 59)",
        "(line 391,col 13)-(line 393,col 13)",
        "(line 394,col 13)-(line 394,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.createEntrySetIterator()",
      "begin_line": 405,
      "end_line": 411,
      "comment": "\n     * Creates an entry set iterator.\n     * Subclasses can override this to return iterators with different properties.\n     *\n     * @return the entrySet iterator\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractLinkedMap.LinkIterator\u003cK, V\u003e",
        "org.apache.commons.collections4.OrderedIterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e",
        "org.apache.commons.collections4.ResettableIterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 416,
      "end_line": 432,
      "comment": "\n     * EntrySet iterator.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.EntrySetIterator.EntrySetIterator(org.apache.commons.collections4.map.AbstractLinkedMap\u003cK, V\u003e)",
      "begin_line": 419,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 420,col 13)-(line 420,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.EntrySetIterator.next()",
      "begin_line": 423,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 425,col 13)-(line 425,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.EntrySetIterator.previous()",
      "begin_line": 428,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 430,col 13)-(line 430,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.createKeySetIterator()",
      "begin_line": 441,
      "end_line": 447,
      "comment": "\n     * Creates a key set iterator.\n     * Subclasses can override this to return iterators with different properties.\n     *\n     * @return the keySet iterator\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 446,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeySetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractLinkedMap.LinkIterator\u003cK, java.lang.Object\u003e",
        "org.apache.commons.collections4.OrderedIterator\u003cK\u003e",
        "org.apache.commons.collections4.ResettableIterator\u003cK\u003e"
      ],
      "begin_line": 452,
      "end_line": 469,
      "comment": "\n     * KeySet iterator.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.KeySetIterator.KeySetIterator(org.apache.commons.collections4.map.AbstractLinkedMap\u003cK, ?\u003e)",
      "begin_line": 455,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 457,col 13)-(line 457,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.KeySetIterator.next()",
      "begin_line": 460,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 462,col 13)-(line 462,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.KeySetIterator.previous()",
      "begin_line": 465,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 467,col 13)-(line 467,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.createValuesIterator()",
      "begin_line": 478,
      "end_line": 484,
      "comment": "\n     * Creates a values iterator.\n     * Subclasses can override this to return iterators with different properties.\n     *\n     * @return the values iterator\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuesIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractLinkedMap.LinkIterator\u003cjava.lang.Object, V\u003e",
        "org.apache.commons.collections4.OrderedIterator\u003cV\u003e",
        "org.apache.commons.collections4.ResettableIterator\u003cV\u003e"
      ],
      "begin_line": 489,
      "end_line": 506,
      "comment": "\n     * Values iterator.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.ValuesIterator.ValuesIterator(org.apache.commons.collections4.map.AbstractLinkedMap\u003c?, V\u003e)",
      "begin_line": 492,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 494,col 13)-(line 494,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.ValuesIterator.next()",
      "begin_line": 497,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 499,col 13)-(line 499,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.ValuesIterator.previous()",
      "begin_line": 502,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 504,col 13)-(line 504,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinkEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e"
      ],
      "begin_line": 517,
      "end_line": 534,
      "comment": "\n     * LinkEntry that stores the data.\n     * \u003cp\u003e\n     * If you subclass \u003ccode\u003eAbstractLinkedMap\u003c/code\u003e but not \u003ccode\u003eLinkEntry\u003c/code\u003e\n     * then you will not be able to access the protected fields.\n     * The \u003ccode\u003eentryXxx()\u003c/code\u003e methods on \u003ccode\u003eAbstractLinkedMap\u003c/code\u003e exist\n     * to provide the necessary access.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "before"
      ],
      "begin_line": 519,
      "end_line": 519,
      "comment": " The entry before this one in the order "
    },
    {
      "type": "field",
      "varNames": [
        "after"
      ],
      "begin_line": 521,
      "end_line": 521,
      "comment": " The entry after this one in the order "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.LinkEntry.LinkEntry(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e, int, java.lang.Object, V)",
      "begin_line": 531,
      "end_line": 533,
      "comment": "\n         * Constructs a new entry.\n         *\n         * @param next  the next entry in the hash bucket sequence\n         * @param hashCode  the hash code\n         * @param key  the key\n         * @param value  the value\n         ",
      "child_ranges": [
        "(line 532,col 13)-(line 532,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinkIterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 539,
      "end_line": 618,
      "comment": "\n     * Base Iterator that iterates in link order.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 542,
      "end_line": 542,
      "comment": " The parent map "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 544,
      "end_line": 544,
      "comment": " The current (last returned) entry "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 546,
      "end_line": 546,
      "comment": " The next entry "
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 548,
      "end_line": 548,
      "comment": " The modification count expected "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.LinkIterator.LinkIterator(org.apache.commons.collections4.map.AbstractLinkedMap\u003cK, V\u003e)",
      "begin_line": 550,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 551,col 13)-(line 551,col 20)",
        "(line 552,col 13)-(line 552,col 33)",
        "(line 553,col 13)-(line 553,col 44)",
        "(line 554,col 13)-(line 554,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.LinkIterator.hasNext()",
      "begin_line": 557,
      "end_line": 559,
      "comment": "",
      "child_ranges": [
        "(line 558,col 13)-(line 558,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.LinkIterator.hasPrevious()",
      "begin_line": 561,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 562,col 13)-(line 562,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.LinkIterator.nextEntry()",
      "begin_line": 565,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 566,col 13)-(line 568,col 13)",
        "(line 569,col 13)-(line 571,col 13)",
        "(line 572,col 13)-(line 572,col 24)",
        "(line 573,col 13)-(line 573,col 30)",
        "(line 574,col 13)-(line 574,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.LinkIterator.previousEntry()",
      "begin_line": 577,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 578,col 13)-(line 580,col 13)",
        "(line 581,col 13)-(line 581,col 57)",
        "(line 582,col 13)-(line 584,col 13)",
        "(line 585,col 13)-(line 585,col 28)",
        "(line 586,col 13)-(line 586,col 28)",
        "(line 587,col 13)-(line 587,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.LinkIterator.currentEntry()",
      "begin_line": 590,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 591,col 13)-(line 591,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.LinkIterator.remove()",
      "begin_line": 594,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 595,col 13)-(line 597,col 13)",
        "(line 598,col 13)-(line 600,col 13)",
        "(line 601,col 13)-(line 601,col 41)",
        "(line 602,col 13)-(line 602,col 24)",
        "(line 603,col 13)-(line 603,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.LinkIterator.reset()",
      "begin_line": 606,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 607,col 13)-(line 607,col 24)",
        "(line 608,col 13)-(line 608,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractLinkedMap.LinkIterator.toString()",
      "begin_line": 611,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 613,col 13)-(line 615,col 13)",
        "(line 616,col 13)-(line 616,col 32)"
      ]
    }
  ]
}