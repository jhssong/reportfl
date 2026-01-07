{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/util/OpenIntToDoubleHashMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenIntToDoubleHashMap",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 600,
      "comment": "\n * Open addressed map from int to double.\n * \u003cp\u003eThis class provides a dedicated map from integers to doubles with a\n * much smaller memory overhead than standard \u003ccode\u003ejava.util.Map\u003c/code\u003e.\u003c/p\u003e\n * \u003cp\u003eThis class is not synchronized. The specialized iterators returned by\n * {@link #iterator()} are fail-fast: they throw a\n * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map has been\n * modified during iteration.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "FREE"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Status indicator for free table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Status indicator for full table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "REMOVED"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Status indicator for removed table entries. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "LOAD_FACTOR"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Load factor for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXPECTED_SIZE"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Default starting size.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RESIZE_MULTIPLIER"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Multiplier for size growth when map fills up.\n     * \u003cp\u003eThis must be a power of two for bit mask to work properly. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PERTURB_SHIFT"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Number of bits to perturb the index when probing for collision resolution. "
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Keys table. "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Values table. "
    },
    {
      "type": "field",
      "varNames": [
        "states"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " States table. "
    },
    {
      "type": "field",
      "varNames": [
        "missingEntries"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Return value for missing entries. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Current size of the map. "
    },
    {
      "type": "field",
      "varNames": [
        "mask"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Bit mask for hash values. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Modifications count. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Build an empty map with default size and using NaN for missing entries.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(double)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Build an empty map with default size\n     * @param missingEntries value to return when a missing entry is fetched\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(int)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Build an empty map with specified size and using NaN for missing entries.\n     * @param expectedSize expected number of elements in the map\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(int, double)",
      "begin_line": 119,
      "end_line": 127,
      "comment": "\n     * Build an empty map with specified size.\n     * @param expectedSize expected number of elements in the map\n     * @param missingEntries value to return when a missing entry is fetched\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 59)",
        "(line 122,col 9)-(line 122,col 35)",
        "(line 123,col 9)-(line 123,col 38)",
        "(line 124,col 9)-(line 124,col 36)",
        "(line 125,col 9)-(line 125,col 45)",
        "(line 126,col 9)-(line 126,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.OpenIntToDoubleHashMap(org.apache.commons.math.util.OpenIntToDoubleHashMap)",
      "begin_line": 133,
      "end_line": 145,
      "comment": "\n     * Copy constructor.\n     * @param source map to copy\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 46)",
        "(line 135,col 9)-(line 135,col 31)",
        "(line 136,col 9)-(line 136,col 58)",
        "(line 137,col 9)-(line 137,col 36)",
        "(line 138,col 9)-(line 138,col 62)",
        "(line 139,col 9)-(line 139,col 34)",
        "(line 140,col 9)-(line 140,col 62)",
        "(line 141,col 9)-(line 141,col 47)",
        "(line 142,col 9)-(line 142,col 28)",
        "(line 143,col 9)-(line 143,col 28)",
        "(line 144,col 9)-(line 144,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.computeCapacity(int)",
      "begin_line": 152,
      "end_line": 162,
      "comment": "\n     * Compute the capacity needed for a given size.\n     * @param expectedSize expected size of the map\n     * @return capacity to use for the specified size\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 79)",
        "(line 157,col 9)-(line 157,col 63)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.nextPowerOfTwo(int)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Find the smallest power of two greater than the input value\n     * @param i input value\n     * @return smallest power of two greater than the input value\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.get(int)",
      "begin_line": 178,
      "end_line": 201,
      "comment": "\n     * Get the stored value associated with the given key\n     * @param key key associated with the data\n     * @return data associated with the key\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 38)",
        "(line 181,col 9)-(line 181,col 32)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 22)",
        "(line 191,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(int)",
      "begin_line": 208,
      "end_line": 231,
      "comment": "\n     * Check if a value is associated with a key.\n     * @param key key to check\n     * @return true if a value is associated with key\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 38)",
        "(line 211,col 9)-(line 211,col 32)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 220,col 9)-(line 220,col 22)",
        "(line 221,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 229,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.iterator()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Get an iterator over map elements.\n     * \u003cp\u003eThe specialized iterators returned are fail-fast: they throw a\n     * \u003ccode\u003eConcurrentModificationException\u003c/code\u003e when they detect the map\n     * has been modified during iteration.\u003c/p\u003e\n     * @return iterator over the map elements\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.perturb(int)",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Perturb the hash for starting probing.\n     * @param hash initial hash\n     * @return perturbed hash\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(int)",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param key key to lookup\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(int[], byte[], int, int)",
      "begin_line": 270,
      "end_line": 317,
      "comment": "\n     * Find the index at which a key should be inserted\n     * @param keys keys table\n     * @param states states table\n     * @param key key to lookup\n     * @param mask bit mask for hash values\n     * @return index at which key should be inserted\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 37)",
        "(line 273,col 9)-(line 273,col 32)",
        "(line 274,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 280,col 36)",
        "(line 281,col 9)-(line 281,col 22)",
        "(line 282,col 9)-(line 292,col 9)",
        "(line 294,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 302,col 39)",
        "(line 303,col 9)-(line 315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.probe(int, int)",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n     * Compute next probe for collision resolution\n     * @param perturb perturbed hash\n     * @param j previous probe\n     * @return next probe\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.changeIndexSign(int)",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * Change the index sign\n     * @param index initial index\n     * @return changed index\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.size()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\n     * Get the number of elements stored in the map.\n     * @return number of elements stored in the map\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(int)",
      "begin_line": 352,
      "end_line": 375,
      "comment": "\n     * Remove the value associated with a key.\n     * @param key key to which the value is associated\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 38)",
        "(line 355,col 9)-(line 355,col 32)",
        "(line 356,col 9)-(line 358,col 9)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 364,col 9)-(line 364,col 22)",
        "(line 365,col 9)-(line 371,col 9)",
        "(line 373,col 9)-(line 373,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(int, int)",
      "begin_line": 384,
      "end_line": 386,
      "comment": "\n     * Check if the tables contain an element associated with specified key\n     * at specified index.\n     * @param key key to check\n     * @param index index to check\n     * @return true if an element is associated with key at index\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(int)",
      "begin_line": 393,
      "end_line": 401,
      "comment": "\n     * Remove an element at specified index.\n     * @param index index of the element to remove\n     * @return removed value\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 26)",
        "(line 395,col 9)-(line 395,col 32)",
        "(line 396,col 9)-(line 396,col 46)",
        "(line 397,col 9)-(line 397,col 39)",
        "(line 398,col 9)-(line 398,col 15)",
        "(line 399,col 9)-(line 399,col 16)",
        "(line 400,col 9)-(line 400,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.put(int, double)",
      "begin_line": 409,
      "end_line": 430,
      "comment": "\n     * Put a value associated with a key in the map.\n     * @param key key to which value is associated\n     * @param value value to put in the map\n     * @return previous value associated with the key\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 44)",
        "(line 411,col 9)-(line 411,col 41)",
        "(line 412,col 9)-(line 412,col 34)",
        "(line 413,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 28)",
        "(line 419,col 9)-(line 419,col 29)",
        "(line 420,col 9)-(line 420,col 30)",
        "(line 421,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.growTable()",
      "begin_line": 435,
      "end_line": 462,
      "comment": "\n     * Grow the tables.\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 49)",
        "(line 438,col 9)-(line 438,col 40)",
        "(line 439,col 9)-(line 439,col 42)",
        "(line 440,col 9)-(line 440,col 42)",
        "(line 442,col 9)-(line 442,col 60)",
        "(line 443,col 9)-(line 443,col 49)",
        "(line 444,col 9)-(line 444,col 57)",
        "(line 445,col 9)-(line 445,col 53)",
        "(line 446,col 9)-(line 446,col 42)",
        "(line 447,col 9)-(line 455,col 9)",
        "(line 457,col 9)-(line 457,col 25)",
        "(line 458,col 9)-(line 458,col 25)",
        "(line 459,col 9)-(line 459,col 27)",
        "(line 460,col 9)-(line 460,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.shouldGrowTable()",
      "begin_line": 468,
      "end_line": 470,
      "comment": "\n     * Check if tables should grow due to increased size.\n     * @return true if  tables should grow\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.hashOf(int)",
      "begin_line": 477,
      "end_line": 480,
      "comment": "\n     * Compute the hash value of a key\n     * @param key key to hash\n     * @return hash value of the key\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 58)",
        "(line 479,col 9)-(line 479,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Iterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 484,
      "end_line": 584,
      "comment": " Iterator class for the map. "
    },
    {
      "type": "field",
      "varNames": [
        "referenceCount"
      ],
      "begin_line": 487,
      "end_line": 487,
      "comment": " Reference modification count. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 490,
      "end_line": 490,
      "comment": " Index of current element. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 493,
      "end_line": 493,
      "comment": " Index of next element. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.Iterator()",
      "begin_line": 498,
      "end_line": 511,
      "comment": "\n         * Simple constructor.\n         ",
      "child_ranges": [
        "(line 501,col 13)-(line 501,col 35)",
        "(line 504,col 13)-(line 504,col 22)",
        "(line 505,col 13)-(line 509,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.hasNext()",
      "begin_line": 517,
      "end_line": 519,
      "comment": "\n         * Check if there is a next element in the map.\n         * @return true if there is a next element\n         ",
      "child_ranges": [
        "(line 518,col 13)-(line 518,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.key()",
      "begin_line": 527,
      "end_line": 536,
      "comment": "\n         * Get the key of current entry.\n         * @return key of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 529,col 13)-(line 531,col 13)",
        "(line 532,col 13)-(line 534,col 13)",
        "(line 535,col 13)-(line 535,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.value()",
      "begin_line": 544,
      "end_line": 553,
      "comment": "\n         * Get the value of current entry.\n         * @return value of current entry\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 546,col 13)-(line 548,col 13)",
        "(line 549,col 13)-(line 551,col 13)",
        "(line 552,col 13)-(line 552,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator.advance()",
      "begin_line": 560,
      "end_line": 582,
      "comment": "\n         * Advance iterator one step further.\n         * @exception ConcurrentModificationException if the map is modified during iteration\n         * @exception NoSuchElementException if there is no element left in the map\n         ",
      "child_ranges": [
        "(line 563,col 13)-(line 565,col 13)",
        "(line 568,col 13)-(line 568,col 27)",
        "(line 571,col 13)-(line 580,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.OpenIntToDoubleHashMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 593,
      "end_line": 597,
      "comment": "\n     * Read a serialized object.\n     * @param stream input stream\n     * @throws IOException if object cannot be read\n     * @throws ClassNotFoundException if the class corresponding\n     * to the serialized object cannot be found\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 35)",
        "(line 596,col 9)-(line 596,col 18)"
      ]
    }
  ]
}