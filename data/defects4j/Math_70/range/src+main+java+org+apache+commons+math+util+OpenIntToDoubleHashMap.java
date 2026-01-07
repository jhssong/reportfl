{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/util/OpenIntToDoubleHashMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenIntToDoubleHashMap",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 610,
      "comment": "\n * Open addressed map from int to double.\n * \u003cp\u003eThis class provides a dedicated map from integers to doubles with a\n * much smaller memory overhead than standard \u003ccode\u003ejava.util.Map\u003c/code\u003e.\u003c/p\u003e\n * \u003cp\u003eThis class is not synchronized. The specialized iterators returned by\n * {@link #iterator()} are fail-fast: they throw a\n * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map has been\n * modified during iteration.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "FREE"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Status indicator for free table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Status indicator for full table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "REMOVED"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Status indicator for removed table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "CONCURRENT_MODIFICATION_MESSAGE"
      ],
      "begin_line": 54,
      "end_line": 55,
      "comment": " Message for map modification during iteration. "
    },
    {
      "type": "field",
      "varNames": [
        "EXHAUSTED_ITERATOR_MESSAGE"
      ],
      "begin_line": 58,
      "end_line": 59,
      "comment": " Message for exhausted iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "LOAD_FACTOR"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Load factor for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXPECTED_SIZE"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Default starting size.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RESIZE_MULTIPLIER"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Multiplier for size growth when map fills up.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PERTURB_SHIFT"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Number of bits to perturb the index when probing for collision resolution. "
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Keys table. "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Values table. "
    },
    {
      "type": "field",
      "varNames": [
        "states"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " States table. "
    },
    {
      "type": "field",
      "varNames": [
        "missingEntries"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Return value for missing entries. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Current size of the map. "
    },
    {
      "type": "field",
      "varNames": [
        "mask"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Bit mask for hash values. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Modifications count. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Build an empty map with default size and using NaN for missing entries.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(double)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Build an empty map with default size\n     * @param missingEntries value to return when a missing entry is fetched\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(int)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Build an empty map with specified size and using NaN for missing entries.\n     * @param expectedSize expected number of elements in the map\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(int, double)",
      "begin_line": 126,
      "end_line": 134,
      "comment": "\n     * Build an empty map with specified size.\n     * @param expectedSize expected number of elements in the map\n     * @param missingEntries value to return when a missing entry is fetched\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 59)",
        "(line 129,col 9)-(line 129,col 35)",
        "(line 130,col 9)-(line 130,col 38)",
        "(line 131,col 9)-(line 131,col 36)",
        "(line 132,col 9)-(line 132,col 45)",
        "(line 133,col 9)-(line 133,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(org.apache.commons.math.util.OpenIntToDoubleHashMap)",
      "begin_line": 140,
      "end_line": 152,
      "comment": "\n     * Copy constructor.\n     * @param source map to copy\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 46)",
        "(line 142,col 9)-(line 142,col 31)",
        "(line 143,col 9)-(line 143,col 58)",
        "(line 144,col 9)-(line 144,col 36)",
        "(line 145,col 9)-(line 145,col 62)",
        "(line 146,col 9)-(line 146,col 34)",
        "(line 147,col 9)-(line 147,col 62)",
        "(line 148,col 9)-(line 148,col 47)",
        "(line 149,col 9)-(line 149,col 28)",
        "(line 150,col 9)-(line 150,col 28)",
        "(line 151,col 9)-(line 151,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.computeCapacity(int)",
      "begin_line": 159,
      "end_line": 169,
      "comment": "\n     * Compute the capacity needed for a given size.\n     * @param expectedSize expected size of the map\n     * @return capacity to use for the specified size\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 75)",
        "(line 164,col 9)-(line 164,col 63)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.nextPowerOfTwo(int)",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Find the smallest power of two greater than the input value\n     * @param i input value\n     * @return smallest power of two greater than the input value\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.get(int)",
      "begin_line": 185,
      "end_line": 208,
      "comment": "\n     * Get the stored value associated with the given key\n     * @param key key associated with the data\n     * @return data associated with the key\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 38)",
        "(line 188,col 9)-(line 188,col 32)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 22)",
        "(line 198,col 9)-(line 204,col 9)",
        "(line 206,col 9)-(line 206,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(int)",
      "begin_line": 215,
      "end_line": 238,
      "comment": "\n     * Check if a value is associated with a key.\n     * @param key key to check\n     * @return true if a value is associated with key\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 38)",
        "(line 218,col 9)-(line 218,col 32)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 227,col 9)-(line 227,col 22)",
        "(line 228,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 236,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.iterator()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * Get an iterator over map elements.\n     * \u003cp\u003eThe specialized iterators returned are fail-fast: they throw a\n     * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map\n     * has been modified during iteration.\u003c/p\u003e\n     * @return iterator over the map elements\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.perturb(int)",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * Perturb the hash for starting probing.\n     * @param hash initial hash\n     * @return perturbed hash\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(int)",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param key key to lookup\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(int[], byte[], int, int)",
      "begin_line": 277,
      "end_line": 324,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param keys keys table\n     * @param states states table\n     * @param key key to lookup\n     * @param mask bit mask for hash values\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 37)",
        "(line 280,col 9)-(line 280,col 32)",
        "(line 281,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 287,col 36)",
        "(line 288,col 9)-(line 288,col 22)",
        "(line 289,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 307,col 9)",
        "(line 309,col 9)-(line 309,col 39)",
        "(line 310,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.probe(int, int)",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * Compute next probe for collision resolution\n     * @param perturb perturbed hash\n     * @param j previous probe\n     * @return next probe\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.changeIndexSign(int)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * Change the index sign\n     * @param index initial index\n     * @return changed index\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.size()",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\n     * Get the number of elements stored in the map.\n     * @return number of elements stored in the map\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(int)",
      "begin_line": 359,
      "end_line": 382,
      "comment": "\n     * Remove the value associated with a key.\n     * @param key key to which the value is associated\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 38)",
        "(line 362,col 9)-(line 362,col 32)",
        "(line 363,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 371,col 9)-(line 371,col 22)",
        "(line 372,col 9)-(line 378,col 9)",
        "(line 380,col 9)-(line 380,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(int, int)",
      "begin_line": 391,
      "end_line": 393,
      "comment": "\n     * Check if the tables contain an element associated with specified key\n     * at specified index.\n     * @param key key to check\n     * @param index index to check\n     * @return true if an element is associated with key at index\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(int)",
      "begin_line": 400,
      "end_line": 408,
      "comment": "\n     * Remove an element at specified index.\n     * @param index index of the element to remove\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 26)",
        "(line 402,col 9)-(line 402,col 32)",
        "(line 403,col 9)-(line 403,col 46)",
        "(line 404,col 9)-(line 404,col 39)",
        "(line 405,col 9)-(line 405,col 15)",
        "(line 406,col 9)-(line 406,col 16)",
        "(line 407,col 9)-(line 407,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.put(int, double)",
      "begin_line": 416,
      "end_line": 437,
      "comment": "\n     * Put a value associated with a key in the map.\n     * @param key key to which value is associated\n     * @param value value to put in the map\n     * @return previous value associated with the key\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 44)",
        "(line 418,col 9)-(line 418,col 41)",
        "(line 419,col 9)-(line 419,col 34)",
        "(line 420,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 28)",
        "(line 426,col 9)-(line 426,col 29)",
        "(line 427,col 9)-(line 427,col 30)",
        "(line 428,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.growTable()",
      "begin_line": 442,
      "end_line": 469,
      "comment": "\n     * Grow the tables.\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 49)",
        "(line 445,col 9)-(line 445,col 40)",
        "(line 446,col 9)-(line 446,col 42)",
        "(line 447,col 9)-(line 447,col 42)",
        "(line 449,col 9)-(line 449,col 60)",
        "(line 450,col 9)-(line 450,col 49)",
        "(line 451,col 9)-(line 451,col 57)",
        "(line 452,col 9)-(line 452,col 53)",
        "(line 453,col 9)-(line 453,col 42)",
        "(line 454,col 9)-(line 462,col 9)",
        "(line 464,col 9)-(line 464,col 25)",
        "(line 465,col 9)-(line 465,col 25)",
        "(line 466,col 9)-(line 466,col 27)",
        "(line 467,col 9)-(line 467,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.shouldGrowTable()",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\n     * Check if tables should grow due to increased size.\n     * @return true if  tables should grow\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.hashOf(int)",
      "begin_line": 484,
      "end_line": 487,
      "comment": "\n     * Compute the hash value of a key\n     * @param key key to hash\n     * @return hash value of the key\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 58)",
        "(line 486,col 9)-(line 486,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Iterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 491,
      "end_line": 594,
      "comment": " Iterator class for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "referenceCount"
      ],
      "begin_line": 494,
      "end_line": 494,
      "comment": " Reference modification count. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 497,
      "end_line": 497,
      "comment": " Index of current element. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 500,
      "end_line": 500,
      "comment": " Index of next element. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.Iterator()",
      "begin_line": 505,
      "end_line": 518,
      "comment": "\n         * Simple constructor.\n         ",
      "child_ranges": [
        "(line 508,col 13)-(line 508,col 35)",
        "(line 511,col 13)-(line 511,col 22)",
        "(line 512,col 13)-(line 516,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.hasNext()",
      "begin_line": 524,
      "end_line": 526,
      "comment": "\n         * Check if there is a next element in the map.\n         * @return true if there is a next element\n         ",
      "child_ranges": [
        "(line 525,col 13)-(line 525,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.key()",
      "begin_line": 534,
      "end_line": 544,
      "comment": "\n         * Get the key of current entry.\n         * @return key of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 536,col 13)-(line 539,col 13)",
        "(line 540,col 13)-(line 542,col 13)",
        "(line 543,col 13)-(line 543,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.value()",
      "begin_line": 552,
      "end_line": 562,
      "comment": "\n         * Get the value of current entry.\n         * @return value of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 554,col 13)-(line 557,col 13)",
        "(line 558,col 13)-(line 560,col 13)",
        "(line 561,col 13)-(line 561,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.advance()",
      "begin_line": 569,
      "end_line": 592,
      "comment": "\n         * Advance iterator one step further.\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 572,col 13)-(line 575,col 13)",
        "(line 578,col 13)-(line 578,col 27)",
        "(line 581,col 13)-(line 590,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 603,
      "end_line": 607,
      "comment": "\n     * Read a serialized object.\n     * @param stream input stream\n     * @throws IOException if object cannot be read\n     * @throws ClassNotFoundException if the class corresponding\n     * to the serialized object cannot be found\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 35)",
        "(line 606,col 9)-(line 606,col 18)"
      ]
    }
  ]
}