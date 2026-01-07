{
  "filepath": "/tmp/Math-85b/src/java/org/apache/commons/math/util/OpenIntToFieldHashMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenIntToFieldHashMap",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 616,
      "comment": "\r\n * Open addressed map from int to FieldElement.\r\n * \u003cp\u003eThis class provides a dedicated map from integers to FieldElements with a\r\n * much smaller memory overhead than standard \u003ccode\u003ejava.util.Map\u003c/code\u003e.\u003c/p\u003e\r\n * \u003cp\u003eThis class is not synchronized. The specialized iterators returned by\r\n * {@link #iterator()} are fail-fast: they throw a\r\n * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map has been\r\n * modified during iteration.\u003c/p\u003e\r\n * @param \u003cT\u003e the type of the field elements\r\n * @version $Revision: 746578 $ $Date: 2009-02-21 12:01:14 -0800 (Sat, 21 Feb 2009) $\r\n * @since 2.0\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "LOAD_FACTOR"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Load factor for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXPECTED_SIZE"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Default starting size.\r\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RESIZE_MULTIPLIER"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Multiplier for size growth when map fills up.\r\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PERTURB_SHIFT"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Number of bits to perturb the index when probing for collision resolution. "
    },
    {
      "type": "field",
      "varNames": [
        "FREE"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Status indicator for free table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Status indicator for full table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "REMOVED"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Status indicator for removed table entries. "
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
      "comment": "\r\n     * Build an empty map with default size and using zero for missing entries.\r\n     * @param field field to which the elements belong\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.Field\u003cT\u003e, T)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\r\n     * Build an empty map with default size\r\n     * @param field field to which the elements belong\r\n     * @param missingEntries value to return when a missing entry is fetched\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\r\n     * Build an empty map with specified size and using zero for missing entries.\r\n     * @param field field to which the elements belong\r\n     * @param expectedSize expected number of elements in the map\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.Field\u003cT\u003e, int, T)",
      "begin_line": 128,
      "end_line": 137,
      "comment": "\r\n     * Build an empty map with specified size.\r\n     * @param field field to which the elements belong\r\n     * @param expectedSize expected number of elements in the map\r\n     * @param missingEntries value to return when a missing entry is fetched\r\n     ",
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
      "comment": "\r\n     * Copy constructor.\r\n     * @param source map to copy\r\n     ",
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
      "comment": "\r\n     * Compute the capacity needed for a given size.\r\n     * @param expectedSize expected size of the map\r\n     * @return capacity to use for the specified size\r\n     ",
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
      "comment": "\r\n     * Find the smallest power of two greater than the input value\r\n     * @param i input value\r\n     * @return smallest power of two greater than the input value\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.get(int)",
      "begin_line": 189,
      "end_line": 211,
      "comment": "\r\n     * Get the stored value associated with the given key\r\n     * @param key key associated with the data\r\n     * @return data associated with the key\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 38)",
        "(line 192,col 9)-(line 192,col 32)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 201,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 209,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.containsKey(int)",
      "begin_line": 218,
      "end_line": 240,
      "comment": "\r\n     * Check if a value is associated with a key.\r\n     * @param key key to check\r\n     * @return true if a value is associated with key\r\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 38)",
        "(line 221,col 9)-(line 221,col 32)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 236,col 9)",
        "(line 238,col 9)-(line 238,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.iterator()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\r\n     * Get an iterator over map elements.\r\n     * \u003cp\u003eThe specialized iterators returned are fail-fast: they throw a\r\n     * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map\r\n     * has been modified during iteration.\u003c/p\u003e\r\n     * @return iterator over the map elements\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.perturb(int)",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\r\n     * Perturb the hash for starting probing.\r\n     * @param hash initial hash\r\n     * @return perturbed hash\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.findInsertionIndex(int)",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\r\n     * Find the index at which a key should be inserted\r\n     * @param key key to lookup\r\n     * @return index at which key should be inserted\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.findInsertionIndex(int[], byte[], int, int)",
      "begin_line": 279,
      "end_line": 326,
      "comment": "\r\n     * Find the index at which a key should be inserted\r\n     * @param keys keys table\r\n     * @param states states table\r\n     * @param key key to lookup\r\n     * @param mask bit mask for hash values\r\n     * @return index at which key should be inserted\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 37)",
        "(line 282,col 9)-(line 282,col 32)",
        "(line 283,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 289,col 36)",
        "(line 290,col 9)-(line 290,col 22)",
        "(line 291,col 9)-(line 301,col 9)",
        "(line 303,col 9)-(line 309,col 9)",
        "(line 311,col 9)-(line 311,col 39)",
        "(line 312,col 9)-(line 324,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.probe(int, int)",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\r\n     * Compute next probe for collision resolution\r\n     * @param perturb perturbed hash\r\n     * @param j previous probe\r\n     * @return next probe\r\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.changeIndexSign(int)",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\r\n     * Change the index sign\r\n     * @param index initial index\r\n     * @return changed index\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.size()",
      "begin_line": 351,
      "end_line": 353,
      "comment": "\r\n     * Get the number of elements stored in the map.\r\n     * @return number of elements stored in the map\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.remove(int)",
      "begin_line": 361,
      "end_line": 383,
      "comment": "\r\n     * Remove the value associated with a key.\r\n     * @param key key to which the value is associated\r\n     * @return removed value\r\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 38)",
        "(line 364,col 9)-(line 364,col 32)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 369,col 9)-(line 371,col 9)",
        "(line 373,col 9)-(line 379,col 9)",
        "(line 381,col 9)-(line 381,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.containsKey(int, int)",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\r\n     * Check if the tables contain an element associated with specified key\r\n     * at specified index.\r\n     * @param key key to check\r\n     * @param index index to check\r\n     * @return true if an element is associated with key at index\r\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.doRemove(int)",
      "begin_line": 401,
      "end_line": 409,
      "comment": "\r\n     * Remove an element at specified index.\r\n     * @param index index of the element to remove\r\n     * @return removed value\r\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 26)",
        "(line 403,col 9)-(line 403,col 32)",
        "(line 404,col 9)-(line 404,col 41)",
        "(line 405,col 9)-(line 405,col 39)",
        "(line 406,col 9)-(line 406,col 15)",
        "(line 407,col 9)-(line 407,col 16)",
        "(line 408,col 9)-(line 408,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.put(int, T)",
      "begin_line": 417,
      "end_line": 438,
      "comment": "\r\n     * Put a value associated with a key in the map.\r\n     * @param key key to which value is associated\r\n     * @param value value to put in the map\r\n     * @return previous value associated with the key\r\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 44)",
        "(line 419,col 9)-(line 419,col 36)",
        "(line 420,col 9)-(line 420,col 34)",
        "(line 421,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 28)",
        "(line 427,col 9)-(line 427,col 29)",
        "(line 428,col 9)-(line 428,col 30)",
        "(line 429,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.growTable()",
      "begin_line": 443,
      "end_line": 470,
      "comment": "\r\n     * Grow the tables.\r\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 49)",
        "(line 446,col 9)-(line 446,col 40)",
        "(line 447,col 9)-(line 447,col 37)",
        "(line 448,col 9)-(line 448,col 42)",
        "(line 450,col 9)-(line 450,col 60)",
        "(line 451,col 9)-(line 451,col 49)",
        "(line 452,col 9)-(line 452,col 52)",
        "(line 453,col 9)-(line 453,col 53)",
        "(line 454,col 9)-(line 454,col 42)",
        "(line 455,col 9)-(line 463,col 9)",
        "(line 465,col 9)-(line 465,col 25)",
        "(line 466,col 9)-(line 466,col 25)",
        "(line 467,col 9)-(line 467,col 27)",
        "(line 468,col 9)-(line 468,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.shouldGrowTable()",
      "begin_line": 476,
      "end_line": 478,
      "comment": "\r\n     * Check if tables should grow due to increased size.\r\n     * @return true if  tables should grow\r\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.hashOf(int)",
      "begin_line": 485,
      "end_line": 488,
      "comment": "\r\n     * Compute the hash value of a key\r\n     * @param key key to hash\r\n     * @return hash value of the key\r\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 58)",
        "(line 487,col 9)-(line 487,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Iterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 492,
      "end_line": 592,
      "comment": " Iterator class for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "referenceCount"
      ],
      "begin_line": 495,
      "end_line": 495,
      "comment": " Reference modification count. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 498,
      "end_line": 498,
      "comment": " Index of current element. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 501,
      "end_line": 501,
      "comment": " Index of next element. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.Iterator()",
      "begin_line": 506,
      "end_line": 519,
      "comment": "\r\n         * Simple constructor.\r\n         ",
      "child_ranges": [
        "(line 509,col 13)-(line 509,col 35)",
        "(line 512,col 13)-(line 512,col 22)",
        "(line 513,col 13)-(line 517,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.hasNext()",
      "begin_line": 525,
      "end_line": 527,
      "comment": "\r\n         * Check if there is a next element in the map.\r\n         * @return true if there is a next element\r\n         ",
      "child_ranges": [
        "(line 526,col 13)-(line 526,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.key()",
      "begin_line": 535,
      "end_line": 544,
      "comment": "\r\n         * Get the key of current entry.\r\n         * @return key of current entry\r\n         * @exception ConcurrentModificationException if the map is modified during iteration\r\n         * @exception NoSuchElementException if there is no element left in the map\r\n         ",
      "child_ranges": [
        "(line 537,col 13)-(line 539,col 13)",
        "(line 540,col 13)-(line 542,col 13)",
        "(line 543,col 13)-(line 543,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.value()",
      "begin_line": 552,
      "end_line": 561,
      "comment": "\r\n         * Get the value of current entry.\r\n         * @return value of current entry\r\n         * @exception ConcurrentModificationException if the map is modified during iteration\r\n         * @exception NoSuchElementException if there is no element left in the map\r\n         ",
      "child_ranges": [
        "(line 554,col 13)-(line 556,col 13)",
        "(line 557,col 13)-(line 559,col 13)",
        "(line 560,col 13)-(line 560,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.advance()",
      "begin_line": 568,
      "end_line": 590,
      "comment": "\r\n         * Advance iterator one step further.\r\n         * @exception ConcurrentModificationException if the map is modified during iteration\r\n         * @exception NoSuchElementException if there is no element left in the map\r\n         ",
      "child_ranges": [
        "(line 571,col 13)-(line 573,col 13)",
        "(line 576,col 13)-(line 576,col 27)",
        "(line 579,col 13)-(line 588,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 601,
      "end_line": 605,
      "comment": "\r\n     * Read a serialized object.\r\n     * @param stream input stream\r\n     * @throws IOException if object cannot be read\r\n     * @throws ClassNotFoundException if the class corresponding\r\n     * to the serialized object cannot be found\r\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 35)",
        "(line 604,col 9)-(line 604,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.buildArray(int)",
      "begin_line": 611,
      "end_line": 614,
      "comment": " Build an array of elements.\r\n     * @param length size of the array to build\r\n     * @return a new array\r\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 75)"
      ]
    }
  ]
}