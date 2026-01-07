{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/util/OpenIntToDoubleHashMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenIntToDoubleHashMap",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 599,
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
        "LOAD_FACTOR"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Load factor for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXPECTED_SIZE"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Default starting size.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RESIZE_MULTIPLIER"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Multiplier for size growth when map fills up.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PERTURB_SHIFT"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Number of bits to perturb the index when probing for collision resolution. "
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Keys table. "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Values table. "
    },
    {
      "type": "field",
      "varNames": [
        "states"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " States table. "
    },
    {
      "type": "field",
      "varNames": [
        "missingEntries"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Return value for missing entries. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Current size of the map. "
    },
    {
      "type": "field",
      "varNames": [
        "mask"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Bit mask for hash values. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Modifications count. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Build an empty map with default size and using NaN for missing entries.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(double)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Build an empty map with default size\n     * @param missingEntries value to return when a missing entry is fetched\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(int)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Build an empty map with specified size and using NaN for missing entries.\n     * @param expectedSize expected number of elements in the map\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(int, double)",
      "begin_line": 118,
      "end_line": 126,
      "comment": "\n     * Build an empty map with specified size.\n     * @param expectedSize expected number of elements in the map\n     * @param missingEntries value to return when a missing entry is fetched\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 59)",
        "(line 121,col 9)-(line 121,col 35)",
        "(line 122,col 9)-(line 122,col 38)",
        "(line 123,col 9)-(line 123,col 36)",
        "(line 124,col 9)-(line 124,col 45)",
        "(line 125,col 9)-(line 125,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(org.apache.commons.math.util.OpenIntToDoubleHashMap)",
      "begin_line": 132,
      "end_line": 144,
      "comment": "\n     * Copy constructor.\n     * @param source map to copy\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 46)",
        "(line 134,col 9)-(line 134,col 31)",
        "(line 135,col 9)-(line 135,col 58)",
        "(line 136,col 9)-(line 136,col 36)",
        "(line 137,col 9)-(line 137,col 62)",
        "(line 138,col 9)-(line 138,col 34)",
        "(line 139,col 9)-(line 139,col 62)",
        "(line 140,col 9)-(line 140,col 47)",
        "(line 141,col 9)-(line 141,col 28)",
        "(line 142,col 9)-(line 142,col 28)",
        "(line 143,col 9)-(line 143,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.computeCapacity(int)",
      "begin_line": 151,
      "end_line": 161,
      "comment": "\n     * Compute the capacity needed for a given size.\n     * @param expectedSize expected size of the map\n     * @return capacity to use for the specified size\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 75)",
        "(line 156,col 9)-(line 156,col 63)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.nextPowerOfTwo(int)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Find the smallest power of two greater than the input value\n     * @param i input value\n     * @return smallest power of two greater than the input value\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.get(int)",
      "begin_line": 177,
      "end_line": 200,
      "comment": "\n     * Get the stored value associated with the given key\n     * @param key key associated with the data\n     * @return data associated with the key\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 38)",
        "(line 180,col 9)-(line 180,col 32)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 189,col 22)",
        "(line 190,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(int)",
      "begin_line": 207,
      "end_line": 230,
      "comment": "\n     * Check if a value is associated with a key.\n     * @param key key to check\n     * @return true if a value is associated with key\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 38)",
        "(line 210,col 9)-(line 210,col 32)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 219,col 9)-(line 219,col 22)",
        "(line 220,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 228,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.iterator()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Get an iterator over map elements.\n     * \u003cp\u003eThe specialized iterators returned are fail-fast: they throw a\n     * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map\n     * has been modified during iteration.\u003c/p\u003e\n     * @return iterator over the map elements\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.perturb(int)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Perturb the hash for starting probing.\n     * @param hash initial hash\n     * @return perturbed hash\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(int)",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param key key to lookup\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(int[], byte[], int, int)",
      "begin_line": 269,
      "end_line": 316,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param keys keys table\n     * @param states states table\n     * @param key key to lookup\n     * @param mask bit mask for hash values\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 37)",
        "(line 272,col 9)-(line 272,col 32)",
        "(line 273,col 9)-(line 277,col 9)",
        "(line 279,col 9)-(line 279,col 36)",
        "(line 280,col 9)-(line 280,col 22)",
        "(line 281,col 9)-(line 291,col 9)",
        "(line 293,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 301,col 39)",
        "(line 302,col 9)-(line 314,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.probe(int, int)",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\n     * Compute next probe for collision resolution\n     * @param perturb perturbed hash\n     * @param j previous probe\n     * @return next probe\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.changeIndexSign(int)",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * Change the index sign\n     * @param index initial index\n     * @return changed index\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.size()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * Get the number of elements stored in the map.\n     * @return number of elements stored in the map\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(int)",
      "begin_line": 351,
      "end_line": 374,
      "comment": "\n     * Remove the value associated with a key.\n     * @param key key to which the value is associated\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 38)",
        "(line 354,col 9)-(line 354,col 32)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 363,col 9)-(line 363,col 22)",
        "(line 364,col 9)-(line 370,col 9)",
        "(line 372,col 9)-(line 372,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(int, int)",
      "begin_line": 383,
      "end_line": 385,
      "comment": "\n     * Check if the tables contain an element associated with specified key\n     * at specified index.\n     * @param key key to check\n     * @param index index to check\n     * @return true if an element is associated with key at index\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(int)",
      "begin_line": 392,
      "end_line": 400,
      "comment": "\n     * Remove an element at specified index.\n     * @param index index of the element to remove\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 26)",
        "(line 394,col 9)-(line 394,col 32)",
        "(line 395,col 9)-(line 395,col 46)",
        "(line 396,col 9)-(line 396,col 39)",
        "(line 397,col 9)-(line 397,col 15)",
        "(line 398,col 9)-(line 398,col 16)",
        "(line 399,col 9)-(line 399,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.put(int, double)",
      "begin_line": 408,
      "end_line": 429,
      "comment": "\n     * Put a value associated with a key in the map.\n     * @param key key to which value is associated\n     * @param value value to put in the map\n     * @return previous value associated with the key\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 44)",
        "(line 410,col 9)-(line 410,col 41)",
        "(line 411,col 9)-(line 411,col 34)",
        "(line 412,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 28)",
        "(line 418,col 9)-(line 418,col 29)",
        "(line 419,col 9)-(line 419,col 30)",
        "(line 420,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.growTable()",
      "begin_line": 434,
      "end_line": 461,
      "comment": "\n     * Grow the tables.\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 49)",
        "(line 437,col 9)-(line 437,col 40)",
        "(line 438,col 9)-(line 438,col 42)",
        "(line 439,col 9)-(line 439,col 42)",
        "(line 441,col 9)-(line 441,col 60)",
        "(line 442,col 9)-(line 442,col 49)",
        "(line 443,col 9)-(line 443,col 57)",
        "(line 444,col 9)-(line 444,col 53)",
        "(line 445,col 9)-(line 445,col 42)",
        "(line 446,col 9)-(line 454,col 9)",
        "(line 456,col 9)-(line 456,col 25)",
        "(line 457,col 9)-(line 457,col 25)",
        "(line 458,col 9)-(line 458,col 27)",
        "(line 459,col 9)-(line 459,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.shouldGrowTable()",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\n     * Check if tables should grow due to increased size.\n     * @return true if  tables should grow\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.hashOf(int)",
      "begin_line": 476,
      "end_line": 479,
      "comment": "\n     * Compute the hash value of a key\n     * @param key key to hash\n     * @return hash value of the key\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 58)",
        "(line 478,col 9)-(line 478,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Iterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 483,
      "end_line": 583,
      "comment": " Iterator class for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "referenceCount"
      ],
      "begin_line": 486,
      "end_line": 486,
      "comment": " Reference modification count. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 489,
      "end_line": 489,
      "comment": " Index of current element. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 492,
      "end_line": 492,
      "comment": " Index of next element. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.Iterator()",
      "begin_line": 497,
      "end_line": 510,
      "comment": "\n         * Simple constructor.\n         ",
      "child_ranges": [
        "(line 500,col 13)-(line 500,col 35)",
        "(line 503,col 13)-(line 503,col 22)",
        "(line 504,col 13)-(line 508,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.hasNext()",
      "begin_line": 516,
      "end_line": 518,
      "comment": "\n         * Check if there is a next element in the map.\n         * @return true if there is a next element\n         ",
      "child_ranges": [
        "(line 517,col 13)-(line 517,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.key()",
      "begin_line": 526,
      "end_line": 535,
      "comment": "\n         * Get the key of current entry.\n         * @return key of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 528,col 13)-(line 530,col 13)",
        "(line 531,col 13)-(line 533,col 13)",
        "(line 534,col 13)-(line 534,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.value()",
      "begin_line": 543,
      "end_line": 552,
      "comment": "\n         * Get the value of current entry.\n         * @return value of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 545,col 13)-(line 547,col 13)",
        "(line 548,col 13)-(line 550,col 13)",
        "(line 551,col 13)-(line 551,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.advance()",
      "begin_line": 559,
      "end_line": 581,
      "comment": "\n         * Advance iterator one step further.\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 562,col 13)-(line 564,col 13)",
        "(line 567,col 13)-(line 567,col 27)",
        "(line 570,col 13)-(line 579,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 592,
      "end_line": 596,
      "comment": "\n     * Read a serialized object.\n     * @param stream input stream\n     * @throws IOException if object cannot be read\n     * @throws ClassNotFoundException if the class corresponding\n     * to the serialized object cannot be found\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 35)",
        "(line 595,col 9)-(line 595,col 18)"
      ]
    }
  ]
}