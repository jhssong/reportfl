{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/OpenIntToDoubleHashMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenIntToDoubleHashMap",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 597,
      "comment": "\n * Open addressed map from int to double.\n * \u003cp\u003eThis class provides a dedicated map from integers to doubles with a\n * much smaller memory overhead than standard \u003ccode\u003ejava.util.Map\u003c/code\u003e.\u003c/p\u003e\n * \u003cp\u003eThis class is not synchronized. The specialized iterators returned by\n * {@link #iterator()} are fail-fast: they throw a\n * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map has been\n * modified during iteration.\u003c/p\u003e\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "FREE"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Status indicator for free table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Status indicator for full table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "REMOVED"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Status indicator for removed table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "LOAD_FACTOR"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Load factor for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXPECTED_SIZE"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Default starting size.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RESIZE_MULTIPLIER"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Multiplier for size growth when map fills up.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PERTURB_SHIFT"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Number of bits to perturb the index when probing for collision resolution. "
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
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Build an empty map with default size and using NaN for missing entries.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(double)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Build an empty map with default size\n     * @param missingEntries value to return when a missing entry is fetched\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(int)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Build an empty map with specified size and using NaN for missing entries.\n     * @param expectedSize expected number of elements in the map\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(int, double)",
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
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(org.apache.commons.math3.util.OpenIntToDoubleHashMap)",
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
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.computeCapacity(int)",
      "begin_line": 149,
      "end_line": 159,
      "comment": "\n     * Compute the capacity needed for a given size.\n     * @param expectedSize expected size of the map\n     * @return capacity to use for the specified size\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 79)",
        "(line 154,col 9)-(line 154,col 63)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.nextPowerOfTwo(int)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Find the smallest power of two greater than the input value\n     * @param i input value\n     * @return smallest power of two greater than the input value\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(int)",
      "begin_line": 175,
      "end_line": 198,
      "comment": "\n     * Get the stored value associated with the given key\n     * @param key key associated with the data\n     * @return data associated with the key\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 38)",
        "(line 178,col 9)-(line 178,col 32)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 187,col 22)",
        "(line 188,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 196,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(int)",
      "begin_line": 205,
      "end_line": 228,
      "comment": "\n     * Check if a value is associated with a key.\n     * @param key key to check\n     * @return true if a value is associated with key\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 38)",
        "(line 208,col 9)-(line 208,col 32)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 217,col 22)",
        "(line 218,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.iterator()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * Get an iterator over map elements.\n     * \u003cp\u003eThe specialized iterators returned are fail-fast: they throw a\n     * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map\n     * has been modified during iteration.\u003c/p\u003e\n     * @return iterator over the map elements\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.perturb(int)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * Perturb the hash for starting probing.\n     * @param hash initial hash\n     * @return perturbed hash\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(int)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param key key to lookup\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(int[], byte[], int, int)",
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
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.probe(int, int)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * Compute next probe for collision resolution\n     * @param perturb perturbed hash\n     * @param j previous probe\n     * @return next probe\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.changeIndexSign(int)",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\n     * Change the index sign\n     * @param index initial index\n     * @return changed index\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.size()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\n     * Get the number of elements stored in the map.\n     * @return number of elements stored in the map\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.remove(int)",
      "begin_line": 349,
      "end_line": 372,
      "comment": "\n     * Remove the value associated with a key.\n     * @param key key to which the value is associated\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 38)",
        "(line 352,col 9)-(line 352,col 32)",
        "(line 353,col 9)-(line 355,col 9)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 361,col 9)-(line 361,col 22)",
        "(line 362,col 9)-(line 368,col 9)",
        "(line 370,col 9)-(line 370,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(int, int)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\n     * Check if the tables contain an element associated with specified key\n     * at specified index.\n     * @param key key to check\n     * @param index index to check\n     * @return true if an element is associated with key at index\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.doRemove(int)",
      "begin_line": 390,
      "end_line": 398,
      "comment": "\n     * Remove an element at specified index.\n     * @param index index of the element to remove\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 26)",
        "(line 392,col 9)-(line 392,col 32)",
        "(line 393,col 9)-(line 393,col 46)",
        "(line 394,col 9)-(line 394,col 39)",
        "(line 395,col 9)-(line 395,col 15)",
        "(line 396,col 9)-(line 396,col 16)",
        "(line 397,col 9)-(line 397,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.put(int, double)",
      "begin_line": 406,
      "end_line": 427,
      "comment": "\n     * Put a value associated with a key in the map.\n     * @param key key to which value is associated\n     * @param value value to put in the map\n     * @return previous value associated with the key\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 44)",
        "(line 408,col 9)-(line 408,col 41)",
        "(line 409,col 9)-(line 409,col 34)",
        "(line 410,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 28)",
        "(line 416,col 9)-(line 416,col 29)",
        "(line 417,col 9)-(line 417,col 30)",
        "(line 418,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.growTable()",
      "begin_line": 432,
      "end_line": 459,
      "comment": "\n     * Grow the tables.\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 49)",
        "(line 435,col 9)-(line 435,col 40)",
        "(line 436,col 9)-(line 436,col 42)",
        "(line 437,col 9)-(line 437,col 42)",
        "(line 439,col 9)-(line 439,col 60)",
        "(line 440,col 9)-(line 440,col 49)",
        "(line 441,col 9)-(line 441,col 57)",
        "(line 442,col 9)-(line 442,col 53)",
        "(line 443,col 9)-(line 443,col 42)",
        "(line 444,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 454,col 25)",
        "(line 455,col 9)-(line 455,col 25)",
        "(line 456,col 9)-(line 456,col 27)",
        "(line 457,col 9)-(line 457,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.shouldGrowTable()",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\n     * Check if tables should grow due to increased size.\n     * @return true if  tables should grow\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.hashOf(int)",
      "begin_line": 474,
      "end_line": 477,
      "comment": "\n     * Compute the hash value of a key\n     * @param key key to hash\n     * @return hash value of the key\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 58)",
        "(line 476,col 9)-(line 476,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Iterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 481,
      "end_line": 581,
      "comment": " Iterator class for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "referenceCount"
      ],
      "begin_line": 484,
      "end_line": 484,
      "comment": " Reference modification count. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 487,
      "end_line": 487,
      "comment": " Index of current element. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 490,
      "end_line": 490,
      "comment": " Index of next element. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator.Iterator()",
      "begin_line": 495,
      "end_line": 508,
      "comment": "\n         * Simple constructor.\n         ",
      "child_ranges": [
        "(line 498,col 13)-(line 498,col 35)",
        "(line 501,col 13)-(line 501,col 22)",
        "(line 502,col 13)-(line 506,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator.hasNext()",
      "begin_line": 514,
      "end_line": 516,
      "comment": "\n         * Check if there is a next element in the map.\n         * @return true if there is a next element\n         ",
      "child_ranges": [
        "(line 515,col 13)-(line 515,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator.key()",
      "begin_line": 524,
      "end_line": 533,
      "comment": "\n         * Get the key of current entry.\n         * @return key of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 526,col 13)-(line 528,col 13)",
        "(line 529,col 13)-(line 531,col 13)",
        "(line 532,col 13)-(line 532,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator.value()",
      "begin_line": 541,
      "end_line": 550,
      "comment": "\n         * Get the value of current entry.\n         * @return value of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 543,col 13)-(line 545,col 13)",
        "(line 546,col 13)-(line 548,col 13)",
        "(line 549,col 13)-(line 549,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator.advance()",
      "begin_line": 557,
      "end_line": 579,
      "comment": "\n         * Advance iterator one step further.\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 560,col 13)-(line 562,col 13)",
        "(line 565,col 13)-(line 565,col 27)",
        "(line 568,col 13)-(line 577,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToDoubleHashMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 590,
      "end_line": 594,
      "comment": "\n     * Read a serialized object.\n     * @param stream input stream\n     * @throws IOException if object cannot be read\n     * @throws ClassNotFoundException if the class corresponding\n     * to the serialized object cannot be found\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 35)",
        "(line 593,col 9)-(line 593,col 18)"
      ]
    }
  ]
}