{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/util/OpenIntToFieldHashMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenIntToFieldHashMap",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 630,
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
        "CONCURRENT_MODIFICATION_MESSAGE"
      ],
      "begin_line": 57,
      "end_line": 58,
      "comment": " Message for map modification during iteration. "
    },
    {
      "type": "field",
      "varNames": [
        "EXHAUSTED_ITERATOR_MESSAGE"
      ],
      "begin_line": 61,
      "end_line": 62,
      "comment": " Message for exhausted iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "LOAD_FACTOR"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Load factor for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXPECTED_SIZE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Default starting size.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RESIZE_MULTIPLIER"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Multiplier for size growth when map fills up.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PERTURB_SHIFT"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Number of bits to perturb the index when probing for collision resolution. "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Keys table. "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Values table. "
    },
    {
      "type": "field",
      "varNames": [
        "states"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " States table. "
    },
    {
      "type": "field",
      "varNames": [
        "missingEntries"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Return value for missing entries. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Current size of the map. "
    },
    {
      "type": "field",
      "varNames": [
        "mask"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Bit mask for hash values. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Modifications count. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Build an empty map with default size and using zero for missing entries.\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.Field\u003cT\u003e, T)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Build an empty map with default size\n     * @param field field to which the elements belong\n     * @param missingEntries value to return when a missing entry is fetched\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Build an empty map with specified size and using zero for missing entries.\n     * @param field field to which the elements belong\n     * @param expectedSize expected number of elements in the map\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.Field\u003cT\u003e, int, T)",
      "begin_line": 136,
      "end_line": 145,
      "comment": "\n     * Build an empty map with specified size.\n     * @param field field to which the elements belong\n     * @param expectedSize expected number of elements in the map\n     * @param missingEntries value to return when a missing entry is fetched\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 27)",
        "(line 139,col 9)-(line 139,col 59)",
        "(line 140,col 9)-(line 140,col 35)",
        "(line 141,col 9)-(line 141,col 38)",
        "(line 142,col 9)-(line 142,col 36)",
        "(line 143,col 9)-(line 143,col 45)",
        "(line 144,col 9)-(line 144,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.OpenIntToFieldHashMap(org.apache.commons.math.util.OpenIntToFieldHashMap\u003cT\u003e)",
      "begin_line": 151,
      "end_line": 164,
      "comment": "\n     * Copy constructor.\n     * @param source map to copy\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 29)",
        "(line 153,col 9)-(line 153,col 46)",
        "(line 154,col 9)-(line 154,col 31)",
        "(line 155,col 9)-(line 155,col 58)",
        "(line 156,col 9)-(line 156,col 36)",
        "(line 157,col 9)-(line 157,col 62)",
        "(line 158,col 9)-(line 158,col 34)",
        "(line 159,col 9)-(line 159,col 62)",
        "(line 160,col 9)-(line 160,col 47)",
        "(line 161,col 9)-(line 161,col 28)",
        "(line 162,col 9)-(line 162,col 28)",
        "(line 163,col 9)-(line 163,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.computeCapacity(int)",
      "begin_line": 171,
      "end_line": 181,
      "comment": "\n     * Compute the capacity needed for a given size.\n     * @param expectedSize expected size of the map\n     * @return capacity to use for the specified size\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 75)",
        "(line 176,col 9)-(line 176,col 63)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.nextPowerOfTwo(int)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Find the smallest power of two greater than the input value\n     * @param i input value\n     * @return smallest power of two greater than the input value\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.get(int)",
      "begin_line": 197,
      "end_line": 220,
      "comment": "\n     * Get the stored value associated with the given key\n     * @param key key associated with the data\n     * @return data associated with the key\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 38)",
        "(line 200,col 9)-(line 200,col 32)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 209,col 22)",
        "(line 210,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 218,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.containsKey(int)",
      "begin_line": 227,
      "end_line": 250,
      "comment": "\n     * Check if a value is associated with a key.\n     * @param key key to check\n     * @return true if a value is associated with key\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 38)",
        "(line 230,col 9)-(line 230,col 32)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 22)",
        "(line 240,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 248,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.iterator()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Get an iterator over map elements.\n     * \u003cp\u003eThe specialized iterators returned are fail-fast: they throw a\n     * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map\n     * has been modified during iteration.\u003c/p\u003e\n     * @return iterator over the map elements\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.perturb(int)",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * Perturb the hash for starting probing.\n     * @param hash initial hash\n     * @return perturbed hash\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.findInsertionIndex(int)",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param key key to lookup\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.findInsertionIndex(int[], byte[], int, int)",
      "begin_line": 289,
      "end_line": 336,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param keys keys table\n     * @param states states table\n     * @param key key to lookup\n     * @param mask bit mask for hash values\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 37)",
        "(line 292,col 9)-(line 292,col 32)",
        "(line 293,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 299,col 36)",
        "(line 300,col 9)-(line 300,col 22)",
        "(line 301,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 319,col 9)",
        "(line 321,col 9)-(line 321,col 39)",
        "(line 322,col 9)-(line 334,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.probe(int, int)",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\n     * Compute next probe for collision resolution\n     * @param perturb perturbed hash\n     * @param j previous probe\n     * @return next probe\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.changeIndexSign(int)",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\n     * Change the index sign\n     * @param index initial index\n     * @return changed index\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.size()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\n     * Get the number of elements stored in the map.\n     * @return number of elements stored in the map\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.remove(int)",
      "begin_line": 371,
      "end_line": 394,
      "comment": "\n     * Remove the value associated with a key.\n     * @param key key to which the value is associated\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 38)",
        "(line 374,col 9)-(line 374,col 32)",
        "(line 375,col 9)-(line 377,col 9)",
        "(line 379,col 9)-(line 381,col 9)",
        "(line 383,col 9)-(line 383,col 22)",
        "(line 384,col 9)-(line 390,col 9)",
        "(line 392,col 9)-(line 392,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.containsKey(int, int)",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\n     * Check if the tables contain an element associated with specified key\n     * at specified index.\n     * @param key key to check\n     * @param index index to check\n     * @return true if an element is associated with key at index\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.doRemove(int)",
      "begin_line": 412,
      "end_line": 420,
      "comment": "\n     * Remove an element at specified index.\n     * @param index index of the element to remove\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 26)",
        "(line 414,col 9)-(line 414,col 32)",
        "(line 415,col 9)-(line 415,col 41)",
        "(line 416,col 9)-(line 416,col 39)",
        "(line 417,col 9)-(line 417,col 15)",
        "(line 418,col 9)-(line 418,col 16)",
        "(line 419,col 9)-(line 419,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.put(int, T)",
      "begin_line": 428,
      "end_line": 449,
      "comment": "\n     * Put a value associated with a key in the map.\n     * @param key key to which value is associated\n     * @param value value to put in the map\n     * @return previous value associated with the key\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 44)",
        "(line 430,col 9)-(line 430,col 36)",
        "(line 431,col 9)-(line 431,col 34)",
        "(line 432,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 28)",
        "(line 438,col 9)-(line 438,col 29)",
        "(line 439,col 9)-(line 439,col 30)",
        "(line 440,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 447,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.growTable()",
      "begin_line": 454,
      "end_line": 481,
      "comment": "\n     * Grow the tables.\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 49)",
        "(line 457,col 9)-(line 457,col 40)",
        "(line 458,col 9)-(line 458,col 37)",
        "(line 459,col 9)-(line 459,col 42)",
        "(line 461,col 9)-(line 461,col 60)",
        "(line 462,col 9)-(line 462,col 49)",
        "(line 463,col 9)-(line 463,col 52)",
        "(line 464,col 9)-(line 464,col 53)",
        "(line 465,col 9)-(line 465,col 42)",
        "(line 466,col 9)-(line 474,col 9)",
        "(line 476,col 9)-(line 476,col 25)",
        "(line 477,col 9)-(line 477,col 25)",
        "(line 478,col 9)-(line 478,col 27)",
        "(line 479,col 9)-(line 479,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.shouldGrowTable()",
      "begin_line": 487,
      "end_line": 489,
      "comment": "\n     * Check if tables should grow due to increased size.\n     * @return true if  tables should grow\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.hashOf(int)",
      "begin_line": 496,
      "end_line": 499,
      "comment": "\n     * Compute the hash value of a key\n     * @param key key to hash\n     * @return hash value of the key\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 58)",
        "(line 498,col 9)-(line 498,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Iterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 503,
      "end_line": 606,
      "comment": " Iterator class for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "referenceCount"
      ],
      "begin_line": 506,
      "end_line": 506,
      "comment": " Reference modification count. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 509,
      "end_line": 509,
      "comment": " Index of current element. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 512,
      "end_line": 512,
      "comment": " Index of next element. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.Iterator()",
      "begin_line": 517,
      "end_line": 530,
      "comment": "\n         * Simple constructor.\n         ",
      "child_ranges": [
        "(line 520,col 13)-(line 520,col 35)",
        "(line 523,col 13)-(line 523,col 22)",
        "(line 524,col 13)-(line 528,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.hasNext()",
      "begin_line": 536,
      "end_line": 538,
      "comment": "\n         * Check if there is a next element in the map.\n         * @return true if there is a next element\n         ",
      "child_ranges": [
        "(line 537,col 13)-(line 537,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.key()",
      "begin_line": 546,
      "end_line": 556,
      "comment": "\n         * Get the key of current entry.\n         * @return key of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 548,col 13)-(line 551,col 13)",
        "(line 552,col 13)-(line 554,col 13)",
        "(line 555,col 13)-(line 555,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.value()",
      "begin_line": 564,
      "end_line": 574,
      "comment": "\n         * Get the value of current entry.\n         * @return value of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 566,col 13)-(line 569,col 13)",
        "(line 570,col 13)-(line 572,col 13)",
        "(line 573,col 13)-(line 573,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.Iterator.advance()",
      "begin_line": 581,
      "end_line": 604,
      "comment": "\n         * Advance iterator one step further.\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 584,col 13)-(line 587,col 13)",
        "(line 590,col 13)-(line 590,col 27)",
        "(line 593,col 13)-(line 602,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 615,
      "end_line": 619,
      "comment": "\n     * Read a serialized object.\n     * @param stream input stream\n     * @throws IOException if object cannot be read\n     * @throws ClassNotFoundException if the class corresponding\n     * to the serialized object cannot be found\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 35)",
        "(line 618,col 9)-(line 618,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToFieldHashMap.buildArray(int)",
      "begin_line": 625,
      "end_line": 628,
      "comment": " Build an array of elements.\n     * @param length size of the array to build\n     * @return a new array\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 75)"
      ]
    }
  ]
}