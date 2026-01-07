{
  "filepath": "/tmp/Math-84b/src/main/java/org/apache/commons/math/util/OpenIntToDoubleHashMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenIntToDoubleHashMap",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 596,
      "comment": "\n * Open addressed map from int to double.\n * \u003cp\u003eThis class provides a dedicated map from integers to doubles with a\n * much smaller memory overhead than standard \u003ccode\u003ejava.util.Map\u003c/code\u003e.\u003c/p\u003e\n * \u003cp\u003eThis class is not synchronized. The specialized iterators returned by\n * {@link #iterator()} are fail-fast: they throw a\n * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map has been\n * modified during iteration.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "LOAD_FACTOR"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Load factor for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXPECTED_SIZE"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Default starting size.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RESIZE_MULTIPLIER"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Multiplier for size growth when map fills up.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PERTURB_SHIFT"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Number of bits to perturb the index when probing for collision resolution. "
    },
    {
      "type": "field",
      "varNames": [
        "FREE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Status indicator for free table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Status indicator for full table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "REMOVED"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Status indicator for removed table entries. "
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
      "end_line": 199,
      "comment": "\n     * Get the stored value associated with the given key\n     * @param key key associated with the data\n     * @return data associated with the key\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 38)",
        "(line 180,col 9)-(line 180,col 32)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(int)",
      "begin_line": 206,
      "end_line": 228,
      "comment": "\n     * Check if a value is associated with a key.\n     * @param key key to check\n     * @return true if a value is associated with key\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 38)",
        "(line 209,col 9)-(line 209,col 32)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.iterator()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * Get an iterator over map elements.\n     * \u003cp\u003eThe specialized iterators returned are fail-fast: they throw a\n     * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map\n     * has been modified during iteration.\u003c/p\u003e\n     * @return iterator over the map elements\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.perturb(int)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * Perturb the hash for starting probing.\n     * @param hash initial hash\n     * @return perturbed hash\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(int)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param key key to lookup\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(int[], byte[], int, int)",
      "begin_line": 267,
      "end_line": 314,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param keys keys table\n     * @param states states table\n     * @param key key to lookup\n     * @param mask bit mask for hash values\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 37)",
        "(line 270,col 9)-(line 270,col 32)",
        "(line 271,col 9)-(line 275,col 9)",
        "(line 277,col 9)-(line 277,col 36)",
        "(line 278,col 9)-(line 278,col 22)",
        "(line 279,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 299,col 39)",
        "(line 300,col 9)-(line 312,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.probe(int, int)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * Compute next probe for collision resolution\n     * @param perturb perturbed hash\n     * @param j previous probe\n     * @return next probe\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.changeIndexSign(int)",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\n     * Change the index sign\n     * @param index initial index\n     * @return changed index\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.size()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\n     * Get the number of elements stored in the map.\n     * @return number of elements stored in the map\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(int)",
      "begin_line": 349,
      "end_line": 371,
      "comment": "\n     * Remove the value associated with a key.\n     * @param key key to which the value is associated\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 38)",
        "(line 352,col 9)-(line 352,col 32)",
        "(line 353,col 9)-(line 355,col 9)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 361,col 9)-(line 367,col 9)",
        "(line 369,col 9)-(line 369,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(int, int)",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\n     * Check if the tables contain an element associated with specified key\n     * at specified index.\n     * @param key key to check\n     * @param index index to check\n     * @return true if an element is associated with key at index\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(int)",
      "begin_line": 389,
      "end_line": 397,
      "comment": "\n     * Remove an element at specified index.\n     * @param index index of the element to remove\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 26)",
        "(line 391,col 9)-(line 391,col 32)",
        "(line 392,col 9)-(line 392,col 46)",
        "(line 393,col 9)-(line 393,col 39)",
        "(line 394,col 9)-(line 394,col 15)",
        "(line 395,col 9)-(line 395,col 16)",
        "(line 396,col 9)-(line 396,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.put(int, double)",
      "begin_line": 405,
      "end_line": 426,
      "comment": "\n     * Put a value associated with a key in the map.\n     * @param key key to which value is associated\n     * @param value value to put in the map\n     * @return previous value associated with the key\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 44)",
        "(line 407,col 9)-(line 407,col 41)",
        "(line 408,col 9)-(line 408,col 34)",
        "(line 409,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 28)",
        "(line 415,col 9)-(line 415,col 29)",
        "(line 416,col 9)-(line 416,col 30)",
        "(line 417,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.growTable()",
      "begin_line": 431,
      "end_line": 458,
      "comment": "\n     * Grow the tables.\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 49)",
        "(line 434,col 9)-(line 434,col 40)",
        "(line 435,col 9)-(line 435,col 42)",
        "(line 436,col 9)-(line 436,col 42)",
        "(line 438,col 9)-(line 438,col 60)",
        "(line 439,col 9)-(line 439,col 49)",
        "(line 440,col 9)-(line 440,col 57)",
        "(line 441,col 9)-(line 441,col 53)",
        "(line 442,col 9)-(line 442,col 42)",
        "(line 443,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 453,col 25)",
        "(line 454,col 9)-(line 454,col 25)",
        "(line 455,col 9)-(line 455,col 27)",
        "(line 456,col 9)-(line 456,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.shouldGrowTable()",
      "begin_line": 464,
      "end_line": 466,
      "comment": "\n     * Check if tables should grow due to increased size.\n     * @return true if  tables should grow\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.hashOf(int)",
      "begin_line": 473,
      "end_line": 476,
      "comment": "\n     * Compute the hash value of a key\n     * @param key key to hash\n     * @return hash value of the key\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 58)",
        "(line 475,col 9)-(line 475,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Iterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 480,
      "end_line": 580,
      "comment": " Iterator class for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "referenceCount"
      ],
      "begin_line": 483,
      "end_line": 483,
      "comment": " Reference modification count. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 486,
      "end_line": 486,
      "comment": " Index of current element. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 489,
      "end_line": 489,
      "comment": " Index of next element. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.Iterator()",
      "begin_line": 494,
      "end_line": 507,
      "comment": "\n         * Simple constructor.\n         ",
      "child_ranges": [
        "(line 497,col 13)-(line 497,col 35)",
        "(line 500,col 13)-(line 500,col 22)",
        "(line 501,col 13)-(line 505,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.hasNext()",
      "begin_line": 513,
      "end_line": 515,
      "comment": "\n         * Check if there is a next element in the map.\n         * @return true if there is a next element\n         ",
      "child_ranges": [
        "(line 514,col 13)-(line 514,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.key()",
      "begin_line": 523,
      "end_line": 532,
      "comment": "\n         * Get the key of current entry.\n         * @return key of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 525,col 13)-(line 527,col 13)",
        "(line 528,col 13)-(line 530,col 13)",
        "(line 531,col 13)-(line 531,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.value()",
      "begin_line": 540,
      "end_line": 549,
      "comment": "\n         * Get the value of current entry.\n         * @return value of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 542,col 13)-(line 544,col 13)",
        "(line 545,col 13)-(line 547,col 13)",
        "(line 548,col 13)-(line 548,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.advance()",
      "begin_line": 556,
      "end_line": 578,
      "comment": "\n         * Advance iterator one step further.\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 559,col 13)-(line 561,col 13)",
        "(line 564,col 13)-(line 564,col 27)",
        "(line 567,col 13)-(line 576,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 589,
      "end_line": 593,
      "comment": "\n     * Read a serialized object.\n     * @param stream input stream\n     * @throws IOException if object cannot be read\n     * @throws ClassNotFoundException if the class corresponding\n     * to the serialized object cannot be found\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 35)",
        "(line 592,col 9)-(line 592,col 18)"
      ]
    }
  ]
}