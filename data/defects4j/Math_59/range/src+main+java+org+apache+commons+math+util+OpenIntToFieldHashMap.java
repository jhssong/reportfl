{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/util/OpenIntToFieldHashMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenIntToFieldHashMap",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 620,
      "comment": "\n * Open addressed map from int to FieldElement.\n * \u003cp\u003eThis class provides a dedicated map from integers to FieldElements with a\n * much smaller memory overhead than standard \u003ccode\u003ejava.util.Map\u003c/code\u003e.\u003c/p\u003e\n * \u003cp\u003eThis class is not synchronized. The specialized iterators returned by\n * {@link #iterator()} are fail-fast: they throw a\n * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map has been\n * modified during iteration.\u003c/p\u003e\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "FREE"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Status indicator for free table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Status indicator for full table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "REMOVED"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Status indicator for removed table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "LOAD_FACTOR"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Load factor for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXPECTED_SIZE"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Default starting size.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RESIZE_MULTIPLIER"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Multiplier for size growth when map fills up.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PERTURB_SHIFT"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Number of bits to perturb the index when probing for collision resolution. "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Keys table. "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Values table. "
    },
    {
      "type": "field",
      "varNames": [
        "states"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " States table. "
    },
    {
      "type": "field",
      "varNames": [
        "missingEntries"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Return value for missing entries. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Current size of the map. "
    },
    {
      "type": "field",
      "varNames": [
        "mask"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Bit mask for hash values. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Modifications count. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Build an empty map with default size and using zero for missing entries.\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.Field\u003cT\u003e, T)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Build an empty map with default size\n     * @param field field to which the elements belong\n     * @param missingEntries value to return when a missing entry is fetched\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Build an empty map with specified size and using zero for missing entries.\n     * @param field field to which the elements belong\n     * @param expectedSize expected number of elements in the map\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.Field\u003cT\u003e, int, T)",
      "begin_line": 129,
      "end_line": 138,
      "comment": "\n     * Build an empty map with specified size.\n     * @param field field to which the elements belong\n     * @param expectedSize expected number of elements in the map\n     * @param missingEntries value to return when a missing entry is fetched\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 27)",
        "(line 132,col 9)-(line 132,col 59)",
        "(line 133,col 9)-(line 133,col 35)",
        "(line 134,col 9)-(line 134,col 38)",
        "(line 135,col 9)-(line 135,col 36)",
        "(line 136,col 9)-(line 136,col 45)",
        "(line 137,col 9)-(line 137,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.util.OpenIntToFieldHashMap\u003cT\u003e)",
      "begin_line": 144,
      "end_line": 157,
      "comment": "\n     * Copy constructor.\n     * @param source map to copy\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 29)",
        "(line 146,col 9)-(line 146,col 46)",
        "(line 147,col 9)-(line 147,col 31)",
        "(line 148,col 9)-(line 148,col 58)",
        "(line 149,col 9)-(line 149,col 36)",
        "(line 150,col 9)-(line 150,col 62)",
        "(line 151,col 9)-(line 151,col 34)",
        "(line 152,col 9)-(line 152,col 62)",
        "(line 153,col 9)-(line 153,col 47)",
        "(line 154,col 9)-(line 154,col 28)",
        "(line 155,col 9)-(line 155,col 28)",
        "(line 156,col 9)-(line 156,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.computeCapacity(int)",
      "begin_line": 164,
      "end_line": 174,
      "comment": "\n     * Compute the capacity needed for a given size.\n     * @param expectedSize expected size of the map\n     * @return capacity to use for the specified size\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 79)",
        "(line 169,col 9)-(line 169,col 63)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.nextPowerOfTwo(int)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Find the smallest power of two greater than the input value\n     * @param i input value\n     * @return smallest power of two greater than the input value\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.get(int)",
      "begin_line": 190,
      "end_line": 213,
      "comment": "\n     * Get the stored value associated with the given key\n     * @param key key associated with the data\n     * @return data associated with the key\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 38)",
        "(line 193,col 9)-(line 193,col 32)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 202,col 9)-(line 202,col 22)",
        "(line 203,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.containsKey(int)",
      "begin_line": 220,
      "end_line": 243,
      "comment": "\n     * Check if a value is associated with a key.\n     * @param key key to check\n     * @return true if a value is associated with key\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 38)",
        "(line 223,col 9)-(line 223,col 32)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 232,col 22)",
        "(line 233,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.iterator()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Get an iterator over map elements.\n     * \u003cp\u003eThe specialized iterators returned are fail-fast: they throw a\n     * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map\n     * has been modified during iteration.\u003c/p\u003e\n     * @return iterator over the map elements\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.perturb(int)",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Perturb the hash for starting probing.\n     * @param hash initial hash\n     * @return perturbed hash\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.findInsertionIndex(int)",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param key key to lookup\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.findInsertionIndex(int[], byte[], int, int)",
      "begin_line": 282,
      "end_line": 329,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param keys keys table\n     * @param states states table\n     * @param key key to lookup\n     * @param mask bit mask for hash values\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 37)",
        "(line 285,col 9)-(line 285,col 32)",
        "(line 286,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 292,col 36)",
        "(line 293,col 9)-(line 293,col 22)",
        "(line 294,col 9)-(line 304,col 9)",
        "(line 306,col 9)-(line 312,col 9)",
        "(line 314,col 9)-(line 314,col 39)",
        "(line 315,col 9)-(line 327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.probe(int, int)",
      "begin_line": 337,
      "end_line": 339,
      "comment": "\n     * Compute next probe for collision resolution\n     * @param perturb perturbed hash\n     * @param j previous probe\n     * @return next probe\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.changeIndexSign(int)",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\n     * Change the index sign\n     * @param index initial index\n     * @return changed index\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.size()",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * Get the number of elements stored in the map.\n     * @return number of elements stored in the map\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.remove(int)",
      "begin_line": 364,
      "end_line": 387,
      "comment": "\n     * Remove the value associated with a key.\n     * @param key key to which the value is associated\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 38)",
        "(line 367,col 9)-(line 367,col 32)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 372,col 9)-(line 374,col 9)",
        "(line 376,col 9)-(line 376,col 22)",
        "(line 377,col 9)-(line 383,col 9)",
        "(line 385,col 9)-(line 385,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.containsKey(int, int)",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\n     * Check if the tables contain an element associated with specified key\n     * at specified index.\n     * @param key key to check\n     * @param index index to check\n     * @return true if an element is associated with key at index\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.doRemove(int)",
      "begin_line": 405,
      "end_line": 413,
      "comment": "\n     * Remove an element at specified index.\n     * @param index index of the element to remove\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 26)",
        "(line 407,col 9)-(line 407,col 32)",
        "(line 408,col 9)-(line 408,col 41)",
        "(line 409,col 9)-(line 409,col 39)",
        "(line 410,col 9)-(line 410,col 15)",
        "(line 411,col 9)-(line 411,col 16)",
        "(line 412,col 9)-(line 412,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.put(int, T)",
      "begin_line": 421,
      "end_line": 442,
      "comment": "\n     * Put a value associated with a key in the map.\n     * @param key key to which value is associated\n     * @param value value to put in the map\n     * @return previous value associated with the key\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 44)",
        "(line 423,col 9)-(line 423,col 36)",
        "(line 424,col 9)-(line 424,col 34)",
        "(line 425,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 28)",
        "(line 431,col 9)-(line 431,col 29)",
        "(line 432,col 9)-(line 432,col 30)",
        "(line 433,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.growTable()",
      "begin_line": 447,
      "end_line": 474,
      "comment": "\n     * Grow the tables.\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 49)",
        "(line 450,col 9)-(line 450,col 40)",
        "(line 451,col 9)-(line 451,col 37)",
        "(line 452,col 9)-(line 452,col 42)",
        "(line 454,col 9)-(line 454,col 60)",
        "(line 455,col 9)-(line 455,col 49)",
        "(line 456,col 9)-(line 456,col 52)",
        "(line 457,col 9)-(line 457,col 53)",
        "(line 458,col 9)-(line 458,col 42)",
        "(line 459,col 9)-(line 467,col 9)",
        "(line 469,col 9)-(line 469,col 25)",
        "(line 470,col 9)-(line 470,col 25)",
        "(line 471,col 9)-(line 471,col 27)",
        "(line 472,col 9)-(line 472,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.shouldGrowTable()",
      "begin_line": 480,
      "end_line": 482,
      "comment": "\n     * Check if tables should grow due to increased size.\n     * @return true if  tables should grow\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.hashOf(int)",
      "begin_line": 489,
      "end_line": 492,
      "comment": "\n     * Compute the hash value of a key\n     * @param key key to hash\n     * @return hash value of the key\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 58)",
        "(line 491,col 9)-(line 491,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Iterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 496,
      "end_line": 596,
      "comment": " Iterator class for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "referenceCount"
      ],
      "begin_line": 499,
      "end_line": 499,
      "comment": " Reference modification count. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 502,
      "end_line": 502,
      "comment": " Index of current element. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 505,
      "end_line": 505,
      "comment": " Index of next element. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.Iterator()",
      "begin_line": 510,
      "end_line": 523,
      "comment": "\n         * Simple constructor.\n         ",
      "child_ranges": [
        "(line 513,col 13)-(line 513,col 35)",
        "(line 516,col 13)-(line 516,col 22)",
        "(line 517,col 13)-(line 521,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.hasNext()",
      "begin_line": 529,
      "end_line": 531,
      "comment": "\n         * Check if there is a next element in the map.\n         * @return true if there is a next element\n         ",
      "child_ranges": [
        "(line 530,col 13)-(line 530,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.key()",
      "begin_line": 539,
      "end_line": 548,
      "comment": "\n         * Get the key of current entry.\n         * @return key of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 541,col 13)-(line 543,col 13)",
        "(line 544,col 13)-(line 546,col 13)",
        "(line 547,col 13)-(line 547,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.value()",
      "begin_line": 556,
      "end_line": 565,
      "comment": "\n         * Get the value of current entry.\n         * @return value of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 558,col 13)-(line 560,col 13)",
        "(line 561,col 13)-(line 563,col 13)",
        "(line 564,col 13)-(line 564,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.advance()",
      "begin_line": 572,
      "end_line": 594,
      "comment": "\n         * Advance iterator one step further.\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 575,col 13)-(line 577,col 13)",
        "(line 580,col 13)-(line 580,col 27)",
        "(line 583,col 13)-(line 592,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 605,
      "end_line": 609,
      "comment": "\n     * Read a serialized object.\n     * @param stream input stream\n     * @throws IOException if object cannot be read\n     * @throws ClassNotFoundException if the class corresponding\n     * to the serialized object cannot be found\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 35)",
        "(line 608,col 9)-(line 608,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.buildArray(int)",
      "begin_line": 615,
      "end_line": 618,
      "comment": " Build an array of elements.\n     * @param length size of the array to build\n     * @return a new array\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 75)"
      ]
    }
  ]
}