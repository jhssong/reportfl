{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/util/OpenIntToFieldHashMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenIntToFieldHashMap",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 619,
      "comment": "\n * Open addressed map from int to FieldElement.\n * \u003cp\u003eThis class provides a dedicated map from integers to FieldElements with a\n * much smaller memory overhead than standard \u003ccode\u003ejava.util.Map\u003c/code\u003e.\u003c/p\u003e\n * \u003cp\u003eThis class is not synchronized. The specialized iterators returned by\n * {@link #iterator()} are fail-fast: they throw a\n * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map has been\n * modified during iteration.\u003c/p\u003e\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "FREE"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Status indicator for free table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Status indicator for full table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "REMOVED"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Status indicator for removed table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "LOAD_FACTOR"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Load factor for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXPECTED_SIZE"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Default starting size.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RESIZE_MULTIPLIER"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Multiplier for size growth when map fills up.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PERTURB_SHIFT"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Number of bits to perturb the index when probing for collision resolution. "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Keys table. "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Values table. "
    },
    {
      "type": "field",
      "varNames": [
        "states"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " States table. "
    },
    {
      "type": "field",
      "varNames": [
        "missingEntries"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Return value for missing entries. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Current size of the map. "
    },
    {
      "type": "field",
      "varNames": [
        "mask"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Bit mask for hash values. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Modifications count. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Build an empty map with default size and using zero for missing entries.\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.Field\u003cT\u003e, T)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Build an empty map with default size\n     * @param field field to which the elements belong\n     * @param missingEntries value to return when a missing entry is fetched\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Build an empty map with specified size and using zero for missing entries.\n     * @param field field to which the elements belong\n     * @param expectedSize expected number of elements in the map\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.Field\u003cT\u003e, int, T)",
      "begin_line": 128,
      "end_line": 137,
      "comment": "\n     * Build an empty map with specified size.\n     * @param field field to which the elements belong\n     * @param expectedSize expected number of elements in the map\n     * @param missingEntries value to return when a missing entry is fetched\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 27)",
        "(line 131,col 9)-(line 131,col 59)",
        "(line 132,col 9)-(line 132,col 35)",
        "(line 133,col 9)-(line 133,col 38)",
        "(line 134,col 9)-(line 134,col 36)",
        "(line 135,col 9)-(line 135,col 45)",
        "(line 136,col 9)-(line 136,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.util.OpenIntToFieldHashMap\u003cT\u003e)",
      "begin_line": 143,
      "end_line": 156,
      "comment": "\n     * Copy constructor.\n     * @param source map to copy\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 29)",
        "(line 145,col 9)-(line 145,col 46)",
        "(line 146,col 9)-(line 146,col 31)",
        "(line 147,col 9)-(line 147,col 58)",
        "(line 148,col 9)-(line 148,col 36)",
        "(line 149,col 9)-(line 149,col 62)",
        "(line 150,col 9)-(line 150,col 34)",
        "(line 151,col 9)-(line 151,col 62)",
        "(line 152,col 9)-(line 152,col 47)",
        "(line 153,col 9)-(line 153,col 28)",
        "(line 154,col 9)-(line 154,col 28)",
        "(line 155,col 9)-(line 155,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.computeCapacity(int)",
      "begin_line": 163,
      "end_line": 173,
      "comment": "\n     * Compute the capacity needed for a given size.\n     * @param expectedSize expected size of the map\n     * @return capacity to use for the specified size\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 75)",
        "(line 168,col 9)-(line 168,col 63)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.nextPowerOfTwo(int)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Find the smallest power of two greater than the input value\n     * @param i input value\n     * @return smallest power of two greater than the input value\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.get(int)",
      "begin_line": 189,
      "end_line": 212,
      "comment": "\n     * Get the stored value associated with the given key\n     * @param key key associated with the data\n     * @return data associated with the key\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 38)",
        "(line 192,col 9)-(line 192,col 32)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 201,col 9)-(line 201,col 22)",
        "(line 202,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.containsKey(int)",
      "begin_line": 219,
      "end_line": 242,
      "comment": "\n     * Check if a value is associated with a key.\n     * @param key key to check\n     * @return true if a value is associated with key\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 38)",
        "(line 222,col 9)-(line 222,col 32)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 231,col 9)-(line 231,col 22)",
        "(line 232,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 240,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.iterator()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * Get an iterator over map elements.\n     * \u003cp\u003eThe specialized iterators returned are fail-fast: they throw a\n     * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map\n     * has been modified during iteration.\u003c/p\u003e\n     * @return iterator over the map elements\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.perturb(int)",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * Perturb the hash for starting probing.\n     * @param hash initial hash\n     * @return perturbed hash\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.findInsertionIndex(int)",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param key key to lookup\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.findInsertionIndex(int[], byte[], int, int)",
      "begin_line": 281,
      "end_line": 328,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param keys keys table\n     * @param states states table\n     * @param key key to lookup\n     * @param mask bit mask for hash values\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 37)",
        "(line 284,col 9)-(line 284,col 32)",
        "(line 285,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 291,col 36)",
        "(line 292,col 9)-(line 292,col 22)",
        "(line 293,col 9)-(line 303,col 9)",
        "(line 305,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 313,col 39)",
        "(line 314,col 9)-(line 326,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.probe(int, int)",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\n     * Compute next probe for collision resolution\n     * @param perturb perturbed hash\n     * @param j previous probe\n     * @return next probe\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.changeIndexSign(int)",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\n     * Change the index sign\n     * @param index initial index\n     * @return changed index\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.size()",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\n     * Get the number of elements stored in the map.\n     * @return number of elements stored in the map\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.remove(int)",
      "begin_line": 363,
      "end_line": 386,
      "comment": "\n     * Remove the value associated with a key.\n     * @param key key to which the value is associated\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 38)",
        "(line 366,col 9)-(line 366,col 32)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 375,col 9)-(line 375,col 22)",
        "(line 376,col 9)-(line 382,col 9)",
        "(line 384,col 9)-(line 384,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.containsKey(int, int)",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\n     * Check if the tables contain an element associated with specified key\n     * at specified index.\n     * @param key key to check\n     * @param index index to check\n     * @return true if an element is associated with key at index\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.doRemove(int)",
      "begin_line": 404,
      "end_line": 412,
      "comment": "\n     * Remove an element at specified index.\n     * @param index index of the element to remove\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 26)",
        "(line 406,col 9)-(line 406,col 32)",
        "(line 407,col 9)-(line 407,col 41)",
        "(line 408,col 9)-(line 408,col 39)",
        "(line 409,col 9)-(line 409,col 15)",
        "(line 410,col 9)-(line 410,col 16)",
        "(line 411,col 9)-(line 411,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.put(int, T)",
      "begin_line": 420,
      "end_line": 441,
      "comment": "\n     * Put a value associated with a key in the map.\n     * @param key key to which value is associated\n     * @param value value to put in the map\n     * @return previous value associated with the key\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 44)",
        "(line 422,col 9)-(line 422,col 36)",
        "(line 423,col 9)-(line 423,col 34)",
        "(line 424,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 28)",
        "(line 430,col 9)-(line 430,col 29)",
        "(line 431,col 9)-(line 431,col 30)",
        "(line 432,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.growTable()",
      "begin_line": 446,
      "end_line": 473,
      "comment": "\n     * Grow the tables.\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 49)",
        "(line 449,col 9)-(line 449,col 40)",
        "(line 450,col 9)-(line 450,col 37)",
        "(line 451,col 9)-(line 451,col 42)",
        "(line 453,col 9)-(line 453,col 60)",
        "(line 454,col 9)-(line 454,col 49)",
        "(line 455,col 9)-(line 455,col 52)",
        "(line 456,col 9)-(line 456,col 53)",
        "(line 457,col 9)-(line 457,col 42)",
        "(line 458,col 9)-(line 466,col 9)",
        "(line 468,col 9)-(line 468,col 25)",
        "(line 469,col 9)-(line 469,col 25)",
        "(line 470,col 9)-(line 470,col 27)",
        "(line 471,col 9)-(line 471,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.shouldGrowTable()",
      "begin_line": 479,
      "end_line": 481,
      "comment": "\n     * Check if tables should grow due to increased size.\n     * @return true if  tables should grow\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.hashOf(int)",
      "begin_line": 488,
      "end_line": 491,
      "comment": "\n     * Compute the hash value of a key\n     * @param key key to hash\n     * @return hash value of the key\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 58)",
        "(line 490,col 9)-(line 490,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Iterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 495,
      "end_line": 595,
      "comment": " Iterator class for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "referenceCount"
      ],
      "begin_line": 498,
      "end_line": 498,
      "comment": " Reference modification count. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 501,
      "end_line": 501,
      "comment": " Index of current element. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 504,
      "end_line": 504,
      "comment": " Index of next element. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.Iterator()",
      "begin_line": 509,
      "end_line": 522,
      "comment": "\n         * Simple constructor.\n         ",
      "child_ranges": [
        "(line 512,col 13)-(line 512,col 35)",
        "(line 515,col 13)-(line 515,col 22)",
        "(line 516,col 13)-(line 520,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.hasNext()",
      "begin_line": 528,
      "end_line": 530,
      "comment": "\n         * Check if there is a next element in the map.\n         * @return true if there is a next element\n         ",
      "child_ranges": [
        "(line 529,col 13)-(line 529,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.key()",
      "begin_line": 538,
      "end_line": 547,
      "comment": "\n         * Get the key of current entry.\n         * @return key of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 540,col 13)-(line 542,col 13)",
        "(line 543,col 13)-(line 545,col 13)",
        "(line 546,col 13)-(line 546,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.value()",
      "begin_line": 555,
      "end_line": 564,
      "comment": "\n         * Get the value of current entry.\n         * @return value of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 557,col 13)-(line 559,col 13)",
        "(line 560,col 13)-(line 562,col 13)",
        "(line 563,col 13)-(line 563,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.advance()",
      "begin_line": 571,
      "end_line": 593,
      "comment": "\n         * Advance iterator one step further.\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 574,col 13)-(line 576,col 13)",
        "(line 579,col 13)-(line 579,col 27)",
        "(line 582,col 13)-(line 591,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 604,
      "end_line": 608,
      "comment": "\n     * Read a serialized object.\n     * @param stream input stream\n     * @throws IOException if object cannot be read\n     * @throws ClassNotFoundException if the class corresponding\n     * to the serialized object cannot be found\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 606,col 35)",
        "(line 607,col 9)-(line 607,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.buildArray(int)",
      "begin_line": 614,
      "end_line": 617,
      "comment": " Build an array of elements.\n     * @param length size of the array to build\n     * @return a new array\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 75)"
      ]
    }
  ]
}