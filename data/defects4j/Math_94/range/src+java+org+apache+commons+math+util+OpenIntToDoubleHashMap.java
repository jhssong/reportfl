{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/util/OpenIntToDoubleHashMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenIntToDoubleHashMap",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 582,
      "comment": "\n * Open addressed map from int to double.\n * \u003cp\u003eThis class provides a dedicated map from integers to doubles with a\n * much smaller memory overhead than standard \u003ccode\u003ejava.util.Map\u003c/code\u003e.\u003c/p\u003e\n * \u003cp\u003eThis class is not synchronized. The specialized iterators returned by\n * {@link #iterator()} are fail-fast: they throw a\n * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map has been\n * modified during iteration.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "LOAD_FACTOR"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Load factor for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXPECTED_SIZE"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Default starting size.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RESIZE_MULTIPLIER"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Multiplier for size growth when map fills up.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PERTURB_SHIFT"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Number of bits to perturb the index when probing for collision resolution. "
    },
    {
      "type": "field",
      "varNames": [
        "FREE"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Status indicator for free table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Status indicator for full table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "REMOVED"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Status indicator for removed table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Keys table. "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Values table. "
    },
    {
      "type": "field",
      "varNames": [
        "states"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " States table. "
    },
    {
      "type": "field",
      "varNames": [
        "missingEntries"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Return value for missing entries. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Current size of the map. "
    },
    {
      "type": "field",
      "varNames": [
        "mask"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Bit mask for hash values. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Modifications count. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Build an empty map with default size and using NaN for missing entries.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(double)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Build an empty map with default size\n     * @param missingEntries value to return when a missing entry is fetched\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(int)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Build an empty map with specified size and using NaN for missing entries.\n     * @param expectedSize expected number of elements in the map\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(int, double)",
      "begin_line": 116,
      "end_line": 124,
      "comment": "\n     * Build an empty map with specified size.\n     * @param expectedSize expected number of elements in the map\n     * @param missingEntries value to return when a missing entry is fetched\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 59)",
        "(line 119,col 9)-(line 119,col 35)",
        "(line 120,col 9)-(line 120,col 38)",
        "(line 121,col 9)-(line 121,col 36)",
        "(line 122,col 9)-(line 122,col 45)",
        "(line 123,col 9)-(line 123,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(org.apache.commons.math.util.OpenIntToDoubleHashMap)",
      "begin_line": 130,
      "end_line": 142,
      "comment": "\n     * Copy constructor.\n     * @param source map to copy\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 46)",
        "(line 132,col 9)-(line 132,col 31)",
        "(line 133,col 9)-(line 133,col 58)",
        "(line 134,col 9)-(line 134,col 36)",
        "(line 135,col 9)-(line 135,col 62)",
        "(line 136,col 9)-(line 136,col 34)",
        "(line 137,col 9)-(line 137,col 62)",
        "(line 138,col 9)-(line 138,col 47)",
        "(line 139,col 9)-(line 139,col 28)",
        "(line 140,col 9)-(line 140,col 28)",
        "(line 141,col 9)-(line 141,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.computeCapacity(int)",
      "begin_line": 149,
      "end_line": 159,
      "comment": "\n     * Compute the capacity needed for a given size.\n     * @param expectedSize expected size of the map\n     * @return capacity to use for the specified size\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 75)",
        "(line 154,col 9)-(line 154,col 63)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.nextPowerOfTwo(int)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Find the smallest power of two greater than the input value\n     * @param i input value\n     * @return smallest power of two greater than the input value\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.get(int)",
      "begin_line": 175,
      "end_line": 197,
      "comment": "\n     * Get the stored value associated with the given key\n     * @param key key associated with the data\n     * @return data associated with the key\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 38)",
        "(line 178,col 9)-(line 178,col 32)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(int)",
      "begin_line": 204,
      "end_line": 226,
      "comment": "\n     * Check if a value is associated with a key.\n     * @param key key to check\n     * @return true if a value is associated with key\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 38)",
        "(line 207,col 9)-(line 207,col 32)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 224,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.iterator()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * Get an iterator over map elements.\n     * \u003cp\u003eThe specialized iterators returned are fail-fast: they throw a\n     * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map\n     * has been modified during iteration.\u003c/p\u003e\n     * @return iterator over the map elements\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.perturb(int)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Perturb the hash for starting probing.\n     * @param hash initial hash\n     * @return perturbed hash\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(int)",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param key key to lookup\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(int[], byte[], int, int)",
      "begin_line": 265,
      "end_line": 312,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param keys keys table\n     * @param states states table\n     * @param key key to lookup\n     * @param mask bit mask for hash values\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 37)",
        "(line 268,col 9)-(line 268,col 32)",
        "(line 269,col 9)-(line 273,col 9)",
        "(line 275,col 9)-(line 275,col 36)",
        "(line 276,col 9)-(line 276,col 22)",
        "(line 277,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 297,col 39)",
        "(line 298,col 9)-(line 310,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.probe(int, int)",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * Compute next probe for collision resolution\n     * @param perturb perturbed hash\n     * @param j previous probe\n     * @return next probe\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.changeIndexSign(int)",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n     * Change the index sign\n     * @param index initial index\n     * @return changed index\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.size()",
      "begin_line": 337,
      "end_line": 339,
      "comment": "\n     * Get the number of elements stored in the map.\n     * @return number of elements stored in the map\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(int)",
      "begin_line": 346,
      "end_line": 368,
      "comment": "\n     * Remove the value associated with a key.\n     * @param key key to which the value is associated\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 38)",
        "(line 349,col 9)-(line 349,col 32)",
        "(line 350,col 9)-(line 352,col 9)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 358,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 366,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(int, int)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\n     * Check if the tables contain an element associated with specified key\n     * at specified index.\n     * @param key key to check\n     * @param index index to check\n     * @return true if an element is associated with key at index\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(int)",
      "begin_line": 386,
      "end_line": 394,
      "comment": "\n     * Remove an element at specified index.\n     * @param index index of the element to remove\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 26)",
        "(line 388,col 9)-(line 388,col 32)",
        "(line 389,col 9)-(line 389,col 46)",
        "(line 390,col 9)-(line 390,col 39)",
        "(line 391,col 9)-(line 391,col 15)",
        "(line 392,col 9)-(line 392,col 16)",
        "(line 393,col 9)-(line 393,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.put(int, double)",
      "begin_line": 402,
      "end_line": 424,
      "comment": "\n     * Put a value associated with a key in the map.\n     * @param key key to which value is associated\n     * @param value value to put in the map\n     * @return previous value associated with the key\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 44)",
        "(line 404,col 9)-(line 404,col 41)",
        "(line 405,col 9)-(line 405,col 34)",
        "(line 406,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 28)",
        "(line 412,col 9)-(line 412,col 29)",
        "(line 413,col 9)-(line 413,col 30)",
        "(line 414,col 9)-(line 419,col 9)",
        "(line 421,col 9)-(line 421,col 16)",
        "(line 422,col 9)-(line 422,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.growTable()",
      "begin_line": 429,
      "end_line": 456,
      "comment": "\n     * Grow the tables.\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 49)",
        "(line 432,col 9)-(line 432,col 40)",
        "(line 433,col 9)-(line 433,col 42)",
        "(line 434,col 9)-(line 434,col 42)",
        "(line 436,col 9)-(line 436,col 60)",
        "(line 437,col 9)-(line 437,col 49)",
        "(line 438,col 9)-(line 438,col 57)",
        "(line 439,col 9)-(line 439,col 53)",
        "(line 440,col 9)-(line 440,col 42)",
        "(line 441,col 9)-(line 449,col 9)",
        "(line 451,col 9)-(line 451,col 25)",
        "(line 452,col 9)-(line 452,col 25)",
        "(line 453,col 9)-(line 453,col 27)",
        "(line 454,col 9)-(line 454,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.shouldGrowTable()",
      "begin_line": 462,
      "end_line": 464,
      "comment": "\n     * Check if tables should grow due to increased size.\n     * @return true if  tables should grow\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.hashOf(int)",
      "begin_line": 471,
      "end_line": 474,
      "comment": "\n     * Compute the hash value of a key\n     * @param key key to hash\n     * @return hash value of the key\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 58)",
        "(line 473,col 9)-(line 473,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Iterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 477,
      "end_line": 580,
      "comment": " Iterator class for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "referenceCount"
      ],
      "begin_line": 480,
      "end_line": 480,
      "comment": " Reference modification count. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 483,
      "end_line": 483,
      "comment": " Index of curent element. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 486,
      "end_line": 486,
      "comment": " Index of next element. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.Iterator()",
      "begin_line": 491,
      "end_line": 504,
      "comment": "\n         * Simple constructor.\n         ",
      "child_ranges": [
        "(line 494,col 13)-(line 494,col 35)",
        "(line 497,col 13)-(line 497,col 22)",
        "(line 498,col 13)-(line 502,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.hasNext()",
      "begin_line": 510,
      "end_line": 512,
      "comment": "\n         * Check if there is a next element in the map.\n         * @return true if there is a next element\n         ",
      "child_ranges": [
        "(line 511,col 13)-(line 511,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.key()",
      "begin_line": 520,
      "end_line": 530,
      "comment": "\n         * Get the key of current entry.\n         * @return key of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 522,col 13)-(line 525,col 13)",
        "(line 526,col 13)-(line 528,col 13)",
        "(line 529,col 13)-(line 529,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.value()",
      "begin_line": 538,
      "end_line": 548,
      "comment": "\n         * Get the value of current entry.\n         * @return value of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 540,col 13)-(line 543,col 13)",
        "(line 544,col 13)-(line 546,col 13)",
        "(line 547,col 13)-(line 547,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.advance()",
      "begin_line": 555,
      "end_line": 578,
      "comment": "\n         * Advance iterator one step further.\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 558,col 13)-(line 561,col 13)",
        "(line 564,col 13)-(line 564,col 27)",
        "(line 567,col 13)-(line 576,col 13)"
      ]
    }
  ]
}