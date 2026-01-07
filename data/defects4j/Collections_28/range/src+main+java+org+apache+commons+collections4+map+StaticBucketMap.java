{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/StaticBucketMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StaticBucketMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractIterableMap\u003cK, V\u003e"
      ],
      "begin_line": 96,
      "end_line": 736,
      "comment": "\n * A StaticBucketMap is an efficient, thread-safe implementation of\n * \u003ccode\u003ejava.util.Map\u003c/code\u003e that performs well in in a highly\n * thread-contentious environment.  The map supports very efficient\n * {@link #get(Object) get}, {@link #put(Object,Object) put},\n * {@link #remove(Object) remove} and {@link #containsKey(Object) containsKey}\n * operations, assuming (approximate) uniform hashing and\n * that the number of entries does not exceed the number of buckets.  If the\n * number of entries exceeds the number of buckets or if the hash codes of the\n * objects are not uniformly distributed, these operations have a worst case\n * scenario that is proportional to the number of elements in the map\n * (\u003ci\u003eO(n)\u003c/i\u003e).\u003cp\u003e\n *\n * Each bucket in the hash table has its own monitor, so two threads can\n * safely operate on the map at the same time, often without incurring any\n * monitor contention.  This means that you don\u0027t have to wrap instances\n * of this class with {@link java.util.Collections#synchronizedMap(Map)};\n * instances are already thread-safe.  Unfortunately, however, this means\n * that this map implementation behaves in ways you may find disconcerting.\n * Bulk operations, such as {@link #putAll(Map) putAll} or the\n * {@link Collection#retainAll(Collection) retainAll} operation in collection\n * views, are \u003ci\u003enot\u003c/i\u003e atomic.  If two threads are simultaneously\n * executing\n *\n * \u003cpre\u003e\n *   staticBucketMapInstance.putAll(map);\n * \u003c/pre\u003e\n *\n * and\n *\n * \u003cpre\u003e\n *   staticBucketMapInstance.entrySet().removeAll(map.entrySet());\n * \u003c/pre\u003e\n *\n * then the results are generally random.  Those two statement could cancel\n * each other out, leaving \u003ccode\u003estaticBucketMapInstance\u003c/code\u003e essentially\n * unchanged, or they could leave some random subset of \u003ccode\u003emap\u003c/code\u003e in\n * \u003ccode\u003estaticBucketMapInstance\u003c/code\u003e.\u003cp\u003e\n *\n * Also, much like an encyclopedia, the results of {@link #size()} and\n * {@link #isEmpty()} are out-of-date as soon as they are produced.\u003cp\u003e\n *\n * The iterators returned by the collection views of this class are \u003ci\u003enot\u003c/i\u003e\n * fail-fast.  They will \u003ci\u003enever\u003c/i\u003e raise a\n * {@link java.util.ConcurrentModificationException}.  Keys and values\n * added to the map after the iterator is created do not necessarily appear\n * during iteration.  Similarly, the iterator does not necessarily fail to\n * return keys and values that were removed after the iterator was created.\u003cp\u003e\n *\n * Finally, unlike {@link java.util.HashMap}-style implementations, this\n * class \u003ci\u003enever\u003c/i\u003e rehashes the map.  The number of buckets is fixed\n * at construction time and never altered.  Performance may degrade if\n * you do not allocate enough buckets upfront.\u003cp\u003e\n *\n * The {@link #atomic(Runnable)} method is provided to allow atomic iterations\n * and bulk operations; however, overuse of {@link #atomic(Runnable) atomic}\n * will basically result in a map that\u0027s slower than an ordinary synchronized\n * {@link java.util.HashMap}.\n *\n * Use this class if you do not require reliable bulk operations and\n * iterations, or if you can make your own guarantees about how bulk\n * operations will affect the map.\u003cp\u003e\n *\n * @since 3.0 (previously in main package v2.1)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BUCKETS"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The default number of buckets to use "
    },
    {
      "type": "field",
      "varNames": [
        "buckets"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The array of buckets, where the actual data is held "
    },
    {
      "type": "field",
      "varNames": [
        "locks"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The matching array of locks "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.StaticBucketMap()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Initializes the map with the default number of buckets (255).\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.StaticBucketMap(int)",
      "begin_line": 122,
      "end_line": 137,
      "comment": "\n     * Initializes the map with a specified number of buckets.  The number\n     * of buckets is never below 17, and is always an odd number (StaticBucketMap\n     * ensures this). The number of buckets is inversely proportional to the\n     * chances for thread contention.  The fewer buckets, the more chances for\n     * thread contention.  The more buckets the fewer chances for thread\n     * contention.\n     *\n     * @param numBuckets  the number of buckets for this map\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 44)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 131,col 9)-(line 131,col 33)",
        "(line 132,col 9)-(line 132,col 31)",
        "(line 134,col 9)-(line 136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.getHash(java.lang.Object)",
      "begin_line": 153,
      "end_line": 166,
      "comment": "\n     * Determine the exact hash entry for the key.  The hash algorithm\n     * is rather simplistic, but it does the job:\n     *\n     * \u003cpre\u003e\n     *   He \u003d |Hk mod n|\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\n     *   He is the entry\u0027s hashCode, Hk is the key\u0027s hashCode, and n is\n     *   the number of buckets.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 34)",
        "(line 158,col 9)-(line 158,col 30)",
        "(line 159,col 9)-(line 159,col 30)",
        "(line 160,col 9)-(line 160,col 28)",
        "(line 161,col 9)-(line 161,col 29)",
        "(line 162,col 9)-(line 162,col 30)",
        "(line 163,col 9)-(line 163,col 30)",
        "(line 164,col 9)-(line 164,col 31)",
        "(line 165,col 9)-(line 165,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.size()",
      "begin_line": 174,
      "end_line": 184,
      "comment": "\n     * Gets the current size of the map.\n     * The value is computed fresh each time the method is called.\n     *\n     * @return the current size\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 20)",
        "(line 178,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.isEmpty()",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * Checks if the size is currently zero.\n     *\n     * @return true if empty\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.get(java.lang.Object)",
      "begin_line": 202,
      "end_line": 218,
      "comment": "\n     * Gets the value associated with the key.\n     *\n     * @param key  the key to retrieve\n     * @return the associated value\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 38)",
        "(line 206,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.containsKey(java.lang.Object)",
      "begin_line": 226,
      "end_line": 242,
      "comment": "\n     * Checks if the map contains the specified key.\n     *\n     * @param key  the key to check\n     * @return true if found\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 38)",
        "(line 230,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.containsValue(java.lang.Object)",
      "begin_line": 250,
      "end_line": 266,
      "comment": "\n     * Checks if the map contains the specified value.\n     *\n     * @param value  the value to check\n     * @return true if found\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.put(K, V)",
      "begin_line": 276,
      "end_line": 314,
      "comment": "\n     * Puts a new key value mapping into the map.\n     *\n     * @param key  the key to use\n     * @param value  the value to use\n     * @return the previous mapping for the key\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 38)",
        "(line 280,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.remove(java.lang.Object)",
      "begin_line": 322,
      "end_line": 349,
      "comment": "\n     * Removes the specified key from the map.\n     *\n     * @param key  the key to remove\n     * @return the previous value at this key\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 38)",
        "(line 326,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.keySet()",
      "begin_line": 357,
      "end_line": 360,
      "comment": "\n     * Gets the key set.\n     *\n     * @return the key set\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.values()",
      "begin_line": 367,
      "end_line": 370,
      "comment": "\n     * Gets the values.\n     *\n     * @return the values\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.entrySet()",
      "begin_line": 377,
      "end_line": 380,
      "comment": "\n     * Gets the entry set.\n     *\n     * @return the entry set\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 389,
      "end_line": 394,
      "comment": "\n     * Puts all the entries from the specified map into this map.\n     * This operation is \u003cb\u003enot atomic\u003c/b\u003e and may have undesired effects.\n     *\n     * @param map  the map of entries to add\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 393,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.clear()",
      "begin_line": 399,
      "end_line": 408,
      "comment": "\n     * Clears the map of all entries.\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 407,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.equals(java.lang.Object)",
      "begin_line": 416,
      "end_line": 426,
      "comment": "\n     * Compares this map to another, as per the Map specification.\n     *\n     * @param obj  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 48)",
        "(line 425,col 9)-(line 425,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.hashCode()",
      "begin_line": 433,
      "end_line": 448,
      "comment": "\n     * Gets the hash code, as per the Map specification.\n     *\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 25)",
        "(line 437,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 447,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [
        "java.util.Map.Entry\u003cK, V\u003e",
        "org.apache.commons.collections4.KeyValue\u003cK, V\u003e"
      ],
      "begin_line": 454,
      "end_line": 496,
      "comment": "\n     * The Map.Entry for the StaticBucketMap.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 455,
      "end_line": 455,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 456,
      "end_line": 456,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 457,
      "end_line": 457,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.Node.getKey()",
      "begin_line": 459,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 461,col 13)-(line 461,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.Node.getValue()",
      "begin_line": 464,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 466,col 13)-(line 466,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.Node.hashCode()",
      "begin_line": 469,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 471,col 13)-(line 472,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.Node.equals(java.lang.Object)",
      "begin_line": 475,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 477,col 13)-(line 479,col 13)",
        "(line 480,col 13)-(line 482,col 13)",
        "(line 484,col 13)-(line 484,col 61)",
        "(line 485,col 13)-(line 487,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.Node.setValue(V)",
      "begin_line": 490,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 492,col 13)-(line 492,col 35)",
        "(line 493,col 13)-(line 493,col 24)",
        "(line 494,col 13)-(line 494,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Lock",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 501,
      "end_line": 503,
      "comment": "\n     * The lock object, which also includes a count of the nodes in this lock.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 502,
      "end_line": 502,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "BaseIterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 506,
      "end_line": 546,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 507,
      "end_line": 507,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bucket"
      ],
      "begin_line": 508,
      "end_line": 508,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 509,
      "end_line": 509,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.BaseIterator.hasNext()",
      "begin_line": 511,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 512,col 13)-(line 514,col 13)",
        "(line 515,col 13)-(line 527,col 13)",
        "(line 528,col 13)-(line 528,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.BaseIterator.nextEntry()",
      "begin_line": 531,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 532,col 13)-(line 534,col 13)",
        "(line 535,col 13)-(line 535,col 54)",
        "(line 536,col 13)-(line 536,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.BaseIterator.remove()",
      "begin_line": 539,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 540,col 13)-(line 542,col 13)",
        "(line 543,col 13)-(line 543,col 55)",
        "(line 544,col 13)-(line 544,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.StaticBucketMap.BaseIterator",
        "java.util.Iterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 548,
      "end_line": 555,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.EntryIterator.next()",
      "begin_line": 550,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 552,col 13)-(line 552,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValueIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.StaticBucketMap.BaseIterator",
        "java.util.Iterator\u003cV\u003e"
      ],
      "begin_line": 557,
      "end_line": 564,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.ValueIterator.next()",
      "begin_line": 559,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 561,col 13)-(line 561,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeyIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.StaticBucketMap.BaseIterator",
        "java.util.Iterator\u003cK\u003e"
      ],
      "begin_line": 566,
      "end_line": 573,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.KeyIterator.next()",
      "begin_line": 568,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 570,col 13)-(line 570,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 575,
      "end_line": 624,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.EntrySet.size()",
      "begin_line": 577,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 579,col 13)-(line 579,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.EntrySet.clear()",
      "begin_line": 582,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 584,col 13)-(line 584,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.EntrySet.iterator()",
      "begin_line": 587,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 589,col 13)-(line 589,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.EntrySet.contains(java.lang.Object)",
      "begin_line": 592,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 594,col 13)-(line 594,col 64)",
        "(line 595,col 13)-(line 595,col 53)",
        "(line 596,col 13)-(line 602,col 13)",
        "(line 603,col 13)-(line 603,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.EntrySet.remove(java.lang.Object)",
      "begin_line": 606,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 608,col 13)-(line 610,col 13)",
        "(line 611,col 13)-(line 611,col 64)",
        "(line 612,col 13)-(line 612,col 53)",
        "(line 613,col 13)-(line 620,col 13)",
        "(line 621,col 13)-(line 621,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cK\u003e"
      ],
      "begin_line": 626,
      "end_line": 663,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.KeySet.size()",
      "begin_line": 628,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 630,col 13)-(line 630,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.KeySet.clear()",
      "begin_line": 633,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 635,col 13)-(line 635,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.KeySet.iterator()",
      "begin_line": 638,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 640,col 13)-(line 640,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.KeySet.contains(java.lang.Object)",
      "begin_line": 643,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 645,col 13)-(line 645,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.KeySet.remove(java.lang.Object)",
      "begin_line": 648,
      "end_line": 661,
      "comment": "",
      "child_ranges": [
        "(line 650,col 13)-(line 650,col 42)",
        "(line 651,col 13)-(line 659,col 13)",
        "(line 660,col 13)-(line 660,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Values",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cV\u003e"
      ],
      "begin_line": 666,
      "end_line": 683,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.Values.size()",
      "begin_line": 668,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 670,col 13)-(line 670,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.Values.clear()",
      "begin_line": 673,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 675,col 13)-(line 675,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.Values.iterator()",
      "begin_line": 678,
      "end_line": 681,
      "comment": "",
      "child_ranges": [
        "(line 680,col 13)-(line 680,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.atomic(java.lang.Runnable)",
      "begin_line": 719,
      "end_line": 724,
      "comment": "\n     *  Prevents any operations from occurring on this map while the\n     *  given {@link Runnable} executes.  This method can be used, for\n     *  instance, to execute a bulk operation atomically:\n     *\n     *  \u003cpre\u003e\n     *    staticBucketMapInstance.atomic(new Runnable() {\n     *        public void run() {\n     *            staticBucketMapInstance.putAll(map);\n     *        }\n     *    });\n     *  \u003c/pre\u003e\n     *\n     *  It can also be used if you need a reliable iterator:\n     *\n     *  \u003cpre\u003e\n     *    staticBucketMapInstance.atomic(new Runnable() {\n     *        public void run() {\n     *            Iterator iterator \u003d staticBucketMapInstance.iterator();\n     *            while (iterator.hasNext()) {\n     *                foo(iterator.next();\n     *            }\n     *        }\n     *    });\n     *  \u003c/pre\u003e\n     *\n     *  \u003cb\u003eImplementation note:\u003c/b\u003e This method requires a lot of time\n     *  and a ton of stack space.  Essentially a recursive algorithm is used\n     *  to enter each bucket\u0027s monitor.  If you have twenty thousand buckets\n     *  in your map, then the recursive method will be invoked twenty thousand\n     *  times.  You have been warned.\n     *\n     *  @param r  the code to execute atomically\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 722,col 9)",
        "(line 723,col 9)-(line 723,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.atomic(java.lang.Runnable, int)",
      "begin_line": 726,
      "end_line": 734,
      "comment": "",
      "child_ranges": [
        "(line 727,col 9)-(line 730,col 9)",
        "(line 731,col 9)-(line 733,col 9)"
      ]
    }
  ]
}