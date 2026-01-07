{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/OpenIntToFieldHashMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenIntToFieldHashMap",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 41,
      "end_line": 618,
      "comment": "\n * Open addressed map from int to FieldElement.\n * \u003cp\u003eThis class provides a dedicated map from integers to FieldElements with a\n * much smaller memory overhead than standard \u003ccode\u003ejava.util.Map\u003c/code\u003e.\u003c/p\u003e\n * \u003cp\u003eThis class is not synchronized. The specialized iterators returned by\n * {@link #iterator()} are fail-fast: they throw a\n * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map has been\n * modified during iteration.\u003c/p\u003e\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "FREE"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Status indicator for free table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Status indicator for full table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "REMOVED"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Status indicator for removed table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "LOAD_FACTOR"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Load factor for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXPECTED_SIZE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Default starting size.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RESIZE_MULTIPLIER"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Multiplier for size growth when map fills up.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PERTURB_SHIFT"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Number of bits to perturb the index when probing for collision resolution. "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Keys table. "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Values table. "
    },
    {
      "type": "field",
      "varNames": [
        "states"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " States table. "
    },
    {
      "type": "field",
      "varNames": [
        "missingEntries"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Return value for missing entries. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Current size of the map. "
    },
    {
      "type": "field",
      "varNames": [
        "mask"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Bit mask for hash values. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Modifications count. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math3.Field\u003cT\u003e)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Build an empty map with default size and using zero for missing entries.\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math3.Field\u003cT\u003e, T)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Build an empty map with default size\n     * @param field field to which the elements belong\n     * @param missingEntries value to return when a missing entry is fetched\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math3.Field\u003cT\u003e, int)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Build an empty map with specified size and using zero for missing entries.\n     * @param field field to which the elements belong\n     * @param expectedSize expected number of elements in the map\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math3.Field\u003cT\u003e, int, T)",
      "begin_line": 127,
      "end_line": 136,
      "comment": "\n     * Build an empty map with specified size.\n     * @param field field to which the elements belong\n     * @param expectedSize expected number of elements in the map\n     * @param missingEntries value to return when a missing entry is fetched\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 27)",
        "(line 130,col 9)-(line 130,col 59)",
        "(line 131,col 9)-(line 131,col 35)",
        "(line 132,col 9)-(line 132,col 38)",
        "(line 133,col 9)-(line 133,col 36)",
        "(line 134,col 9)-(line 134,col 45)",
        "(line 135,col 9)-(line 135,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math3.util.OpenIntToFieldHashMap\u003cT\u003e)",
      "begin_line": 142,
      "end_line": 155,
      "comment": "\n     * Copy constructor.\n     * @param source map to copy\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 29)",
        "(line 144,col 9)-(line 144,col 46)",
        "(line 145,col 9)-(line 145,col 31)",
        "(line 146,col 9)-(line 146,col 58)",
        "(line 147,col 9)-(line 147,col 36)",
        "(line 148,col 9)-(line 148,col 62)",
        "(line 149,col 9)-(line 149,col 34)",
        "(line 150,col 9)-(line 150,col 62)",
        "(line 151,col 9)-(line 151,col 47)",
        "(line 152,col 9)-(line 152,col 28)",
        "(line 153,col 9)-(line 153,col 28)",
        "(line 154,col 9)-(line 154,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.computeCapacity(int)",
      "begin_line": 162,
      "end_line": 172,
      "comment": "\n     * Compute the capacity needed for a given size.\n     * @param expectedSize expected size of the map\n     * @return capacity to use for the specified size\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 79)",
        "(line 167,col 9)-(line 167,col 63)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.nextPowerOfTwo(int)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Find the smallest power of two greater than the input value\n     * @param i input value\n     * @return smallest power of two greater than the input value\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.get(int)",
      "begin_line": 188,
      "end_line": 211,
      "comment": "\n     * Get the stored value associated with the given key\n     * @param key key associated with the data\n     * @return data associated with the key\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 38)",
        "(line 191,col 9)-(line 191,col 32)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 22)",
        "(line 201,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 209,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.containsKey(int)",
      "begin_line": 218,
      "end_line": 241,
      "comment": "\n     * Check if a value is associated with a key.\n     * @param key key to check\n     * @return true if a value is associated with key\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 38)",
        "(line 221,col 9)-(line 221,col 32)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 230,col 22)",
        "(line 231,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.iterator()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Get an iterator over map elements.\n     * \u003cp\u003eThe specialized iterators returned are fail-fast: they throw a\n     * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map\n     * has been modified during iteration.\u003c/p\u003e\n     * @return iterator over the map elements\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.perturb(int)",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Perturb the hash for starting probing.\n     * @param hash initial hash\n     * @return perturbed hash\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.findInsertionIndex(int)",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param key key to lookup\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.findInsertionIndex(int[], byte[], int, int)",
      "begin_line": 280,
      "end_line": 327,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param keys keys table\n     * @param states states table\n     * @param key key to lookup\n     * @param mask bit mask for hash values\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 37)",
        "(line 283,col 9)-(line 283,col 32)",
        "(line 284,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 290,col 36)",
        "(line 291,col 9)-(line 291,col 22)",
        "(line 292,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 312,col 39)",
        "(line 313,col 9)-(line 325,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.probe(int, int)",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\n     * Compute next probe for collision resolution\n     * @param perturb perturbed hash\n     * @param j previous probe\n     * @return next probe\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.changeIndexSign(int)",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\n     * Change the index sign\n     * @param index initial index\n     * @return changed index\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.size()",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\n     * Get the number of elements stored in the map.\n     * @return number of elements stored in the map\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.remove(int)",
      "begin_line": 362,
      "end_line": 385,
      "comment": "\n     * Remove the value associated with a key.\n     * @param key key to which the value is associated\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 38)",
        "(line 365,col 9)-(line 365,col 32)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 374,col 9)-(line 374,col 22)",
        "(line 375,col 9)-(line 381,col 9)",
        "(line 383,col 9)-(line 383,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.containsKey(int, int)",
      "begin_line": 394,
      "end_line": 396,
      "comment": "\n     * Check if the tables contain an element associated with specified key\n     * at specified index.\n     * @param key key to check\n     * @param index index to check\n     * @return true if an element is associated with key at index\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.doRemove(int)",
      "begin_line": 403,
      "end_line": 411,
      "comment": "\n     * Remove an element at specified index.\n     * @param index index of the element to remove\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 26)",
        "(line 405,col 9)-(line 405,col 32)",
        "(line 406,col 9)-(line 406,col 41)",
        "(line 407,col 9)-(line 407,col 39)",
        "(line 408,col 9)-(line 408,col 15)",
        "(line 409,col 9)-(line 409,col 16)",
        "(line 410,col 9)-(line 410,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.put(int, T)",
      "begin_line": 419,
      "end_line": 440,
      "comment": "\n     * Put a value associated with a key in the map.\n     * @param key key to which value is associated\n     * @param value value to put in the map\n     * @return previous value associated with the key\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 44)",
        "(line 421,col 9)-(line 421,col 36)",
        "(line 422,col 9)-(line 422,col 34)",
        "(line 423,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 28)",
        "(line 429,col 9)-(line 429,col 29)",
        "(line 430,col 9)-(line 430,col 30)",
        "(line 431,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.growTable()",
      "begin_line": 445,
      "end_line": 472,
      "comment": "\n     * Grow the tables.\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 49)",
        "(line 448,col 9)-(line 448,col 40)",
        "(line 449,col 9)-(line 449,col 37)",
        "(line 450,col 9)-(line 450,col 42)",
        "(line 452,col 9)-(line 452,col 60)",
        "(line 453,col 9)-(line 453,col 49)",
        "(line 454,col 9)-(line 454,col 52)",
        "(line 455,col 9)-(line 455,col 53)",
        "(line 456,col 9)-(line 456,col 42)",
        "(line 457,col 9)-(line 465,col 9)",
        "(line 467,col 9)-(line 467,col 25)",
        "(line 468,col 9)-(line 468,col 25)",
        "(line 469,col 9)-(line 469,col 27)",
        "(line 470,col 9)-(line 470,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.shouldGrowTable()",
      "begin_line": 478,
      "end_line": 480,
      "comment": "\n     * Check if tables should grow due to increased size.\n     * @return true if  tables should grow\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.hashOf(int)",
      "begin_line": 487,
      "end_line": 490,
      "comment": "\n     * Compute the hash value of a key\n     * @param key key to hash\n     * @return hash value of the key\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 58)",
        "(line 489,col 9)-(line 489,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Iterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 494,
      "end_line": 594,
      "comment": " Iterator class for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "referenceCount"
      ],
      "begin_line": 497,
      "end_line": 497,
      "comment": " Reference modification count. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 500,
      "end_line": 500,
      "comment": " Index of current element. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 503,
      "end_line": 503,
      "comment": " Index of next element. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.Iterator.Iterator()",
      "begin_line": 508,
      "end_line": 521,
      "comment": "\n         * Simple constructor.\n         ",
      "child_ranges": [
        "(line 511,col 13)-(line 511,col 35)",
        "(line 514,col 13)-(line 514,col 22)",
        "(line 515,col 13)-(line 519,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.Iterator.hasNext()",
      "begin_line": 527,
      "end_line": 529,
      "comment": "\n         * Check if there is a next element in the map.\n         * @return true if there is a next element\n         ",
      "child_ranges": [
        "(line 528,col 13)-(line 528,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.Iterator.key()",
      "begin_line": 537,
      "end_line": 546,
      "comment": "\n         * Get the key of current entry.\n         * @return key of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 539,col 13)-(line 541,col 13)",
        "(line 542,col 13)-(line 544,col 13)",
        "(line 545,col 13)-(line 545,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.Iterator.value()",
      "begin_line": 554,
      "end_line": 563,
      "comment": "\n         * Get the value of current entry.\n         * @return value of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 556,col 13)-(line 558,col 13)",
        "(line 559,col 13)-(line 561,col 13)",
        "(line 562,col 13)-(line 562,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.Iterator.advance()",
      "begin_line": 570,
      "end_line": 592,
      "comment": "\n         * Advance iterator one step further.\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 573,col 13)-(line 575,col 13)",
        "(line 578,col 13)-(line 578,col 27)",
        "(line 581,col 13)-(line 590,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 603,
      "end_line": 607,
      "comment": "\n     * Read a serialized object.\n     * @param stream input stream\n     * @throws IOException if object cannot be read\n     * @throws ClassNotFoundException if the class corresponding\n     * to the serialized object cannot be found\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 35)",
        "(line 606,col 9)-(line 606,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.OpenIntToFieldHashMap.buildArray(int)",
      "begin_line": 613,
      "end_line": 616,
      "comment": " Build an array of elements.\n     * @param length size of the array to build\n     * @return a new array\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 72)"
      ]
    }
  ]
}